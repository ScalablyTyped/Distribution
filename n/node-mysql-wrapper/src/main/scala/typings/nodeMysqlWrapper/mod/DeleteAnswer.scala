package typings.nodeMysqlWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAnswer extends js.Object {
  var affectedRows: Double
  var table: String
}

object DeleteAnswer {
  @scala.inline
  def apply(affectedRows: Double, table: String): DeleteAnswer = {
    val __obj = js.Dynamic.literal(affectedRows = affectedRows.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteAnswer]
  }
}

