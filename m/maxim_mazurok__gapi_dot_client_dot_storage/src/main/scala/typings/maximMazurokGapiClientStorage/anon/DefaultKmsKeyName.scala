package typings.maximMazurokGapiClientStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultKmsKeyName extends js.Object {
  
  /** A Cloud KMS key that will be used to encrypt objects inserted into this bucket, if no encryption method is specified. */
  var defaultKmsKeyName: js.UndefOr[String] = js.native
}
object DefaultKmsKeyName {
  
  @scala.inline
  def apply(): DefaultKmsKeyName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultKmsKeyName]
  }
  
  @scala.inline
  implicit class DefaultKmsKeyNameOps[Self <: DefaultKmsKeyName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultKmsKeyName(value: String): Self = this.set("defaultKmsKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultKmsKeyName: Self = this.set("defaultKmsKeyName", js.undefined)
  }
}
