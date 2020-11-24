package typings.mysticateaSpy.mod.Spy_

import typings.mysticateaSpy.mod.This
import typings.mysticateaSpy.mysticateaSpyStrings.`throw`
import typings.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information for each thrown call. */
@js.native
trait ThrownCall[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends Call[T] {
  
  var arguments: Parameters[T] = js.native
  
  var `this`: This[T] = js.native
  
  var `throw`: js.Any = js.native
  
  var `type`: `throw` = js.native
}
object ThrownCall {
  
  @scala.inline
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](arguments: Parameters[T], `throw`: js.Any, `type`: `throw`): ThrownCall[T] = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.updateDynamic("throw")(`throw`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrownCall[T]]
  }
  
  @scala.inline
  implicit class ThrownCallOps[Self <: ThrownCall[_], T /* <: js.Function1[/* repeated */ js.Any, _] */] (val x: Self with ThrownCall[T]) extends AnyVal {
    
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
    def setArguments(value: Parameters[T]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrow(value: js.Any): Self = this.set("throw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `throw`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThis(value: This[T]): Self = this.set("this", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThis: Self = this.set("this", js.undefined)
  }
}
