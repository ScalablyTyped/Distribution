package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flagged extends StObject {
  
  /**
    * Current flagged state
    */
  var flagged: js.UndefOr[Boolean] = js.undefined
}
object Flagged {
  
  inline def apply(): Flagged = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Flagged]
  }
  
  extension [Self <: Flagged](x: Self) {
    
    inline def setFlagged(value: Boolean): Self = StObject.set(x, "flagged", value.asInstanceOf[js.Any])
    
    inline def setFlaggedUndefined: Self = StObject.set(x, "flagged", js.undefined)
  }
}
