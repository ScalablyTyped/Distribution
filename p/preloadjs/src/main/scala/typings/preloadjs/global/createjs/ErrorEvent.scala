package typings.preloadjs.global.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.ErrorEvent")
@js.native
class ErrorEvent ()
  extends typings.preloadjs.createjs.ErrorEvent {
  def this(title: String) = this()
  def this(title: String, message: String) = this()
  def this(title: String, message: String, data: js.Object) = this()
  // properties
  /* CompleteClass */
  override var data: js.Object = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var title: String = js.native
}

