package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathJobid extends StObject {
  
  var path: Jobid
}
object PathJobid {
  
  inline def apply(path: Jobid): PathJobid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathJobid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathJobid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Jobid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
