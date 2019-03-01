package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpsertGraphOptions extends js.Object {
  var insertMissing: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  var noDelete: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  var noInsert: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  var noRelate: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  var noUnrelate: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  var noUpdate: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  var relate: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  var unrelate: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  var update: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
}

object UpsertGraphOptions {
  @scala.inline
  def apply(
    insertMissing: scala.Boolean | js.Array[java.lang.String] = null,
    noDelete: scala.Boolean | js.Array[java.lang.String] = null,
    noInsert: scala.Boolean | js.Array[java.lang.String] = null,
    noRelate: scala.Boolean | js.Array[java.lang.String] = null,
    noUnrelate: scala.Boolean | js.Array[java.lang.String] = null,
    noUpdate: scala.Boolean | js.Array[java.lang.String] = null,
    relate: scala.Boolean | js.Array[java.lang.String] = null,
    unrelate: scala.Boolean | js.Array[java.lang.String] = null,
    update: scala.Boolean | js.Array[java.lang.String] = null
  ): UpsertGraphOptions = {
    val __obj = js.Dynamic.literal()
    if (insertMissing != null) __obj.updateDynamic("insertMissing")(insertMissing.asInstanceOf[js.Any])
    if (noDelete != null) __obj.updateDynamic("noDelete")(noDelete.asInstanceOf[js.Any])
    if (noInsert != null) __obj.updateDynamic("noInsert")(noInsert.asInstanceOf[js.Any])
    if (noRelate != null) __obj.updateDynamic("noRelate")(noRelate.asInstanceOf[js.Any])
    if (noUnrelate != null) __obj.updateDynamic("noUnrelate")(noUnrelate.asInstanceOf[js.Any])
    if (noUpdate != null) __obj.updateDynamic("noUpdate")(noUpdate.asInstanceOf[js.Any])
    if (relate != null) __obj.updateDynamic("relate")(relate.asInstanceOf[js.Any])
    if (unrelate != null) __obj.updateDynamic("unrelate")(unrelate.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpsertGraphOptions]
  }
}

