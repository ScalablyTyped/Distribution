package typings.playcanvas.global.pc

import typings.playcanvas.anon.ErrorHandler
import typings.playcanvas.mod.ModuleInstanceCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Callback used by {@link Module#setConfig}.
  *
  * @callback ModuleErrorCallback
  * @param {string} error - If the instance fails to load this will contain a description of the error.
  */
/**
  * Callback used by {@link Module#getInstance}.
  *
  * @callback ModuleInstanceCallback
  * @param {any} moduleInstance - The module instance.
  */
/**
  * A pure static utility class which supports immediate and lazy loading of wasm modules.
  */
@JSGlobal("pc.WasmModule")
@js.native
open class WasmModule ()
  extends typings.playcanvas.mod.WasmModule
object WasmModule {
  
  @JSGlobal("pc.WasmModule")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get a wasm module's configuration.
    *
    * @param {string} moduleName - Name of the module.
    * @returns {object | undefined} The previously set configuration.
    */
  /* static member */
  inline def getConfig(moduleName: String): js.UndefOr[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(moduleName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Object]]
  
  /**
    * Get a wasm module instance. The instance will be created if necessary and returned
    * in the second parameter to callback.
    *
    * @param {string} moduleName - Name of the module.
    * @param {ModuleInstanceCallback} callback - The function called when the instance is
    * available.
    */
  /* static member */
  inline def getInstance(moduleName: String, callback: ModuleInstanceCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(moduleName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Set a wasm module's configuration.
    *
    * @param {string} moduleName - Name of the module.
    * @param {object} [config] - The configuration object.
    * @param {string} [config.glueUrl] - URL of glue script.
    * @param {string} [config.wasmUrl] - URL of the wasm script.
    * @param {string} [config.fallbackUrl] - URL of the fallback script to use when wasm modules
    * aren't supported.
    * @param {number} [config.numWorkers] - For modules running on worker threads, the number of
    * threads to use. Default value is based on module implementation.
    * @param {ModuleErrorCallback} [config.errorHandler] - Function to be called if the module fails
    * to download.
    */
  /* static member */
  inline def setConfig(moduleName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setConfig")(moduleName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setConfig(moduleName: String, config: ErrorHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setConfig")(moduleName.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
