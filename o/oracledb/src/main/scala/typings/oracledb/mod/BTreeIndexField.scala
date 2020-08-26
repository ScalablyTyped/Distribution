package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to configure fields when creating a B-Tree Index.
  */
@js.native
trait BTreeIndexField extends js.Object {
  /** Name of the data type of the targeted-field value, for indexing purposes. */
  var datatype: js.UndefOr[String] = js.native
  /** Specifies the maximum length of the value to index. */
  var maxlength: js.UndefOr[Double] = js.native
  /** Index sorting order, for datatype varchar2 (or one of its synonyms) or number. */
  var order: js.UndefOr[String | Double] = js.native
  /** Path to the targeted field, whose value is expected to be a scalar. */
  var path: String = js.native
}

object BTreeIndexField {
  @scala.inline
  def apply(path: String): BTreeIndexField = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[BTreeIndexField]
  }
  @scala.inline
  implicit class BTreeIndexFieldOps[Self <: BTreeIndexField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatatype(value: String): Self = this.set("datatype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatatype: Self = this.set("datatype", js.undefined)
    @scala.inline
    def setMaxlength(value: Double): Self = this.set("maxlength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxlength: Self = this.set("maxlength", js.undefined)
    @scala.inline
    def setOrder(value: String | Double): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
  }
  
}

