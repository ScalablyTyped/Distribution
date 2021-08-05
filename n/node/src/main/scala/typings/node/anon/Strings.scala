package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Strings extends StObject {
  
  /**
    * If set to false any calls to eval or function constructors (Function, GeneratorFunction, etc)
    * will throw an EvalError.
    * @default true
    */
  var strings: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to false any attempt to compile a WebAssembly module will throw a WebAssembly.CompileError.
    * @default true
    */
  var wasm: js.UndefOr[Boolean] = js.undefined
}
object Strings {
  
  inline def apply(): Strings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Strings]
  }
  
  extension [Self <: Strings](x: Self) {
    
    inline def setStrings(value: Boolean): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
    
    inline def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
    
    inline def setWasm(value: Boolean): Self = StObject.set(x, "wasm", value.asInstanceOf[js.Any])
    
    inline def setWasmUndefined: Self = StObject.set(x, "wasm", js.undefined)
  }
}
