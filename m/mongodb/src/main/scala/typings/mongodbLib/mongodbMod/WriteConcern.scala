package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A MongoDB WriteConcern, which describes the level of acknowledgement
  * requested from MongoDB for write operations.
  * http://mongodb.github.io/node-mongodb-native/3.1/api/global.html#WriteConcern
  */
trait WriteConcern extends js.Object {
  /**
    * requests acknowledgement from MongoDB that the write operation has
    * been written to the journal
    * @default false
    */
  var j: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * requests acknowledgement that the write operation has
    * propagated to a specified number of mongod hosts
    * @default 1
    */
  var w: js.UndefOr[scala.Double | mongodbLib.mongodbLibStrings.majority | java.lang.String] = js.undefined
  /**
    * a time limit, in milliseconds, for the write concern
    */
  var wtimeout: js.UndefOr[scala.Double] = js.undefined
}

object WriteConcern {
  @scala.inline
  def apply(
    j: js.UndefOr[scala.Boolean] = js.undefined,
    w: scala.Double | mongodbLib.mongodbLibStrings.majority | java.lang.String = null,
    wtimeout: scala.Int | scala.Double = null
  ): WriteConcern = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j)
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (wtimeout != null) __obj.updateDynamic("wtimeout")(wtimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteConcern]
  }
}

