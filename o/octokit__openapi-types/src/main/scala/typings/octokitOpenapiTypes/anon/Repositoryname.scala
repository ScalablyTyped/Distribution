package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Repositoryname extends StObject {
  
  var repository_name: js.UndefOr[ExcludeInclude] = js.undefined
}
object Repositoryname {
  
  inline def apply(): Repositoryname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Repositoryname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Repositoryname] (val x: Self) extends AnyVal {
    
    inline def setRepository_name(value: ExcludeInclude): Self = StObject.set(x, "repository_name", value.asInstanceOf[js.Any])
    
    inline def setRepository_nameUndefined: Self = StObject.set(x, "repository_name", js.undefined)
  }
}
