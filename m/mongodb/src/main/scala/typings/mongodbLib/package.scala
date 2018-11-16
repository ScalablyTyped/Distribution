package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mongodbLib {
  type Default = js.Any
  type GridFSBucketWriteStreamId = java.lang.String | scala.Double | js.Object | js.Any
  // http://mongodb.github.io/node-mongodb-native/3.1/api/global.html#ReadConcern
  type ReadConcernLevel = mongodbLib.mongodbLibStrings.local | mongodbLib.mongodbLibStrings.available | mongodbLib.mongodbLibStrings.majority | mongodbLib.mongodbLibStrings.linearizable | mongodbLib.mongodbLibStrings.snapshot
}
