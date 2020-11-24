package typings.pino.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bindings extends js.Object {
  
  /**
    * Changes the shape of the bindings.
    * The default shape is { pid, hostname }.
    * The function takes a single argument, the bindings object.
    * It will be called every time a child logger is created.
    */
  var bindings: js.UndefOr[js.Function1[/* bindings */ typings.pino.mod.Bindings, js.Object]] = js.native
  
  /**
    * Changes the shape of the log level.
    * The default shape is { level: number }.
    * The function takes two arguments, the label of the level (e.g. 'info') and the numeric value (e.g. 30).
    */
  var level: js.UndefOr[js.Function2[/* level */ String, /* number */ Double, js.Object]] = js.native
  
  /**
    * Changes the shape of the log object.
    * This function will be called every time one of the log methods (such as .info) is called.
    * All arguments passed to the log method, except the message, will be pass to this function.
    * By default it does not change the shape of the log object.
    */
  var log: js.UndefOr[js.Function1[/* object */ js.Object, js.Object]] = js.native
}
object Bindings {
  
  @scala.inline
  def apply(): Bindings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bindings]
  }
  
  @scala.inline
  implicit class BindingsOps[Self <: Bindings] (val x: Self) extends AnyVal {
    
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
    def setBindings(value: /* bindings */ typings.pino.mod.Bindings => js.Object): Self = this.set("bindings", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBindings: Self = this.set("bindings", js.undefined)
    
    @scala.inline
    def setLevel(value: (/* level */ String, /* number */ Double) => js.Object): Self = this.set("level", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setLog(value: /* object */ js.Object => js.Object): Self = this.set("log", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
  }
}
