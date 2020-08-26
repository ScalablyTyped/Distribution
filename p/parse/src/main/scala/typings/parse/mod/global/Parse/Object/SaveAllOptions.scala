package typings.parse.mod.global.Parse.Object

import typings.parse.mod.global.Parse.BatchSizeOption
import typings.parse.mod.global.Parse.SessionTokenOption
import typings.parse.mod.global.Parse.UseMasterKeyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveAllOptions
  extends BatchSizeOption
     with SessionTokenOption
     with UseMasterKeyOption

object SaveAllOptions {
  @scala.inline
  def apply(): SaveAllOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveAllOptions]
  }
}

