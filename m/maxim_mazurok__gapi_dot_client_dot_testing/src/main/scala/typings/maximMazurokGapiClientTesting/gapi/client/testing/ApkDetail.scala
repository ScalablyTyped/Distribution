package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApkDetail extends js.Object {
  
  var apkManifest: js.UndefOr[ApkManifest] = js.native
}
object ApkDetail {
  
  @scala.inline
  def apply(): ApkDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApkDetail]
  }
  
  @scala.inline
  implicit class ApkDetailOps[Self <: ApkDetail] (val x: Self) extends AnyVal {
    
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
    def setApkManifest(value: ApkManifest): Self = this.set("apkManifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApkManifest: Self = this.set("apkManifest", js.undefined)
  }
}
