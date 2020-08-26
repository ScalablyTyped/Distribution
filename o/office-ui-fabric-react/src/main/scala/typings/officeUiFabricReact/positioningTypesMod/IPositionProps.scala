package typings.officeUiFabricReact.positioningTypesMod

import typings.officeUiFabricReact.directionalHintMod.DirectionalHint
import typings.std.Element
import typings.std.MouseEvent
import typings.uifabricUtilities.irectangleMod.IRectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPositionProps extends js.Object {
  /**
    * If true the positioning logic will prefer flipping edges over nudging the rectangle to fit within bounds,
    * thus making sure the element align perfectly with target.
    */
  var alignTargetEdge: js.UndefOr[Boolean] = js.native
  /**
    * The bounding rectangle for which  the contextual menu can appear in.
    */
  var bounds: js.UndefOr[IRectangle] = js.native
  /**
    * If true the position returned will have the menu element cover the target.
    * If false then it will position next to the target;
    */
  var coverTarget: js.UndefOr[Boolean] = js.native
  /** how the element should be positioned */
  var directionalHint: js.UndefOr[DirectionalHint] = js.native
  /**
    * If true the position will not change edges in an attempt to fit the rectangle within bounds.
    * It will still attempt to align it to whatever bounds are given.
    * @defaultvalue false
    */
  var directionalHintFixed: js.UndefOr[Boolean] = js.native
  /**
    * How the element should be positioned in RTL layouts.
    * If not specified, a mirror of `directionalHint` will be used instead
    */
  var directionalHintForRTL: js.UndefOr[DirectionalHint] = js.native
  /** The gap between the callout and the target */
  var gapSpace: js.UndefOr[Double] = js.native
  var target: js.UndefOr[Element | MouseEvent | IPoint] = js.native
}

object IPositionProps {
  @scala.inline
  def apply(): IPositionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPositionProps]
  }
  @scala.inline
  implicit class IPositionPropsOps[Self <: IPositionProps] (val x: Self) extends AnyVal {
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
    def setAlignTargetEdge(value: Boolean): Self = this.set("alignTargetEdge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignTargetEdge: Self = this.set("alignTargetEdge", js.undefined)
    @scala.inline
    def setBounds(value: IRectangle): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setCoverTarget(value: Boolean): Self = this.set("coverTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoverTarget: Self = this.set("coverTarget", js.undefined)
    @scala.inline
    def setDirectionalHint(value: DirectionalHint): Self = this.set("directionalHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectionalHint: Self = this.set("directionalHint", js.undefined)
    @scala.inline
    def setDirectionalHintFixed(value: Boolean): Self = this.set("directionalHintFixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectionalHintFixed: Self = this.set("directionalHintFixed", js.undefined)
    @scala.inline
    def setDirectionalHintForRTL(value: DirectionalHint): Self = this.set("directionalHintForRTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectionalHintForRTL: Self = this.set("directionalHintForRTL", js.undefined)
    @scala.inline
    def setGapSpace(value: Double): Self = this.set("gapSpace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGapSpace: Self = this.set("gapSpace", js.undefined)
    @scala.inline
    def setTarget(value: Element | MouseEvent | IPoint): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

