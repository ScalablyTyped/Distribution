package typings.officeUiFabricReact.beakTypesMod

import typings.officeUiFabricReact.positioningTypesMod.RectangleEdge
import typings.uifabricUtilities.baseComponentTypesMod.IBaseProps
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBeakProps extends IBaseProps[IBeak] {
  /**
    * Bottom position of the beak
    */
  var bottom: js.UndefOr[String] = js.undefined
  /**
    * Color of the beak
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Direction of beak
    */
  var direction: js.UndefOr[RectangleEdge] = js.undefined
  /**
    * Beak height.
    * @defaultvalue 18
    * @deprecated Do not use.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Left position of the beak
    */
  var left: js.UndefOr[String] = js.undefined
  /**
    * Right position of the beak
    */
  var right: js.UndefOr[String] = js.undefined
  /**
    * Top position of the beak
    */
  var top: js.UndefOr[String] = js.undefined
  /**
    * Beak width.
    * @defaultvalue 18
    * @deprecated Do not use.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object IBeakProps {
  @scala.inline
  def apply(
    bottom: String = null,
    color: String = null,
    componentRef: IRefObject[IBeak] = null,
    direction: RectangleEdge = null,
    height: Int | Double = null,
    left: String = null,
    right: String = null,
    top: String = null,
    width: Int | Double = null
  ): IBeakProps = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBeakProps]
  }
}

