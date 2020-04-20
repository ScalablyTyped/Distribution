package typings.openjscad

import typings.std.URL
import typings.std.Worker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var Worker: typings.std.Worker
  var requestFileSystem: js.Any
  var webkitRequestFileSystem: js.Any
  //    URL: URL;
  var webkitURL: URL
}

object Window {
  @scala.inline
  def apply(Worker: Worker, requestFileSystem: js.Any, webkitRequestFileSystem: js.Any, webkitURL: URL): Window = {
    val __obj = js.Dynamic.literal(Worker = Worker.asInstanceOf[js.Any], requestFileSystem = requestFileSystem.asInstanceOf[js.Any], webkitRequestFileSystem = webkitRequestFileSystem.asInstanceOf[js.Any], webkitURL = webkitURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

