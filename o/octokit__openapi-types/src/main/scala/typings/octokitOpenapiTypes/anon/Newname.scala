package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Newname extends StObject {
  
  /** @description The new name of the branch. */
  var new_name: String
}
object Newname {
  
  inline def apply(new_name: String): Newname = {
    val __obj = js.Dynamic.literal(new_name = new_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Newname]
  }
  
  extension [Self <: Newname](x: Self) {
    
    inline def setNew_name(value: String): Self = StObject.set(x, "new_name", value.asInstanceOf[js.Any])
  }
}
