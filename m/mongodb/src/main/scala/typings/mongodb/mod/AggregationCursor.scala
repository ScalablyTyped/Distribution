package typings.mongodb.mod

import typings.node.Buffer
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "AggregationCursor")
@js.native
class AggregationCursor[T] () extends Readable {
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#batchSize */
  def batchSize(value: scala.Double): AggregationCursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#close */
  def close(): js.Promise[AggregationCursorResult] = js.native
  def close(callback: MongoCallback[AggregationCursorResult]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#each */
  def each(callback: MongoCallback[AggregationCursorResult]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#explain */
  def explain(): js.Promise[AggregationCursorResult] = js.native
  def explain(callback: MongoCallback[AggregationCursorResult]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#geoNear */
  def geoNear(document: js.Object): AggregationCursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#group */
  def group[U](document: js.Object): AggregationCursor[U] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#hasNext */
  def hasNext(): js.Promise[Boolean] = js.native
  def hasNext(callback: MongoCallback[Boolean]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#isClosed */
  def isClosed(): Boolean = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#limit */
  def limit(value: scala.Double): AggregationCursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#lookup */
  def lookup(document: js.Object): AggregationCursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#match */
  def `match`(document: js.Object): AggregationCursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#maxTimeMS */
  def maxTimeMS(value: scala.Double): AggregationCursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#next */
  def next(): js.Promise[T | Null] = js.native
  def next(callback: MongoCallback[T | Null]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#out */
  def out(destination: String): AggregationCursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#project */
  def project[U](document: js.Object): AggregationCursor[U] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#redact */
  def redact(document: js.Object): AggregationCursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#rewind */
  def rewind(): AggregationCursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#setEncoding */
  def skip(value: scala.Double): AggregationCursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#sort */
  def sort(document: js.Object): AggregationCursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#toArray */
  def toArray(): js.Promise[js.Array[T]] = js.native
  def toArray(callback: MongoCallback[js.Array[T]]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#unshift */
  def unshift(stream: Buffer): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#unwind */
  def unwind[U](field: String): AggregationCursor[U] = js.native
}

