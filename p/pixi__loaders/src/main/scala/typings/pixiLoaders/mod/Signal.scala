package typings.pixiLoaders.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @memberof PIXI
  */
@js.native
trait Signal[CbType] extends StObject {
  
  var _head: SignalBinding[CbType] = js.native
  
  var _tail: SignalBinding[CbType] = js.native
  
  /**
    * Register a new listener.
    * @param {Function} fn - Callback function.
    * @param {object} [thisArg] - The context of the callback function.
    * @returns {PIXI.SignalBinding} The SignalBinding node that was added.
    */
  def add(fn: CbType): SignalBinding[CbType] = js.native
  def add(fn: CbType, thisArg: Any): SignalBinding[CbType] = js.native
  
  /**
    * Remove binding object.
    * @param {PIXI.SignalBinding} node - The binding node that will be removed.
    * @returns {Signal} The instance on which this method was called.
    @api public */
  def detach(node: SignalBinding[CbType]): this.type = js.native
  
  /**
    * Detach all listeners.
    * @returns {Signal} The instance on which this method was called.
    */
  def detachAll(): this.type = js.native
  
  /**
    * Dispaches a signal to all registered listeners.
    * @param {...any} args
    * @returns {boolean} Indication if we've emitted an event.
    */
  def dispatch(args: Any*): Boolean = js.native
  
  /**
    * Return an array of attached SignalBinding.
    * @param {boolean} [exists=false] - We only need to know if there are handlers.
    * @returns {PIXI.SignalBinding[] | boolean} Array of attached SignalBinding or Boolean if called with exists = true
    * @api public
    */
  def handlers(): js.Array[SignalBinding[CbType]] | Boolean = js.native
  def handlers(exists: Boolean): js.Array[SignalBinding[CbType]] | Boolean = js.native
  
  /**
    * Return true if node is a SignalBinding attached to this MiniSignal
    * @param {PIXI.SignalBinding} node - Node to check.
    * @returns {boolean} True if node is attache to mini-signal
    */
  def has(node: SignalBinding[CbType]): Boolean = js.native
  
  /**
    * Register a new listener that will be executed only once.
    * @param {Function} fn - Callback function.
    * @param {object} [thisArg] - The context of the callback function.
    * @returns {PIXI.SignalBinding} The SignalBinding node that was added.
    */
  def once(fn: CbType): SignalBinding[CbType] = js.native
  def once(fn: CbType, thisArg: Any): SignalBinding[CbType] = js.native
}
