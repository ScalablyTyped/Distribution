package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPackagetypePackageversionid extends StObject {
  
  var path: PackagetypePackageversionid
}
object PathPackagetypePackageversionid {
  
  inline def apply(path: PackagetypePackageversionid): PathPackagetypePackageversionid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPackagetypePackageversionid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathPackagetypePackageversionid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: PackagetypePackageversionid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
