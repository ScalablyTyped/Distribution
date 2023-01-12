package typings.oniguruma

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined oniguruma.oniguruma.CaptureIndex & {  match :string} */
  trait CaptureIndexmatchstring extends StObject {
    
    /** The position in the search string where the capture ends */
    var end: Double
    
    /** The index of the capturing group, or 0 for a full-string match */
    var index: Double
    
    /** The total character length of the capture */
    var length: Double
    
    var `match`: String
    
    /** The position in the search string where the capture begins */
    var start: Double
  }
  object CaptureIndexmatchstring {
    
    inline def apply(end: Double, index: Double, length: Double, `match`: String, start: Double): CaptureIndexmatchstring = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CaptureIndexmatchstring]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CaptureIndexmatchstring] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMatch(value: String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
