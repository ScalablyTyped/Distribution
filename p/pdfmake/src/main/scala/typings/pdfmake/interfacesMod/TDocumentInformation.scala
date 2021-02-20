package typings.pdfmake.interfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TDocumentInformation extends StObject {
  
  /** the name of the author */
  var author: js.UndefOr[String] = js.native
  
  var creationDate: js.UndefOr[Date] = js.native
  
  var creator: js.UndefOr[String] = js.native
  
  /** keywords associated with the document */
  var keywords: js.UndefOr[String] = js.native
  
  var modDate: js.UndefOr[Date] = js.native
  
  var producer: js.UndefOr[String] = js.native
  
  /** the subject of the document */
  var subject: js.UndefOr[String] = js.native
  
  /** the title of the document */
  var title: js.UndefOr[String] = js.native
  
  var trapped: js.UndefOr[String] = js.native
}
object TDocumentInformation {
  
  @scala.inline
  def apply(): TDocumentInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TDocumentInformation]
  }
  
  @scala.inline
  implicit class TDocumentInformationMutableBuilder[Self <: TDocumentInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    @scala.inline
    def setCreationDate(value: Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
    
    @scala.inline
    def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    @scala.inline
    def setModDate(value: Date): Self = StObject.set(x, "modDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModDateUndefined: Self = StObject.set(x, "modDate", js.undefined)
    
    @scala.inline
    def setProducer(value: String): Self = StObject.set(x, "producer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducerUndefined: Self = StObject.set(x, "producer", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTrapped(value: String): Self = StObject.set(x, "trapped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrappedUndefined: Self = StObject.set(x, "trapped", js.undefined)
  }
}
