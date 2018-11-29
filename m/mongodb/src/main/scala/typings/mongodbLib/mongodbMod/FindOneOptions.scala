package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FindOneOptions extends js.Object {
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  var collation: js.UndefOr[js.Object] = js.undefined
  var comment: js.UndefOr[java.lang.String] = js.undefined
  var explain: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * @deprecated Use options.projection instead
       */
  var fields: js.UndefOr[js.Object] = js.undefined
  var hint: js.UndefOr[js.Object] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var maxScan: js.UndefOr[scala.Double] = js.undefined
  var maxTimeMs: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var partial: js.UndefOr[scala.Boolean] = js.undefined
  var projection: js.UndefOr[js.Object] = js.undefined
  var promoteBuffers: js.UndefOr[scala.Boolean] = js.undefined
  var promoteLongs: js.UndefOr[scala.Boolean] = js.undefined
  var promoteValues: js.UndefOr[scala.Boolean] = js.undefined
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  var readPreference: js.UndefOr[ReadPreference | java.lang.String] = js.undefined
  var returnKey: js.UndefOr[scala.Boolean] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
  var showDiskLoc: js.UndefOr[scala.Boolean] = js.undefined
  var skip: js.UndefOr[scala.Double] = js.undefined
  var snapshot: js.UndefOr[scala.Boolean] = js.undefined
  var sort: js.UndefOr[js.Array[_] | js.Object] = js.undefined
  var tailable: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Boolean] = js.undefined
}

