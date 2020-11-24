package typings.pkijs.mod

import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pkijs/src/common", "getRandomValues")
@js.native
object getRandomValues extends js.Object {
  
  /**
    * Initialize input Uint8Array by random values (with help from current "crypto engine")
    *
    * @param {ArrayBufferView} view
    * @returns {ArrayBufferView}
    */
  def apply(view: ArrayBufferView): ArrayBufferView = js.native
}
