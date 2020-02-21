package typings.migrateMongo

import typings.mongodb.mod.MongoCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallback extends js.Object {
  def apply(): js.Promise[Unit] = js.native
  def apply(callback: MongoCallback[Unit]): Unit = js.native
  def apply(force: Boolean): js.Promise[Unit] = js.native
  def apply(force: Boolean, callback: MongoCallback[Unit]): Unit = js.native
}

