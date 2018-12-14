package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mongodbMod {
  type AggregationCursorResult = js.Any | scala.Unit
  type CommandCursorResult = js.Any | scala.Unit
  type CursorResult = js.Any | scala.Unit | scala.Boolean
  type EndCallback = js.Function1[/* error */ MongoError, scala.Unit]
  type FilterQuery[T] = (mongodbLib.mongodbLibStrings.FilterQuery with T) | org.scalablytyped.runtime.StringDictionary[js.Any]
  type GridFSBucketErrorCallback = js.Function1[/* err */ js.UndefOr[MongoError], scala.Unit]
  type IteratorCallback[T] = js.Function1[/* doc */ T, scala.Unit]
  type MongoCallback[T] = js.Function2[/* error */ MongoError, /* result */ T, scala.Unit]
  type ProfilingLevel = mongodbLib.mongodbLibStrings.off | mongodbLib.mongodbLibStrings.slow_only | mongodbLib.mongodbLibStrings.all
  type log = js.Function2[
    /* message */ js.UndefOr[java.lang.String], 
    /* state */ js.UndefOr[LoggerState], 
    scala.Unit
  ]
}
