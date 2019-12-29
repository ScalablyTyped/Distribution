package typings.nuclearDashJs.nuclearDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stores are initialized like:
  *
  * ```
  * new Store({
  *   initialize() { ... },
  *   getInitialState() { ... },
  * })
  * ```
  *
  * This type defines the functions for the object passed to the
  * `new Store()` constructor. In additional, all of these functions are
  * available on the base `Store` object itself.
  */
trait StoreLike[T] extends js.Object {
  /**
    * Deserializes plain JavaScript to store state.
    */
  var deserialize: js.UndefOr[js.ThisFunction1[/* this */ Store[T], /* state */ js.Any, T]] = js.undefined
  /**
    * Pure function taking the current state of store and returning the new
    * state after a NuclearJS reactor has been reset
    */
  var handleReset: js.UndefOr[js.ThisFunction1[/* this */ Store[T], /* state */ T, T]] = js.undefined
  /**
    * Serializes store state to plain JSON serializable JavaScript.
    */
  var serialize: js.UndefOr[js.ThisFunction1[/* this */ Store[T], /* state */ T, _]] = js.undefined
  /**
    * Gets the initial state for this type of store
    */
  def getInitialState(): T
  /**
    * Sets up message handlers via `this.on` and to set up the initial
    * state.
    */
  def initialize(): Unit
}

object StoreLike {
  @scala.inline
  def apply[T](
    getInitialState: () => T,
    initialize: () => Unit,
    deserialize: js.ThisFunction1[/* this */ Store[T], /* state */ js.Any, T] = null,
    handleReset: js.ThisFunction1[/* this */ Store[T], /* state */ T, T] = null,
    serialize: js.ThisFunction1[/* this */ Store[T], /* state */ T, _] = null
  ): StoreLike[T] = {
    val __obj = js.Dynamic.literal(getInitialState = js.Any.fromFunction0(getInitialState), initialize = js.Any.fromFunction0(initialize))
    if (deserialize != null) __obj.updateDynamic("deserialize")(deserialize.asInstanceOf[js.Any])
    if (handleReset != null) __obj.updateDynamic("handleReset")(handleReset.asInstanceOf[js.Any])
    if (serialize != null) __obj.updateDynamic("serialize")(serialize.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreLike[T]]
  }
}

