package typings.playmusic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistMeta extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var shareState: js.UndefOr[String] = js.undefined
}
object PlaylistMeta {
  
  inline def apply(): PlaylistMeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaylistMeta] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setShareState(value: String): Self = StObject.set(x, "shareState", value.asInstanceOf[js.Any])
    
    inline def setShareStateUndefined: Self = StObject.set(x, "shareState", js.undefined)
  }
}
