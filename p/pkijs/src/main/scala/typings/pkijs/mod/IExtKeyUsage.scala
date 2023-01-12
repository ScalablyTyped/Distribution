package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExtKeyUsage extends StObject {
  
  var keyPurposes: js.Array[String]
}
object IExtKeyUsage {
  
  inline def apply(keyPurposes: js.Array[String]): IExtKeyUsage = {
    val __obj = js.Dynamic.literal(keyPurposes = keyPurposes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExtKeyUsage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IExtKeyUsage] (val x: Self) extends AnyVal {
    
    inline def setKeyPurposes(value: js.Array[String]): Self = StObject.set(x, "keyPurposes", value.asInstanceOf[js.Any])
    
    inline def setKeyPurposesVarargs(value: String*): Self = StObject.set(x, "keyPurposes", js.Array(value*))
  }
}
