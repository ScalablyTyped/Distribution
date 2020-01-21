package typings.mongodb.mod

import typings.mongodb.AnonDocument
import typings.node.Buffer
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "Cursor")
@js.native
class Cursor[T] () extends Readable {
  var readPreference: ReadPreference = js.native
  var sortValue: String = js.native
  var timeout: Boolean = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#addCursorFlag */
  def addCursorFlag(flag: String, value: Boolean): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#addQueryModifier */
  def addQueryModifier(name: String, value: Boolean): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#batchSize */
  def batchSize(value: scala.Double): Cursor[T] = js.native
   // still returns the same type
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#close */
  def close(): js.Promise[CursorResult] = js.native
  def close(callback: MongoCallback[CursorResult]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#collation */
  def collation(value: CollationDocument): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#comment */
  def comment(value: String): Cursor[T] = js.native
  def count(): js.Promise[scala.Double] = js.native
  def count(applySkipLimit: Boolean): js.Promise[scala.Double] = js.native
  def count(applySkipLimit: Boolean, callback: MongoCallback[scala.Double]): Unit = js.native
  def count(applySkipLimit: Boolean, options: CursorCommentOptions): js.Promise[scala.Double] = js.native
  def count(applySkipLimit: Boolean, options: CursorCommentOptions, callback: MongoCallback[scala.Double]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#count */
  def count(callback: MongoCallback[scala.Double]): Unit = js.native
  def count(options: CursorCommentOptions, callback: MongoCallback[scala.Double]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#explain */
  def explain(): js.Promise[CursorResult] = js.native
  def explain(callback: MongoCallback[CursorResult]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#filter */
  def filter(filter: js.Object): Cursor[T] = js.native
  def forEach(iterator: IteratorCallback[T]): js.Promise[Unit] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#forEach */
  def forEach(iterator: IteratorCallback[T], callback: EndCallback): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#hasNext */
  def hasNext(): js.Promise[Boolean] = js.native
  def hasNext(callback: MongoCallback[Boolean]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#hint */
  def hint(hint: String): Cursor[T] = js.native
  def hint(hint: js.Object): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#isClosed */
  def isClosed(): Boolean = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#limit */
  def limit(value: scala.Double): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#map */
  def map[U](transform: js.Function1[/* document */ T, U]): Cursor[U] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#max */
  def max(max: js.Object): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#maxAwaitTimeMS */
  def maxAwaitTimeMS(value: scala.Double): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#maxScan */
  def maxScan(maxScan: js.Object): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#maxTimeMS */
  def maxTimeMS(value: scala.Double): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#min */
  def min(min: js.Object): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#next */
  def next(): js.Promise[T | Null] = js.native
  def next(callback: MongoCallback[T | Null]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#project */
  def project(value: js.Object): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#next */
  def returnKey(returnKey: js.Object): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#rewind */
  def rewind(): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#setCursorOption */
  def setCursorOption(field: String, value: js.Object): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#setReadPreference */
  def setReadPreference(readPreference: ReadPreferenceOrMode): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#showRecordId */
  def showRecordId(showRecordId: js.Object): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#skip */
  def skip(value: scala.Double): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#snapshot */
  def snapshot(snapshot: js.Object): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#sort */
  def sort(keyOrList: String): Cursor[T] = js.native
  def sort(keyOrList: String, direction: scala.Double): Cursor[T] = js.native
  def sort(keyOrList: js.Array[js.Object]): Cursor[T] = js.native
  def sort(keyOrList: js.Array[js.Object], direction: scala.Double): Cursor[T] = js.native
  def sort(keyOrList: js.Object): Cursor[T] = js.native
  def sort(keyOrList: js.Object, direction: scala.Double): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#stream */
  def stream(): Cursor[T] = js.native
  def stream(options: AnonDocument[T]): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#toArray */
  def toArray(): js.Promise[js.Array[T]] = js.native
  def toArray(callback: MongoCallback[js.Array[T]]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#unshift */
  def unshift(stream: Buffer): Unit = js.native
}

