package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CursorCloseOptions extends StObject {
  
  /** Bypass calling killCursors when closing the cursor. */
  /** @deprecated  the skipKillCursors option is deprecated */
  var skipKillCursors: js.UndefOr[Boolean] = js.undefined
}
object CursorCloseOptions {
  
  inline def apply(): CursorCloseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CursorCloseOptions]
  }
  
  extension [Self <: CursorCloseOptions](x: Self) {
    
    inline def setSkipKillCursors(value: Boolean): Self = StObject.set(x, "skipKillCursors", value.asInstanceOf[js.Any])
    
    inline def setSkipKillCursorsUndefined: Self = StObject.set(x, "skipKillCursors", js.undefined)
  }
}
