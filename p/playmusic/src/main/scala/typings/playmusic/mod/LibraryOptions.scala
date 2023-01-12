package typings.playmusic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LibraryOptions extends StObject {
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object LibraryOptions {
  
  inline def apply(): LibraryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LibraryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LibraryOptions] (val x: Self) extends AnyVal {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
