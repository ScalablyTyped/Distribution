package typings.mongooseDelete.mod

import typings.mongooseDelete.mongooseDeleteStrings.all
import typings.mongooseDelete.mongooseDeleteStrings.deleteAt
import typings.mongooseDelete.mongooseDeleteStrings.deleted
import typings.mongooseDelete.mongooseDeleteStrings.deletedBy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var deletedAt: Boolean
  var deletedBy: Boolean
  /**
    * DeleteBy Schema type, equal to
    * ```
    * Schema({
    * deletedBy: {
    *  type: options.deletedByType
    *  }
    * })
    * ```
    * @default ObjectId
    */
  var deletedByType: js.Any
  var indexFields: Boolean | all | deleted | deleteAt | deletedBy
  var overrideMethods: Boolean | all | js.Array[overridableMethods]
  var validateBeforeDelete: Boolean
}

object Options {
  @scala.inline
  def apply(
    deletedAt: Boolean,
    deletedBy: Boolean,
    deletedByType: js.Any,
    indexFields: Boolean | all | deleted | deleteAt | deletedBy,
    overrideMethods: Boolean | all | js.Array[overridableMethods],
    validateBeforeDelete: Boolean
  ): Options = {
    val __obj = js.Dynamic.literal(deletedAt = deletedAt.asInstanceOf[js.Any], deletedBy = deletedBy.asInstanceOf[js.Any], deletedByType = deletedByType.asInstanceOf[js.Any], indexFields = indexFields.asInstanceOf[js.Any], overrideMethods = overrideMethods.asInstanceOf[js.Any], validateBeforeDelete = validateBeforeDelete.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

