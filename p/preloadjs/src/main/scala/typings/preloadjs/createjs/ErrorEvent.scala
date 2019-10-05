package typings.preloadjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.ErrorEvent")
@js.native
class ErrorEvent () extends js.Object {
  def this(title: String) = this()
  def this(title: String, message: String) = this()
  def this(title: String, message: String, data: js.Object) = this()
  // properties
  var data: js.Object = js.native
  var message: String = js.native
  var title: String = js.native
}

