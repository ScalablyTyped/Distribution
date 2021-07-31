package typings.popperjsCore.typesMod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifierArguments[Options /* <: Obj */] extends StObject {
  
  var instance: Instance
  
  var name: String
  
  var options: Partial[Options]
  
  var state: State
}
object ModifierArguments {
  
  @scala.inline
  def apply[Options /* <: Obj */](instance: Instance, name: String, options: Partial[Options], state: State): ModifierArguments[Options] = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifierArguments[Options]]
  }
  
  @scala.inline
  implicit class ModifierArgumentsMutableBuilder[Self <: ModifierArguments[?], Options /* <: Obj */] (val x: Self & ModifierArguments[Options]) extends AnyVal {
    
    @scala.inline
    def setInstance(value: Instance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: Partial[Options]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
