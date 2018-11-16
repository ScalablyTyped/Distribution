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

