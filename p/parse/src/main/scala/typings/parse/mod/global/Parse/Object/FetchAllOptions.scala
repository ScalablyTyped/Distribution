package typings.parse.mod.global.Parse.Object

import typings.parse.mod.global.Parse.ErrorOption
import typings.parse.mod.global.Parse.SessionTokenOption
import typings.parse.mod.global.Parse.SuccessOption
import typings.parse.mod.global.Parse.UseMasterKeyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchAllOptions
  extends SuccessOption
     with ErrorOption
     with SessionTokenOption
     with UseMasterKeyOption
object FetchAllOptions {
  
  @scala.inline
  def apply(): FetchAllOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchAllOptions]
  }
}
