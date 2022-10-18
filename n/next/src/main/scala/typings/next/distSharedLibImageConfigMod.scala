package typings.next

import typings.next.nextStrings.akamai
import typings.next.nextStrings.cloudinary
import typings.next.nextStrings.custom
import typings.next.nextStrings.default
import typings.next.nextStrings.http
import typings.next.nextStrings.https
import typings.next.nextStrings.imgix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibImageConfigMod {
  
  @JSImport("next/dist/shared/lib/image-config", "VALID_LOADERS")
  @js.native
  val VALID_LOADERS: js.Tuple5[default, imgix, cloudinary, akamai, custom] = js.native
  
  @JSImport("next/dist/shared/lib/image-config", "imageConfigDefault")
  @js.native
  val imageConfigDefault: ImageConfigComplete = js.native
  
  /* Inlined std.Partial<next.next/dist/shared/lib/image-config.ImageConfigComplete> */
  trait ImageConfig extends StObject {
    
    var contentSecurityPolicy: js.UndefOr[String] = js.undefined
    
    var dangerouslyAllowSVG: js.UndefOr[Boolean] = js.undefined
    
    var deviceSizes: js.UndefOr[js.Array[Double]] = js.undefined
    
    var disableStaticImages: js.UndefOr[Boolean] = js.undefined
    
    var domains: js.UndefOr[js.Array[String]] = js.undefined
    
    var formats: js.UndefOr[js.Array[ImageFormat]] = js.undefined
    
    var imageSizes: js.UndefOr[js.Array[Double]] = js.undefined
    
    var loader: js.UndefOr[LoaderValue] = js.undefined
    
    var minimumCacheTTL: js.UndefOr[Double] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var remotePatterns: js.UndefOr[js.Array[RemotePattern]] = js.undefined
    
    var unoptimized: js.UndefOr[Boolean] = js.undefined
  }
  object ImageConfig {
    
    inline def apply(): ImageConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageConfig]
    }
    
    extension [Self <: ImageConfig](x: Self) {
      
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
  
  trait ImageConfigComplete extends StObject {
    
    /** @see [Dangerously Allow SVG](https://nextjs.org/docs/api-reference/next/image#dangerously-allow-svg) */
    var contentSecurityPolicy: String
    
    /** @see [Dangerously Allow SVG](https://nextjs.org/docs/api-reference/next/image#dangerously-allow-svg) */
    var dangerouslyAllowSVG: Boolean
    
    /** @see [Device sizes documentation](https://nextjs.org/docs/api-reference/next/image#device-sizes) */
    var deviceSizes: js.Array[Double]
    
    /** @see [Disable static image import configuration](https://nextjs.org/docs/api-reference/next/image#disable-static-imports) */
    var disableStaticImages: Boolean
    
    /**
      * @see [Image domains configuration](https://nextjs.org/docs/api-reference/next/image#domains)
      */
    var domains: js.Array[String]
    
    /** @see [Acceptable formats](https://nextjs.org/docs/api-reference/next/image#acceptable-formats) */
    var formats: js.Array[ImageFormat]
    
    /** @see [Image sizing documentation](https://nextjs.org/docs/basic-features/image-optimization#image-sizing) */
    var imageSizes: js.Array[Double]
    
    /** @see [Image loaders configuration](https://nextjs.org/docs/basic-features/image-optimization#loaders) */
    var loader: LoaderValue
    
    /** @see [Cache behavior](https://nextjs.org/docs/api-reference/next/image#caching-behavior) */
    var minimumCacheTTL: Double
    
    /** @see [Image loader configuration](https://nextjs.org/docs/api-reference/next/image#loader-configuration) */
    var path: String
    
    /** @see [Remote Patterns](https://nextjs.org/docs/api-reference/next/image#remote-patterns) */
    var remotePatterns: js.Array[RemotePattern]
    
    /** @see [Unoptimized](https://nextjs.org/docs/api-reference/next/image#unoptimized) */
    var unoptimized: Boolean
  }
  object ImageConfigComplete {
    
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
    ): ImageConfigComplete = {
      val __obj = js.Dynamic.literal(contentSecurityPolicy = contentSecurityPolicy.asInstanceOf[js.Any], dangerouslyAllowSVG = dangerouslyAllowSVG.asInstanceOf[js.Any], deviceSizes = deviceSizes.asInstanceOf[js.Any], disableStaticImages = disableStaticImages.asInstanceOf[js.Any], domains = domains.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], imageSizes = imageSizes.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any], minimumCacheTTL = minimumCacheTTL.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], remotePatterns = remotePatterns.asInstanceOf[js.Any], unoptimized = unoptimized.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageConfigComplete]
    }
    
    extension [Self <: ImageConfigComplete](x: Self) {
      
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.nextStrings.imageSlashavif
    - typings.next.nextStrings.imageSlashwebp
  */
  trait ImageFormat extends StObject
  object ImageFormat {
    
    inline def imageSlashavif: typings.next.nextStrings.imageSlashavif = "image/avif".asInstanceOf[typings.next.nextStrings.imageSlashavif]
    
    inline def imageSlashwebp: typings.next.nextStrings.imageSlashwebp = "image/webp".asInstanceOf[typings.next.nextStrings.imageSlashwebp]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.nextStrings.default
    - typings.next.nextStrings.imgix
    - typings.next.nextStrings.cloudinary
    - typings.next.nextStrings.akamai
    - typings.next.nextStrings.custom
  */
  trait LoaderValue extends StObject
  
  trait RemotePattern extends StObject {
    
    /**
      * Can be literal or wildcard.
      * Single `*` matches a single subdomain.
      * Double `**` matches any number of subdomains.
      */
    var hostname: String
    
    /**
      * Can be literal or wildcard.
      * Single `*` matches a single path segment.
      * Double `**` matches any number of path segments.
      */
    var pathname: js.UndefOr[String] = js.undefined
    
    /**
      * Can be literal port such as `8080` or empty string
      * meaning no port.
      */
    var port: js.UndefOr[String] = js.undefined
    
    /**
      * Must be `http` or `https`.
      */
    var protocol: js.UndefOr[http | https] = js.undefined
  }
  object RemotePattern {
    
    inline def apply(hostname: String): RemotePattern = {
      val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemotePattern]
    }
    
    extension [Self <: RemotePattern](x: Self) {
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: http | https): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    }
  }
}
