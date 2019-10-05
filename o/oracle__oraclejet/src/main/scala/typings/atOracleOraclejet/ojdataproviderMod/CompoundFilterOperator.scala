package typings.atOracleOraclejet.ojdataproviderMod

import typings.atOracleOraclejet.ojdataproviderMod.CompoundFilterOperator.CompoundOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompoundFilterOperator[D] extends js.Object {
  var criteria: js.Array[FilterOperator[D]]
  var op: CompoundOperator
}

@JSImport("@oracle/oraclejet/ojdataprovider", "CompoundFilterOperator")
@js.native
object CompoundFilterOperator extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.atOracleOraclejet.atOracleOraclejetStrings.DOLLARand
    - typings.atOracleOraclejet.atOracleOraclejetStrings.DOLLARor
  */
  trait CompoundOperator extends js.Object
  
}

