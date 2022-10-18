package typings.oembedParser

import typings.oembedParser.oembedParserStrings.link
import typings.oembedParser.oembedParserStrings.photo
import typings.oembedParser.oembedParserStrings.rich
import typings.oembedParser.oembedParserStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsMod {
  
  @JSImport("oembed-parser/dist/cjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extract(url: String): js.Promise[OembedData] = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[OembedData]]
  inline def extract(url: String, params: Any): js.Promise[OembedData] = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(url.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OembedData]]
  
  inline def findProvider(url: String): FindProviderResult = ^.asInstanceOf[js.Dynamic].applyDynamic("findProvider")(url.asInstanceOf[js.Any]).asInstanceOf[FindProviderResult]
  
  inline def hasProvider(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasProvider")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def setProviderList(providers: js.Array[Provider]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setProviderList")(providers.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Endpoint extends StObject {
    
    // "json" "xml"
    var discovery: js.UndefOr[Boolean] = js.undefined
    
    var formats: js.UndefOr[js.Array[String]] = js.undefined
    
    var schemes: js.UndefOr[js.Array[String]] = js.undefined
    
    var url: String
  }
  object Endpoint {
    
    inline def apply(url: String): Endpoint = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Endpoint]
    }
    
    extension [Self <: Endpoint](x: Self) {
      
      inline def setDiscovery(value: Boolean): Self = StObject.set(x, "discovery", value.asInstanceOf[js.Any])
      
      inline def setDiscoveryUndefined: Self = StObject.set(x, "discovery", js.undefined)
      
      inline def setFormats(value: js.Array[String]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      inline def setFormatsVarargs(value: String*): Self = StObject.set(x, "formats", js.Array(value*))
      
      inline def setSchemes(value: js.Array[String]): Self = StObject.set(x, "schemes", value.asInstanceOf[js.Any])
      
      inline def setSchemesUndefined: Self = StObject.set(x, "schemes", js.undefined)
      
      inline def setSchemesVarargs(value: String*): Self = StObject.set(x, "schemes", js.Array(value*))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait FindProviderResult extends StObject {
    
    var fetchEndpoint: String
    
    var provider_name: String
    
    var provider_url: String
  }
  object FindProviderResult {
    
    inline def apply(fetchEndpoint: String, provider_name: String, provider_url: String): FindProviderResult = {
      val __obj = js.Dynamic.literal(fetchEndpoint = fetchEndpoint.asInstanceOf[js.Any], provider_name = provider_name.asInstanceOf[js.Any], provider_url = provider_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindProviderResult]
    }
    
    extension [Self <: FindProviderResult](x: Self) {
      
      inline def setFetchEndpoint(value: String): Self = StObject.set(x, "fetchEndpoint", value.asInstanceOf[js.Any])
      
      inline def setProvider_name(value: String): Self = StObject.set(x, "provider_name", value.asInstanceOf[js.Any])
      
      inline def setProvider_url(value: String): Self = StObject.set(x, "provider_url", value.asInstanceOf[js.Any])
    }
  }
  
  trait LinkTypeData
    extends StObject
       with OembedData {
    
    @JSName("type")
    val type_LinkTypeData: link
  }
  object LinkTypeData {
    
    inline def apply(version: String): LinkTypeData = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("link")
      __obj.asInstanceOf[LinkTypeData]
    }
    
    extension [Self <: LinkTypeData](x: Self) {
      
      inline def setType(value: link): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait OembedData extends StObject {
    
    /** The name of the author/owner of the resource. */
    var author_name: js.UndefOr[String] = js.undefined
    
    /** A URL for the author/owner of the resource. */
    var author_url: js.UndefOr[String] = js.undefined
    
    /** The suggested cache lifetime for this resource, in seconds. Consumers may choose to use this value or not. */
    var cache_age: js.UndefOr[String | Double] = js.undefined
    
    /** The name of the resource provider. */
    var provider_name: js.UndefOr[String] = js.undefined
    
    /** The url of the resource provider. */
    var provider_url: js.UndefOr[String] = js.undefined
    
    /**
      * The height of the optional thumbnail.
      * If this parameter is present, thumbnail_url and thumbnail_width must also be present.
      */
    var thumbnail_height: js.UndefOr[Double] = js.undefined
    
    /**
      * A URL to a thumbnail image representing the resource.
      * The thumbnail must respect any maxwidth and maxheight parameters.
      * If this parameter is present, thumbnail_width and thumbnail_height must also be present.
      */
    var thumbnail_url: js.UndefOr[String] = js.undefined
    
    /**
      * The width of the optional thumbnail.
      * If this parameter is present, thumbnail_url and thumbnail_height must also be present.
      */
    var thumbnail_width: js.UndefOr[Double] = js.undefined
    
    /** A text title, describing the resource. */
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: rich | video | photo | link
    
    var version: String
  }
  object OembedData {
    
    inline def apply(`type`: rich | video | photo | link, version: String): OembedData = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OembedData]
    }
    
    extension [Self <: OembedData](x: Self) {
      
      inline def setAuthor_name(value: String): Self = StObject.set(x, "author_name", value.asInstanceOf[js.Any])
      
      inline def setAuthor_nameUndefined: Self = StObject.set(x, "author_name", js.undefined)
      
      inline def setAuthor_url(value: String): Self = StObject.set(x, "author_url", value.asInstanceOf[js.Any])
      
      inline def setAuthor_urlUndefined: Self = StObject.set(x, "author_url", js.undefined)
      
      inline def setCache_age(value: String | Double): Self = StObject.set(x, "cache_age", value.asInstanceOf[js.Any])
      
      inline def setCache_ageUndefined: Self = StObject.set(x, "cache_age", js.undefined)
      
      inline def setProvider_name(value: String): Self = StObject.set(x, "provider_name", value.asInstanceOf[js.Any])
      
      inline def setProvider_nameUndefined: Self = StObject.set(x, "provider_name", js.undefined)
      
      inline def setProvider_url(value: String): Self = StObject.set(x, "provider_url", value.asInstanceOf[js.Any])
      
      inline def setProvider_urlUndefined: Self = StObject.set(x, "provider_url", js.undefined)
      
      inline def setThumbnail_height(value: Double): Self = StObject.set(x, "thumbnail_height", value.asInstanceOf[js.Any])
      
      inline def setThumbnail_heightUndefined: Self = StObject.set(x, "thumbnail_height", js.undefined)
      
      inline def setThumbnail_url(value: String): Self = StObject.set(x, "thumbnail_url", value.asInstanceOf[js.Any])
      
      inline def setThumbnail_urlUndefined: Self = StObject.set(x, "thumbnail_url", js.undefined)
      
      inline def setThumbnail_width(value: Double): Self = StObject.set(x, "thumbnail_width", value.asInstanceOf[js.Any])
      
      inline def setThumbnail_widthUndefined: Self = StObject.set(x, "thumbnail_width", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: rich | video | photo | link): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait PhotoTypeData
    extends StObject
       with OembedData {
    
    /** The height in pixels of the image specified in the url parameter. */
    var height: Double
    
    @JSName("type")
    val type_PhotoTypeData: photo
    
    /**
      * The source URL of the image. Consumers should be able to insert this URL into an <img> element.
      * Only HTTP and HTTPS URLs are valid.
      */
    var url: String
    
    /** The width in pixels of the image specified in the url parameter. */
    var width: Double
  }
  object PhotoTypeData {
    
    inline def apply(height: Double, url: String, version: String, width: Double): PhotoTypeData = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("photo")
      __obj.asInstanceOf[PhotoTypeData]
    }
    
    extension [Self <: PhotoTypeData](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setType(value: photo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Provider extends StObject {
    
    var endpoints: js.Array[Endpoint]
    
    var provider_name: String
    
    var provider_url: String
  }
  object Provider {
    
    inline def apply(endpoints: js.Array[Endpoint], provider_name: String, provider_url: String): Provider = {
      val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], provider_name = provider_name.asInstanceOf[js.Any], provider_url = provider_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Provider]
    }
    
    extension [Self <: Provider](x: Self) {
      
      inline def setEndpoints(value: js.Array[Endpoint]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
      
      inline def setEndpointsVarargs(value: Endpoint*): Self = StObject.set(x, "endpoints", js.Array(value*))
      
      inline def setProvider_name(value: String): Self = StObject.set(x, "provider_name", value.asInstanceOf[js.Any])
      
      inline def setProvider_url(value: String): Self = StObject.set(x, "provider_url", value.asInstanceOf[js.Any])
    }
  }
  
  trait RichTypeData
    extends StObject
       with OembedData {
    
    /** The height in pixels required to display the HTML. */
    var height: Double
    
    /**
      * The HTML required to display the resource.
      * The HTML should have no padding or margins.
      * Consumers may wish to load the HTML in an off-domain iframe to avoid XSS vulnerabilities.
      * The markup should be valid XHTML 1.0 Basic.
      */
    var html: String
    
    @JSName("type")
    val type_RichTypeData: rich
    
    /** The width in pixels required to display the HTML. */
    var width: Double
  }
  object RichTypeData {
    
    inline def apply(height: Double, html: String, version: String, width: Double): RichTypeData = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("rich")
      __obj.asInstanceOf[RichTypeData]
    }
    
    extension [Self <: RichTypeData](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setType(value: rich): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait VideoTypeData
    extends StObject
       with OembedData {
    
    /** The height in pixels required to display the HTML. */
    var height: Double
    
    /**
      * The HTML required to embed a video player.
      * The HTML should have no padding or margins.
      * Consumers may wish to load the HTML in an off-domain iframe to avoid XSS vulnerabilities.
      */
    var html: String
    
    @JSName("type")
    val type_VideoTypeData: video
    
    /** The width in pixels required to display the HTML. */
    var width: Double
  }
  object VideoTypeData {
    
    inline def apply(height: Double, html: String, version: String, width: Double): VideoTypeData = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("video")
      __obj.asInstanceOf[VideoTypeData]
    }
    
    extension [Self <: VideoTypeData](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setType(value: video): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
