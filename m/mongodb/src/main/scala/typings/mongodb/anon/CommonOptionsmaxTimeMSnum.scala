package typings.mongodb.anon

import typings.mongodb.mod.ClientSession
import typings.mongodb.mongodbStrings.majority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mongodb.mongodb.CommonOptions & {  maxTimeMS ? :number} */
trait CommonOptionsmaxTimeMSnum extends js.Object {
  /**
    * requests acknowledgement from MongoDB that the write operation has
    * been written to the journal
    * @default false
    */
  var j: js.UndefOr[Boolean] = js.undefined
  var maxTimeMS: js.UndefOr[Double] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
  /**
    * requests acknowledgement that the write operation has
    * propagated to a specified number of mongod hosts
    * @default 1
    */
  var w: js.UndefOr[Double | majority | String] = js.undefined
  /**
    * a time limit, in milliseconds, for the write concern
    */
  var wtimeout: js.UndefOr[Double] = js.undefined
}

object CommonOptionsmaxTimeMSnum {
  @scala.inline
  def apply(
    j: js.UndefOr[Boolean] = js.undefined,
    maxTimeMS: js.UndefOr[Double] = js.undefined,
    session: ClientSession = null,
    w: Double | majority | String = null,
    wtimeout: js.UndefOr[Double] = js.undefined
  ): CommonOptionsmaxTimeMSnum = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTimeMS)) __obj.updateDynamic("maxTimeMS")(maxTimeMS.get.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (!js.isUndefined(wtimeout)) __obj.updateDynamic("wtimeout")(wtimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonOptionsmaxTimeMSnum]
  }
}

