package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildVersion extends StObject {
  
  /** Free-form build information. Envoy defines several well known keys in the source/common/version/version.h file */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /** SemVer version of extension. */
  var version: js.UndefOr[SemanticVersion] = js.undefined
}
object BuildVersion {
  
  inline def apply(): BuildVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildVersion] (val x: Self) extends AnyVal {
    
    inline def setMetadata(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setVersion(value: SemanticVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
