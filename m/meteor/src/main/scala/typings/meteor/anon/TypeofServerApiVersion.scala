package typings.meteor.anon

import typings.meteor.meteorStrings.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofServerApiVersion extends StObject {
  
  val v1: `1`
}
object TypeofServerApiVersion {
  
  inline def apply(): TypeofServerApiVersion = {
    val __obj = js.Dynamic.literal(v1 = "1")
    __obj.asInstanceOf[TypeofServerApiVersion]
  }
  
  extension [Self <: TypeofServerApiVersion](x: Self) {
    
    inline def setV1(value: `1`): Self = StObject.set(x, "v1", value.asInstanceOf[js.Any])
  }
}
