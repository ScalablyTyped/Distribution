package typings.mongoose.mod

import typings.mongodb.mod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose", "startSession")
@js.native
object startSession extends js.Object {
  def apply(): js.Promise[typings.mongodb.mod.ClientSession] = js.native
  def apply(options: SessionOptions): js.Promise[typings.mongodb.mod.ClientSession] = js.native
  def apply(
    options: SessionOptions,
    cb: js.Function2[/* err */ js.Any, /* session */ typings.mongodb.mod.ClientSession, Unit]
  ): js.Promise[typings.mongodb.mod.ClientSession] = js.native
}

