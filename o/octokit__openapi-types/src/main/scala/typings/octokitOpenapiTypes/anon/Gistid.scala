package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gistid extends StObject {
  
  /** The unique identifier of the gist. */
  var gist_id: String
}
object Gistid {
  
  inline def apply(gist_id: String): Gistid = {
    val __obj = js.Dynamic.literal(gist_id = gist_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gistid]
  }
  
  extension [Self <: Gistid](x: Self) {
    
    inline def setGist_id(value: String): Self = StObject.set(x, "gist_id", value.asInstanceOf[js.Any])
  }
}
