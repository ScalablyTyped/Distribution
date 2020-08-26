package typings.parse.mod.global.Parse.Query

import typings.parse.mod.global.Parse.ErrorOption
import typings.parse.mod.global.Parse.SessionTokenOption
import typings.parse.mod.global.Parse.SuccessOption
import typings.parse.mod.global.Parse.UseMasterKeyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindOptions
  extends SuccessOption
     with ErrorOption
     with SessionTokenOption
     with UseMasterKeyOption

object FindOptions {
  @scala.inline
  def apply(): FindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOptions]
  }
}

