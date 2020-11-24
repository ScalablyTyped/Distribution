package typings.meteor.global.Meteor

import typings.meteor.anon.LoginStyle
import typings.meteor.globalError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Meteor.loginWith")
@js.native
object loginWith extends js.Object {
  
  def apply[ExternalService](): Unit = js.native
  def apply[ExternalService](
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[
      /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | typings.meteor.Meteor.TypedError], 
      Unit
    ]
  ): Unit = js.native
  def apply[ExternalService](options: LoginStyle): Unit = js.native
  def apply[ExternalService](
    options: LoginStyle,
    callback: js.Function1[
      /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | typings.meteor.Meteor.TypedError], 
      Unit
    ]
  ): Unit = js.native
}
