package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitCreateCommitParamsCommitter extends StObject {
  
  var date: js.UndefOr[String] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object GitCreateCommitParamsCommitter {
  
  @scala.inline
  def apply(): GitCreateCommitParamsCommitter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GitCreateCommitParamsCommitter]
  }
  
  @scala.inline
  implicit class GitCreateCommitParamsCommitterMutableBuilder[Self <: GitCreateCommitParamsCommitter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
