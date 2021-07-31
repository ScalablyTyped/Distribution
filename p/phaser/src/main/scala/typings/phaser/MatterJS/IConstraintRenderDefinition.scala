package typings.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConstraintRenderDefinition extends StObject {
  
  /**
    * A hex color value that defines the color to use when rendering the anchors.
    *
    * @property anchorColor
    * @type number
    */
  var anchorColor: js.UndefOr[Double] = js.undefined
  
  /**
    * The size of the anchors during rendering.
    *
    * @property anchorSize
    * @type number
    */
  var anchorSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A flag that indicates if the constraint anchors should be rendered.
    *
    * @property anchors
    * @type boolean
    * @default true
    */
  var anchors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A hex color value that defines the line color to use when rendering the body.
    *
    * @property lineColor
    * @type number
    */
  var lineColor: js.UndefOr[Double] = js.undefined
  
  /**
    * A value that defines the line opacity to use when rendering the body.
    *
    * @property lineOpacity
    * @type number
    */
  var lineOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * A `Number` that defines the line width to use when rendering the body outline.
    *
    * @property lineThickness
    * @type number
    */
  var lineThickness: js.UndefOr[Double] = js.undefined
  
  /**
    * The size of the pins during rendering.
    *
    * @property pinSize
    * @type number
    */
  var pinSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The type of constraint.
    *
    * @property type
    * @type string
    * @default 'line'
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * A flag that indicates if the constraint should be rendered.
    *
    * @property visible
    * @type boolean
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object IConstraintRenderDefinition {
  
  @scala.inline
  def apply(): IConstraintRenderDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConstraintRenderDefinition]
  }
  
  @scala.inline
  implicit class IConstraintRenderDefinitionMutableBuilder[Self <: IConstraintRenderDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchorColor(value: Double): Self = StObject.set(x, "anchorColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorColorUndefined: Self = StObject.set(x, "anchorColor", js.undefined)
    
    @scala.inline
    def setAnchorSize(value: Double): Self = StObject.set(x, "anchorSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorSizeUndefined: Self = StObject.set(x, "anchorSize", js.undefined)
    
    @scala.inline
    def setAnchors(value: Boolean): Self = StObject.set(x, "anchors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorsUndefined: Self = StObject.set(x, "anchors", js.undefined)
    
    @scala.inline
    def setLineColor(value: Double): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    @scala.inline
    def setLineOpacity(value: Double): Self = StObject.set(x, "lineOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineOpacityUndefined: Self = StObject.set(x, "lineOpacity", js.undefined)
    
    @scala.inline
    def setLineThickness(value: Double): Self = StObject.set(x, "lineThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineThicknessUndefined: Self = StObject.set(x, "lineThickness", js.undefined)
    
    @scala.inline
    def setPinSize(value: Double): Self = StObject.set(x, "pinSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinSizeUndefined: Self = StObject.set(x, "pinSize", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
