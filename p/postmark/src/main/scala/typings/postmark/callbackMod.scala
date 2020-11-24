package typings.postmark

import typings.postmark.errorsMod.PostmarkError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark/dist/client/models/client/Callback", JSImport.Namespace)
@js.native
object callbackMod extends js.Object {
  
  type Callback[T] = js.Function2[/* error */ PostmarkError | Null, /* result */ T | Null, Unit]
}
