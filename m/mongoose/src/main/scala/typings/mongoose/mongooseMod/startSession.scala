package typings.mongoose.mongooseMod

import typings.mongodb.mongodbMod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose", "startSession")
@js.native
object startSession extends js.Object {
  def apply(): js.Promise[typings.mongodb.mongodbMod.ClientSession] = js.native
  def apply(options: SessionOptions): js.Promise[typings.mongodb.mongodbMod.ClientSession] = js.native
  def apply(
    options: SessionOptions,
    cb: js.Function2[/* err */ js.Any, /* session */ typings.mongodb.mongodbMod.ClientSession, Unit]
  ): js.Promise[typings.mongodb.mongodbMod.ClientSession] = js.native
}

