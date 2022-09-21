package typings.parse.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait As extends StObject {
  
  var as: String
  
  var foreignField: String
  
  var from: String
  
  var localField: String
}
object As {
  
  inline def apply(as: String, foreignField: String, from: String, localField: String): As = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], foreignField = foreignField.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], localField = localField.asInstanceOf[js.Any])
    __obj.asInstanceOf[As]
  }
  
  extension [Self <: As](x: Self) {
    
    inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setForeignField(value: String): Self = StObject.set(x, "foreignField", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setLocalField(value: String): Self = StObject.set(x, "localField", value.asInstanceOf[js.Any])
  }
}
