package typings.postmark.distClientModelsMod

import typings.postmark.distClientModelsStreamsMessageStreamMod.SubscriptionManagementConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark/dist/client/models", "CreateMessageStreamRequest")
@js.native
open class CreateMessageStreamRequest protected ()
  extends typings.postmark.distClientModelsStreamsMessageStreamMod.CreateMessageStreamRequest {
  def this(id: String, name: String, messageStreamType: String) = this()
  def this(id: String, name: String, messageStreamType: String, description: String) = this()
  def this(
    id: String,
    name: String,
    messageStreamType: String,
    description: String,
    subscriptionManagementConfiguration: SubscriptionManagementConfiguration
  ) = this()
  def this(
    id: String,
    name: String,
    messageStreamType: String,
    description: Unit,
    subscriptionManagementConfiguration: SubscriptionManagementConfiguration
  ) = this()
}
