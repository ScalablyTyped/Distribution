package typings
package nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAnswer extends js.Object {
  var affectedRows: scala.Double
  var table: java.lang.String
}

object DeleteAnswer {
  @scala.inline
  def apply(affectedRows: scala.Double, table: java.lang.String): DeleteAnswer = {
    val __obj = js.Dynamic.literal(affectedRows = affectedRows, table = table)
  
    __obj.asInstanceOf[DeleteAnswer]
  }
}

