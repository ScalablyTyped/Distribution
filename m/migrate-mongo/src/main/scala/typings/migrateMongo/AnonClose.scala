package typings.migrateMongo

import typings.mongodb.mod.MongoCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClose extends js.Object {
  @JSName("close")
  var close_Original: FnCallback = js.native
  def close(): js.Promise[Unit] = js.native
  def close(callback: MongoCallback[Unit]): Unit = js.native
  def close(force: Boolean): js.Promise[Unit] = js.native
  def close(force: Boolean, callback: MongoCallback[Unit]): Unit = js.native
}

