package typings.nodepub

import typings.nodepub.nodepubStrings.contents
import typings.nodepub.nodepubStrings.front
import typings.nodepub.nodepubStrings.main
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nodepub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def document(metadata: Metadata): Document_ = ^.asInstanceOf[js.Dynamic].applyDynamic("document")(metadata.asInstanceOf[js.Any]).asInstanceOf[Document_]
  inline def document(metadata: Metadata, generateContentsCallback: GenerateContentsCallback): Document_ = (^.asInstanceOf[js.Dynamic].applyDynamic("document")(metadata.asInstanceOf[js.Any], generateContentsCallback.asInstanceOf[js.Any])).asInstanceOf[Document_]
  
  @js.native
  trait Document_ extends StObject {
    
    var CSS: String = js.native
    
    def addCSS(content: String): Unit = js.native
    
    def addSection(title: String, content: String): Unit = js.native
    def addSection(title: String, content: String, excludeFromContents: Boolean): Unit = js.native
    def addSection(title: String, content: String, excludeFromContents: Boolean, isFrontMatter: String): Unit = js.native
    def addSection(
      title: String,
      content: String,
      excludeFromContents: Boolean,
      isFrontMatter: String,
      overrideFilename: String
    ): Unit = js.native
    def addSection(
      title: String,
      content: String,
      excludeFromContents: Boolean,
      isFrontMatter: Unit,
      overrideFilename: String
    ): Unit = js.native
    def addSection(title: String, content: String, excludeFromContents: Unit, isFrontMatter: String): Unit = js.native
    def addSection(
      title: String,
      content: String,
      excludeFromContents: Unit,
      isFrontMatter: String,
      overrideFilename: String
    ): Unit = js.native
    def addSection(
      title: String,
      content: String,
      excludeFromContents: Unit,
      isFrontMatter: Unit,
      overrideFilename: String
    ): Unit = js.native
    
    var coverImage: String = js.native
    
    var filesForTOC: js.Array[String] = js.native
    
    var generateContentsCallback: js.UndefOr[GenerateContentsCallback] = js.native
    
    def getFilesForEPUB(): js.Promise[File] = js.native
    
    def getSectionCount(): Double = js.native
    
    var images: js.Array[String] = js.native
    
    var metadata: Metadata = js.native
    
    var sections: js.Array[String] = js.native
    
    var showContents: Boolean = js.native
    
    def writeEPUB(folder: String, filename: String): js.Promise[Unit] = js.native
    
    def writeFilesForEPUB(folder: String): js.Promise[Unit] = js.native
  }
  
  trait File extends StObject {
    
    var compress: Boolean
    
    var content: String
    
    var folder: String
    
    var name: String
  }
  object File {
    
    inline def apply(compress: Boolean, content: String, folder: String, name: String): File = {
      val __obj = js.Dynamic.literal(compress = compress.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type GenerateContentsCallback = js.Function1[/* links */ js.Array[Link], String]
  
  trait Link extends StObject {
    
    var itemType: front | contents | main
    
    var link: String
    
    var title: String
  }
  object Link {
    
    inline def apply(itemType: front | contents | main, link: String, title: String): Link = {
      val __obj = js.Dynamic.literal(itemType = itemType.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Link]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
      
      inline def setItemType(value: front | contents | main): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Metadata extends StObject {
    
    var author: String
    
    var contents: js.UndefOr[String] = js.undefined
    
    var copyright: js.UndefOr[String] = js.undefined
    
    var cover: String
    
    var description: js.UndefOr[String] = js.undefined
    
    var fileAs: js.UndefOr[String] = js.undefined
    
    var genre: js.UndefOr[String] = js.undefined
    
    var id: Double | String
    
    var images: js.UndefOr[js.Array[String]] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var published: js.UndefOr[String] = js.undefined
    
    var publisher: js.UndefOr[String] = js.undefined
    
    var sequence: js.UndefOr[Double] = js.undefined
    
    var series: js.UndefOr[String] = js.undefined
    
    var showContents: js.UndefOr[Boolean] = js.undefined
    
    var source: js.UndefOr[String] = js.undefined
    
    var tags: js.UndefOr[String] = js.undefined
    
    var title: String
  }
  object Metadata {
    
    inline def apply(author: String, cover: String, id: Double | String, title: String): Metadata = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], cover = cover.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
      
      inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      inline def setCover(value: String): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setFileAs(value: String): Self = StObject.set(x, "fileAs", value.asInstanceOf[js.Any])
      
      inline def setFileAsUndefined: Self = StObject.set(x, "fileAs", js.undefined)
      
      inline def setGenre(value: String): Self = StObject.set(x, "genre", value.asInstanceOf[js.Any])
      
      inline def setGenreUndefined: Self = StObject.set(x, "genre", js.undefined)
      
      inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImages(value: js.Array[String]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      inline def setImagesVarargs(value: String*): Self = StObject.set(x, "images", js.Array(value*))
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setPublished(value: String): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
      
      inline def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
      
      inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
      
      inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
      
      inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
      
      inline def setSeries(value: String): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
      
      inline def setShowContents(value: Boolean): Self = StObject.set(x, "showContents", value.asInstanceOf[js.Any])
      
      inline def setShowContentsUndefined: Self = StObject.set(x, "showContents", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setTags(value: String): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
