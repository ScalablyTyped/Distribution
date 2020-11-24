package typings.maximMazurokGapiClientReseller.gapi.client.reseller

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientReseller.anon.AltCustomerAuthToken
import typings.maximMazurokGapiClientReseller.anon.CustomerNamePrefix
import typings.maximMazurokGapiClientReseller.anon.DeletionType
import typings.maximMazurokGapiClientReseller.anon.PrettyPrint
import typings.maximMazurokGapiClientReseller.anon.QuotaUser
import typings.maximMazurokGapiClientReseller.anon.Resource
import typings.maximMazurokGapiClientReseller.anon.SubscriptionId
import typings.maximMazurokGapiClientReseller.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionsResource extends js.Object {
  
  /** Activates a subscription previously suspended by the reseller */
  def activate(): Request[Subscription] = js.native
  def activate(request: PrettyPrint): Request[Subscription] = js.native
  
  def changePlan(request: PrettyPrint, body: ChangePlanRequest): Request[Subscription] = js.native
  /** Update a subscription plan. Use this method to update a plan for a 30-day trial or a flexible plan subscription to an annual commitment plan with monthly or yearly payments. */
  def changePlan(request: QuotaUser): Request[Subscription] = js.native
  
  def changeRenewalSettings(request: PrettyPrint, body: RenewalSettings): Request[Subscription] = js.native
  /** Update a user license's renewal settings. This is applicable for accounts with annual commitment plans only. */
  def changeRenewalSettings(request: Resource): Request[Subscription] = js.native
  
  def changeSeats(request: PrettyPrint, body: Seats): Request[Subscription] = js.native
  /** Update a subscription's user license settings. */
  def changeSeats(request: SubscriptionId): Request[Subscription] = js.native
  
  /** Cancel, suspend, or transfer a subscription to direct. */
  def delete(): Request[Unit] = js.native
  def delete(request: DeletionType): Request[Unit] = js.native
  
  /** Get a specific subscription. */
  def get(): Request[Subscription] = js.native
  def get(request: PrettyPrint): Request[Subscription] = js.native
  
  def insert(request: AltCustomerAuthToken, body: Subscription): Request[Subscription] = js.native
  /** Create or transfer a subscription. */
  def insert(request: UserIp): Request[Subscription] = js.native
  
  /** List of subscriptions managed by the reseller. The list can be all subscriptions, all of a customer's subscriptions, or all of a customer's transferable subscriptions. */
  def list(): Request[Subscriptions] = js.native
  def list(request: CustomerNamePrefix): Request[Subscriptions] = js.native
  
  /** Immediately move a 30-day free trial subscription to a paid service subscription. */
  def startPaidService(): Request[Subscription] = js.native
  def startPaidService(request: PrettyPrint): Request[Subscription] = js.native
  
  /** Suspends an active subscription. */
  def suspend(): Request[Subscription] = js.native
  def suspend(request: PrettyPrint): Request[Subscription] = js.native
}
