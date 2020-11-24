package typings.monacoEditor.mod

import typings.std.Worker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Environment extends js.Object {
  
  var baseUrl: js.UndefOr[String] = js.native
  
  var getWorker: js.UndefOr[js.Function2[/* workerId */ String, /* label */ String, Worker]] = js.native
  
  var getWorkerUrl: js.UndefOr[js.Function2[/* workerId */ String, /* label */ String, String]] = js.native
}
object Environment {
  
  @scala.inline
  def apply(): Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Environment]
  }
  
  @scala.inline
  implicit class EnvironmentOps[Self <: Environment] (val x: Self) extends AnyVal {
    
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
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    
    @scala.inline
    def setGetWorker(value: (/* workerId */ String, /* label */ String) => Worker): Self = this.set("getWorker", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetWorker: Self = this.set("getWorker", js.undefined)
    
    @scala.inline
    def setGetWorkerUrl(value: (/* workerId */ String, /* label */ String) => String): Self = this.set("getWorkerUrl", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetWorkerUrl: Self = this.set("getWorkerUrl", js.undefined)
  }
}
