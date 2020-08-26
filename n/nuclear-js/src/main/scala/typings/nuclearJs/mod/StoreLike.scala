package typings.nuclearJs.mod

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
@js.native
trait StoreLike[T] extends js.Object {
  /**
    * Deserializes plain JavaScript to store state.
    */
  var deserialize: js.UndefOr[js.ThisFunction1[/* this */ Store[T], /* state */ js.Any, T]] = js.native
  /**
    * Pure function taking the current state of store and returning the new
    * state after a NuclearJS reactor has been reset
    */
  var handleReset: js.UndefOr[js.ThisFunction1[/* this */ Store[T], /* state */ T, T]] = js.native
  /**
    * Serializes store state to plain JSON serializable JavaScript.
    */
  var serialize: js.UndefOr[js.ThisFunction1[/* this */ Store[T], /* state */ T, _]] = js.native
  /**
    * Gets the initial state for this type of store
    */
  def getInitialState(): T = js.native
  /**
    * Sets up message handlers via `this.on` and to set up the initial
    * state.
    */
  def initialize(): Unit = js.native
}

object StoreLike {
  @scala.inline
  def apply[T](getInitialState: () => T, initialize: () => Unit): StoreLike[T] = {
    val __obj = js.Dynamic.literal(getInitialState = js.Any.fromFunction0(getInitialState), initialize = js.Any.fromFunction0(initialize))
    __obj.asInstanceOf[StoreLike[T]]
  }
  @scala.inline
  implicit class StoreLikeOps[Self <: StoreLike[_], T] (val x: Self with StoreLike[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetInitialState(value: () => T): Self = this.set("getInitialState", js.Any.fromFunction0(value))
    @scala.inline
    def setInitialize(value: () => Unit): Self = this.set("initialize", js.Any.fromFunction0(value))
    @scala.inline
    def setDeserialize(value: js.ThisFunction1[/* this */ Store[T], /* state */ js.Any, T]): Self = this.set("deserialize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeserialize: Self = this.set("deserialize", js.undefined)
    @scala.inline
    def setHandleReset(value: js.ThisFunction1[/* this */ Store[T], /* state */ T, T]): Self = this.set("handleReset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleReset: Self = this.set("handleReset", js.undefined)
    @scala.inline
    def setSerialize(value: js.ThisFunction1[/* this */ Store[T], /* state */ T, _]): Self = this.set("serialize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerialize: Self = this.set("serialize", js.undefined)
  }
  
}

