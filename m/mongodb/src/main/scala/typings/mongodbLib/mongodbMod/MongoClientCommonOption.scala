package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MongoClientCommonOption extends js.Object {
  /** Do not make the db an event listener to the original connection. */
  var noListener: js.UndefOr[scala.Boolean] = js.undefined
  /** Control if you want to return a cached instance or have a new one created */
  var returnNonCachedInstance: js.UndefOr[scala.Boolean] = js.undefined
}

