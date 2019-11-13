package typings.nuclearDashJs.nuclearDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  /**
    * Gets the initial state for this type of store
    */
  /* CompleteClass */
  override def getInitialState(`this`: Store[T]): T = js.native
  /**
    * Sets up message handlers via `this.on` and to set up the initial
    * state.
    */
  /* CompleteClass */
  override def initialize(`this`: Store[T]): Unit = js.native
}

