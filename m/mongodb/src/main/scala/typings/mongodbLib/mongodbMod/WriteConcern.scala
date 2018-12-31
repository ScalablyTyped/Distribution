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
    * @type {boolean} default false
    */
  var j: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * requests acknowledgement that the write operation has
    * propagated to a specified number of mongod hosts
    * @type {(number | 'majority' | string)} default 1
    */
  var w: js.UndefOr[scala.Double | mongodbLib.mongodbLibStrings.majority | java.lang.String] = js.undefined
  /**
    * a time limit, in milliseconds, for the write concern
    * @type {number}
    * @memberof WriteConcern
    */
  var wtimeout: js.UndefOr[scala.Double] = js.undefined
}

