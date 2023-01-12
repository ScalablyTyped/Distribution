package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApkDetail extends StObject {
  
  var apkManifest: js.UndefOr[ApkManifest] = js.undefined
}
object ApkDetail {
  
  inline def apply(): ApkDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApkDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApkDetail] (val x: Self) extends AnyVal {
    
    inline def setApkManifest(value: ApkManifest): Self = StObject.set(x, "apkManifest", value.asInstanceOf[js.Any])
    
    inline def setApkManifestUndefined: Self = StObject.set(x, "apkManifest", js.undefined)
  }
}
