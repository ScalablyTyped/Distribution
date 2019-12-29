package typings.atOracleOraclejet

import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojtreedataprovider", JSImport.Namespace)
@js.native
object ojtreedataproviderMod extends js.Object {
  @js.native
  trait TreeDataProvider[K, D] extends DataProvider[K, D] {
    def getChildDataProvider(parentKey: js.Any): TreeDataProvider[K, D] = js.native
  }
  
}

