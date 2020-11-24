package typings.maximMazurokGapiClientSqladmin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertPath extends js.Object {
  
  /** Path to the Certificate (.cer) in Cloud Storage, in the form *gs://bucketName/fileName*. The instance must have write permissions to the bucket and read access to the file. */
  var certPath: js.UndefOr[String] = js.native
  
  /** Password that encrypts the private key */
  var pvkPassword: js.UndefOr[String] = js.native
  
  /**
    * Path to the Certificate Private Key (.pvk) in Cloud Storage, in the form *gs://bucketName/fileName*. The instance must have write permissions to the bucket and read access
    * to the file.
    */
  var pvkPath: js.UndefOr[String] = js.native
}
object CertPath {
  
  @scala.inline
  def apply(): CertPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertPath]
  }
  
  @scala.inline
  implicit class CertPathOps[Self <: CertPath] (val x: Self) extends AnyVal {
    
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
    def setCertPath(value: String): Self = this.set("certPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertPath: Self = this.set("certPath", js.undefined)
    
    @scala.inline
    def setPvkPassword(value: String): Self = this.set("pvkPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePvkPassword: Self = this.set("pvkPassword", js.undefined)
    
    @scala.inline
    def setPvkPath(value: String): Self = this.set("pvkPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePvkPath: Self = this.set("pvkPath", js.undefined)
  }
}
