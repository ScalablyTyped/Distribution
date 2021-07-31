package typings.openGraph

import org.scalablytyped.runtime.StringDictionary
import typings.cheerio.cheerio.Cheerio
import typings.openGraph.anon.Alternate
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(url: String, callback: DataCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(url: String, callback: DataCallback, options: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("open-graph", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getHTML(url: String, callback: RequestCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getHTML")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def getHTML(url: Cheerio, callback: RequestCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getHTML")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def parse(websiteContent: String): Data = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(websiteContent.asInstanceOf[js.Any]).asInstanceOf[Data]
  @scala.inline
  def parse(websiteContent: String, options: Options): Data = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(websiteContent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Data]
  
  trait Data
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[String | js.Array[String] | ImageVideoMetadata | Metadata]] {
    
    /** A URL to an audio file to accompany this object. */
    var audio: js.UndefOr[String | js.Array[String] | Metadata] = js.undefined
    
    /** A one to two sentence description of your object. */
    var description: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * The word that appears before this object's title in a sentence. An enum of (a, an, the, "", auto).
      * If auto is chosen, the consumer of your data should chose between "a" or "an". Default is "" (blank).
      */
    var determiner: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** An image URL which should represent your object within the graph. */
    var image: js.UndefOr[String | js.Array[String] | ImageVideoMetadata] = js.undefined
    
    /** The locale these tags are marked up in. Of the format `language_TERRITORY`. Default is `en_US`. */
    var locale: js.UndefOr[String | js.Array[String] | Alternate] = js.undefined
    
    /** If your object is part of a larger web site, the name which should be displayed for the overall site. e.g., "IMDb". */
    var site_name: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** The title of your object as it should appear within the graph, e.g., "The Rock". */
    var title: String | js.Array[String]
    
    /** The type of your object, e.g., "video.movie". Depending on the type you specify, other properties may also be required. */
    var `type`: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** The canonical URL of your object that will be used as its permanent ID in the graph, e.g., "http://www.imdb.com/title/tt0117500/". */
    var url: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** A URL to a video file that complements this object. */
    var video: js.UndefOr[String | js.Array[String] | ImageVideoMetadata] = js.undefined
  }
  object Data {
    
    @scala.inline
    def apply(title: String | js.Array[String]): Data = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudio(value: String | js.Array[String] | Metadata): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
      
      @scala.inline
      def setAudioVarargs(value: String*): Self = StObject.set(x, "audio", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: String | js.Array[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDescriptionVarargs(value: String*): Self = StObject.set(x, "description", js.Array(value :_*))
      
      @scala.inline
      def setDeterminer(value: String | js.Array[String]): Self = StObject.set(x, "determiner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeterminerUndefined: Self = StObject.set(x, "determiner", js.undefined)
      
      @scala.inline
      def setDeterminerVarargs(value: String*): Self = StObject.set(x, "determiner", js.Array(value :_*))
      
      @scala.inline
      def setImage(value: String | js.Array[String] | ImageVideoMetadata): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setImageVarargs(value: String*): Self = StObject.set(x, "image", js.Array(value :_*))
      
      @scala.inline
      def setLocale(value: String | js.Array[String] | Alternate): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setLocaleVarargs(value: String*): Self = StObject.set(x, "locale", js.Array(value :_*))
      
      @scala.inline
      def setSite_name(value: String | js.Array[String]): Self = StObject.set(x, "site_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSite_nameUndefined: Self = StObject.set(x, "site_name", js.undefined)
      
      @scala.inline
      def setSite_nameVarargs(value: String*): Self = StObject.set(x, "site_name", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String | js.Array[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String | js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value :_*))
      
      @scala.inline
      def setUrl(value: String | js.Array[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setUrlVarargs(value: String*): Self = StObject.set(x, "url", js.Array(value :_*))
      
      @scala.inline
      def setVideo(value: String | js.Array[String] | ImageVideoMetadata): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
      
      @scala.inline
      def setVideoVarargs(value: String*): Self = StObject.set(x, "video", js.Array(value :_*))
    }
  }
  
  type DataCallback = js.Function2[/* err */ Error | Null, /* data */ js.UndefOr[Data], Unit]
  
  trait ImageVideoMetadata
    extends StObject
       with Metadata {
    
    /** A description of what is in the image (not a caption). If the page specifies an `og:image` it should specify `og:image:alt`. */
    var alt: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** The number of pixels high. */
    var height: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** The  */
    var url: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** The number of pixels wide. */
    var width: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object ImageVideoMetadata {
    
    @scala.inline
    def apply(): ImageVideoMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageVideoMetadata]
    }
    
    @scala.inline
    implicit class ImageVideoMetadataMutableBuilder[Self <: ImageVideoMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlt(value: String | js.Array[String]): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setAltVarargs(value: String*): Self = StObject.set(x, "alt", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: String | js.Array[String]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHeightVarargs(value: String*): Self = StObject.set(x, "height", js.Array(value :_*))
      
      @scala.inline
      def setUrl(value: String | js.Array[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setUrlVarargs(value: String*): Self = StObject.set(x, "url", js.Array(value :_*))
      
      @scala.inline
      def setWidth(value: String | js.Array[String]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWidthVarargs(value: String*): Self = StObject.set(x, "width", js.Array(value :_*))
    }
  }
  
  trait Metadata
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[String | js.Array[String]]] {
    
    /** An alternate url to use if the webpage requires HTTPS. */
    var secure_url: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** A MIME type for this image. */
    var `type`: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object Metadata {
    
    @scala.inline
    def apply(): Metadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Metadata]
    }
    
    @scala.inline
    implicit class MetadataMutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecure_url(value: String | js.Array[String]): Self = StObject.set(x, "secure_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecure_urlUndefined: Self = StObject.set(x, "secure_url", js.undefined)
      
      @scala.inline
      def setSecure_urlVarargs(value: String*): Self = StObject.set(x, "secure_url", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String | js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value :_*))
    }
  }
  
  trait Options extends StObject {
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  type RequestCallback = js.Function2[/* err */ Error | Null, /* data */ js.UndefOr[String], Unit]
}
