package typings.openpgp.mod.worker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see module:openpgp.initWorker
  * @see module:openpgp.getWorker
  * @see module:openpgp.destroyWorker
  * @see module:worker/async_proxy
  */
@JSImport("openpgp", "worker.worker")
@js.native
object worker extends js.Object {
  /**
    * Set config from main context to worker context.
    * @param config The openpgp configuration
    */
  def configure(config: js.Object): Unit = js.native
  /**
    * Generic proxy function that handles all commands from the public api.
    * @param method The public api function to be delegated to the worker thread
    * @param options The api function's options
    */
  def delegate(method: String, options: js.Object): Unit = js.native
  /**
    * Handle random buffer exhaustion by requesting more random bytes from the main window
    * @returns Empty Promise<any> whose resolution indicates that the buffer has been refilled
    */
  def randomCallback(): js.Promise[js.Object] = js.native
  /**
    * Respond to the main window.
    * @param event Contains event type and data
    */
  def response(event: js.Object): Unit = js.native
  /**
    * Seed the library with entropy gathered window.crypto.getRandomValues
    * as this api is only avalible in the main window.
    * @param buffer Some random bytes
    */
  def seedRandom(buffer: js.Array[_]): Unit = js.native
}

