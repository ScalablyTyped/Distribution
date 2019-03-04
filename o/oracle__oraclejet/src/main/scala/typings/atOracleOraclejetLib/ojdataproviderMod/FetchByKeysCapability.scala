package typings
package atOracleOraclejetLib.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchByKeysCapability[D] extends js.Object {
  var implementation: atOracleOraclejetLib.atOracleOraclejetLibStrings.iteration | atOracleOraclejetLib.atOracleOraclejetLibStrings.lookup
}

object FetchByKeysCapability {
  @scala.inline
  def apply[D](
    implementation: atOracleOraclejetLib.atOracleOraclejetLibStrings.iteration | atOracleOraclejetLib.atOracleOraclejetLibStrings.lookup
  ): FetchByKeysCapability[D] = {
    val __obj = js.Dynamic.literal(implementation = implementation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FetchByKeysCapability[D]]
  }
}

