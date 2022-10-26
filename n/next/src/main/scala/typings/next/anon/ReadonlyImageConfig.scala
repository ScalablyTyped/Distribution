package typings.next.anon

import typings.next.distSharedLibImageConfigMod.ImageFormat
import typings.next.distSharedLibImageConfigMod.LoaderValue
import typings.next.distSharedLibImageConfigMod.RemotePattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<next.next/dist/shared/lib/image-config.ImageConfig> */
trait ReadonlyImageConfig extends StObject {
  
  val contentSecurityPolicy: js.UndefOr[String] = js.undefined
  
  val dangerouslyAllowSVG: js.UndefOr[Boolean] = js.undefined
  
  val deviceSizes: js.UndefOr[js.Array[Double]] = js.undefined
  
  val disableStaticImages: js.UndefOr[Boolean] = js.undefined
  
  val domains: js.UndefOr[js.Array[String]] = js.undefined
  
  val formats: js.UndefOr[js.Array[ImageFormat]] = js.undefined
  
  val imageSizes: js.UndefOr[js.Array[Double]] = js.undefined
  
  val loader: js.UndefOr[LoaderValue] = js.undefined
  
  val loaderFile: js.UndefOr[String] = js.undefined
  
  val minimumCacheTTL: js.UndefOr[Double] = js.undefined
  
  val path: js.UndefOr[String] = js.undefined
  
  val remotePatterns: js.UndefOr[js.Array[RemotePattern]] = js.undefined
  
  val unoptimized: js.UndefOr[Boolean] = js.undefined
}
object ReadonlyImageConfig {
  
  inline def apply(): ReadonlyImageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyImageConfig]
  }
  
  extension [Self <: ReadonlyImageConfig](x: Self) {
    
    inline def setContentSecurityPolicy(value: String): Self = StObject.set(x, "contentSecurityPolicy", value.asInstanceOf[js.Any])
    
    inline def setContentSecurityPolicyUndefined: Self = StObject.set(x, "contentSecurityPolicy", js.undefined)
    
    inline def setDangerouslyAllowSVG(value: Boolean): Self = StObject.set(x, "dangerouslyAllowSVG", value.asInstanceOf[js.Any])
    
    inline def setDangerouslyAllowSVGUndefined: Self = StObject.set(x, "dangerouslyAllowSVG", js.undefined)
    
    inline def setDeviceSizes(value: js.Array[Double]): Self = StObject.set(x, "deviceSizes", value.asInstanceOf[js.Any])
    
    inline def setDeviceSizesUndefined: Self = StObject.set(x, "deviceSizes", js.undefined)
    
    inline def setDeviceSizesVarargs(value: Double*): Self = StObject.set(x, "deviceSizes", js.Array(value*))
    
    inline def setDisableStaticImages(value: Boolean): Self = StObject.set(x, "disableStaticImages", value.asInstanceOf[js.Any])
    
    inline def setDisableStaticImagesUndefined: Self = StObject.set(x, "disableStaticImages", js.undefined)
    
    inline def setDomains(value: js.Array[String]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
    
    inline def setDomainsVarargs(value: String*): Self = StObject.set(x, "domains", js.Array(value*))
    
    inline def setFormats(value: js.Array[ImageFormat]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    
    inline def setFormatsVarargs(value: ImageFormat*): Self = StObject.set(x, "formats", js.Array(value*))
    
    inline def setImageSizes(value: js.Array[Double]): Self = StObject.set(x, "imageSizes", value.asInstanceOf[js.Any])
    
    inline def setImageSizesUndefined: Self = StObject.set(x, "imageSizes", js.undefined)
    
    inline def setImageSizesVarargs(value: Double*): Self = StObject.set(x, "imageSizes", js.Array(value*))
    
    inline def setLoader(value: LoaderValue): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setLoaderFile(value: String): Self = StObject.set(x, "loaderFile", value.asInstanceOf[js.Any])
    
    inline def setLoaderFileUndefined: Self = StObject.set(x, "loaderFile", js.undefined)
    
    inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    inline def setMinimumCacheTTL(value: Double): Self = StObject.set(x, "minimumCacheTTL", value.asInstanceOf[js.Any])
    
    inline def setMinimumCacheTTLUndefined: Self = StObject.set(x, "minimumCacheTTL", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setRemotePatterns(value: js.Array[RemotePattern]): Self = StObject.set(x, "remotePatterns", value.asInstanceOf[js.Any])
    
    inline def setRemotePatternsUndefined: Self = StObject.set(x, "remotePatterns", js.undefined)
    
    inline def setRemotePatternsVarargs(value: RemotePattern*): Self = StObject.set(x, "remotePatterns", js.Array(value*))
    
    inline def setUnoptimized(value: Boolean): Self = StObject.set(x, "unoptimized", value.asInstanceOf[js.Any])
    
    inline def setUnoptimizedUndefined: Self = StObject.set(x, "unoptimized", js.undefined)
  }
}
