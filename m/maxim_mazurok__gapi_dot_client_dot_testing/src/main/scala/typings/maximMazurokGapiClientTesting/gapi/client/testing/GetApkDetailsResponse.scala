package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetApkDetailsResponse extends StObject {
  
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
  implicit class GetApkDetailsResponseMutableBuilder[Self <: GetApkDetailsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApkDetail(value: ApkDetail): Self = StObject.set(x, "apkDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApkDetailUndefined: Self = StObject.set(x, "apkDetail", js.undefined)
  }
}
