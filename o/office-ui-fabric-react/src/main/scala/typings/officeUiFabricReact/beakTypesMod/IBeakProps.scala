package typings.officeUiFabricReact.beakTypesMod

import typings.officeUiFabricReact.positioningTypesMod.RectangleEdge
import typings.uifabricUtilities.baseComponentTypesMod.IBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBeakProps extends IBaseProps[IBeak] {
  /**
    * Bottom position of the beak
    */
  var bottom: js.UndefOr[String] = js.native
  /**
    * Color of the beak
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Direction of beak
    */
  var direction: js.UndefOr[RectangleEdge] = js.native
  /**
    * Beak height.
    * @defaultvalue 18
    * @deprecated Do not use.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Left position of the beak
    */
  var left: js.UndefOr[String] = js.native
  /**
    * Right position of the beak
    */
  var right: js.UndefOr[String] = js.native
  /**
    * Top position of the beak
    */
  var top: js.UndefOr[String] = js.native
  /**
    * Beak width.
    * @defaultvalue 18
    * @deprecated Do not use.
    */
  var width: js.UndefOr[Double] = js.native
}

object IBeakProps {
  @scala.inline
  def apply(): IBeakProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBeakProps]
  }
  @scala.inline
  implicit class IBeakPropsOps[Self <: IBeakProps] (val x: Self) extends AnyVal {
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
    def setBottom(value: String): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDirection(value: RectangleEdge): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLeft(value: String): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setRight(value: String): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setTop(value: String): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

