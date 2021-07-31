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
  
  @scala.inline
  def apply(): Strings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Strings]
  }
  
  @scala.inline
  implicit class StringsMutableBuilder[Self <: Strings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStrings(value: Boolean): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
    
    @scala.inline
    def setWasm(value: Boolean): Self = StObject.set(x, "wasm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWasmUndefined: Self = StObject.set(x, "wasm", js.undefined)
  }
}
