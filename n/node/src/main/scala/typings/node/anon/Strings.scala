package typings.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Strings extends js.Object {
  /**
    * If set to false any calls to eval or function constructors (Function, GeneratorFunction, etc)
    * will throw an EvalError.
    * @default true
    */
  var strings: js.UndefOr[Boolean] = js.native
  /**
    * If set to false any attempt to compile a WebAssembly module will throw a WebAssembly.CompileError.
    * @default true
    */
  var wasm: js.UndefOr[Boolean] = js.native
}

object Strings {
  @scala.inline
  def apply(): Strings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Strings]
  }
  @scala.inline
  implicit class StringsOps[Self <: Strings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStrings(value: Boolean): Self = this.set("strings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrings: Self = this.set("strings", js.undefined)
    @scala.inline
    def setWasm(value: Boolean): Self = this.set("wasm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWasm: Self = this.set("wasm", js.undefined)
  }
  
}

