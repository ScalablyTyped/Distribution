package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pull extends StObject {
  
  var admin: Boolean
  
  var pull: Boolean
  
  var push: Boolean
}
object Pull {
  
  @scala.inline
  def apply(admin: Boolean, pull: Boolean, push: Boolean): Pull = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], pull = pull.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pull]
  }
  
  @scala.inline
  implicit class PullMutableBuilder[Self <: Pull] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdmin(value: Boolean): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPull(value: Boolean): Self = StObject.set(x, "pull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
  }
}
