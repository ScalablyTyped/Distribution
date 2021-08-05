package typings.maximMazurokGapiClientDrive.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexableText extends StObject {
  
  /** Text to be indexed for the file to improve fullText queries. This is limited to 128KB in length and may contain HTML elements. */
  var indexableText: js.UndefOr[String] = js.undefined
  
  /** A thumbnail for the file. This will only be used if Google Drive cannot generate a standard thumbnail. */
  var thumbnail: js.UndefOr[Image] = js.undefined
}
object IndexableText {
  
  inline def apply(): IndexableText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexableText]
  }
  
  extension [Self <: IndexableText](x: Self) {
    
    inline def setIndexableText(value: String): Self = StObject.set(x, "indexableText", value.asInstanceOf[js.Any])
    
    inline def setIndexableTextUndefined: Self = StObject.set(x, "indexableText", js.undefined)
    
    inline def setThumbnail(value: Image): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
  }
}
