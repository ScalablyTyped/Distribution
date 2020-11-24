package typings.node.wasiMod

import typings.node.NodeJS.Dict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wasi", "WASI")
@js.native
class WASI () extends js.Object {
  def this(options: WASIOptions) = this()
  
   // TODO: avoid DOM dependency until WASM moved to own lib.
  /**
    * Attempt to initialize `instance` as a WASI reactor by invoking its `_initialize()` export, if it is present.
    * If `instance` contains a `_start()` export, then an exception is thrown.
    *
    * `start()` requires that `instance` exports a [`WebAssembly.Memory`][] named
    * `memory`. If `instance` does not have a `memory` export an exception is thrown.
    *
    * If `initialize()` is called more than once, an exception is thrown.
    */
  def initialize(instance: js.Object): Unit = js.native
  
  /**
    *
    * Attempt to begin execution of `instance` by invoking its `_start()` export.
    * If `instance` does not contain a `_start()` export, then `start()` attempts to
    * invoke the `__wasi_unstable_reactor_start()` export. If neither of those exports
    * is present on `instance`, then `start()` does nothing.
    *
    * `start()` requires that `instance` exports a [`WebAssembly.Memory`][] named
    * `memory`. If `instance` does not have a `memory` export an exception is thrown.
    *
    * If `start()` is called more than once, an exception is thrown.
    */
  def start(instance: js.Object): Unit = js.native
  
   // TODO: avoid DOM dependency until WASM moved to own lib.
  /**
    * Is an object that implements the WASI system call API. This object
    * should be passed as the `wasi_snapshot_preview1` import during the instantiation of a
    * [`WebAssembly.Instance`][].
    */
  val wasiImport: Dict[_] = js.native
}
