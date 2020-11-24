package typings.nextServer.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmpBindInitData extends js.Object {
  
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
  implicit class AmpBindInitDataOps[Self <: AmpBindInitData] (val x: Self) extends AnyVal {
    
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
    def setAmpBindInitData(value: Boolean): Self = this.set("ampBindInitData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildId(value: String): Self = this.set("buildId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanonicalBase(value: String): Self = this.set("canonicalBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentMiddlewareEnabled(value: Boolean): Self = this.set("documentMiddlewareEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateEtags(value: Boolean): Self = this.set("generateEtags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoweredByHeader(value: Boolean): Self = this.set("poweredByHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticMarkup(value: Boolean): Self = this.set("staticMarkup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetPrefix(value: String): Self = this.set("assetPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetPrefix: Self = this.set("assetPrefix", js.undefined)
    
    @scala.inline
    def setDev(value: Boolean): Self = this.set("dev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDev: Self = this.set("dev", js.undefined)
    
    @scala.inline
    def setRuntimeConfig(value: StringDictionary[js.Any]): Self = this.set("runtimeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntimeConfig: Self = this.set("runtimeConfig", js.undefined)
  }
}
