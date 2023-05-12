package typings.node.vmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunningScriptOptions
  extends StObject
     with BaseOptions {
  
  /**
    * If `true`, the execution will be terminated when `SIGINT` (Ctrl+C) is received.
    * Existing handlers for the event that have been attached via `process.on('SIGINT')` will be disabled during script execution, but will continue to work after that.
    * If execution is terminated, an `Error` will be thrown.
    * Default: `false`.
    */
  var breakOnSigint: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `true`, if an `Error` occurs while compiling the `code`, the line of code causing the error is attached to the stack trace.
    * Default: `true`.
    */
  var displayErrors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the number of milliseconds to execute code before terminating execution.
    * If execution is terminated, an `Error` will be thrown. This value must be a strictly positive integer.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}
object RunningScriptOptions {
  
  inline def apply(): RunningScriptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunningScriptOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RunningScriptOptions] (val x: Self) extends AnyVal {
    
    inline def setBreakOnSigint(value: Boolean): Self = StObject.set(x, "breakOnSigint", value.asInstanceOf[js.Any])
    
    inline def setBreakOnSigintUndefined: Self = StObject.set(x, "breakOnSigint", js.undefined)
    
    inline def setDisplayErrors(value: Boolean): Self = StObject.set(x, "displayErrors", value.asInstanceOf[js.Any])
    
    inline def setDisplayErrorsUndefined: Self = StObject.set(x, "displayErrors", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
