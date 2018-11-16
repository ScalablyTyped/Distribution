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

