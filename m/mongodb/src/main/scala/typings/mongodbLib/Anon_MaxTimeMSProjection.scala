package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxTimeMSProjection extends js.Object {
  var maxTimeMS: js.UndefOr[scala.Double] = js.undefined
  var projection: js.UndefOr[js.Object] = js.undefined
  var session: js.UndefOr[mongodbLib.mongodbMod.ClientSession] = js.undefined
  var sort: js.UndefOr[js.Object] = js.undefined
}

object Anon_MaxTimeMSProjection {
  @scala.inline
  def apply(
    maxTimeMS: scala.Int | scala.Double = null,
    projection: js.Object = null,
    session: mongodbLib.mongodbMod.ClientSession = null,
    sort: js.Object = null
  ): Anon_MaxTimeMSProjection = {
    val __obj = js.Dynamic.literal()
    if (maxTimeMS != null) __obj.updateDynamic("maxTimeMS")(maxTimeMS.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (session != null) __obj.updateDynamic("session")(session)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[Anon_MaxTimeMSProjection]
  }
}

