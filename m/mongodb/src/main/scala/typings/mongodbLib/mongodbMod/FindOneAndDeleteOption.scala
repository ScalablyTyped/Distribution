package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindOneAndDeleteOption extends js.Object {
  var collation: js.UndefOr[CollationDocument] = js.undefined
  var maxTimeMS: js.UndefOr[scala.Double] = js.undefined
  var projection: js.UndefOr[js.Object] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
  var sort: js.UndefOr[js.Object] = js.undefined
}

object FindOneAndDeleteOption {
  @scala.inline
  def apply(
    collation: CollationDocument = null,
    maxTimeMS: scala.Int | scala.Double = null,
    projection: js.Object = null,
    session: ClientSession = null,
    sort: js.Object = null
  ): FindOneAndDeleteOption = {
    val __obj = js.Dynamic.literal()
    if (collation != null) __obj.updateDynamic("collation")(collation)
    if (maxTimeMS != null) __obj.updateDynamic("maxTimeMS")(maxTimeMS.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (session != null) __obj.updateDynamic("session")(session)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[FindOneAndDeleteOption]
  }
}

