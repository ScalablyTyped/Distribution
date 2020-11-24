package typings.podcast.mod

import typings.podcast.podcastStrings.episodic
import typings.podcast.podcastStrings.serial
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseFeedOptions extends js.Object {
  
  var author: String = js.native
  
  var categories: js.UndefOr[js.Array[String]] = js.native
  
  var copyright: js.UndefOr[String] = js.native
  
  var customElements: js.UndefOr[js.Array[js.Object]] = js.native
  
  var customNamespaces: js.UndefOr[js.Object] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var docs: js.UndefOr[String] = js.native
  
  var generator: js.UndefOr[String] = js.native
  
  var itunesAuthor: js.UndefOr[String] = js.native
  
  var itunesCategory: js.UndefOr[js.Array[FeedItunesCategory]] = js.native
  
  var itunesExplicit: js.UndefOr[Boolean] = js.native
  
  var itunesImage: js.UndefOr[String] = js.native
  
  var itunesOwner: js.UndefOr[FeedItunesOwner] = js.native
  
  var itunesSubtitle: js.UndefOr[String] = js.native
  
  var itunesSummary: js.UndefOr[String] = js.native
  
  var itunesType: js.UndefOr[episodic | serial] = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var managingEditor: js.UndefOr[String] = js.native
  
  var pubDate: js.UndefOr[Date | String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var ttl: js.UndefOr[Double] = js.native
  
  var webMaster: js.UndefOr[String] = js.native
}
object BaseFeedOptions {
  
  @scala.inline
  def apply(author: String): BaseFeedOptions = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFeedOptions]
  }
  
  @scala.inline
  implicit class BaseFeedOptionsOps[Self <: BaseFeedOptions] (val x: Self) extends AnyVal {
    
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
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    
    @scala.inline
    def setCopyright(value: String): Self = this.set("copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    
    @scala.inline
    def setCustomElementsVarargs(value: js.Object*): Self = this.set("customElements", js.Array(value :_*))
    
    @scala.inline
    def setCustomElements(value: js.Array[js.Object]): Self = this.set("customElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomElements: Self = this.set("customElements", js.undefined)
    
    @scala.inline
    def setCustomNamespaces(value: js.Object): Self = this.set("customNamespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomNamespaces: Self = this.set("customNamespaces", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDocs(value: String): Self = this.set("docs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocs: Self = this.set("docs", js.undefined)
    
    @scala.inline
    def setGenerator(value: String): Self = this.set("generator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerator: Self = this.set("generator", js.undefined)
    
    @scala.inline
    def setItunesAuthor(value: String): Self = this.set("itunesAuthor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItunesAuthor: Self = this.set("itunesAuthor", js.undefined)
    
    @scala.inline
    def setItunesCategoryVarargs(value: FeedItunesCategory*): Self = this.set("itunesCategory", js.Array(value :_*))
    
    @scala.inline
    def setItunesCategory(value: js.Array[FeedItunesCategory]): Self = this.set("itunesCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItunesCategory: Self = this.set("itunesCategory", js.undefined)
    
    @scala.inline
    def setItunesExplicit(value: Boolean): Self = this.set("itunesExplicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItunesExplicit: Self = this.set("itunesExplicit", js.undefined)
    
    @scala.inline
    def setItunesImage(value: String): Self = this.set("itunesImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItunesImage: Self = this.set("itunesImage", js.undefined)
    
    @scala.inline
    def setItunesOwner(value: FeedItunesOwner): Self = this.set("itunesOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItunesOwner: Self = this.set("itunesOwner", js.undefined)
    
    @scala.inline
    def setItunesSubtitle(value: String): Self = this.set("itunesSubtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItunesSubtitle: Self = this.set("itunesSubtitle", js.undefined)
    
    @scala.inline
    def setItunesSummary(value: String): Self = this.set("itunesSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItunesSummary: Self = this.set("itunesSummary", js.undefined)
    
    @scala.inline
    def setItunesType(value: episodic | serial): Self = this.set("itunesType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItunesType: Self = this.set("itunesType", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setManagingEditor(value: String): Self = this.set("managingEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagingEditor: Self = this.set("managingEditor", js.undefined)
    
    @scala.inline
    def setPubDate(value: Date | String): Self = this.set("pubDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubDate: Self = this.set("pubDate", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
    
    @scala.inline
    def setWebMaster(value: String): Self = this.set("webMaster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebMaster: Self = this.set("webMaster", js.undefined)
  }
}
