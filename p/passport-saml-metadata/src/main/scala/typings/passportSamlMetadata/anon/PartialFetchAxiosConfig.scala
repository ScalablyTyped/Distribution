package typings.passportSamlMetadata.anon

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<passport-saml-metadata.passport-saml-metadata/src/fetch.FetchAxiosConfig> */
@js.native
trait PartialFetchAxiosConfig extends js.Object {
  
  var backupStore: js.UndefOr[Map[String, String]] = js.native
  
  var responseType: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object PartialFetchAxiosConfig {
  
  @scala.inline
  def apply(): PartialFetchAxiosConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFetchAxiosConfig]
  }
  
  @scala.inline
  implicit class PartialFetchAxiosConfigOps[Self <: PartialFetchAxiosConfig] (val x: Self) extends AnyVal {
    
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
    def setBackupStore(value: Map[String, String]): Self = this.set("backupStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupStore: Self = this.set("backupStore", js.undefined)
    
    @scala.inline
    def setResponseType(value: String): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
