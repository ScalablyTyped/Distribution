package typings.oracleOraclejet.ojdeferreddataproviderMod

import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojdeferreddataprovider", JSImport.Namespace)
@js.native
class ^[K, D] protected () extends DeferredDataProvider[K, D] {
  def this(
    dataProvider: js.Promise[DataProvider[K, D]],
    capabilityFunc: js.Function1[/* capabilityName */ String, _]
  ) = this()
}

