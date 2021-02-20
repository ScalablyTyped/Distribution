package typings.monacoEditor.mod

import typings.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Environment extends StObject {
  
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
  implicit class EnvironmentMutableBuilder[Self <: Environment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    @scala.inline
    def setGetWorker(value: (/* workerId */ String, /* label */ String) => Worker): Self = StObject.set(x, "getWorker", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetWorkerUndefined: Self = StObject.set(x, "getWorker", js.undefined)
    
    @scala.inline
    def setGetWorkerUrl(value: (/* workerId */ String, /* label */ String) => String): Self = StObject.set(x, "getWorkerUrl", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetWorkerUrlUndefined: Self = StObject.set(x, "getWorkerUrl", js.undefined)
  }
}
