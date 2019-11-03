package typings.postmark

import typings.postmark.distClientModelsClientErrorsMod.PostmarkError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models/client/Callback", JSImport.Namespace)
@js.native
object distClientModelsClientCallbackMod extends js.Object {
  type Callback[T] = js.Function2[/* error */ PostmarkError | Null, /* result */ T | Null, Unit]
}

