package typings.nuclearJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nuclear-js", "Store")
@js.native
class StoreCls[T] protected () extends Store[T] {
  /**
    * A Store defines how a certain domain of the application should respond to
    * actions taken on the whole system. They manage their own section of the
    * entire app state and have no knowledge about the other parts of the
    * application state.
    */
  def this(config: StoreLike[T]) = this()
}
