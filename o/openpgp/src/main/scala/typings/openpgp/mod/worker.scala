package typings.openpgp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object worker {
  
  /**
    * @see module:openpgp.initWorker
    * @see module:openpgp.getWorker
    * @see module:openpgp.destroyWorker
    * @see module:worker/worker
    */
  object asyncProxy {
    
    @JSImport("openpgp", "worker.async_proxy.AsyncProxy")
    @js.native
    class AsyncProxy protected () extends StObject {
      /**
        * Initializes a new proxy and loads the web worker
        * @param path The path to the worker or 'openpgp.worker.js' by default
        * @param n number of workers to initialize if path given
        * @param config config The worker configuration
        * @param worker alternative to path parameter: web worker initialized with 'openpgp.worker.js'
        */
      def this(path: String, n: Double, config: js.Object, worker: js.Array[js.Any]) = this()
      
      /**
        * Generic proxy function that handles all commands from the public api.
        * @param method the public api function to be delegated to the worker thread
        * @param options the api function's options
        * @returns see the corresponding public api functions for their return types
        */
      def delegate(method: String, options: js.Object): js.Promise[js.Any] = js.native
      
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
  object worker {
    
    @JSImport("openpgp", "worker.worker")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Set config from main context to worker context.
      * @param config The openpgp configuration
      */
    @scala.inline
    def configure(config: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Generic proxy function that handles all commands from the public api.
      * @param method The public api function to be delegated to the worker thread
      * @param options The api function's options
      */
    @scala.inline
    def delegate(method: String, options: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(method.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Handle random buffer exhaustion by requesting more random bytes from the main window
      * @returns Empty Promise<any> whose resolution indicates that the buffer has been refilled
      */
    @scala.inline
    def randomCallback(): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("randomCallback")().asInstanceOf[js.Promise[js.Object]]
    
    /**
      * Respond to the main window.
      * @param event Contains event type and data
      */
    @scala.inline
    def response(event: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("response")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Seed the library with entropy gathered window.crypto.getRandomValues
      * as this api is only avalible in the main window.
      * @param buffer Some random bytes
      */
    @scala.inline
    def seedRandom(buffer: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("seedRandom")(buffer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
