package typings.nodeIsbn.mod.isbn

import typings.nodeIsbn.anon.SmallThumbnail
import typings.nodeIsbn.nodeIsbnStrings.BOOK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Book extends js.Object {
  
  var authors: js.Array[String] = js.native
  
  var categories: js.Array[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var imageLinks: js.UndefOr[SmallThumbnail] = js.native
  
  var industryIdentifiers: js.Array[String] = js.native
  
  var infoLink: String = js.native
  
  var language: BookLanguage = js.native
  
  var pageCount: js.UndefOr[Double] = js.native
  
  var previewLink: String = js.native
  
  var printType: BOOK = js.native
  
  var publishedDate: String = js.native
  
  var publisher: String = js.native
  
  var title: String = js.native
}
object Book {
  
  @scala.inline
  def apply(
    authors: js.Array[String],
    categories: js.Array[String],
    industryIdentifiers: js.Array[String],
    infoLink: String,
    language: BookLanguage,
    previewLink: String,
    printType: BOOK,
    publishedDate: String,
    publisher: String,
    title: String
  ): Book = {
    val __obj = js.Dynamic.literal(authors = authors.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], industryIdentifiers = industryIdentifiers.asInstanceOf[js.Any], infoLink = infoLink.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], previewLink = previewLink.asInstanceOf[js.Any], printType = printType.asInstanceOf[js.Any], publishedDate = publishedDate.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Book]
  }
  
  @scala.inline
  implicit class BookOps[Self <: Book] (val x: Self) extends AnyVal {
    
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
    def setAuthorsVarargs(value: String*): Self = this.set("authors", js.Array(value :_*))
    
    @scala.inline
    def setAuthors(value: js.Array[String]): Self = this.set("authors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndustryIdentifiersVarargs(value: String*): Self = this.set("industryIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setIndustryIdentifiers(value: js.Array[String]): Self = this.set("industryIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoLink(value: String): Self = this.set("infoLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: BookLanguage): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewLink(value: String): Self = this.set("previewLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintType(value: BOOK): Self = this.set("printType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedDate(value: String): Self = this.set("publishedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setImageLinks(value: SmallThumbnail): Self = this.set("imageLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageLinks: Self = this.set("imageLinks", js.undefined)
    
    @scala.inline
    def setPageCount(value: Double): Self = this.set("pageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageCount: Self = this.set("pageCount", js.undefined)
  }
}
