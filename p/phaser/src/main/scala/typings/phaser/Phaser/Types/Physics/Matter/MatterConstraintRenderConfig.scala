package typings.phaser.Phaser.Types.Physics.Matter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatterConstraintRenderConfig extends js.Object {
  
  /**
    * The color value of constraint anchors.
    */
  var anchorColor: js.UndefOr[Double] = js.native
  
  /**
    * The size of the circles drawn as the constraint anchors.
    */
  var anchorSize: js.UndefOr[Double] = js.native
  
  /**
    * If this constraint has anchors, should they be rendered? Pin constraints never have anchors.
    */
  var anchors: js.UndefOr[Boolean] = js.native
  
  /**
    * The color value of the line stroke when rendering this constraint.
    */
  var lineColor: js.UndefOr[Double] = js.native
  
  /**
    * The opacity of the line when rendering this constraint, a value between 0 and 1.
    */
  var lineOpacity: js.UndefOr[Double] = js.native
  
  /**
    * If rendering lines, the thickness of the line.
    */
  var lineThickness: js.UndefOr[Double] = js.native
  
  /**
    * The size of the circles drawn when rendering pin constraints.
    */
  var pinSize: js.UndefOr[Double] = js.native
  
  /**
    * Should this constraint be rendered by the Debug Renderer?
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object MatterConstraintRenderConfig {
  
  @scala.inline
  def apply(): MatterConstraintRenderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterConstraintRenderConfig]
  }
  
  @scala.inline
  implicit class MatterConstraintRenderConfigOps[Self <: MatterConstraintRenderConfig] (val x: Self) extends AnyVal {
    
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
    def setAnchorColor(value: Double): Self = this.set("anchorColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorColor: Self = this.set("anchorColor", js.undefined)
    
    @scala.inline
    def setAnchorSize(value: Double): Self = this.set("anchorSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorSize: Self = this.set("anchorSize", js.undefined)
    
    @scala.inline
    def setAnchors(value: Boolean): Self = this.set("anchors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchors: Self = this.set("anchors", js.undefined)
    
    @scala.inline
    def setLineColor(value: Double): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    
    @scala.inline
    def setLineOpacity(value: Double): Self = this.set("lineOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineOpacity: Self = this.set("lineOpacity", js.undefined)
    
    @scala.inline
    def setLineThickness(value: Double): Self = this.set("lineThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineThickness: Self = this.set("lineThickness", js.undefined)
    
    @scala.inline
    def setPinSize(value: Double): Self = this.set("pinSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinSize: Self = this.set("pinSize", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
