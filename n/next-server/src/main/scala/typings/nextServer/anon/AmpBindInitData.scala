package typings.nextServer.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmpBindInitData extends StObject {
  
  var ampBindInitData: Boolean
  
  var assetPrefix: js.UndefOr[String] = js.undefined
  
  var buildId: String
  
  var canonicalBase: String
  
  var dev: js.UndefOr[Boolean] = js.undefined
  
  var documentMiddlewareEnabled: Boolean
  
  var generateEtags: Boolean
  
  var poweredByHeader: Boolean
  
  var runtimeConfig: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var staticMarkup: Boolean
}
object AmpBindInitData {
  
  inline def apply(
    ampBindInitData: Boolean,
    buildId: String,
    canonicalBase: String,
    documentMiddlewareEnabled: Boolean,
    generateEtags: Boolean,
    poweredByHeader: Boolean,
    staticMarkup: Boolean
  ): AmpBindInitData = {
    val __obj = js.Dynamic.literal(ampBindInitData = ampBindInitData.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], canonicalBase = canonicalBase.asInstanceOf[js.Any], documentMiddlewareEnabled = documentMiddlewareEnabled.asInstanceOf[js.Any], generateEtags = generateEtags.asInstanceOf[js.Any], poweredByHeader = poweredByHeader.asInstanceOf[js.Any], staticMarkup = staticMarkup.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmpBindInitData]
  }
  
  extension [Self <: AmpBindInitData](x: Self) {
    
    inline def setAmpBindInitData(value: Boolean): Self = StObject.set(x, "ampBindInitData", value.asInstanceOf[js.Any])
    
    inline def setAssetPrefix(value: String): Self = StObject.set(x, "assetPrefix", value.asInstanceOf[js.Any])
    
    inline def setAssetPrefixUndefined: Self = StObject.set(x, "assetPrefix", js.undefined)
    
    inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setCanonicalBase(value: String): Self = StObject.set(x, "canonicalBase", value.asInstanceOf[js.Any])
    
    inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
    
    inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
    
    inline def setDocumentMiddlewareEnabled(value: Boolean): Self = StObject.set(x, "documentMiddlewareEnabled", value.asInstanceOf[js.Any])
    
    inline def setGenerateEtags(value: Boolean): Self = StObject.set(x, "generateEtags", value.asInstanceOf[js.Any])
    
    inline def setPoweredByHeader(value: Boolean): Self = StObject.set(x, "poweredByHeader", value.asInstanceOf[js.Any])
    
    inline def setRuntimeConfig(value: StringDictionary[js.Any]): Self = StObject.set(x, "runtimeConfig", value.asInstanceOf[js.Any])
    
    inline def setRuntimeConfigUndefined: Self = StObject.set(x, "runtimeConfig", js.undefined)
    
    inline def setStaticMarkup(value: Boolean): Self = StObject.set(x, "staticMarkup", value.asInstanceOf[js.Any])
  }
}
