package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `395` extends StObject {
  
  var path: RepoRulesetid
}
object `395` {
  
  inline def apply(path: RepoRulesetid): `395` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`395`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `395`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: RepoRulesetid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
