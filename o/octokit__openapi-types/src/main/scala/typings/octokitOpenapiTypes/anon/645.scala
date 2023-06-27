package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `645` extends StObject {
  
  var path: RepoRunid
}
object `645` {
  
  inline def apply(path: RepoRunid): `645` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`645`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `645`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: RepoRunid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
