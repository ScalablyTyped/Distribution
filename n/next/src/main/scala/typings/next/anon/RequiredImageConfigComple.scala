package typings.next.anon

import typings.next.distSharedLibImageConfigMod.ImageFormat
import typings.next.distSharedLibImageConfigMod.LoaderValue
import typings.next.distSharedLibImageConfigMod.RemotePattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<next.next/dist/shared/lib/image-config.ImageConfigComplete> */
trait RequiredImageConfigComple extends StObject {
  
  var contentSecurityPolicy: String
  
  var dangerouslyAllowSVG: Boolean
  
  var deviceSizes: js.Array[Double]
  
  var disableStaticImages: Boolean
  
  var domains: js.Array[String]
  
  var formats: js.Array[ImageFormat]
  
  var imageSizes: js.Array[Double]
  
  var loader: LoaderValue
  
  var minimumCacheTTL: Double
  
  var path: String
  
  var remotePatterns: js.Array[RemotePattern]
  
  var unoptimized: Boolean
}
object RequiredImageConfigComple {
  
  inline def apply(
    contentSecurityPolicy: String,
    dangerouslyAllowSVG: Boolean,
    deviceSizes: js.Array[Double],
    disableStaticImages: Boolean,
    domains: js.Array[String],
    formats: js.Array[ImageFormat],
    imageSizes: js.Array[Double],
    loader: LoaderValue,
    minimumCacheTTL: Double,
    path: String,
    remotePatterns: js.Array[RemotePattern],
    unoptimized: Boolean
  ): RequiredImageConfigComple = {
    val __obj = js.Dynamic.literal(contentSecurityPolicy = contentSecurityPolicy.asInstanceOf[js.Any], dangerouslyAllowSVG = dangerouslyAllowSVG.asInstanceOf[js.Any], deviceSizes = deviceSizes.asInstanceOf[js.Any], disableStaticImages = disableStaticImages.asInstanceOf[js.Any], domains = domains.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], imageSizes = imageSizes.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any], minimumCacheTTL = minimumCacheTTL.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], remotePatterns = remotePatterns.asInstanceOf[js.Any], unoptimized = unoptimized.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredImageConfigComple]
  }
  
  extension [Self <: RequiredImageConfigComple](x: Self) {
    
    inline def setContentSecurityPolicy(value: String): Self = StObject.set(x, "contentSecurityPolicy", value.asInstanceOf[js.Any])
    
    inline def setDangerouslyAllowSVG(value: Boolean): Self = StObject.set(x, "dangerouslyAllowSVG", value.asInstanceOf[js.Any])
    
    inline def setDeviceSizes(value: js.Array[Double]): Self = StObject.set(x, "deviceSizes", value.asInstanceOf[js.Any])
    
    inline def setDeviceSizesVarargs(value: Double*): Self = StObject.set(x, "deviceSizes", js.Array(value*))
    
    inline def setDisableStaticImages(value: Boolean): Self = StObject.set(x, "disableStaticImages", value.asInstanceOf[js.Any])
    
    inline def setDomains(value: js.Array[String]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsVarargs(value: String*): Self = StObject.set(x, "domains", js.Array(value*))
    
    inline def setFormats(value: js.Array[ImageFormat]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setFormatsVarargs(value: ImageFormat*): Self = StObject.set(x, "formats", js.Array(value*))
    
    inline def setImageSizes(value: js.Array[Double]): Self = StObject.set(x, "imageSizes", value.asInstanceOf[js.Any])
    
    inline def setImageSizesVarargs(value: Double*): Self = StObject.set(x, "imageSizes", js.Array(value*))
    
    inline def setLoader(value: LoaderValue): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setMinimumCacheTTL(value: Double): Self = StObject.set(x, "minimumCacheTTL", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRemotePatterns(value: js.Array[RemotePattern]): Self = StObject.set(x, "remotePatterns", value.asInstanceOf[js.Any])
    
    inline def setRemotePatternsVarargs(value: RemotePattern*): Self = StObject.set(x, "remotePatterns", js.Array(value*))
    
    inline def setUnoptimized(value: Boolean): Self = StObject.set(x, "unoptimized", value.asInstanceOf[js.Any])
  }
}
