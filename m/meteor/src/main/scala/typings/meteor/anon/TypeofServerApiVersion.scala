package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofServerApiVersion extends StObject {
  
  val v1: typings.meteor.meteorStrings.`1`
}
object TypeofServerApiVersion {
  
  inline def apply(): TypeofServerApiVersion = {
    val __obj = js.Dynamic.literal(v1 = "1")
    __obj.asInstanceOf[TypeofServerApiVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofServerApiVersion] (val x: Self) extends AnyVal {
    
    inline def setV1(value: typings.meteor.meteorStrings.`1`): Self = StObject.set(x, "v1", value.asInstanceOf[js.Any])
  }
}
