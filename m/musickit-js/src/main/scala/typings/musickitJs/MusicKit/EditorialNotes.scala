package typings.musickitJs.MusicKit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that represents editorial notes.
  * https://developer.apple.com/documentation/musickit/editorialnotes
  */
trait EditorialNotes extends StObject {
  
  var hashValue: Double
  
  var name: js.UndefOr[String] = js.undefined
  
  var short: js.UndefOr[String] = js.undefined
  
  var standard: js.UndefOr[String] = js.undefined
  
  var tagline: js.UndefOr[String] = js.undefined
}
object EditorialNotes {
  
  inline def apply(hashValue: Double): EditorialNotes = {
    val __obj = js.Dynamic.literal(hashValue = hashValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorialNotes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditorialNotes] (val x: Self) extends AnyVal {
    
    inline def setHashValue(value: Double): Self = StObject.set(x, "hashValue", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    
    inline def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
    
    inline def setStandard(value: String): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    
    inline def setStandardUndefined: Self = StObject.set(x, "standard", js.undefined)
    
    inline def setTagline(value: String): Self = StObject.set(x, "tagline", value.asInstanceOf[js.Any])
    
    inline def setTaglineUndefined: Self = StObject.set(x, "tagline", js.undefined)
  }
}
