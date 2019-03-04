package typings
package atOracleOraclejetLib.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchByOffsetCapability[D] extends js.Object {
  var implementation: atOracleOraclejetLib.atOracleOraclejetLibStrings.iteration | atOracleOraclejetLib.atOracleOraclejetLibStrings.randomAccess
}

object FetchByOffsetCapability {
  @scala.inline
  def apply[D](
    implementation: atOracleOraclejetLib.atOracleOraclejetLibStrings.iteration | atOracleOraclejetLib.atOracleOraclejetLibStrings.randomAccess
  ): FetchByOffsetCapability[D] = {
    val __obj = js.Dynamic.literal(implementation = implementation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FetchByOffsetCapability[D]]
  }
}

