package typings.openpgp.openpgpMod

import typings.openpgp.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "worker")
@js.native
object workerNs extends js.Object {
  /**
    * @see module:openpgp.initWorker
    * @see module:openpgp.getWorker
    * @see module:openpgp.destroyWorker
    * @see module:worker/worker
    */
  @JSName("async_proxy")
  @js.native
  object asyncUnderscoreProxyNs extends js.Object {
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
  
  /**
    * @see module:openpgp.initWorker
    * @see module:openpgp.getWorker
    * @see module:openpgp.destroyWorker
    * @see module:worker/async_proxy
    */
  @JSName("worker")
  @js.native
  object workerNs extends js.Object {
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
  
}

