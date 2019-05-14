package typings
package oracledbLib.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to configure fields when creating a B-Tree Index.
  */
trait BTreeIndexField extends js.Object {
  /** Name of the data type of the targeted-field value, for indexing purposes. */
  var datatype: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the maximum length of the value to index. */
  var maxlength: js.UndefOr[scala.Double] = js.undefined
  /** Index sorting order, for datatype varchar2 (or one of its synonyms) or number. */
  var order: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Path to the targeted field, whose value is expected to be a scalar. */
  var path: java.lang.String
}

object BTreeIndexField {
  @scala.inline
  def apply(
    path: java.lang.String,
    datatype: java.lang.String = null,
    maxlength: scala.Int | scala.Double = null,
    order: java.lang.String | scala.Double = null
  ): BTreeIndexField = {
    val __obj = js.Dynamic.literal(path = path)
    if (datatype != null) __obj.updateDynamic("datatype")(datatype)
    if (maxlength != null) __obj.updateDynamic("maxlength")(maxlength.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[BTreeIndexField]
  }
}

