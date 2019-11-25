package typings.atOracleOraclejet.ojdataproviderMod.CompoundFilterOperator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atOracleOraclejet.atOracleOraclejetStrings.DOLLARand
  - typings.atOracleOraclejet.atOracleOraclejetStrings.DOLLARor
*/
trait CompoundOperator extends js.Object

object CompoundOperator {
  @scala.inline
  def DOLLARand: typings.atOracleOraclejet.atOracleOraclejetStrings.DOLLARand = this.cast("$and")
  @scala.inline
  def DOLLARor: typings.atOracleOraclejet.atOracleOraclejetStrings.DOLLARor = this.cast("$or")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

