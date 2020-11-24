package typings.newman.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewmanRunSummary extends js.Object {
  
  var collection: js.Any = js.native
  
  var environment: js.Any = js.native
  
  var error: js.UndefOr[js.Any] = js.native
  
  var globals: js.Any = js.native
  
  var run: NewmanRun = js.native
}
object NewmanRunSummary {
  
  @scala.inline
  def apply(collection: js.Any, environment: js.Any, globals: js.Any, run: NewmanRun): NewmanRunSummary = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewmanRunSummary]
  }
  
  @scala.inline
  implicit class NewmanRunSummaryOps[Self <: NewmanRunSummary] (val x: Self) extends AnyVal {
    
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
    def setCollection(value: js.Any): Self = this.set("collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment(value: js.Any): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobals(value: js.Any): Self = this.set("globals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRun(value: NewmanRun): Self = this.set("run", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
}
