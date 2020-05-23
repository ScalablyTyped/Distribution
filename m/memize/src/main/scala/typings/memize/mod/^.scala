package typings.memize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("memize", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Memize options object.
    *
    * @typedef MemizeOptions
    *
    * @property {number} [maxSize] Maximum size of the cache.
    */
  /**
    * Internal cache entry.
    *
    * @typedef MemizeCacheNode
    *
    * @property {?MemizeCacheNode|undefined} [prev] Previous node.
    * @property {?MemizeCacheNode|undefined} [next] Next node.
    * @property {Array<*>}                   args   Function arguments for cache
    *                                               entry.
    * @property {*}                          val    Function result.
    */
  /**
    * Properties of the enhanced function for controlling cache.
    *
    * @typedef MemizeMemoizedFunction
    *
    * @property {()=>void} clear Clear the cache.
    */
  /**
    * Accepts a function to be memoized, and returns a new memoized function, with
    * optional options.
    *
    * @template {Function} F
    *
    * @param {F}             fn        Function to memoize.
    * @param {MemizeOptions} [options] Options object.
    *
    * @return {F & MemizeMemoizedFunction} Memoized function.
    */
  def apply[F /* <: js.Function */](fn: F): F with MemizeMemoizedFunction = js.native
  def apply[F /* <: js.Function */](fn: F, options: MemizeOptions): F with MemizeMemoizedFunction = js.native
}

