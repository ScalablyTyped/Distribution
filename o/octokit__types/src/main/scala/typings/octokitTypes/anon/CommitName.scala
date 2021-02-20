package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommitName extends StObject {
  
  var commit: ShaUrl = js.native
  
  var name: String = js.native
  
  var `protected`: Boolean = js.native
}
object CommitName {
  
  @scala.inline
  def apply(commit: ShaUrl, name: String, `protected`: Boolean): CommitName = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitName]
  }
  
  @scala.inline
  implicit class CommitNameMutableBuilder[Self <: CommitName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommit(value: ShaUrl): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtected(value: Boolean): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
  }
}
