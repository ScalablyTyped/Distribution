package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitName extends StObject {
  
  var commit: ShaUrl
  
  var name: String
  
  var `protected`: Boolean
}
object CommitName {
  
  inline def apply(commit: ShaUrl, name: String, `protected`: Boolean): CommitName = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommitName] (val x: Self) extends AnyVal {
    
    inline def setCommit(value: ShaUrl): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProtected(value: Boolean): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
  }
}
