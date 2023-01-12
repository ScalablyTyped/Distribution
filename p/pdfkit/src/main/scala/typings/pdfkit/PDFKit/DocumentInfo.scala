package typings.pdfkit.PDFKit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentInfo extends StObject {
  
  var Author: js.UndefOr[String] = js.undefined
  
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  var Creator: js.UndefOr[String] = js.undefined
  
  var Keywords: js.UndefOr[String] = js.undefined
  
  var ModDate: js.UndefOr[js.Date] = js.undefined
  
  var Producer: js.UndefOr[String] = js.undefined
  
  var Title: js.UndefOr[String] = js.undefined
}
object DocumentInfo {
  
  inline def apply(): DocumentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentInfo] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "Author", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setCreator(value: String): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setCreatorUndefined: Self = StObject.set(x, "Creator", js.undefined)
    
    inline def setKeywords(value: String): Self = StObject.set(x, "Keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "Keywords", js.undefined)
    
    inline def setModDate(value: js.Date): Self = StObject.set(x, "ModDate", value.asInstanceOf[js.Any])
    
    inline def setModDateUndefined: Self = StObject.set(x, "ModDate", js.undefined)
    
    inline def setProducer(value: String): Self = StObject.set(x, "Producer", value.asInstanceOf[js.Any])
    
    inline def setProducerUndefined: Self = StObject.set(x, "Producer", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
  }
}
