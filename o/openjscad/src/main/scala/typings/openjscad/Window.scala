package typings.openjscad

import typings.std.URL
import typings.std.Worker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
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
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
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
    def setWorker(value: Worker): Self = this.set("Worker", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestFileSystem(value: js.Any): Self = this.set("requestFileSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebkitRequestFileSystem(value: js.Any): Self = this.set("webkitRequestFileSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebkitURL(value: URL): Self = this.set("webkitURL", value.asInstanceOf[js.Any])
  }
  
}

