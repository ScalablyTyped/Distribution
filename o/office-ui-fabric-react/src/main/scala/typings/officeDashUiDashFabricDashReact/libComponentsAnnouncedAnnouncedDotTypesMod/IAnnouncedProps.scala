package typings.officeDashUiDashFabricDashReact.libComponentsAnnouncedAnnouncedDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.officeDashUiDashFabricDashReact.libComponentsAnnouncedAnnouncedDotBaseMod.AnnouncedBase
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.Props
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.react.reactMod.Props because var conflicts: children. Inlined key, ref */ trait IAnnouncedProps extends HTMLAttributes[HTMLDivElement] {
  var key: js.UndefOr[Key] = js.undefined
  /**
    * The status message provided as screen reader output
    */
  var message: js.UndefOr[String] = js.undefined
  var ref: js.UndefOr[LegacyRef[AnnouncedBase]] = js.undefined
  /** Call to provide customized styling that will layer on top of the variant rules. */
  var styles: js.UndefOr[IStyleFunctionOrObject[js.Object, IAnnouncedStyles]] = js.undefined
}

object IAnnouncedProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    Props: Props[AnnouncedBase] = null,
    message: String = null,
    styles: IStyleFunctionOrObject[js.Object, IAnnouncedStyles] = null
  ): IAnnouncedProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, Props)
    if (message != null) __obj.updateDynamic("message")(message)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnnouncedProps]
  }
}

