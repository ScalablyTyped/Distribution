package typings.parse.mod.global.Parse.Object

import typings.parse.mod.global.Parse.CascadeSaveOption
import typings.parse.mod.global.Parse.ErrorOption
import typings.parse.mod.global.Parse.SessionTokenOption
import typings.parse.mod.global.Parse.SilentOption
import typings.parse.mod.global.Parse.SuccessOption
import typings.parse.mod.global.Parse.UseMasterKeyOption
import typings.parse.mod.global.Parse.WaitOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveOptions
  extends CascadeSaveOption
     with SuccessOption
     with ErrorOption
     with SilentOption
     with SessionTokenOption
     with UseMasterKeyOption
     with WaitOption

object SaveOptions {
  @scala.inline
  def apply(): SaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveOptions]
  }
}

