package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryNameFromString extends StObject {
  
  var repository: NameFromString
}
object RepositoryNameFromString {
  
  inline def apply(repository: NameFromString): RepositoryNameFromString = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryNameFromString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepositoryNameFromString] (val x: Self) extends AnyVal {
    
    inline def setRepository(value: NameFromString): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
  }
}
