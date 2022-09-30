package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISecretBag extends StObject {
  
  var secretTypeId: String
  
  var secretValue: SchemaCompatible
}
object ISecretBag {
  
  inline def apply(secretTypeId: String, secretValue: SchemaCompatible): ISecretBag = {
    val __obj = js.Dynamic.literal(secretTypeId = secretTypeId.asInstanceOf[js.Any], secretValue = secretValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISecretBag]
  }
  
  extension [Self <: ISecretBag](x: Self) {
    
    inline def setSecretTypeId(value: String): Self = StObject.set(x, "secretTypeId", value.asInstanceOf[js.Any])
    
    inline def setSecretValue(value: SchemaCompatible): Self = StObject.set(x, "secretValue", value.asInstanceOf[js.Any])
  }
}
