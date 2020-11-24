package typings.meteor.global.Meteor

import typings.meteor.Meteor.LoginWithExternalServiceOptions
import typings.meteor.globalError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Meteor.loginWithFacebook")
@js.native
object loginWithFacebook extends js.Object {
  
  def apply(): Unit = js.native
  def apply(
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[
      /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | typings.meteor.Meteor.TypedError], 
      Unit
    ]
  ): Unit = js.native
  def apply(options: LoginWithExternalServiceOptions): Unit = js.native
  def apply(
    options: LoginWithExternalServiceOptions,
    callback: js.Function1[
      /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | typings.meteor.Meteor.TypedError], 
      Unit
    ]
  ): Unit = js.native
}
