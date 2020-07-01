package typings.pollyjsAdapter.mod

import org.scalablytyped.runtime.StringDictionary
import typings.pollyjsAdapter.anon.Body
import typings.pollyjsCore.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pollyjs/adapter", JSImport.Default)
@js.native
class default () extends Adapter {
  /* CompleteClass */
  override val options: StringDictionary[js.Any] = js.native
  /* CompleteClass */
  override def connect(): Unit = js.native
  /* CompleteClass */
  override def disconnect(): Unit = js.native
  /* CompleteClass */
  override def passthroughRequest(pollyRequest: Request): js.Promise[Body] = js.native
}

/* static members */
@JSImport("@pollyjs/adapter", JSImport.Default)
@js.native
object default extends js.Object {
  val id: String = js.native
  val `type`: String = js.native
}

