package typings.nodeEasyCert.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertManagerOptions extends js.Object {
  
  /** The default attributes of a generated cert, you can change it here */
  var defaultCertAttrs: js.UndefOr[js.Array[CertificateAttribute]] = js.native
  
  /**
    * Path where certificates should be stored.
    * @default "/{USER_HOME}/{.node_easy_certs}/"
    */
  var rootDirPath: js.UndefOr[String] = js.native
}
object CertManagerOptions {
  
  @scala.inline
  def apply(): CertManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertManagerOptions]
  }
  
  @scala.inline
  implicit class CertManagerOptionsOps[Self <: CertManagerOptions] (val x: Self) extends AnyVal {
    
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
    def setDefaultCertAttrsVarargs(value: CertificateAttribute*): Self = this.set("defaultCertAttrs", js.Array(value :_*))
    
    @scala.inline
    def setDefaultCertAttrs(value: js.Array[CertificateAttribute]): Self = this.set("defaultCertAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCertAttrs: Self = this.set("defaultCertAttrs", js.undefined)
    
    @scala.inline
    def setRootDirPath(value: String): Self = this.set("rootDirPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootDirPath: Self = this.set("rootDirPath", js.undefined)
  }
}
