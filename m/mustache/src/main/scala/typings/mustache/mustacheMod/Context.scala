package typings.mustache.mustacheMod

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
    * Initializes a new instance of the `MustacheContenxt` class.
    */
  def this(view: js.Any, parentContext: MustacheContext) = this()
  /* CompleteClass */
  override var parentContext: MustacheContext = js.native
  /* CompleteClass */
  override var view: js.Any = js.native
  /**
    * Returns the value of the given name in this context, traversing up the context hierarchy if the value is absent in this context's view.
    *
    * @param name
    * The name to look up.
    */
  /* CompleteClass */
  override def lookup(name: String): js.Any = js.native
  /**
    * Creates a new context using the given view with this context as the parent.
    *
    * @param view
    * The view to create the new context with.
    */
  /* CompleteClass */
  override def push(view: js.Any): MustacheContext = js.native
}

