package typings.postmark.mod.Models

import typings.postmark.messageStreamMod.SubscriptionManagementConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark", "Models.UpdateMessageStreamRequest")
@js.native
open class UpdateMessageStreamRequest ()
  extends typings.postmark.modelsMod.UpdateMessageStreamRequest {
  def this(name: String) = this()
  def this(name: String, description: String) = this()
  def this(name: Unit, description: String) = this()
  def this(
    name: String,
    description: String,
    subscriptionManagementConfiguration: SubscriptionManagementConfiguration
  ) = this()
  def this(
    name: String,
    description: Unit,
    subscriptionManagementConfiguration: SubscriptionManagementConfiguration
  ) = this()
  def this(
    name: Unit,
    description: String,
    subscriptionManagementConfiguration: SubscriptionManagementConfiguration
  ) = this()
  def this(
    name: Unit,
    description: Unit,
    subscriptionManagementConfiguration: SubscriptionManagementConfiguration
  ) = this()
}
