package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstraintOptions extends StObject {
  
  var collideConnected: js.UndefOr[Boolean] = js.native
  
  var wakeUpBodies: js.UndefOr[Boolean] = js.native
}
object ConstraintOptions {
  
  @scala.inline
  def apply(): ConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstraintOptions]
  }
  
  @scala.inline
  implicit class ConstraintOptionsMutableBuilder[Self <: ConstraintOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollideConnected(value: Boolean): Self = StObject.set(x, "collideConnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollideConnectedUndefined: Self = StObject.set(x, "collideConnected", js.undefined)
    
    @scala.inline
    def setWakeUpBodies(value: Boolean): Self = StObject.set(x, "wakeUpBodies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWakeUpBodiesUndefined: Self = StObject.set(x, "wakeUpBodies", js.undefined)
  }
}
