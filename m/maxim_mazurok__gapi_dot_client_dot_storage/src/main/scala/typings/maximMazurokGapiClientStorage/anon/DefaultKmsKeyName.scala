package typings.maximMazurokGapiClientStorage.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultKmsKeyName extends StObject {
  
  /** A Cloud KMS key that will be used to encrypt objects inserted into this bucket, if no encryption method is specified. */
  var defaultKmsKeyName: js.UndefOr[String] = js.undefined
}
object DefaultKmsKeyName {
  
  @scala.inline
  def apply(): DefaultKmsKeyName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultKmsKeyName]
  }
  
  @scala.inline
  implicit class DefaultKmsKeyNameMutableBuilder[Self <: DefaultKmsKeyName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultKmsKeyName(value: String): Self = StObject.set(x, "defaultKmsKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultKmsKeyNameUndefined: Self = StObject.set(x, "defaultKmsKeyName", js.undefined)
  }
}
