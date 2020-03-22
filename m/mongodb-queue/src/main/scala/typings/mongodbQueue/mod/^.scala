package typings.mongodbQueue.mod

import typings.mongodb.mod.Db
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb-queue", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(db: Db, name: String): Queue = js.native
  def apply(db: Db, name: String, opts: QueueOptions): Queue = js.native
}

