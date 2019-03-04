package typings
package openjscadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var Worker: stdLib.Worker
  var requestFileSystem: js.Any
  var webkitRequestFileSystem: js.Any
  //    URL: URL;
  var webkitURL: stdLib.URL
}

object Window {
  @scala.inline
  def apply(
    Worker: stdLib.Worker,
    requestFileSystem: js.Any,
    webkitRequestFileSystem: js.Any,
    webkitURL: stdLib.URL
  ): Window = {
    val __obj = js.Dynamic.literal(Worker = Worker, requestFileSystem = requestFileSystem, webkitRequestFileSystem = webkitRequestFileSystem, webkitURL = webkitURL)
  
    __obj.asInstanceOf[Window]
  }
}

