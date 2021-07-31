package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApkDetail extends StObject {
  
  var apkManifest: js.UndefOr[ApkManifest] = js.undefined
}
object ApkDetail {
  
  @scala.inline
  def apply(): ApkDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApkDetail]
  }
  
  @scala.inline
  implicit class ApkDetailMutableBuilder[Self <: ApkDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApkManifest(value: ApkManifest): Self = StObject.set(x, "apkManifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApkManifestUndefined: Self = StObject.set(x, "apkManifest", js.undefined)
  }
}
