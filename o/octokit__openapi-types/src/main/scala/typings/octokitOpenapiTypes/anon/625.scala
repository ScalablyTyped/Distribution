package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `625` extends StObject {
  
  var path: OwnerRepoRulesetid
}
object `625` {
  
  inline def apply(path: OwnerRepoRulesetid): `625` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`625`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `625`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerRepoRulesetid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
