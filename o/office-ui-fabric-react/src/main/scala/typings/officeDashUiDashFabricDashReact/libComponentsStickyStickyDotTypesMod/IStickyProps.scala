package typings.officeDashUiDashFabricDashReact.libComponentsStickyStickyDotTypesMod

import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.officeDashUiDashFabricDashReact.libComponentsStickyStickyMod.Sticky
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.Props
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStickyProps extends Props[Sticky] {
  /**
    * Gets ref to component interface.
    */
  var componentRef: js.UndefOr[IRefObject[IStickyProps]] = js.undefined
  /**
    * If true, then match scrolling position of placeholder element in Sticky.
    * @defaultvalue true
    */
  var isScrollSynced: js.UndefOr[Boolean] = js.undefined
  /**
    * color to apply as 'background-color' style for sticky element.
    */
  var stickyBackgroundColor: js.UndefOr[String] = js.undefined
  /**
    * Class name to apply to the sticky element if component is sticky.
    */
  var stickyClassName: js.UndefOr[String] = js.undefined
  /**
    * Region to render sticky component in.
    * @defaultvalue Both
    */
  var stickyPosition: js.UndefOr[StickyPositionType] = js.undefined
}

object IStickyProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    componentRef: IRefObject[IStickyProps] = null,
    isScrollSynced: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    ref: LegacyRef[Sticky] = null,
    stickyBackgroundColor: String = null,
    stickyClassName: String = null,
    stickyPosition: StickyPositionType = null
  ): IStickyProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(isScrollSynced)) __obj.updateDynamic("isScrollSynced")(isScrollSynced)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (stickyBackgroundColor != null) __obj.updateDynamic("stickyBackgroundColor")(stickyBackgroundColor)
    if (stickyClassName != null) __obj.updateDynamic("stickyClassName")(stickyClassName)
    if (stickyPosition != null) __obj.updateDynamic("stickyPosition")(stickyPosition)
    __obj.asInstanceOf[IStickyProps]
  }
}

