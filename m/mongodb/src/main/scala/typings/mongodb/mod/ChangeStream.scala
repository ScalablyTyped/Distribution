package typings.mongodb.mod

import typings.mongodb.AnonTransform
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "ChangeStream")
@js.native
class ChangeStream protected () extends Readable {
  def this(changeDomain: Collection[DefaultSchema], pipeline: js.Array[js.Object]) = this()
  def this(changeDomain: Db, pipeline: js.Array[js.Object]) = this()
  def this(
    changeDomain: Collection[DefaultSchema],
    pipeline: js.Array[js.Object],
    options: ChangeStreamOptions
  ) = this()
  def this(changeDomain: Db, pipeline: js.Array[js.Object], options: ChangeStreamOptions) = this()
  var resumeToken: ResumeToken = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/ChangeStream.html#close */
  def close(): js.Promise[_] = js.native
  def close(callback: MongoCallback[_]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/ChangeStream.html#hasNext */
  def hasNext(): js.Promise[_] = js.native
  def hasNext(callback: MongoCallback[_]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/ChangeStream.html#isClosed */
  def isClosed(): Boolean = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/ChangeStream.html#next */
  def next(): js.Promise[_] = js.native
  def next(callback: MongoCallback[_]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/ChangeStream.html#stream */
  def stream(): Cursor[Default] = js.native
  def stream(options: AnonTransform): Cursor[Default] = js.native
}

