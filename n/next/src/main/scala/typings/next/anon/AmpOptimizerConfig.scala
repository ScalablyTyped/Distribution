package typings.next.anon

import org.scalablytyped.runtime.StringDictionary
import typings.next.apiUtilsMod.ApiPreviewProps
import typings.next.fontUtilsMod.FontManifest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmpOptimizerConfig extends js.Object {
  
  var ampOptimizerConfig: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var assetPrefix: js.UndefOr[String] = js.native
  
  var basePath: String = js.native
  
  var buildId: String = js.native
  
  var canonicalBase: String = js.native
  
  var customServer: js.UndefOr[Boolean] = js.native
  
  var defaultLocale: js.UndefOr[String] = js.native
  
  var dev: js.UndefOr[Boolean] = js.native
  
  var fontManifest: FontManifest = js.native
  
  var generateEtags: Boolean = js.native
  
  var images: String = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var locales: js.UndefOr[js.Array[String]] = js.native
  
  var optimizeFonts: Boolean = js.native
  
  var optimizeImages: Boolean = js.native
  
  var poweredByHeader: Boolean = js.native
  
  var previewProps: ApiPreviewProps = js.native
  
  var runtimeConfig: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object AmpOptimizerConfig {
  
  @scala.inline
  def apply(
    basePath: String,
    buildId: String,
    canonicalBase: String,
    fontManifest: FontManifest,
    generateEtags: Boolean,
    images: String,
    optimizeFonts: Boolean,
    optimizeImages: Boolean,
    poweredByHeader: Boolean,
    previewProps: ApiPreviewProps
  ): AmpOptimizerConfig = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], canonicalBase = canonicalBase.asInstanceOf[js.Any], fontManifest = fontManifest.asInstanceOf[js.Any], generateEtags = generateEtags.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], optimizeFonts = optimizeFonts.asInstanceOf[js.Any], optimizeImages = optimizeImages.asInstanceOf[js.Any], poweredByHeader = poweredByHeader.asInstanceOf[js.Any], previewProps = previewProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmpOptimizerConfig]
  }
  
  @scala.inline
  implicit class AmpOptimizerConfigOps[Self <: AmpOptimizerConfig] (val x: Self) extends AnyVal {
    
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
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildId(value: String): Self = this.set("buildId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanonicalBase(value: String): Self = this.set("canonicalBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontManifestVarargs(value: Content*): Self = this.set("fontManifest", js.Array(value :_*))
    
    @scala.inline
    def setFontManifest(value: FontManifest): Self = this.set("fontManifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateEtags(value: Boolean): Self = this.set("generateEtags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages(value: String): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizeFonts(value: Boolean): Self = this.set("optimizeFonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizeImages(value: Boolean): Self = this.set("optimizeImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoweredByHeader(value: Boolean): Self = this.set("poweredByHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewProps(value: ApiPreviewProps): Self = this.set("previewProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmpOptimizerConfig(value: StringDictionary[js.Any]): Self = this.set("ampOptimizerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmpOptimizerConfig: Self = this.set("ampOptimizerConfig", js.undefined)
    
    @scala.inline
    def setAssetPrefix(value: String): Self = this.set("assetPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetPrefix: Self = this.set("assetPrefix", js.undefined)
    
    @scala.inline
    def setCustomServer(value: Boolean): Self = this.set("customServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomServer: Self = this.set("customServer", js.undefined)
    
    @scala.inline
    def setDefaultLocale(value: String): Self = this.set("defaultLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLocale: Self = this.set("defaultLocale", js.undefined)
    
    @scala.inline
    def setDev(value: Boolean): Self = this.set("dev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDev: Self = this.set("dev", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setLocalesVarargs(value: String*): Self = this.set("locales", js.Array(value :_*))
    
    @scala.inline
    def setLocales(value: js.Array[String]): Self = this.set("locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocales: Self = this.set("locales", js.undefined)
    
    @scala.inline
    def setRuntimeConfig(value: StringDictionary[js.Any]): Self = this.set("runtimeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntimeConfig: Self = this.set("runtimeConfig", js.undefined)
  }
}
