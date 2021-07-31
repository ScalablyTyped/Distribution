package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposDeleteFileParamsCommitter extends StObject {
  
  var email: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object ReposDeleteFileParamsCommitter {
  
  @scala.inline
  def apply(): ReposDeleteFileParamsCommitter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReposDeleteFileParamsCommitter]
  }
  
  @scala.inline
  implicit class ReposDeleteFileParamsCommitterMutableBuilder[Self <: ReposDeleteFileParamsCommitter] (val x: Self) extends AnyVal {
    
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
