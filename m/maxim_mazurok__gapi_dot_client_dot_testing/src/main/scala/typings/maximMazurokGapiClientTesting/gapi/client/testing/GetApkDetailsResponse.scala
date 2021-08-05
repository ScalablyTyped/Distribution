package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApkDetailsResponse extends StObject {
  
  /** Details of the Android APK. */
  var apkDetail: js.UndefOr[ApkDetail] = js.undefined
}
object GetApkDetailsResponse {
  
  inline def apply(): GetApkDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetApkDetailsResponse]
  }
  
  extension [Self <: GetApkDetailsResponse](x: Self) {
    
    inline def setApkDetail(value: ApkDetail): Self = StObject.set(x, "apkDetail", value.asInstanceOf[js.Any])
    
    inline def setApkDetailUndefined: Self = StObject.set(x, "apkDetail", js.undefined)
  }
}
