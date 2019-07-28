package typings.mongooseDashSequence.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequenceOptions extends js.Object {
              // If true, the counter will not be incremented on saving a new document. Default to false
  var collection_name: js.UndefOr[String] = js.undefined
     // The field to reference for a scoped counter. Optional
  var disable_hooks: js.UndefOr[Boolean] = js.undefined
                    // The name of the field to increment. Mandatory, default is _id
  var id: js.UndefOr[String] = js.undefined
  var inc_field: String
                          // Id of the sequence. Is mandatory only for scoped sequences but its use is strongly encouraged.
  var reference_fields: js.UndefOr[js.Array[String]] = js.undefined
}

object SequenceOptions {
  @scala.inline
  def apply(
    inc_field: String,
    collection_name: String = null,
    disable_hooks: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    reference_fields: js.Array[String] = null
  ): SequenceOptions = {
    val __obj = js.Dynamic.literal(inc_field = inc_field)
    if (collection_name != null) __obj.updateDynamic("collection_name")(collection_name)
    if (!js.isUndefined(disable_hooks)) __obj.updateDynamic("disable_hooks")(disable_hooks)
    if (id != null) __obj.updateDynamic("id")(id)
    if (reference_fields != null) __obj.updateDynamic("reference_fields")(reference_fields)
    __obj.asInstanceOf[SequenceOptions]
  }
}

