package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMilestonenumber extends StObject {
  
  var path: Milestonenumber
}
object PathMilestonenumber {
  
  inline def apply(path: Milestonenumber): PathMilestonenumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMilestonenumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathMilestonenumber] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Milestonenumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
