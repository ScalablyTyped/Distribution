package typings.node

import typings.node.eventsMod.EventEmitterOptions
import typings.node.timersMod.global.NodeJS.Timer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domainMod {
  
  @JSImport("domain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The `Domain` class encapsulates the functionality of routing errors and
    * uncaught exceptions to the active `Domain` object.
    *
    * To handle the errors that it catches, listen to its `'error'` event.
    */
  @JSImport("domain", "Domain")
  @js.native
  open class Domain () extends StObject {
    def this(options: EventEmitterOptions) = this()
    
    /**
      * Explicitly adds an emitter to the domain. If any event handlers called by
      * the emitter throw an error, or if the emitter emits an `'error'` event, it
      * will be routed to the domain's `'error'` event, just like with implicit
      * binding.
      *
      * This also works with timers that are returned from `setInterval()` and `setTimeout()`. If their callback function throws, it will be caught by
      * the domain `'error'` handler.
      *
      * If the Timer or `EventEmitter` was already bound to a domain, it is removed
      * from that one, and bound to this one instead.
      * @param emitter emitter or timer to be added to the domain
      */
    def add(emitter: typings.node.nodeEventsMod.^): Unit = js.native
    def add(emitter: Timer): Unit = js.native
    
    /**
      * The returned function will be a wrapper around the supplied callback
      * function. When the returned function is called, any errors that are
      * thrown will be routed to the domain's `'error'` event.
      *
      * ```js
      * const d = domain.create();
      *
      * function readSomeFile(filename, cb) {
      *   fs.readFile(filename, 'utf8', d.bind((er, data) => {
      *     // If this throws, it will also be passed to the domain.
      *     return cb(er, data ? JSON.parse(data) : null);
      *   }));
      * }
      *
      * d.on('error', (er) => {
      *   // An error occurred somewhere. If we throw it now, it will crash the program
      *   // with the normal line number and stack message.
      * });
      * ```
      * @param callback The callback function
      * @return The bound function
      */
    def bind[T /* <: js.Function */](callback: T): T = js.native
    
    /**
      * The `enter()` method is plumbing used by the `run()`, `bind()`, and`intercept()` methods to set the active domain. It sets `domain.active` and`process.domain` to the domain, and implicitly
      * pushes the domain onto the domain
      * stack managed by the domain module (see {@link exit} for details on the
      * domain stack). The call to `enter()` delimits the beginning of a chain of
      * asynchronous calls and I/O operations bound to a domain.
      *
      * Calling `enter()` changes only the active domain, and does not alter the domain
      * itself. `enter()` and `exit()` can be called an arbitrary number of times on a
      * single domain.
      */
    def enter(): Unit = js.native
    
    /**
      * The `exit()` method exits the current domain, popping it off the domain stack.
      * Any time execution is going to switch to the context of a different chain of
      * asynchronous calls, it's important to ensure that the current domain is exited.
      * The call to `exit()` delimits either the end of or an interruption to the chain
      * of asynchronous calls and I/O operations bound to a domain.
      *
      * If there are multiple, nested domains bound to the current execution context,`exit()` will exit any domains nested within this domain.
      *
      * Calling `exit()` changes only the active domain, and does not alter the domain
      * itself. `enter()` and `exit()` can be called an arbitrary number of times on a
      * single domain.
      */
    def exit(): Unit = js.native
    
    /**
      * This method is almost identical to {@link bind}. However, in
      * addition to catching thrown errors, it will also intercept `Error` objects sent as the first argument to the function.
      *
      * In this way, the common `if (err) return callback(err);` pattern can be replaced
      * with a single error handler in a single place.
      *
      * ```js
      * const d = domain.create();
      *
      * function readSomeFile(filename, cb) {
      *   fs.readFile(filename, 'utf8', d.intercept((data) => {
      *     // Note, the first argument is never passed to the
      *     // callback since it is assumed to be the 'Error' argument
      *     // and thus intercepted by the domain.
      *
      *     // If this throws, it will also be passed to the domain
      *     // so the error-handling logic can be moved to the 'error'
      *     // event on the domain instead of being repeated throughout
      *     // the program.
      *     return cb(null, JSON.parse(data));
      *   }));
      * }
      *
      * d.on('error', (er) => {
      *   // An error occurred somewhere. If we throw it now, it will crash the program
      *   // with the normal line number and stack message.
      * });
      * ```
      * @param callback The callback function
      * @return The intercepted function
      */
    def intercept[T /* <: js.Function */](callback: T): T = js.native
    
    /**
      * An array of timers and event emitters that have been explicitly added
      * to the domain.
      */
    var members: js.Array[typings.node.nodeEventsMod.^ | Timer] = js.native
    
    /**
      * The opposite of {@link add}. Removes domain handling from the
      * specified emitter.
      * @param emitter emitter or timer to be removed from the domain
      */
    def remove(emitter: typings.node.nodeEventsMod.^): Unit = js.native
    def remove(emitter: Timer): Unit = js.native
    
    /**
      * Run the supplied function in the context of the domain, implicitly
      * binding all event emitters, timers, and lowlevel requests that are
      * created in that context. Optionally, arguments can be passed to
      * the function.
      *
      * This is the most basic way to use a domain.
      *
      * ```js
      * const domain = require('domain');
      * const fs = require('fs');
      * const d = domain.create();
      * d.on('error', (er) => {
      *   console.error('Caught error!', er);
      * });
      * d.run(() => {
      *   process.nextTick(() => {
      *     setTimeout(() => { // Simulating some various async stuff
      *       fs.open('non-existent file', 'r', (er, fd) => {
      *         if (er) throw er;
      *         // proceed...
      *       });
      *     }, 100);
      *   });
      * });
      * ```
      *
      * In this example, the `d.on('error')` handler will be triggered, rather
      * than crashing the program.
      */
    def run[T](fn: js.Function1[/* repeated */ Any, T], args: Any*): T = js.native
  }
  
  inline def create(): Domain = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Domain]
}
