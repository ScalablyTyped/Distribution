package typings.oracledb.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to configure fields when creating a B-Tree Index.
  */
trait BTreeIndexField extends js.Object {
  /** Name of the data type of the targeted-field value, for indexing purposes. */
  var datatype: js.UndefOr[String] = js.undefined
  /** Specifies the maximum length of the value to index. */
  var maxlength: js.UndefOr[Double] = js.undefined
  /** Index sorting order, for datatype varchar2 (or one of its synonyms) or number. */
  var order: js.UndefOr[String | Double] = js.undefined
  /** Path to the targeted field, whose value is expected to be a scalar. */
  var path: String
}

object BTreeIndexField {
  @scala.inline
  def apply(
    path: String,
    datatype: String = null,
    maxlength: Int | Double = null,
    order: String | Double = null
  ): BTreeIndexField = {
    val __obj = js.Dynamic.literal(path = path)
    if (datatype != null) __obj.updateDynamic("datatype")(datatype)
    if (maxlength != null) __obj.updateDynamic("maxlength")(maxlength.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[BTreeIndexField]
  }
}

