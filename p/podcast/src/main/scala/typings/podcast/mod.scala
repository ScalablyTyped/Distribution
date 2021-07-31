package typings.podcast

import typings.podcast.anon.FeedUrl_
import typings.podcast.anon.Feedurl
import typings.podcast.anon.ImageUrl_
import typings.podcast.anon.Imageurl
import typings.podcast.anon.SiteUrl_
import typings.podcast.anon.Siteurl
import typings.podcast.podcastStrings.bonus
import typings.podcast.podcastStrings.episodic
import typings.podcast.podcastStrings.full
import typings.podcast.podcastStrings.serial
import typings.podcast.podcastStrings.trailer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("podcast", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Podcast {
    def this(options: FeedOptions) = this()
    def this(options: Unit, items: js.Array[Item]) = this()
    def this(options: FeedOptions, items: js.Array[Item]) = this()
  }
  
  trait BaseFeedOptions extends StObject {
    
    var author: String
    
    var categories: js.UndefOr[js.Array[String]] = js.undefined
    
    var copyright: js.UndefOr[String] = js.undefined
    
    var customElements: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    var customNamespaces: js.UndefOr[js.Object] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var docs: js.UndefOr[String] = js.undefined
    
    var generator: js.UndefOr[String] = js.undefined
    
    var itunesAuthor: js.UndefOr[String] = js.undefined
    
    var itunesCategory: js.UndefOr[js.Array[FeedItunesCategory]] = js.undefined
    
    var itunesExplicit: js.UndefOr[Boolean] = js.undefined
    
    var itunesImage: js.UndefOr[String] = js.undefined
    
    var itunesOwner: js.UndefOr[FeedItunesOwner] = js.undefined
    
    var itunesSubtitle: js.UndefOr[String] = js.undefined
    
    var itunesSummary: js.UndefOr[String] = js.undefined
    
    var itunesType: js.UndefOr[episodic | serial] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var managingEditor: js.UndefOr[String] = js.undefined
    
    var pubDate: js.UndefOr[Date | String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
    
    var webMaster: js.UndefOr[String] = js.undefined
  }
  object BaseFeedOptions {
    
    @scala.inline
    def apply(author: String): BaseFeedOptions = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseFeedOptions]
    }
    
    @scala.inline
    implicit class BaseFeedOptionsMutableBuilder[Self <: BaseFeedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
      
      @scala.inline
      def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
      
      @scala.inline
      def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      @scala.inline
      def setCustomElements(value: js.Array[js.Object]): Self = StObject.set(x, "customElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomElementsUndefined: Self = StObject.set(x, "customElements", js.undefined)
      
      @scala.inline
      def setCustomElementsVarargs(value: js.Object*): Self = StObject.set(x, "customElements", js.Array(value :_*))
      
      @scala.inline
      def setCustomNamespaces(value: js.Object): Self = StObject.set(x, "customNamespaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomNamespacesUndefined: Self = StObject.set(x, "customNamespaces", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDocs(value: String): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocsUndefined: Self = StObject.set(x, "docs", js.undefined)
      
      @scala.inline
      def setGenerator(value: String): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeneratorUndefined: Self = StObject.set(x, "generator", js.undefined)
      
      @scala.inline
      def setItunesAuthor(value: String): Self = StObject.set(x, "itunesAuthor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesAuthorUndefined: Self = StObject.set(x, "itunesAuthor", js.undefined)
      
      @scala.inline
      def setItunesCategory(value: js.Array[FeedItunesCategory]): Self = StObject.set(x, "itunesCategory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesCategoryUndefined: Self = StObject.set(x, "itunesCategory", js.undefined)
      
      @scala.inline
      def setItunesCategoryVarargs(value: FeedItunesCategory*): Self = StObject.set(x, "itunesCategory", js.Array(value :_*))
      
      @scala.inline
      def setItunesExplicit(value: Boolean): Self = StObject.set(x, "itunesExplicit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesExplicitUndefined: Self = StObject.set(x, "itunesExplicit", js.undefined)
      
      @scala.inline
      def setItunesImage(value: String): Self = StObject.set(x, "itunesImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesImageUndefined: Self = StObject.set(x, "itunesImage", js.undefined)
      
      @scala.inline
      def setItunesOwner(value: FeedItunesOwner): Self = StObject.set(x, "itunesOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesOwnerUndefined: Self = StObject.set(x, "itunesOwner", js.undefined)
      
      @scala.inline
      def setItunesSubtitle(value: String): Self = StObject.set(x, "itunesSubtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesSubtitleUndefined: Self = StObject.set(x, "itunesSubtitle", js.undefined)
      
      @scala.inline
      def setItunesSummary(value: String): Self = StObject.set(x, "itunesSummary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesSummaryUndefined: Self = StObject.set(x, "itunesSummary", js.undefined)
      
      @scala.inline
      def setItunesType(value: episodic | serial): Self = StObject.set(x, "itunesType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesTypeUndefined: Self = StObject.set(x, "itunesType", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setManagingEditor(value: String): Self = StObject.set(x, "managingEditor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManagingEditorUndefined: Self = StObject.set(x, "managingEditor", js.undefined)
      
      @scala.inline
      def setPubDate(value: Date | String): Self = StObject.set(x, "pubDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubDateUndefined: Self = StObject.set(x, "pubDate", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      @scala.inline
      def setWebMaster(value: String): Self = StObject.set(x, "webMaster", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebMasterUndefined: Self = StObject.set(x, "webMaster", js.undefined)
    }
  }
  
  trait FeedItunesCategory extends StObject {
    
    var subcats: js.UndefOr[js.Array[FeedItunesCategory]] = js.undefined
    
    var text: String
  }
  object FeedItunesCategory {
    
    @scala.inline
    def apply(text: String): FeedItunesCategory = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeedItunesCategory]
    }
    
    @scala.inline
    implicit class FeedItunesCategoryMutableBuilder[Self <: FeedItunesCategory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSubcats(value: js.Array[FeedItunesCategory]): Self = StObject.set(x, "subcats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubcatsUndefined: Self = StObject.set(x, "subcats", js.undefined)
      
      @scala.inline
      def setSubcatsVarargs(value: FeedItunesCategory*): Self = StObject.set(x, "subcats", js.Array(value :_*))
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait FeedItunesOwner extends StObject {
    
    var email: String
    
    var name: String
  }
  object FeedItunesOwner {
    
    @scala.inline
    def apply(email: String, name: String): FeedItunesOwner = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeedItunesOwner]
    }
    
    @scala.inline
    implicit class FeedItunesOwnerMutableBuilder[Self <: FeedItunesOwner] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type FeedOptions = BaseFeedOptions & (FeedUrl_ | Feedurl) & (SiteUrl_ | Siteurl) & (ImageUrl_ | Imageurl)
  
  trait Item extends StObject {
    
    var author: js.UndefOr[String] = js.undefined
    
    var categories: js.UndefOr[js.Array[String]] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var customElements: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    var date: Date | String
    
    var description: js.UndefOr[String] = js.undefined
    
    var enclosure: js.UndefOr[ItemEnclosure] = js.undefined
    
    var guid: js.UndefOr[String] = js.undefined
    
    var itunesAuthor: js.UndefOr[String] = js.undefined
    
    var itunesDuration: js.UndefOr[Double | String] = js.undefined
    
    var itunesEpisode: js.UndefOr[Double] = js.undefined
    
    var itunesEpisodeType: js.UndefOr[full | trailer | bonus] = js.undefined
    
    var itunesExplicit: js.UndefOr[Boolean] = js.undefined
    
    var itunesImage: js.UndefOr[String] = js.undefined
    
    var itunesSeason: js.UndefOr[Double] = js.undefined
    
    var itunesSubtitle: js.UndefOr[String] = js.undefined
    
    var itunesSummary: js.UndefOr[String] = js.undefined
    
    var itunesTitle: js.UndefOr[String] = js.undefined
    
    var lat: js.UndefOr[Double] = js.undefined
    
    var long: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var url: String
  }
  object Item {
    
    @scala.inline
    def apply(date: Date | String, url: String): Item = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      @scala.inline
      def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
      
      @scala.inline
      def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setCustomElements(value: js.Array[js.Object]): Self = StObject.set(x, "customElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomElementsUndefined: Self = StObject.set(x, "customElements", js.undefined)
      
      @scala.inline
      def setCustomElementsVarargs(value: js.Object*): Self = StObject.set(x, "customElements", js.Array(value :_*))
      
      @scala.inline
      def setDate(value: Date | String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEnclosure(value: ItemEnclosure): Self = StObject.set(x, "enclosure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnclosureUndefined: Self = StObject.set(x, "enclosure", js.undefined)
      
      @scala.inline
      def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
      
      @scala.inline
      def setItunesAuthor(value: String): Self = StObject.set(x, "itunesAuthor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesAuthorUndefined: Self = StObject.set(x, "itunesAuthor", js.undefined)
      
      @scala.inline
      def setItunesDuration(value: Double | String): Self = StObject.set(x, "itunesDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesDurationUndefined: Self = StObject.set(x, "itunesDuration", js.undefined)
      
      @scala.inline
      def setItunesEpisode(value: Double): Self = StObject.set(x, "itunesEpisode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesEpisodeType(value: full | trailer | bonus): Self = StObject.set(x, "itunesEpisodeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesEpisodeTypeUndefined: Self = StObject.set(x, "itunesEpisodeType", js.undefined)
      
      @scala.inline
      def setItunesEpisodeUndefined: Self = StObject.set(x, "itunesEpisode", js.undefined)
      
      @scala.inline
      def setItunesExplicit(value: Boolean): Self = StObject.set(x, "itunesExplicit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesExplicitUndefined: Self = StObject.set(x, "itunesExplicit", js.undefined)
      
      @scala.inline
      def setItunesImage(value: String): Self = StObject.set(x, "itunesImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesImageUndefined: Self = StObject.set(x, "itunesImage", js.undefined)
      
      @scala.inline
      def setItunesSeason(value: Double): Self = StObject.set(x, "itunesSeason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesSeasonUndefined: Self = StObject.set(x, "itunesSeason", js.undefined)
      
      @scala.inline
      def setItunesSubtitle(value: String): Self = StObject.set(x, "itunesSubtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesSubtitleUndefined: Self = StObject.set(x, "itunesSubtitle", js.undefined)
      
      @scala.inline
      def setItunesSummary(value: String): Self = StObject.set(x, "itunesSummary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesSummaryUndefined: Self = StObject.set(x, "itunesSummary", js.undefined)
      
      @scala.inline
      def setItunesTitle(value: String): Self = StObject.set(x, "itunesTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesTitleUndefined: Self = StObject.set(x, "itunesTitle", js.undefined)
      
      @scala.inline
      def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatUndefined: Self = StObject.set(x, "lat", js.undefined)
      
      @scala.inline
      def setLong(value: Double): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongUndefined: Self = StObject.set(x, "long", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemEnclosure extends StObject {
    
    var file: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var url: String
  }
  object ItemEnclosure {
    
    @scala.inline
    def apply(url: String): ItemEnclosure = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemEnclosure]
    }
    
    @scala.inline
    implicit class ItemEnclosureMutableBuilder[Self <: ItemEnclosure] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Podcast extends StObject {
    
    def addItem(item: Item): Unit = js.native
    
    def buildXml(): String = js.native
    def buildXml(indent: String): String = js.native
    def buildXml(indent: Boolean): String = js.native
  }
}
