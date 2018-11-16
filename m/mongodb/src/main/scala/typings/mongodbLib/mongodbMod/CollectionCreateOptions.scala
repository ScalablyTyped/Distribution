package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CollectionCreateOptions extends CommonOptions {
  var autoIndexId: js.UndefOr[scala.Boolean] = js.undefined
  var capped: js.UndefOr[scala.Boolean] = js.undefined
  var collation: js.UndefOr[js.Object] = js.undefined
  var flags: js.UndefOr[scala.Double] = js.undefined
  var indexOptionDefaults: js.UndefOr[js.Object] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var pipeline: js.UndefOr[js.Array[_]] = js.undefined
  var pkFactory: js.UndefOr[js.Object] = js.undefined
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  var readPreference: js.UndefOr[ReadPreference | java.lang.String] = js.undefined
  var serializeFunctions: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var storageEngine: js.UndefOr[js.Object] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  var validationAction: js.UndefOr[mongodbLib.mongodbLibStrings.error | mongodbLib.mongodbLibStrings.warn] = js.undefined
  var validationLevel: js.UndefOr[
    mongodbLib.mongodbLibStrings.off | mongodbLib.mongodbLibStrings.strict | mongodbLib.mongodbLibStrings.moderate
  ] = js.undefined
  var validator: js.UndefOr[js.Object] = js.undefined
  var viewOn: js.UndefOr[java.lang.String] = js.undefined
}

