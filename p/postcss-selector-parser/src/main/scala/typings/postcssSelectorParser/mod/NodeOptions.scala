package typings.postcssSelectorParser.mod

import typings.postcssSelectorParser.anon.PartialSpaces
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeOptions[Value] extends StObject {
  
  var source: js.UndefOr[NodeSource] = js.undefined
  
  var sourceIndex: js.UndefOr[Double] = js.undefined
  
  var spaces: js.UndefOr[PartialSpaces] = js.undefined
  
  var value: Value
}
object NodeOptions {
  
  inline def apply[Value](value: Value): NodeOptions[Value] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeOptions[Value]]
  }
  
  extension [Self <: NodeOptions[?], Value](x: Self & NodeOptions[Value]) {
    
    inline def setSource(value: NodeSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceIndex(value: Double): Self = StObject.set(x, "sourceIndex", value.asInstanceOf[js.Any])
    
    inline def setSourceIndexUndefined: Self = StObject.set(x, "sourceIndex", js.undefined)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSpaces(value: PartialSpaces): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
    
    inline def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
    
    inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
