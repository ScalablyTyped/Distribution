package typings.mustache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a rendering context by wrapping a view object and maintaining a reference to the parent context.
  */
@JSImport("mustache", "Context")
@js.native
class Context protected () extends MustacheContext {
  /**
    * Initializes a new instance of the `MustacheContext` class.
    */
  def this(view: js.Any) = this()
  def this(view: js.Any, parentContext: MustacheContext) = this()
}

