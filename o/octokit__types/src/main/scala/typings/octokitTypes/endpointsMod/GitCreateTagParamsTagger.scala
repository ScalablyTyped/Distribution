package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitCreateTagParamsTagger extends StObject {
  
  var date: js.UndefOr[String] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object GitCreateTagParamsTagger {
  
  @scala.inline
  def apply(): GitCreateTagParamsTagger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GitCreateTagParamsTagger]
  }
  
  @scala.inline
  implicit class GitCreateTagParamsTaggerMutableBuilder[Self <: GitCreateTagParamsTagger] (val x: Self) extends AnyVal {
    
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
