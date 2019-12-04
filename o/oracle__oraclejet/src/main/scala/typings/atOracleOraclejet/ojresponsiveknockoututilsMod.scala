package typings.atOracleOraclejet

import typings.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojresponsiveknockoututils", JSImport.Namespace)
@js.native
object ojresponsiveknockoututilsMod extends js.Object {
  def createMediaQueryObservable(queryString: String): KnockoutObservable[Boolean] = js.native
  def createScreenRangeObservable(): KnockoutObservable[String] = js.native
}

