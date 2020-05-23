package typings.officeUiFabricReact.stickyTypesMod

import typings.officeUiFabricReact.stickyStickyMod.Sticky
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
import typings.uifabricUtilities.createRefMod.IRefObject
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
    ref: js.UndefOr[Null | LegacyRef[Sticky]] = js.undefined,
    stickyBackgroundColor: String = null,
    stickyClassName: String = null,
    stickyPosition: StickyPositionType = null
  ): IStickyProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(isScrollSynced)) __obj.updateDynamic("isScrollSynced")(isScrollSynced.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (stickyBackgroundColor != null) __obj.updateDynamic("stickyBackgroundColor")(stickyBackgroundColor.asInstanceOf[js.Any])
    if (stickyClassName != null) __obj.updateDynamic("stickyClassName")(stickyClassName.asInstanceOf[js.Any])
    if (stickyPosition != null) __obj.updateDynamic("stickyPosition")(stickyPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStickyProps]
  }
}

