package typings.postmate.mod

import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmate", JSImport.Namespace)
@js.native
class ^ protected () extends Promise[ParentAPI] {
  /**
    * Initializes a new instance of Postmate
    *
    * @param options configuration options
    */
  def this(options: PostmateOptions) = this()
}

@JSImport("postmate", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Replace the Promise API that Postmate uses. Default: window.Promise
    */
  var Promise: js.Promise[_] = js.native
  /**
    * Set to true to enable logging of additional information. Default: false
    */
  var debug: Boolean = js.native
}

