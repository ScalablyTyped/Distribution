package typings.openjscad

import typings.std.URL
import typings.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  var Worker: typings.std.Worker = js.native
  
  var requestFileSystem: js.Any = js.native
  
  var webkitRequestFileSystem: js.Any = js.native
  
  //    URL: URL;
  var webkitURL: URL = js.native
}
object Window {
  
  @scala.inline
  def apply(Worker: Worker, requestFileSystem: js.Any, webkitRequestFileSystem: js.Any, webkitURL: URL): Window = {
    val __obj = js.Dynamic.literal(Worker = Worker.asInstanceOf[js.Any], requestFileSystem = requestFileSystem.asInstanceOf[js.Any], webkitRequestFileSystem = webkitRequestFileSystem.asInstanceOf[js.Any], webkitURL = webkitURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestFileSystem(value: js.Any): Self = StObject.set(x, "requestFileSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitRequestFileSystem(value: js.Any): Self = StObject.set(x, "webkitRequestFileSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitURL(value: URL): Self = StObject.set(x, "webkitURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorker(value: Worker): Self = StObject.set(x, "Worker", value.asInstanceOf[js.Any])
  }
}
