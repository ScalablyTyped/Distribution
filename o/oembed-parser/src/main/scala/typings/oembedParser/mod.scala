package typings.oembedParser

import typings.oembedParser.oembedParserStrings.link
import typings.oembedParser.oembedParserStrings.photo
import typings.oembedParser.oembedParserStrings.rich
import typings.oembedParser.oembedParserStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("oembed-parser", "extract")
  @js.native
  def extract(url: String): js.Promise[OembedData] = js.native
  @JSImport("oembed-parser", "extract")
  @js.native
  def extract(url: String, params: js.Any): js.Promise[OembedData] = js.native
  
  @JSImport("oembed-parser", "hasProvider")
  @js.native
  def hasProvider(url: String): Boolean = js.native
  
  @JSImport("oembed-parser", "setProviderList")
  @js.native
  def setProviderList(providers: js.Array[Provider]): Unit = js.native
  
  @js.native
  trait Endpoint extends StObject {
    
    // "json" "xml"
    var discovery: js.UndefOr[Boolean] = js.native
    
    var formats: js.UndefOr[js.Array[String]] = js.native
    
    var schemes: js.UndefOr[js.Array[String]] = js.native
    
    var url: String = js.native
  }
  object Endpoint {
    
    @scala.inline
    def apply(url: String): Endpoint = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Endpoint]
    }
    
    @scala.inline
    implicit class EndpointMutableBuilder[Self <: Endpoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiscovery(value: Boolean): Self = StObject.set(x, "discovery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiscoveryUndefined: Self = StObject.set(x, "discovery", js.undefined)
      
      @scala.inline
      def setFormats(value: js.Array[String]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      @scala.inline
      def setFormatsVarargs(value: String*): Self = StObject.set(x, "formats", js.Array(value :_*))
      
      @scala.inline
      def setSchemes(value: js.Array[String]): Self = StObject.set(x, "schemes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemesUndefined: Self = StObject.set(x, "schemes", js.undefined)
      
      @scala.inline
      def setSchemesVarargs(value: String*): Self = StObject.set(x, "schemes", js.Array(value :_*))
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LinkTypeData extends OembedData {
    
    @JSName("type")
    val type_LinkTypeData: link = js.native
  }
  object LinkTypeData {
    
    @scala.inline
    def apply(`type`: link, version: String): LinkTypeData = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkTypeData]
    }
    
    @scala.inline
    implicit class LinkTypeDataMutableBuilder[Self <: LinkTypeData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: link): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OembedData extends StObject {
    
    /** The name of the author/owner of the resource. */
    var author_name: js.UndefOr[String] = js.native
    
    /** A URL for the author/owner of the resource. */
    var author_url: js.UndefOr[String] = js.native
    
    /** The suggested cache lifetime for this resource, in seconds. Consumers may choose to use this value or not. */
    var cache_age: js.UndefOr[String] = js.native
    
    /** The name of the resource provider. */
    var provider_name: js.UndefOr[String] = js.native
    
    /** The url of the resource provider. */
    var provider_url: js.UndefOr[String] = js.native
    
    /**
      * The height of the optional thumbnail.
      * If this parameter is present, thumbnail_url and thumbnail_width must also be present.
      */
    var thumbnail_height: js.UndefOr[Double] = js.native
    
    /**
      * A URL to a thumbnail image representing the resource.
      * The thumbnail must respect any maxwidth and maxheight parameters.
      * If this parameter is present, thumbnail_width and thumbnail_height must also be present.
      */
    var thumbnail_url: js.UndefOr[String] = js.native
    
    /**
      * The width of the optional thumbnail.
      * If this parameter is present, thumbnail_url and thumbnail_height must also be present.
      */
    var thumbnail_width: js.UndefOr[Double] = js.native
    
    /** A text title, describing the resource. */
    var title: js.UndefOr[String] = js.native
    
    var `type`: rich | video | photo | link = js.native
    
    var version: String = js.native
  }
  object OembedData {
    
    @scala.inline
    def apply(`type`: rich | video | photo | link, version: String): OembedData = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OembedData]
    }
    
    @scala.inline
    implicit class OembedDataMutableBuilder[Self <: OembedData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor_name(value: String): Self = StObject.set(x, "author_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthor_nameUndefined: Self = StObject.set(x, "author_name", js.undefined)
      
      @scala.inline
      def setAuthor_url(value: String): Self = StObject.set(x, "author_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthor_urlUndefined: Self = StObject.set(x, "author_url", js.undefined)
      
      @scala.inline
      def setCache_age(value: String): Self = StObject.set(x, "cache_age", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCache_ageUndefined: Self = StObject.set(x, "cache_age", js.undefined)
      
      @scala.inline
      def setProvider_name(value: String): Self = StObject.set(x, "provider_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvider_nameUndefined: Self = StObject.set(x, "provider_name", js.undefined)
      
      @scala.inline
      def setProvider_url(value: String): Self = StObject.set(x, "provider_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvider_urlUndefined: Self = StObject.set(x, "provider_url", js.undefined)
      
      @scala.inline
      def setThumbnail_height(value: Double): Self = StObject.set(x, "thumbnail_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnail_heightUndefined: Self = StObject.set(x, "thumbnail_height", js.undefined)
      
      @scala.inline
      def setThumbnail_url(value: String): Self = StObject.set(x, "thumbnail_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnail_urlUndefined: Self = StObject.set(x, "thumbnail_url", js.undefined)
      
      @scala.inline
      def setThumbnail_width(value: Double): Self = StObject.set(x, "thumbnail_width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnail_widthUndefined: Self = StObject.set(x, "thumbnail_width", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: rich | video | photo | link): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PhotoTypeData extends OembedData {
    
    /** The height in pixels of the image specified in the url parameter. */
    var height: Double = js.native
    
    @JSName("type")
    val type_PhotoTypeData: photo = js.native
    
    /**
      * The source URL of the image. Consumers should be able to insert this URL into an <img> element.
      * Only HTTP and HTTPS URLs are valid.
      */
    var url: String = js.native
    
    /** The width in pixels of the image specified in the url parameter. */
    var width: Double = js.native
  }
  object PhotoTypeData {
    
    @scala.inline
    def apply(height: Double, `type`: photo, url: String, version: String, width: Double): PhotoTypeData = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhotoTypeData]
    }
    
    @scala.inline
    implicit class PhotoTypeDataMutableBuilder[Self <: PhotoTypeData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: photo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Provider extends StObject {
    
    var endpoints: js.Array[Endpoint] = js.native
    
    var provider_name: String = js.native
    
    var provider_url: String = js.native
  }
  object Provider {
    
    @scala.inline
    def apply(endpoints: js.Array[Endpoint], provider_name: String, provider_url: String): Provider = {
      val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], provider_name = provider_name.asInstanceOf[js.Any], provider_url = provider_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Provider]
    }
    
    @scala.inline
    implicit class ProviderMutableBuilder[Self <: Provider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndpoints(value: js.Array[Endpoint]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointsVarargs(value: Endpoint*): Self = StObject.set(x, "endpoints", js.Array(value :_*))
      
      @scala.inline
      def setProvider_name(value: String): Self = StObject.set(x, "provider_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvider_url(value: String): Self = StObject.set(x, "provider_url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RichTypeData extends OembedData {
    
    /** The height in pixels required to display the HTML. */
    var height: Double = js.native
    
    /**
      * The HTML required to display the resource.
      * The HTML should have no padding or margins.
      * Consumers may wish to load the HTML in an off-domain iframe to avoid XSS vulnerabilities.
      * The markup should be valid XHTML 1.0 Basic.
      */
    var html: String = js.native
    
    @JSName("type")
    val type_RichTypeData: rich = js.native
    
    /** The width in pixels required to display the HTML. */
    var width: Double = js.native
  }
  object RichTypeData {
    
    @scala.inline
    def apply(height: Double, html: String, `type`: rich, version: String, width: Double): RichTypeData = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RichTypeData]
    }
    
    @scala.inline
    implicit class RichTypeDataMutableBuilder[Self <: RichTypeData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: rich): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VideoTypeData extends OembedData {
    
    /** The height in pixels required to display the HTML. */
    var height: Double = js.native
    
    /**
      * The HTML required to embed a video player.
      * The HTML should have no padding or margins.
      * Consumers may wish to load the HTML in an off-domain iframe to avoid XSS vulnerabilities.
      */
    var html: String = js.native
    
    @JSName("type")
    val type_VideoTypeData: video = js.native
    
    /** The width in pixels required to display the HTML. */
    var width: Double = js.native
  }
  object VideoTypeData {
    
    @scala.inline
    def apply(height: Double, html: String, `type`: video, version: String, width: Double): VideoTypeData = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[VideoTypeData]
    }
    
    @scala.inline
    implicit class VideoTypeDataMutableBuilder[Self <: VideoTypeData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: video): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
