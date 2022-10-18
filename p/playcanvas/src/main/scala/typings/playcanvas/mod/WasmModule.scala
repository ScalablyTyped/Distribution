package typings.playcanvas.mod

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
trait WasmModule extends StObject
