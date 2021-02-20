package typings.nextServer.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmpBindInitData extends StObject {
  
  var ampBindInitData: Boolean = js.native
  
  var assetPrefix: js.UndefOr[String] = js.native
  
  var buildId: String = js.native
  
  var canonicalBase: String = js.native
  
  var dev: js.UndefOr[Boolean] = js.native
  
  var documentMiddlewareEnabled: Boolean = js.native
  
  var generateEtags: Boolean = js.native
  
  var poweredByHeader: Boolean = js.native
  
  var runtimeConfig: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var staticMarkup: Boolean = js.native
}
object AmpBindInitData {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class AmpBindInitDataMutableBuilder[Self <: AmpBindInitData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmpBindInitData(value: Boolean): Self = StObject.set(x, "ampBindInitData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetPrefix(value: String): Self = StObject.set(x, "assetPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetPrefixUndefined: Self = StObject.set(x, "assetPrefix", js.undefined)
    
    @scala.inline
    def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanonicalBase(value: String): Self = StObject.set(x, "canonicalBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
    
    @scala.inline
    def setDocumentMiddlewareEnabled(value: Boolean): Self = StObject.set(x, "documentMiddlewareEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateEtags(value: Boolean): Self = StObject.set(x, "generateEtags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoweredByHeader(value: Boolean): Self = StObject.set(x, "poweredByHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeConfig(value: StringDictionary[js.Any]): Self = StObject.set(x, "runtimeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeConfigUndefined: Self = StObject.set(x, "runtimeConfig", js.undefined)
    
    @scala.inline
    def setStaticMarkup(value: Boolean): Self = StObject.set(x, "staticMarkup", value.asInstanceOf[js.Any])
  }
}
