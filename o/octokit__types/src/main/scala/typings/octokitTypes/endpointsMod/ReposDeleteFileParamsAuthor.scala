package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposDeleteFileParamsAuthor extends StObject {
  
  var email: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object ReposDeleteFileParamsAuthor {
  
  @scala.inline
  def apply(): ReposDeleteFileParamsAuthor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReposDeleteFileParamsAuthor]
  }
  
  @scala.inline
  implicit class ReposDeleteFileParamsAuthorMutableBuilder[Self <: ReposDeleteFileParamsAuthor] (val x: Self) extends AnyVal {
    
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
