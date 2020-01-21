package typings.postmate.mod

import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is written in the child page. Calling Postmate.Model initiates a handshake request listener from the
  * Child. Once the handshake is complete, an event listener is bound to receive requests from the Parent. The
  * Child model is extended from the model provided by the Parent.
  */
@JSImport("postmate", "Model")
@js.native
class Model protected () extends Promise[ChildAPI] {
  /**
    * Initializes a new instance of Model
    *
    * @param model An object of gettable properties to expose to the parent. Value types may be anything
    * accepted in postMessage. Promises may also be set as values or returned from functions. Default: {}
    */
  def this(model: js.Any) = this()
}

