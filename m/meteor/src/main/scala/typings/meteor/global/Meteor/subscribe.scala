package typings.meteor.global.Meteor

import typings.meteor.Meteor.SubscriptionHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Meteor.subscribe")
@js.native
object subscribe extends js.Object {
  
  /** Status **/
  /** Pub/Sub **/
  def apply(name: String, args: js.Any*): SubscriptionHandle = js.native
}
