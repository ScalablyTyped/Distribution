package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpsertGraphOptions extends js.Object {
  var allowRefs: js.UndefOr[Boolean] = js.undefined
  var insertMissing: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  var noDelete: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  var noInsert: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  var noRelate: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  var noUnrelate: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  var noUpdate: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  var relate: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  var unrelate: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  var update: js.UndefOr[Boolean | js.Array[String]] = js.undefined
}

object UpsertGraphOptions {
  @scala.inline
  def apply(
    allowRefs: js.UndefOr[Boolean] = js.undefined,
    insertMissing: Boolean | js.Array[String] = null,
    noDelete: Boolean | js.Array[String] = null,
    noInsert: Boolean | js.Array[String] = null,
    noRelate: Boolean | js.Array[String] = null,
    noUnrelate: Boolean | js.Array[String] = null,
    noUpdate: Boolean | js.Array[String] = null,
    relate: Boolean | js.Array[String] = null,
    unrelate: Boolean | js.Array[String] = null,
    update: Boolean | js.Array[String] = null
  ): UpsertGraphOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowRefs)) __obj.updateDynamic("allowRefs")(allowRefs.asInstanceOf[js.Any])
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

