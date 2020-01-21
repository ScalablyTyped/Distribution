package typings.postmate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Composes an API to be used by the child
  */
@js.native
trait ChildAPI extends js.Object {
  /**
    * Emits an event to the parent
    *
    * @param name the name of the event
    * @param data event data
    */
  def emit(name: String): Unit = js.native
  def emit(name: String, data: js.Any): Unit = js.native
}

