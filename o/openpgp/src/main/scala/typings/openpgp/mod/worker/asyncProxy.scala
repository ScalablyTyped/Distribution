package typings.openpgp.mod.worker

import typings.openpgp.mod.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see module:openpgp.initWorker
  * @see module:openpgp.getWorker
  * @see module:openpgp.destroyWorker
  * @see module:worker/worker
  */
@JSImport("openpgp", "worker.async_proxy")
@js.native
object asyncProxy extends js.Object {
  @js.native
  class AsyncProxy protected () extends js.Object {
    /**
      * Initializes a new proxy and loads the web worker
      * @param path The path to the worker or 'openpgp.worker.js' by default
      * @param n number of workers to initialize if path given
      * @param config config The worker configuration
      * @param worker alternative to path parameter: web worker initialized with 'openpgp.worker.js'
      */
    def this(path: String, n: Double, config: js.Object, worker: js.Array[_]) = this()
    /**
      * Generic proxy function that handles all commands from the public api.
      * @param method the public api function to be delegated to the worker thread
      * @param options the api function's options
      * @returns see the corresponding public api functions for their return types
      */
    def delegate(method: String, options: js.Object): js.Promise[_] = js.native
    /**
      * Get new request ID
      * @returns New unique request ID
      */
    def getID(): Integer = js.native
    /**
      * Message handling
      */
    def handleMessage(): Unit = js.native
    /**
      * Send message to worker with random data
      * @param size Number of bytes to send
      */
    def seedRandom(size: Integer): Unit = js.native
    /**
      * Terminates the workers
      */
    def terminate(): Unit = js.native
  }
  
}

