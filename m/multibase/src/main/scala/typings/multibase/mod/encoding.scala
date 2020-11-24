package typings.multibase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("multibase", "encoding")
@js.native
object encoding extends js.Object {
  
  /**
    * Get the encoding by name or code
    *
    * @param {BaseNameOrCode} nameOrCode
    * @returns {Base}
    * @throws {Error} Will throw if the encoding is not supported
    */
  def apply(nameOrCode: BaseNameOrCode): Base = js.native
}
