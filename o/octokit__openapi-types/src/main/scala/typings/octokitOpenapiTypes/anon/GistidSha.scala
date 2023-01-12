package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GistidSha extends StObject {
  
  /** The unique identifier of the gist. */
  var gist_id: String
  
  var sha: String
}
object GistidSha {
  
  inline def apply(gist_id: String, sha: String): GistidSha = {
    val __obj = js.Dynamic.literal(gist_id = gist_id.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistidSha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GistidSha] (val x: Self) extends AnyVal {
    
    inline def setGist_id(value: String): Self = StObject.set(x, "gist_id", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
  }
}
