package typings.atOracleOraclejet.ojdataproviderMod

import typings.atOracleOraclejet.atOracleOraclejetStrings.iteration
import typings.atOracleOraclejet.atOracleOraclejetStrings.lookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchByKeysCapability[D] extends js.Object {
  var implementation: iteration | lookup
}

object FetchByKeysCapability {
  @scala.inline
  def apply[D](implementation: iteration | lookup): FetchByKeysCapability[D] = {
    val __obj = js.Dynamic.literal(implementation = implementation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FetchByKeysCapability[D]]
  }
}

