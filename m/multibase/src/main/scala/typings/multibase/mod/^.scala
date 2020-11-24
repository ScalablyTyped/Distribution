package typings.multibase.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("multibase", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /** @typedef {import('./base')} Base */
  /** @typedef {import("./types").BaseNameOrCode} BaseNameOrCode */
  /** @typedef {import("./types").BaseCode} BaseCode */
  /**
    * Create a new Uint8Array with the multibase varint+code.
    *
    * @param {BaseNameOrCode} nameOrCode - The multibase name or code number.
    * @param {Uint8Array} buf - The data to be prefixed with multibase.
    * @returns {Uint8Array}
    * @throws {Error} Will throw if the encoding is not supported
    */
  def apply(nameOrCode: BaseNameOrCode, buf: Uint8Array): Uint8Array = js.native
}
