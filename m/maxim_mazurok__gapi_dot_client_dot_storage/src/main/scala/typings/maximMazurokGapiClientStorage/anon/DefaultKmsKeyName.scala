package typings.maximMazurokGapiClientStorage.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultKmsKeyName extends StObject {
  
  /** A Cloud KMS key that will be used to encrypt objects inserted into this bucket, if no encryption method is specified. */
  var defaultKmsKeyName: js.UndefOr[String] = js.undefined
}
object DefaultKmsKeyName {
  
  inline def apply(): DefaultKmsKeyName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultKmsKeyName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultKmsKeyName] (val x: Self) extends AnyVal {
    
    inline def setDefaultKmsKeyName(value: String): Self = StObject.set(x, "defaultKmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setDefaultKmsKeyNameUndefined: Self = StObject.set(x, "defaultKmsKeyName", js.undefined)
  }
}
