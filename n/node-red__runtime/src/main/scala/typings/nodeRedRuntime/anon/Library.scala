package typings.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Library extends StObject {
  
  var library: String
  
  var path: String
  
  var req: js.UndefOr[js.Object] = js.undefined
  
  var `type`: String
}
object Library {
  
  @scala.inline
  def apply(library: String, path: String, `type`: String): Library = {
    val __obj = js.Dynamic.literal(library = library.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Library]
  }
  
  @scala.inline
  implicit class LibraryMutableBuilder[Self <: Library] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLibrary(value: String): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReq(value: js.Object): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
