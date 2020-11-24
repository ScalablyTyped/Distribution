package typings.meteor.global.Meteor

import typings.meteor.globalError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Meteor.loginWithToken")
@js.native
object loginWithToken extends js.Object {
  
  def apply(token: String): Unit = js.native
  def apply(
    token: String,
    callback: js.Function1[
      /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | typings.meteor.Meteor.TypedError], 
      Unit
    ]
  ): Unit = js.native
}
