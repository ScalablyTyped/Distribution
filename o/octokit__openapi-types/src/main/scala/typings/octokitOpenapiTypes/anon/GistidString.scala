package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GistidString extends StObject {
  
  var gist_id: String
}
object GistidString {
  
  inline def apply(gist_id: String): GistidString = {
    val __obj = js.Dynamic.literal(gist_id = gist_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistidString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GistidString] (val x: Self) extends AnyVal {
    
    inline def setGist_id(value: String): Self = StObject.set(x, "gist_id", value.asInstanceOf[js.Any])
  }
}
