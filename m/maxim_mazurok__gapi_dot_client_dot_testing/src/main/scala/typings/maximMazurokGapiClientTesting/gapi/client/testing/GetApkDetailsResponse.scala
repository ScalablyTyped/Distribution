package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetApkDetailsResponse extends js.Object {
  
  /** Details of the Android APK. */
  var apkDetail: js.UndefOr[ApkDetail] = js.native
}
object GetApkDetailsResponse {
  
  @scala.inline
  def apply(): GetApkDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetApkDetailsResponse]
  }
  
  @scala.inline
  implicit class GetApkDetailsResponseOps[Self <: GetApkDetailsResponse] (val x: Self) extends AnyVal {
    
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
    def setApkDetail(value: ApkDetail): Self = this.set("apkDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApkDetail: Self = this.set("apkDetail", js.undefined)
  }
}
