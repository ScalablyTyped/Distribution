package typings.parse.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectFromField extends StObject {
  
  var as: String
  
  var connectFromField: String
  
  var connectToField: String
  
  var depthField: js.UndefOr[String] = js.undefined
  
  var from: String
  
  var maxDepth: js.UndefOr[Double] = js.undefined
  
  var restrictSearchWithMatch: js.UndefOr[Record[String, Any]] = js.undefined
  
  var startWith: js.UndefOr[String] = js.undefined
}
object ConnectFromField {
  
  inline def apply(as: String, connectFromField: String, connectToField: String, from: String): ConnectFromField = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], connectFromField = connectFromField.asInstanceOf[js.Any], connectToField = connectToField.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectFromField]
  }
  
  extension [Self <: ConnectFromField](x: Self) {
    
    inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setConnectFromField(value: String): Self = StObject.set(x, "connectFromField", value.asInstanceOf[js.Any])
    
    inline def setConnectToField(value: String): Self = StObject.set(x, "connectToField", value.asInstanceOf[js.Any])
    
    inline def setDepthField(value: String): Self = StObject.set(x, "depthField", value.asInstanceOf[js.Any])
    
    inline def setDepthFieldUndefined: Self = StObject.set(x, "depthField", js.undefined)
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
    
    inline def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
    
    inline def setRestrictSearchWithMatch(value: Record[String, Any]): Self = StObject.set(x, "restrictSearchWithMatch", value.asInstanceOf[js.Any])
    
    inline def setRestrictSearchWithMatchUndefined: Self = StObject.set(x, "restrictSearchWithMatch", js.undefined)
    
    inline def setStartWith(value: String): Self = StObject.set(x, "startWith", value.asInstanceOf[js.Any])
    
    inline def setStartWithUndefined: Self = StObject.set(x, "startWith", js.undefined)
  }
}
