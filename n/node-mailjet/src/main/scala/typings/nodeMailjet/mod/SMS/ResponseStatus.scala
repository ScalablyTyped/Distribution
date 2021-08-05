package typings.nodeMailjet.mod.SMS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseStatus extends StObject {
  
  val Code: Double
  
  val Description: String
  
  val Name: String
}
object ResponseStatus {
  
  inline def apply(Code: Double, Description: String, Name: String): ResponseStatus = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseStatus]
  }
  
  extension [Self <: ResponseStatus](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
