package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "CommandCursor")
@js.native
class CommandCursor ()
  extends nodeLib.streamMod.Readable {
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/CommandCursor.html#batchSize */
  def batchSize(value: scala.Double): CommandCursor = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/CommandCursor.html#close */
  def close(): stdLib.Promise[CommandCursorResult] = js.native
  def close(callback: MongoCallback[CommandCursorResult]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/CommandCursor.html#each */
  def each(callback: MongoCallback[CommandCursorResult]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/CommandCursor.html#hasNext */
  def hasNext(): stdLib.Promise[CommandCursorResult] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/CommandCursor.html#hasNext */
  def hasNext(callback: MongoCallback[CommandCursorResult]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/CommandCursor.html#isClosed */
  def isClosed(): scala.Boolean = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/CommandCursor.html#maxTimeMS */
  def maxTimeMS(value: scala.Double): CommandCursor = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/CommandCursor.html#next */
  def next(): stdLib.Promise[CommandCursorResult] = js.native
  def next(callback: MongoCallback[CommandCursorResult]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/CommandCursor.html#rewind */
  def rewind(): CommandCursor = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/CommandCursor.html#setReadPreference */
  def setReadPreference(readPreference: java.lang.String): CommandCursor = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/CommandCursor.html#setReadPreference */
  def setReadPreference(readPreference: ReadPreference): CommandCursor = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/CommandCursor.html#toArray */
  def toArray(): stdLib.Promise[js.Array[_]] = js.native
  def toArray(callback: MongoCallback[js.Array[_]]): scala.Unit = js.native
}

