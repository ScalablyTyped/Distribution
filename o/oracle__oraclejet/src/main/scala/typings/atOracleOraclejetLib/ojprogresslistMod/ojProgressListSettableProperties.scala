package typings
package atOracleOraclejetLib.ojprogresslistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojProgressListSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.JetSettableProperties {
  var data: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[_, _]) | scala.Null
}

object ojProgressListSettableProperties {
  @scala.inline
  def apply(data: atOracleOraclejetLib.ojdataproviderMod.DataProvider[_, _] = null): ojProgressListSettableProperties = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[ojProgressListSettableProperties]
  }
}

