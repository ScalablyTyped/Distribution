package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DbCollectionOptions extends CommonOptions {
  var pkFactory: js.UndefOr[js.Object] = js.undefined
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  var readConcern: js.UndefOr[ReadConcern] = js.undefined
  var readPreference: js.UndefOr[ReadPreference | java.lang.String] = js.undefined
  var serializeFunctions: js.UndefOr[scala.Boolean] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

