package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConstraintRenderDefinition extends js.Object {
  
  /**
    * A hex color value that defines the color to use when rendering the anchors.
    *
    * @property anchorColor
    * @type number
    */
  var anchorColor: js.UndefOr[Double] = js.native
  
  /**
    * The size of the anchors during rendering.
    *
    * @property anchorSize
    * @type number
    */
  var anchorSize: js.UndefOr[Double] = js.native
  
  /**
    * A flag that indicates if the constraint anchors should be rendered.
    *
    * @property anchors
    * @type boolean
    * @default true
    */
  var anchors: js.UndefOr[Boolean] = js.native
  
  /**
    * A hex color value that defines the line color to use when rendering the body.
    *
    * @property lineColor
    * @type number
    */
  var lineColor: js.UndefOr[Double] = js.native
  
  /**
    * A value that defines the line opacity to use when rendering the body.
    *
    * @property lineOpacity
    * @type number
    */
  var lineOpacity: js.UndefOr[Double] = js.native
  
  /**
    * A `Number` that defines the line width to use when rendering the body outline.
    *
    * @property lineThickness
    * @type number
    */
  var lineThickness: js.UndefOr[Double] = js.native
  
  /**
    * The size of the pins during rendering.
    *
    * @property pinSize
    * @type number
    */
  var pinSize: js.UndefOr[Double] = js.native
  
  /**
    * The type of constraint.
    *
    * @property type
    * @type string
    * @default 'line'
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * A flag that indicates if the constraint should be rendered.
    *
    * @property visible
    * @type boolean
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object IConstraintRenderDefinition {
  
  @scala.inline
  def apply(): IConstraintRenderDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConstraintRenderDefinition]
  }
  
  @scala.inline
  implicit class IConstraintRenderDefinitionOps[Self <: IConstraintRenderDefinition] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
