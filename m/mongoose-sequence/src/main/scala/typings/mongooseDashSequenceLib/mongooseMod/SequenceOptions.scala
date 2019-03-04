package typings
package mongooseDashSequenceLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequenceOptions extends js.Object {
              // If true, the counter will not be incremented on saving a new document. Default to false
  var collection_name: js.UndefOr[java.lang.String] = js.undefined
     // The field to reference for a scoped counter. Optional
  var disable_hooks: js.UndefOr[scala.Boolean] = js.undefined
                    // The name of the field to increment. Mandatory, default is _id
  var id: js.UndefOr[java.lang.String] = js.undefined
  var inc_field: java.lang.String
                          // Id of the sequence. Is mandatory only for scoped sequences but its use is strongly encouraged.
  var reference_fields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object SequenceOptions {
  @scala.inline
  def apply(
    inc_field: java.lang.String,
    collection_name: java.lang.String = null,
    disable_hooks: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    reference_fields: js.Array[java.lang.String] = null
  ): SequenceOptions = {
    val __obj = js.Dynamic.literal(inc_field = inc_field)
    if (collection_name != null) __obj.updateDynamic("collection_name")(collection_name)
    if (!js.isUndefined(disable_hooks)) __obj.updateDynamic("disable_hooks")(disable_hooks)
    if (id != null) __obj.updateDynamic("id")(id)
    if (reference_fields != null) __obj.updateDynamic("reference_fields")(reference_fields)
    __obj.asInstanceOf[SequenceOptions]
  }
}

