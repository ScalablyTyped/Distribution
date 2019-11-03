package typings.mongodb

import typings.mongodb.mongodbMod.ClientSession
import typings.mongodb.mongodbMod.ReadPreferenceOrMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxTimeMSReadPreference extends js.Object {
  var maxTimeMS: js.UndefOr[Double] = js.undefined
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
}

object Anon_MaxTimeMSReadPreference {
  @scala.inline
  def apply(
    maxTimeMS: Int | Double = null,
    readPreference: ReadPreferenceOrMode = null,
    session: ClientSession = null
  ): Anon_MaxTimeMSReadPreference = {
    val __obj = js.Dynamic.literal()
    if (maxTimeMS != null) __obj.updateDynamic("maxTimeMS")(maxTimeMS.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference)
    if (session != null) __obj.updateDynamic("session")(session)
    __obj.asInstanceOf[Anon_MaxTimeMSReadPreference]
  }
}

