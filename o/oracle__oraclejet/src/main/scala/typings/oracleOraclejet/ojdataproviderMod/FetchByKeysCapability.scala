package typings.oracleOraclejet.ojdataproviderMod

import typings.oracleOraclejet.oracleOraclejetStrings.iteration
import typings.oracleOraclejet.oracleOraclejetStrings.lookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchByKeysCapability[D] extends js.Object {
  var implementation: iteration | lookup = js.native
}

object FetchByKeysCapability {
  @scala.inline
  def apply[D](implementation: iteration | lookup): FetchByKeysCapability[D] = {
    val __obj = js.Dynamic.literal(implementation = implementation.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchByKeysCapability[D]]
  }
  @scala.inline
  implicit class FetchByKeysCapabilityOps[Self <: FetchByKeysCapability[_], D] (val x: Self with FetchByKeysCapability[D]) extends AnyVal {
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
    def setImplementation(value: iteration | lookup): Self = this.set("implementation", value.asInstanceOf[js.Any])
  }
  
}

