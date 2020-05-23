package typings.oracleOraclejet.ojprogresslistMod

import typings.oracleOraclejet.mod.JetSettableProperties
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojProgressListSettableProperties extends JetSettableProperties {
  var data: (DataProvider[_, _]) | Null
}

object ojProgressListSettableProperties {
  @scala.inline
  def apply(data: DataProvider[_, _] = null): ojProgressListSettableProperties = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojProgressListSettableProperties]
  }
}

