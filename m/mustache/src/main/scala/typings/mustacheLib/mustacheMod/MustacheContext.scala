package typings
package mustacheLib.mustacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a rendering context by wrapping a view object and maintaining a reference to the parent context.
  */
trait MustacheContext extends js.Object {
  var parentContext: MustacheContext
  var view: js.Any
  /**
    * Returns the value of the given name in this context, traversing up the context hierarchy if the value is absent in this context's view.
    *
    * @param name
    * The name to look up.
    */
  def lookup(name: java.lang.String): js.Any
  /**
    * Creates a new context using the given view with this context as the parent.
    *
    * @param view
    * The view to create the new context with.
    */
  def push(view: js.Any): MustacheContext
}

object MustacheContext {
  @scala.inline
  def apply(
    lookup: js.Function1[java.lang.String, js.Any],
    parentContext: MustacheContext,
    push: js.Function1[js.Any, MustacheContext],
    view: js.Any
  ): MustacheContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lookup")(lookup)
    __obj.updateDynamic("parentContext")(parentContext)
    __obj.updateDynamic("push")(push)
    __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[MustacheContext]
  }
}

