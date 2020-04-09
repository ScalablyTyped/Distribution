package typings.perfy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Perfy extends js.Object {
  /**
    * Gets the total number of existing performance instances.
    */
  def count(): Double = js.native
  /**
    * Destroys the performance instance with the given name.
    * @param name - Name of the performance instance to be destroyed.
    */
  def destroy(name: String): this.type = js.native
  /**
    * Destroys all existing performance instances.
    */
  def destroyAll(): this.type = js.native
  /**
    * Ends the performance instance with the given name;
    * and calculates the elapsed high-resolution real time.
    * Note that if autoDestroy is not disabled when .start() is called; corresponding performance instance is immediately destroyed after returning the result
    * @param name - Unique name of the performance instance to be ended
    */
  def end(name: String): PerfyResult = js.native
  def exec(fn: AsyncOperationFn): this.type = js.native
  def exec(fn: SyncOperationFn): PerfyResult = js.native
  /**
    * Initializes a new performance instance right before executing the given function,
    * and automatically ends after the execution is done
    * @param name - Unique name of the performance instance.
    * Set this if you want the keep the instance for later use (such as getting the result at a later time).
    * @param fn - Function to be executed.
    * This function is invoked with an optional done argument which is only required
    * if you are running an asynchronous operation.
    * You should omit the done argument if it's a synchronous operation.
    */
  def exec(name: String, fn: AsyncOperationFn): this.type = js.native
  /**
    * Specifies whether a performance instance exists with the given name. This method will return false for an item, if called after .end(name) is called since the instance is destroyed
    * @param name - Unique name of the performance instance.
    */
  def exists(name: String): Boolean = js.native
  /**
    * Gets the names of existing performance instances.
    */
  def names(): js.Array[String] = js.native
  /**
    * Gets the calculated result of the performance instance for the given name.
    * To be used with non-destroyed, ended instances.
    * If instance is not yet ended or does not exist at all, returns null
    * @param name - Unique name of the performance instance.
    */
  def result(name: String): PerfyResult | Null = js.native
  /**
    * Initializes a new performance instance with the given name;
    * and marks the current high-resolution real time.
    * @param name - Unique name of the performance instance to be started.
    * Setting an existing name will overwrite this item. Use .exists() method to check for existence.
    * @param [autoDestroy=true] - Specifies whether this performance instance should be destroyed when .end() is called
    */
  def start(name: String): this.type = js.native
  def start(name: String, autoDestroy: Boolean): this.type = js.native
}

