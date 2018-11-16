package typings
package postgresDashIntervalLib.postgresDashIntervalMod.PostgresIntervalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPostgresInterval extends js.Object {
  var days: js.UndefOr[scala.Double] = js.undefined
  var hours: js.UndefOr[scala.Double] = js.undefined
  var milliseconds: js.UndefOr[scala.Double] = js.undefined
  var minutes: js.UndefOr[scala.Double] = js.undefined
  var months: js.UndefOr[scala.Double] = js.undefined
  var seconds: js.UndefOr[scala.Double] = js.undefined
  var years: js.UndefOr[scala.Double] = js.undefined
  def toISO(): java.lang.String
  def toPostgres(): java.lang.String
}

