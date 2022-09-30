package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtKeyUsageJson extends StObject {
  
  var keyPurposes: js.Array[String]
}
object ExtKeyUsageJson {
  
  inline def apply(keyPurposes: js.Array[String]): ExtKeyUsageJson = {
    val __obj = js.Dynamic.literal(keyPurposes = keyPurposes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtKeyUsageJson]
  }
  
  extension [Self <: ExtKeyUsageJson](x: Self) {
    
    inline def setKeyPurposes(value: js.Array[String]): Self = StObject.set(x, "keyPurposes", value.asInstanceOf[js.Any])
    
    inline def setKeyPurposesVarargs(value: String*): Self = StObject.set(x, "keyPurposes", js.Array(value*))
  }
}
