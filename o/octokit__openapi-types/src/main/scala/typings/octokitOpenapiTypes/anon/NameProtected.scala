package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameProtected extends StObject {
  
  var commit: `469`
  
  var name: String
  
  var `protected`: Boolean
}
object NameProtected {
  
  inline def apply(commit: `469`, name: String, `protected`: Boolean): NameProtected = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameProtected]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NameProtected] (val x: Self) extends AnyVal {
    
    inline def setCommit(value: `469`): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProtected(value: Boolean): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
  }
}
