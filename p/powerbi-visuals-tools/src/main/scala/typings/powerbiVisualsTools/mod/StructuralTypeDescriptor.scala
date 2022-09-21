package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes a structural type in the client type system. Leaf properties should use ValueType. */
trait StructuralTypeDescriptor extends StObject {
  
  var dataBars: js.UndefOr[js.Object] = js.undefined
  
  var expression: js.UndefOr[DefaultValueTypeDescriptor] = js.undefined
  
  var fill: js.UndefOr[FillTypeDescriptor] = js.undefined
  
  var fillRule: js.UndefOr[js.Object] = js.undefined
  
  var filter: js.UndefOr[FilterTypeDescriptor] = js.undefined
  
  var geoJson: js.UndefOr[js.Object] = js.undefined
  
  var image: js.UndefOr[js.Object] = js.undefined
  
  var paragraphs: js.UndefOr[js.Object] = js.undefined
  
  var queryTransform: js.UndefOr[js.Object] = js.undefined
}
object StructuralTypeDescriptor {
  
  inline def apply(): StructuralTypeDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructuralTypeDescriptor]
  }
  
  extension [Self <: StructuralTypeDescriptor](x: Self) {
    
    inline def setDataBars(value: js.Object): Self = StObject.set(x, "dataBars", value.asInstanceOf[js.Any])
    
    inline def setDataBarsUndefined: Self = StObject.set(x, "dataBars", js.undefined)
    
    inline def setExpression(value: DefaultValueTypeDescriptor): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setFill(value: FillTypeDescriptor): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillRule(value: js.Object): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
    
    inline def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFilter(value: FilterTypeDescriptor): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setGeoJson(value: js.Object): Self = StObject.set(x, "geoJson", value.asInstanceOf[js.Any])
    
    inline def setGeoJsonUndefined: Self = StObject.set(x, "geoJson", js.undefined)
    
    inline def setImage(value: js.Object): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setParagraphs(value: js.Object): Self = StObject.set(x, "paragraphs", value.asInstanceOf[js.Any])
    
    inline def setParagraphsUndefined: Self = StObject.set(x, "paragraphs", js.undefined)
    
    inline def setQueryTransform(value: js.Object): Self = StObject.set(x, "queryTransform", value.asInstanceOf[js.Any])
    
    inline def setQueryTransformUndefined: Self = StObject.set(x, "queryTransform", js.undefined)
  }
}
