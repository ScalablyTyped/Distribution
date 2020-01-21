package typings.mustache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a rendering context by wrapping a view object and maintaining a reference to the parent context.
  */
trait MustacheContext extends js.Object {
  var parentContext: js.UndefOr[MustacheContext] = js.undefined
  var view: js.Any
  /**
    * Returns the value of the given name in this context, traversing up the context hierarchy if the value is absent in this context's view.
    *
    * @param name
    * The name to look up.
    */
  def lookup(name: String): js.Any
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
    lookup: String => js.Any,
    push: js.Any => MustacheContext,
    view: js.Any,
    parentContext: MustacheContext = null
  ): MustacheContext = {
    val __obj = js.Dynamic.literal(lookup = js.Any.fromFunction1(lookup), push = js.Any.fromFunction1(push), view = view.asInstanceOf[js.Any])
    if (parentContext != null) __obj.updateDynamic("parentContext")(parentContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[MustacheContext]
  }
}

