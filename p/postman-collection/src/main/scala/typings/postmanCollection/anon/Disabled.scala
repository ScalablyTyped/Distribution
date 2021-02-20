package typings.postmanCollection.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Disabled[TDefinition /* <: js.Object */] extends StObject {
  
  var disabled: Boolean = js.native
  
  var info: TDefinition = js.native
}
object Disabled {
  
  @scala.inline
  def apply[TDefinition /* <: js.Object */](disabled: Boolean, info: TDefinition): Disabled[TDefinition] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled[TDefinition]]
  }
  
  @scala.inline
  implicit class DisabledMutableBuilder[Self <: Disabled[_], TDefinition /* <: js.Object */] (val x: Self with Disabled[TDefinition]) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: TDefinition): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
  }
}
