package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "ChangeStream")
@js.native
class ChangeStream protected ()
  extends nodeLib.streamMod.Readable {
  def this(changeDomain: Collection[mongodbLib.Default], pipeline: js.Array[js.Object]) = this()
  def this(changeDomain: Db, pipeline: js.Array[js.Object]) = this()
  def this(changeDomain: Collection[mongodbLib.Default], pipeline: js.Array[js.Object], options: ChangeStreamOptions) = this()
  def this(changeDomain: Db, pipeline: js.Array[js.Object], options: ChangeStreamOptions) = this()
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/ChangeStream.html#close */
  def close(): js.Promise[_] = js.native
  def close(callback: MongoCallback[_]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/ChangeStream.html#hasNext */
  def hasNext(): js.Promise[_] = js.native
  def hasNext(callback: MongoCallback[_]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/ChangeStream.html#isClosed */
  def isClosed(): scala.Boolean = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/ChangeStream.html#next */
  def next(): js.Promise[_] = js.native
  def next(callback: MongoCallback[_]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/ChangeStream.html#stream */
  def stream(): Cursor[mongodbLib.Default] = js.native
  def stream(options: mongodbLib.Anon_Transform): Cursor[mongodbLib.Default] = js.native
}

