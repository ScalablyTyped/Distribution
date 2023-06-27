package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `754` extends StObject {
  
  var path: OwnerRepoRulesetid
}
object `754` {
  
  inline def apply(path: OwnerRepoRulesetid): `754` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`754`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `754`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerRepoRulesetid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
