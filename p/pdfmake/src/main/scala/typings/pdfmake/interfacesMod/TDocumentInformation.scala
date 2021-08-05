package typings.pdfmake.interfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TDocumentInformation extends StObject {
  
  /** the name of the author */
  var author: js.UndefOr[String] = js.undefined
  
  var creationDate: js.UndefOr[Date] = js.undefined
  
  var creator: js.UndefOr[String] = js.undefined
  
  /** keywords associated with the document */
  var keywords: js.UndefOr[String] = js.undefined
  
  var modDate: js.UndefOr[Date] = js.undefined
  
  var producer: js.UndefOr[String] = js.undefined
  
  /** the subject of the document */
  var subject: js.UndefOr[String] = js.undefined
  
  /** the title of the document */
  var title: js.UndefOr[String] = js.undefined
  
  var trapped: js.UndefOr[String] = js.undefined
}
object TDocumentInformation {
  
  inline def apply(): TDocumentInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TDocumentInformation]
  }
  
  extension [Self <: TDocumentInformation](x: Self) {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setCreationDate(value: Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
    
    inline def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setModDate(value: Date): Self = StObject.set(x, "modDate", value.asInstanceOf[js.Any])
    
    inline def setModDateUndefined: Self = StObject.set(x, "modDate", js.undefined)
    
    inline def setProducer(value: String): Self = StObject.set(x, "producer", value.asInstanceOf[js.Any])
    
    inline def setProducerUndefined: Self = StObject.set(x, "producer", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTrapped(value: String): Self = StObject.set(x, "trapped", value.asInstanceOf[js.Any])
    
    inline def setTrappedUndefined: Self = StObject.set(x, "trapped", js.undefined)
  }
}
