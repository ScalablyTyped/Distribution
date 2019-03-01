package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FSyncOptions extends CommonOptions {
  var fsync: js.UndefOr[scala.Boolean] = js.undefined
}

object FSyncOptions {
  @scala.inline
  def apply(
    fsync: js.UndefOr[scala.Boolean] = js.undefined,
    j: js.UndefOr[scala.Boolean] = js.undefined,
    session: ClientSession = null,
    w: scala.Double | mongodbLib.mongodbLibStrings.majority | java.lang.String = null,
    wtimeout: scala.Int | scala.Double = null
  ): FSyncOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fsync)) __obj.updateDynamic("fsync")(fsync)
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j)
    if (session != null) __obj.updateDynamic("session")(session)
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (wtimeout != null) __obj.updateDynamic("wtimeout")(wtimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[FSyncOptions]
  }
}

