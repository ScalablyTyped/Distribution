package typings.phaser.Phaser.Types.Physics.Matter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatterConstraintRenderConfig extends StObject {
  
  /**
    * The color value of constraint anchors.
    */
  var anchorColor: js.UndefOr[Double] = js.undefined
  
  /**
    * The size of the circles drawn as the constraint anchors.
    */
  var anchorSize: js.UndefOr[Double] = js.undefined
  
  /**
    * If this constraint has anchors, should they be rendered? Pin constraints never have anchors.
    */
  var anchors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The color value of the line stroke when rendering this constraint.
    */
  var lineColor: js.UndefOr[Double] = js.undefined
  
  /**
    * The opacity of the line when rendering this constraint, a value between 0 and 1.
    */
  var lineOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * If rendering lines, the thickness of the line.
    */
  var lineThickness: js.UndefOr[Double] = js.undefined
  
  /**
    * The size of the circles drawn when rendering pin constraints.
    */
  var pinSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Should this constraint be rendered by the Debug Renderer?
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object MatterConstraintRenderConfig {
  
  inline def apply(): MatterConstraintRenderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterConstraintRenderConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MatterConstraintRenderConfig] (val x: Self) extends AnyVal {
    
    inline def setAnchorColor(value: Double): Self = StObject.set(x, "anchorColor", value.asInstanceOf[js.Any])
    
    inline def setAnchorColorUndefined: Self = StObject.set(x, "anchorColor", js.undefined)
    
    inline def setAnchorSize(value: Double): Self = StObject.set(x, "anchorSize", value.asInstanceOf[js.Any])
    
    inline def setAnchorSizeUndefined: Self = StObject.set(x, "anchorSize", js.undefined)
    
    inline def setAnchors(value: Boolean): Self = StObject.set(x, "anchors", value.asInstanceOf[js.Any])
    
    inline def setAnchorsUndefined: Self = StObject.set(x, "anchors", js.undefined)
    
    inline def setLineColor(value: Double): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    inline def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    inline def setLineOpacity(value: Double): Self = StObject.set(x, "lineOpacity", value.asInstanceOf[js.Any])
    
    inline def setLineOpacityUndefined: Self = StObject.set(x, "lineOpacity", js.undefined)
    
    inline def setLineThickness(value: Double): Self = StObject.set(x, "lineThickness", value.asInstanceOf[js.Any])
    
    inline def setLineThicknessUndefined: Self = StObject.set(x, "lineThickness", js.undefined)
    
    inline def setPinSize(value: Double): Self = StObject.set(x, "pinSize", value.asInstanceOf[js.Any])
    
    inline def setPinSizeUndefined: Self = StObject.set(x, "pinSize", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
