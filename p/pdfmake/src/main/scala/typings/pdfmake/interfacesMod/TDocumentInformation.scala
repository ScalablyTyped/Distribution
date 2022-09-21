package typings.pdfmake.interfacesMod

import typings.pdfmake.pdfmakeStrings.False
import typings.pdfmake.pdfmakeStrings.True
import typings.pdfmake.pdfmakeStrings.Unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TDocumentInformation extends StObject {
  
  /** Name of the author. */
  var author: js.UndefOr[String] = js.undefined
  
  /**
    * Date the document was created.
    *
    * Defaults to the current date and time.
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Name of the creator.
    *
    * Defaults to `pdfmake`.
    */
  var creator: js.UndefOr[String] = js.undefined
  
  /**
    * Keywords associated with the document.
    *
    * A PDF file stores all keywords as a single string, as given here.
    * For optimal compatibility, separate keywords using commas or spaces.
    */
  var keywords: js.UndefOr[String] = js.undefined
  
  /** Date the document was last modified. */
  var modDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Name of the producer.
    *
    * Defaults to `pdfmake`.
    */
  var producer: js.UndefOr[String] = js.undefined
  
  /** Subject of the document. */
  var subject: js.UndefOr[String] = js.undefined
  
  /** Document title. */
  var title: js.UndefOr[String] = js.undefined
  
  /** Indicates whether the document has been corrected for color misregistrations. */
  var trapped: js.UndefOr[True | False | Unknown] = js.undefined
}
object TDocumentInformation {
  
  inline def apply(): TDocumentInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TDocumentInformation]
  }
  
  extension [Self <: TDocumentInformation](x: Self) {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
    
    inline def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setModDate(value: js.Date): Self = StObject.set(x, "modDate", value.asInstanceOf[js.Any])
    
    inline def setModDateUndefined: Self = StObject.set(x, "modDate", js.undefined)
    
    inline def setProducer(value: String): Self = StObject.set(x, "producer", value.asInstanceOf[js.Any])
    
    inline def setProducerUndefined: Self = StObject.set(x, "producer", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTrapped(value: True | False | Unknown): Self = StObject.set(x, "trapped", value.asInstanceOf[js.Any])
    
    inline def setTrappedUndefined: Self = StObject.set(x, "trapped", js.undefined)
  }
}
