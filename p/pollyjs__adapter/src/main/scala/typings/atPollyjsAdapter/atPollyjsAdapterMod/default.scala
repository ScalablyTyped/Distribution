package typings.atPollyjsAdapter.atPollyjsAdapterMod

import typings.atPollyjsAdapter.Anon_Body
import typings.atPollyjsCore.atPollyjsCoreMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pollyjs/adapter", JSImport.Default)
@js.native
class default () extends Adapter {
  /* CompleteClass */
  override def connect(): Unit = js.native
  /* CompleteClass */
  override def disconnect(): Unit = js.native
  /* CompleteClass */
  override def passthroughRequest(pollyRequest: Request): js.Promise[Anon_Body] = js.native
}

/* static members */
@JSImport("@pollyjs/adapter", JSImport.Default)
@js.native
object default extends js.Object {
  val name: String = js.native
  val `type`: String = js.native
}

