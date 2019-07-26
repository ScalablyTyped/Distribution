package typings
package mssqlLib.mssqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBulkResult extends js.Object {
  var rowsAffected: scala.Double
}

object IBulkResult {
  @scala.inline
  def apply(rowsAffected: scala.Double): IBulkResult = {
    val __obj = js.Dynamic.literal(rowsAffected = rowsAffected)
  
    __obj.asInstanceOf[IBulkResult]
  }
}

