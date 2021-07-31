package typings.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pass extends StObject {
  
  var pass: String
  
  var user: String
}
object Pass {
  
  @scala.inline
  def apply(pass: String, user: String): Pass = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pass]
  }
  
  @scala.inline
  implicit class PassMutableBuilder[Self <: Pass] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
