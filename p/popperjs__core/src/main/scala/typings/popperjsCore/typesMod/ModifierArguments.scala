package typings.popperjsCore.typesMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifierArguments[Options /* <: Obj */] extends js.Object {
  
  var instance: Instance = js.native
  
  var name: String = js.native
  
  var options: Partial[Options] = js.native
  
  var state: State = js.native
}
object ModifierArguments {
  
  @scala.inline
  def apply[Options /* <: Obj */](instance: Instance, name: String, options: Partial[Options], state: State): ModifierArguments[Options] = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifierArguments[Options]]
  }
  
  @scala.inline
  implicit class ModifierArgumentsOps[Self <: ModifierArguments[_], Options /* <: Obj */] (val x: Self with ModifierArguments[Options]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInstance(value: Instance): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: Partial[Options]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: State): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
