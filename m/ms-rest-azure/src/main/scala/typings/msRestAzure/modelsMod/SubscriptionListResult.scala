package typings.msRestAzure.modelsMod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionListResult extends Array[Subscription] {
  
  var nextLink: String = js.native
  
  var value: js.UndefOr[js.Array[Subscription]] = js.native
}
