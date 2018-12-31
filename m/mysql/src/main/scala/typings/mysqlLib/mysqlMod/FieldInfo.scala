package typings
package mysqlLib.mysqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldInfo extends js.Object {
  var catalog: java.lang.String
  var charsetNr: scala.Double
  var db: java.lang.String
  var decimals: scala.Double
  var default: js.UndefOr[java.lang.String] = js.undefined
  var flags: scala.Double
  var length: scala.Double
  var name: java.lang.String
  var orgName: java.lang.String
  var orgTable: java.lang.String
  var protocol41: scala.Boolean
  var table: java.lang.String
  var `type`: Types
  var zeroFill: scala.Boolean
}

