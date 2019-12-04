package typings.atOracleOraclejet.ojprogresslistMod

import typings.atOracleOraclejet.atOracleOraclejetMod.JetSettableProperties
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojProgressListSettableProperties extends JetSettableProperties {
  var data: (DataProvider[_, _]) | Null
}

object ojProgressListSettableProperties {
  @scala.inline
  def apply(data: DataProvider[_, _] = null): ojProgressListSettableProperties = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojProgressListSettableProperties]
  }
}

