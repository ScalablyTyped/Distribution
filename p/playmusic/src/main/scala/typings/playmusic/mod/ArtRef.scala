package typings.playmusic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtRef extends StObject {
  
  var url: js.UndefOr[String] = js.undefined
}
object ArtRef {
  
  inline def apply(): ArtRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArtRef] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
