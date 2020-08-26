package typings.officeUiFabricReact.stickyTypesMod

import typings.officeUiFabricReact.stickyStickyMod.Sticky
import typings.react.mod.Props
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStickyProps extends Props[Sticky] {
  /**
    * Gets ref to component interface.
    */
  var componentRef: js.UndefOr[IRefObject[IStickyProps]] = js.native
  /**
    * If true, then match scrolling position of placeholder element in Sticky.
    * @defaultvalue true
    */
  var isScrollSynced: js.UndefOr[Boolean] = js.native
  /**
    * color to apply as 'background-color' style for sticky element.
    */
  var stickyBackgroundColor: js.UndefOr[String] = js.native
  /**
    * Class name to apply to the sticky element if component is sticky.
    */
  var stickyClassName: js.UndefOr[String] = js.native
  /**
    * Region to render sticky component in.
    * @defaultvalue Both
    */
  var stickyPosition: js.UndefOr[StickyPositionType] = js.native
}

object IStickyProps {
  @scala.inline
  def apply(): IStickyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStickyProps]
  }
  @scala.inline
  implicit class IStickyPropsOps[Self <: IStickyProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IStickyProps | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[IStickyProps]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setIsScrollSynced(value: Boolean): Self = this.set("isScrollSynced", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsScrollSynced: Self = this.set("isScrollSynced", js.undefined)
    @scala.inline
    def setStickyBackgroundColor(value: String): Self = this.set("stickyBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickyBackgroundColor: Self = this.set("stickyBackgroundColor", js.undefined)
    @scala.inline
    def setStickyClassName(value: String): Self = this.set("stickyClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickyClassName: Self = this.set("stickyClassName", js.undefined)
    @scala.inline
    def setStickyPosition(value: StickyPositionType): Self = this.set("stickyPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickyPosition: Self = this.set("stickyPosition", js.undefined)
  }
  
}

