package typings.multibase.mod

import typings.multibase.multibaseBooleans.`false`
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("multibase", "isEncoded")
@js.native
object isEncoded extends js.Object {
  
  def apply(data: String): `false` | String = js.native
  /**
    * Is the given data multibase encoded?
    *
    * @param {Uint8Array|string} data
    * @returns {false | string}
    */
  def apply(data: Uint8Array): `false` | String = js.native
}
