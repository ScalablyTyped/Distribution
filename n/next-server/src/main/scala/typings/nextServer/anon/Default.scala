package typings.nextServer.anon

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Default[P] extends StObject {
  
  var default: ComponentType[P] = js.native
}
object Default {
  
  @scala.inline
  def apply[P](default: ComponentType[P]): Default[P] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default[P]]
  }
  
  @scala.inline
  implicit class DefaultMutableBuilder[Self <: Default[_], P] (val x: Self with Default[P]) extends AnyVal {
    
    @scala.inline
    def setDefault(value: ComponentType[P]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
  }
}
