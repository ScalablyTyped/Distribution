package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "Cursor")
@js.native
class Cursor[T] ()
  extends nodeLib.streamMod.Readable {
  var readPreference: ReadPreference = js.native
  var sortValue: java.lang.String = js.native
  var timeout: scala.Boolean = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#addCursorFlag */
  def addCursorFlag(flag: java.lang.String, value: scala.Boolean): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#addQueryModifier */
  def addQueryModifier(name: java.lang.String, value: scala.Boolean): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#batchSize */
  def batchSize(value: scala.Double): Cursor[T] = js.native
   // still returns the same type
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#close */
  def close(): js.Promise[CursorResult] = js.native
  def close(callback: MongoCallback[CursorResult]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#collation */
  def collation(value: CollationDocument): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#comment */
  def comment(value: java.lang.String): Cursor[T] = js.native
  def count(): js.Promise[scala.Double] = js.native
  def count(applySkipLimit: scala.Boolean): js.Promise[scala.Double] = js.native
  def count(applySkipLimit: scala.Boolean, callback: MongoCallback[scala.Double]): scala.Unit = js.native
  def count(applySkipLimit: scala.Boolean, options: CursorCommentOptions): js.Promise[scala.Double] = js.native
  def count(
    applySkipLimit: scala.Boolean,
    options: CursorCommentOptions,
    callback: MongoCallback[scala.Double]
  ): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#count */
  def count(callback: MongoCallback[scala.Double]): scala.Unit = js.native
  def count(options: CursorCommentOptions, callback: MongoCallback[scala.Double]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#explain */
  def explain(): js.Promise[CursorResult] = js.native
  def explain(callback: MongoCallback[CursorResult]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#filter */
  def filter(filter: js.Object): Cursor[T] = js.native
  def forEach(iterator: IteratorCallback[T]): js.Promise[scala.Unit] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#forEach */
  def forEach(iterator: IteratorCallback[T], callback: EndCallback): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#hasNext */
  def hasNext(): js.Promise[scala.Boolean] = js.native
  def hasNext(callback: MongoCallback[scala.Boolean]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#hint */
  def hint(hint: js.Object): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#isClosed */
  def isClosed(): scala.Boolean = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#limit */
  def limit(value: scala.Double): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#map */
  def map[U](transform: js.Function1[/* document */ T, U]): Cursor[U] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#max */
  def max(max: scala.Double): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#maxAwaitTimeMS */
  def maxAwaitTimeMS(value: scala.Double): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#maxScan */
  def maxScan(maxScan: js.Object): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#maxTimeMS */
  def maxTimeMS(value: scala.Double): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#min */
  def min(min: scala.Double): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#next */
  def next(): js.Promise[T | scala.Null] = js.native
  def next(callback: MongoCallback[T | scala.Null]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#project */
  def project(value: js.Object): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#next */
  def returnKey(returnKey: js.Object): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#rewind */
  def rewind(): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#setCursorOption */
  def setCursorOption(field: java.lang.String, value: js.Object): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#setReadPreference */
  def setReadPreference(readPreference: java.lang.String): Cursor[T] = js.native
  def setReadPreference(readPreference: ReadPreference): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#showRecordId */
  def showRecordId(showRecordId: js.Object): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#skip */
  def skip(value: scala.Double): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#snapshot */
  def snapshot(snapshot: js.Object): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#sort */
  def sort(keyOrList: java.lang.String): Cursor[T] = js.native
  def sort(keyOrList: java.lang.String, direction: scala.Double): Cursor[T] = js.native
  def sort(keyOrList: js.Array[js.Object]): Cursor[T] = js.native
  def sort(keyOrList: js.Array[js.Object], direction: scala.Double): Cursor[T] = js.native
  def sort(keyOrList: js.Object): Cursor[T] = js.native
  def sort(keyOrList: js.Object, direction: scala.Double): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#stream */
  def stream(): Cursor[T] = js.native
  def stream(options: mongodbLib.Anon_Transform): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#toArray */
  def toArray(): js.Promise[js.Array[T]] = js.native
  def toArray(callback: MongoCallback[js.Array[T]]): scala.Unit = js.native
}

