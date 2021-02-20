package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Maintain extends StObject {
  
  var admin: Boolean = js.native
  
  var maintain: Boolean = js.native
  
  var pull: Boolean = js.native
  
  var push: Boolean = js.native
  
  var triage: Boolean = js.native
}
object Maintain {
  
  @scala.inline
  def apply(admin: Boolean, maintain: Boolean, pull: Boolean, push: Boolean, triage: Boolean): Maintain = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], maintain = maintain.asInstanceOf[js.Any], pull = pull.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], triage = triage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maintain]
  }
  
  @scala.inline
  implicit class MaintainMutableBuilder[Self <: Maintain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdmin(value: Boolean): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintain(value: Boolean): Self = StObject.set(x, "maintain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPull(value: Boolean): Self = StObject.set(x, "pull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriage(value: Boolean): Self = StObject.set(x, "triage", value.asInstanceOf[js.Any])
  }
}
