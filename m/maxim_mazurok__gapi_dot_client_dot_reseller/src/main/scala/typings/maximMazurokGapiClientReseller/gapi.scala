package typings.maximMazurokGapiClientReseller

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientReseller.anon.Alt
import typings.maximMazurokGapiClientReseller.anon.AltCustomerAuthToken
import typings.maximMazurokGapiClientReseller.anon.CommitmentInterval
import typings.maximMazurokGapiClientReseller.anon.CustomerAuthToken
import typings.maximMazurokGapiClientReseller.anon.CustomerId
import typings.maximMazurokGapiClientReseller.anon.CustomerNamePrefix
import typings.maximMazurokGapiClientReseller.anon.DeletionType
import typings.maximMazurokGapiClientReseller.anon.Fields
import typings.maximMazurokGapiClientReseller.anon.IsInTrial
import typings.maximMazurokGapiClientReseller.anon.Key
import typings.maximMazurokGapiClientReseller.anon.MinimumTransferableSeats
import typings.maximMazurokGapiClientReseller.anon.Oauthtoken
import typings.maximMazurokGapiClientReseller.anon.PrettyPrint
import typings.maximMazurokGapiClientReseller.anon.QuotaUser
import typings.maximMazurokGapiClientReseller.anon.Resource
import typings.maximMazurokGapiClientReseller.anon.SubscriptionId
import typings.maximMazurokGapiClientReseller.anon.UserIp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object reseller {
      
      @js.native
      trait Address extends StObject {
        
        /** A customer's physical address. An address can be composed of one to three lines. The addressline2 and addressLine3 are optional. */
        var addressLine1: js.UndefOr[String] = js.native
        
        /** Line 2 of the address. */
        var addressLine2: js.UndefOr[String] = js.native
        
        /** Line 3 of the address. */
        var addressLine3: js.UndefOr[String] = js.native
        
        /** The customer contact's name. This is required. */
        var contactName: js.UndefOr[String] = js.native
        
        /**
          * For countryCode information, see the ISO 3166 country code elements. Verify that country is approved for resale of Google products. This property is required when creating a new
          * customer.
          */
        var countryCode: js.UndefOr[String] = js.native
        
        /** Identifies the resource as a customer address. Value: customers#address */
        var kind: js.UndefOr[String] = js.native
        
        /** An example of a locality value is the city of San Francisco. */
        var locality: js.UndefOr[String] = js.native
        
        /** The company or company division name. This is required. */
        var organizationName: js.UndefOr[String] = js.native
        
        /** A postalCode example is a postal zip code such as 94043. This property is required when creating a new customer. */
        var postalCode: js.UndefOr[String] = js.native
        
        /** An example of a region value is CA for the state of California. */
        var region: js.UndefOr[String] = js.native
      }
      object Address {
        
        @scala.inline
        def apply(): Address = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Address]
        }
        
        @scala.inline
        implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAddressLine1(value: String): Self = StObject.set(x, "addressLine1", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAddressLine1Undefined: Self = StObject.set(x, "addressLine1", js.undefined)
          
          @scala.inline
          def setAddressLine2(value: String): Self = StObject.set(x, "addressLine2", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAddressLine2Undefined: Self = StObject.set(x, "addressLine2", js.undefined)
          
          @scala.inline
          def setAddressLine3(value: String): Self = StObject.set(x, "addressLine3", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAddressLine3Undefined: Self = StObject.set(x, "addressLine3", js.undefined)
          
          @scala.inline
          def setContactName(value: String): Self = StObject.set(x, "contactName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setContactNameUndefined: Self = StObject.set(x, "contactName", js.undefined)
          
          @scala.inline
          def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
          
          @scala.inline
          def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          @scala.inline
          def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
          
          @scala.inline
          def setOrganizationName(value: String): Self = StObject.set(x, "organizationName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOrganizationNameUndefined: Self = StObject.set(x, "organizationName", js.undefined)
          
          @scala.inline
          def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
          
          @scala.inline
          def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
        }
      }
      
      @js.native
      trait ChangePlanRequest extends StObject {
        
        /**
          * Google-issued code (100 char max) for discounted pricing on subscription plans. Deal code must be included in changePlan request in order to receive discounted rate. This property
          * is optional. If a deal code has already been added to a subscription, this property may be left empty and the existing discounted rate will still apply (if not empty, only provide
          * the deal code that is already present on the subscription). If a deal code has never been added to a subscription and this property is left blank, regular pricing will apply.
          */
        var dealCode: js.UndefOr[String] = js.native
        
        /** Identifies the resource as a subscription change plan request. Value: subscriptions#changePlanRequest */
        var kind: js.UndefOr[String] = js.native
        
        /**
          * The planName property is required. This is the name of the subscription's payment plan. For more information about the Google payment plans, see API concepts.
          *
          * Possible values are:
          * - ANNUAL_MONTHLY_PAY - The annual commitment plan with monthly payments  Caution: ANNUAL_MONTHLY_PAY is returned as ANNUAL in all API responses.
          * - ANNUAL_YEARLY_PAY - The annual commitment plan with yearly payments
          * - FLEXIBLE - The flexible plan
          * - TRIAL - The 30-day free trial plan
          */
        var planName: js.UndefOr[String] = js.native
        
        /**
          * This is an optional property. This purchase order (PO) information is for resellers to use for their company tracking usage. If a purchaseOrderId value is given it appears in the
          * API responses and shows up in the invoice. The property accepts up to 80 plain text characters.
          */
        var purchaseOrderId: js.UndefOr[String] = js.native
        
        /** This is a required property. The seats property is the number of user seat licenses. */
        var seats: js.UndefOr[Seats] = js.native
      }
      object ChangePlanRequest {
        
        @scala.inline
        def apply(): ChangePlanRequest = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ChangePlanRequest]
        }
        
        @scala.inline
        implicit class ChangePlanRequestMutableBuilder[Self <: ChangePlanRequest] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDealCode(value: String): Self = StObject.set(x, "dealCode", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDealCodeUndefined: Self = StObject.set(x, "dealCode", js.undefined)
          
          @scala.inline
          def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          @scala.inline
          def setPlanName(value: String): Self = StObject.set(x, "planName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPlanNameUndefined: Self = StObject.set(x, "planName", js.undefined)
          
          @scala.inline
          def setPurchaseOrderId(value: String): Self = StObject.set(x, "purchaseOrderId", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPurchaseOrderIdUndefined: Self = StObject.set(x, "purchaseOrderId", js.undefined)
          
          @scala.inline
          def setSeats(value: Seats): Self = StObject.set(x, "seats", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSeatsUndefined: Self = StObject.set(x, "seats", js.undefined)
        }
      }
      
      @js.native
      trait Customer extends StObject {
        
        /**
          * Like the "Customer email" in the reseller tools, this email is the secondary contact used if something happens to the customer's service such as service outage or a security issue.
          * This property is required when creating a new customer and should not use the same domain as customerDomain.
          */
        var alternateEmail: js.UndefOr[String] = js.native
        
        /** The customer's primary domain name string. customerDomain is required when creating a new customer. Do not include the www prefix in the domain when adding a customer. */
        var customerDomain: js.UndefOr[String] = js.native
        
        /** Whether the customer's primary domain has been verified. */
        var customerDomainVerified: js.UndefOr[Boolean] = js.native
        
        /**
          * This property will always be returned in a response as the unique identifier generated by Google. In a request, this property can be either the primary domain or the unique
          * identifier generated by Google.
          */
        var customerId: js.UndefOr[String] = js.native
        
        /** Identifies the resource as a customer. Value: reseller#customer */
        var kind: js.UndefOr[String] = js.native
        
        /**
          * Customer contact phone number. Must start with "+" followed by the country code. The rest of the number can be contiguous numbers or respect the phone local format conventions, but
          * it must be a real phone number and not, for example, "123". This field is silently ignored if invalid.
          */
        var phoneNumber: js.UndefOr[String] = js.native
        
        /** A customer's address information. Each field has a limit of 255 charcters. */
        var postalAddress: js.UndefOr[Address] = js.native
        
        /**
          * URL to customer's Admin console dashboard. The read-only URL is generated by the API service. This is used if your client application requires the customer to complete a task in the
          * Admin console.
          */
        var resourceUiUrl: js.UndefOr[String] = js.native
      }
      object Customer {
        
        @scala.inline
        def apply(): Customer = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Customer]
        }
        
        @scala.inline
        implicit class CustomerMutableBuilder[Self <: Customer] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAlternateEmail(value: String): Self = StObject.set(x, "alternateEmail", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAlternateEmailUndefined: Self = StObject.set(x, "alternateEmail", js.undefined)
          
          @scala.inline
          def setCustomerDomain(value: String): Self = StObject.set(x, "customerDomain", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCustomerDomainUndefined: Self = StObject.set(x, "customerDomain", js.undefined)
          
          @scala.inline
          def setCustomerDomainVerified(value: Boolean): Self = StObject.set(x, "customerDomainVerified", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCustomerDomainVerifiedUndefined: Self = StObject.set(x, "customerDomainVerified", js.undefined)
          
          @scala.inline
          def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
          
          @scala.inline
          def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          @scala.inline
          def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
          
          @scala.inline
          def setPostalAddress(value: Address): Self = StObject.set(x, "postalAddress", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPostalAddressUndefined: Self = StObject.set(x, "postalAddress", js.undefined)
          
          @scala.inline
          def setResourceUiUrl(value: String): Self = StObject.set(x, "resourceUiUrl", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setResourceUiUrlUndefined: Self = StObject.set(x, "resourceUiUrl", js.undefined)
        }
      }
      
      @js.native
      trait CustomersResource extends StObject {
        
        /** Get a customer account. */
        def get(): Request[Customer] = js.native
        def get(request: CustomerId): Request[Customer] = js.native
        
        /** Order a new customer's account. */
        def insert(request: CustomerAuthToken): Request[Customer] = js.native
        def insert(request: Key, body: Customer): Request[Customer] = js.native
        
        def patch(request: CustomerId, body: Customer): Request[Customer] = js.native
        /** Update a customer account's settings. This method supports patch semantics. */
        def patch(request: Oauthtoken): Request[Customer] = js.native
        
        def update(request: CustomerId, body: Customer): Request[Customer] = js.native
        /** Update a customer account's settings. */
        def update(request: Oauthtoken): Request[Customer] = js.native
      }
      
      @js.native
      trait RenewalSettings extends StObject {
        
        /** Identifies the resource as a subscription renewal setting. Value: subscriptions#renewalSettings */
        var kind: js.UndefOr[String] = js.native
        
        /**
          * Renewal settings for the annual commitment plan. For more detailed information, see renewal options in the administrator help center. When renewing a subscription, the renewalType
          * is a required property.
          */
        var renewalType: js.UndefOr[String] = js.native
      }
      object RenewalSettings {
        
        @scala.inline
        def apply(): RenewalSettings = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[RenewalSettings]
        }
        
        @scala.inline
        implicit class RenewalSettingsMutableBuilder[Self <: RenewalSettings] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          @scala.inline
          def setRenewalType(value: String): Self = StObject.set(x, "renewalType", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRenewalTypeUndefined: Self = StObject.set(x, "renewalType", js.undefined)
        }
      }
      
      @js.native
      trait ResellernotifyGetwatchdetailsResponse extends StObject {
        
        /** List of registered service accounts. */
        var serviceAccountEmailAddresses: js.UndefOr[js.Array[String]] = js.native
        
        /** Topic name of the PubSub */
        var topicName: js.UndefOr[String] = js.native
      }
      object ResellernotifyGetwatchdetailsResponse {
        
        @scala.inline
        def apply(): ResellernotifyGetwatchdetailsResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ResellernotifyGetwatchdetailsResponse]
        }
        
        @scala.inline
        implicit class ResellernotifyGetwatchdetailsResponseMutableBuilder[Self <: ResellernotifyGetwatchdetailsResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setServiceAccountEmailAddresses(value: js.Array[String]): Self = StObject.set(x, "serviceAccountEmailAddresses", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setServiceAccountEmailAddressesUndefined: Self = StObject.set(x, "serviceAccountEmailAddresses", js.undefined)
          
          @scala.inline
          def setServiceAccountEmailAddressesVarargs(value: String*): Self = StObject.set(x, "serviceAccountEmailAddresses", js.Array(value :_*))
          
          @scala.inline
          def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTopicNameUndefined: Self = StObject.set(x, "topicName", js.undefined)
        }
      }
      
      @js.native
      trait ResellernotifyResource extends StObject {
        
        /** Returns all the details of the watch corresponding to the reseller. */
        def getwatchdetails(): Request[ResellernotifyGetwatchdetailsResponse] = js.native
        def getwatchdetails(request: Alt): Request[ResellernotifyGetwatchdetailsResponse] = js.native
        
        /** Registers a Reseller for receiving notifications. */
        def register(): Request[ResellernotifyResource] = js.native
        def register(request: Fields): Request[ResellernotifyResource] = js.native
        
        /** Topic name of the PubSub */
        var topicName: js.UndefOr[String] = js.native
        
        /** Unregisters a Reseller for receiving notifications. */
        def unregister(): Request[ResellernotifyResource] = js.native
        def unregister(request: Fields): Request[ResellernotifyResource] = js.native
      }
      
      @js.native
      trait Seats extends StObject {
        
        /** Identifies the resource as a subscription seat setting. Value: subscriptions#seats */
        var kind: js.UndefOr[String] = js.native
        
        /**
          * Read-only field containing the current number of users that are assigned a license for the product defined in skuId. This field's value is equivalent to the numerical count of users
          * returned by the Enterprise License Manager API method: listForProductAndSku
          */
        var licensedNumberOfSeats: js.UndefOr[Double] = js.native
        
        /**
          * This is a required property and is exclusive to subscriptions with FLEXIBLE or TRIAL plans. This property sets the maximum number of licensed users allowed on a subscription. This
          * quantity can be increased up to the maximum limit defined in the reseller's contract. The minimum quantity is the current number of users in the customer account. Note: G Suite
          * subscriptions automatically assign a license to every user.
          */
        var maximumNumberOfSeats: js.UndefOr[Double] = js.native
        
        /**
          * This is a required property and is exclusive to subscriptions with ANNUAL_MONTHLY_PAY and ANNUAL_YEARLY_PAY plans. This property sets the maximum number of licenses assignable to
          * users on a subscription. The reseller can add more licenses, but once set, the numberOfSeats cannot be reduced until renewal. The reseller is invoiced based on the numberOfSeats
          * value regardless of how many of these user licenses are assigned. Note: G Suite subscriptions automatically assign a license to every user.
          */
        var numberOfSeats: js.UndefOr[Double] = js.native
      }
      object Seats {
        
        @scala.inline
        def apply(): Seats = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Seats]
        }
        
        @scala.inline
        implicit class SeatsMutableBuilder[Self <: Seats] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          @scala.inline
          def setLicensedNumberOfSeats(value: Double): Self = StObject.set(x, "licensedNumberOfSeats", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLicensedNumberOfSeatsUndefined: Self = StObject.set(x, "licensedNumberOfSeats", js.undefined)
          
          @scala.inline
          def setMaximumNumberOfSeats(value: Double): Self = StObject.set(x, "maximumNumberOfSeats", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMaximumNumberOfSeatsUndefined: Self = StObject.set(x, "maximumNumberOfSeats", js.undefined)
          
          @scala.inline
          def setNumberOfSeats(value: Double): Self = StObject.set(x, "numberOfSeats", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNumberOfSeatsUndefined: Self = StObject.set(x, "numberOfSeats", js.undefined)
        }
      }
      
      @js.native
      trait Subscription extends StObject {
        
        /** Read-only field that returns the current billing method for a subscription. */
        var billingMethod: js.UndefOr[String] = js.native
        
        /** The creationTime property is the date when subscription was created. It is in milliseconds using the Epoch format. See an example Epoch converter. */
        var creationTime: js.UndefOr[String] = js.native
        
        /** Primary domain name of the customer */
        var customerDomain: js.UndefOr[String] = js.native
        
        /**
          * This property will always be returned in a response as the unique identifier generated by Google. In a request, this property can be either the primary domain or the unique
          * identifier generated by Google.
          */
        var customerId: js.UndefOr[String] = js.native
        
        /**
          * Google-issued code (100 char max) for discounted pricing on subscription plans. Deal code must be included in insert requests in order to receive discounted rate. This property is
          * optional, regular pricing applies if left empty.
          */
        var dealCode: js.UndefOr[String] = js.native
        
        /** Identifies the resource as a Subscription. Value: reseller#subscription */
        var kind: js.UndefOr[String] = js.native
        
        /**
          * The plan property is required. In this version of the API, the G Suite plans are the flexible plan, annual commitment plan, and the 30-day free trial plan. For more information
          * about the API"s payment plans, see the API concepts.
          */
        var plan: js.UndefOr[CommitmentInterval] = js.native
        
        /**
          * This is an optional property. This purchase order (PO) information is for resellers to use for their company tracking usage. If a purchaseOrderId value is given it appears in the
          * API responses and shows up in the invoice. The property accepts up to 80 plain text characters.
          */
        var purchaseOrderId: js.UndefOr[String] = js.native
        
        /** Renewal settings for the annual commitment plan. For more detailed information, see renewal options in the administrator help center. */
        var renewalSettings: js.UndefOr[RenewalSettings] = js.native
        
        /**
          * URL to customer's Subscriptions page in the Admin console. The read-only URL is generated by the API service. This is used if your client application requires the customer to
          * complete a task using the Subscriptions page in the Admin console.
          */
        var resourceUiUrl: js.UndefOr[String] = js.native
        
        /** This is a required property. The number and limit of user seat licenses in the plan. */
        var seats: js.UndefOr[Seats] = js.native
        
        /**
          * A required property. The skuId is a unique system identifier for a product's SKU assigned to a customer in the subscription. For products and SKUs available in this version of the
          * API, see  Product and SKU IDs.
          */
        var skuId: js.UndefOr[String] = js.native
        
        /**
          * Read-only external display name for a product's SKU assigned to a customer in the subscription. SKU names are subject to change at Google's discretion. For products and SKUs
          * available in this version of the API, see  Product and SKU IDs.
          */
        var skuName: js.UndefOr[String] = js.native
        
        /** This is an optional property. */
        var status: js.UndefOr[String] = js.native
        
        /**
          * The subscriptionId is the subscription identifier and is unique for each customer. This is a required property. Since a subscriptionId changes when a subscription is updated, we
          * recommend not using this ID as a key for persistent data. Use the subscriptionId as described in retrieve all reseller subscriptions.
          */
        var subscriptionId: js.UndefOr[String] = js.native
        
        /**
          * Read-only field containing an enumerable of all the current suspension reasons for a subscription. It is possible for a subscription to have many concurrent, overlapping suspension
          * reasons. A subscription's STATUS is SUSPENDED until all pending suspensions are removed.
          *
          * Possible options include:
          * - PENDING_TOS_ACCEPTANCE - The customer has not logged in and accepted the G Suite Resold Terms of Services.
          * - RENEWAL_WITH_TYPE_CANCEL - The customer's commitment ended and their service was cancelled at the end of their term.
          * - RESELLER_INITIATED - A manual suspension invoked by a Reseller.
          * - TRIAL_ENDED - The customer's trial expired without a plan selected.
          * - OTHER - The customer is suspended for an internal Google reason (e.g. abuse or otherwise).
          */
        var suspensionReasons: js.UndefOr[js.Array[String]] = js.native
        
        /** Read-only transfer related information for the subscription. For more information, see retrieve transferable subscriptions for a customer. */
        var transferInfo: js.UndefOr[MinimumTransferableSeats] = js.native
        
        /** The G Suite annual commitment and flexible payment plans can be in a 30-day free trial. For more information, see the API concepts. */
        var trialSettings: js.UndefOr[IsInTrial] = js.native
      }
      object Subscription {
        
        @scala.inline
        def apply(): Subscription = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Subscription]
        }
        
        @scala.inline
        implicit class SubscriptionMutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setBillingMethod(value: String): Self = StObject.set(x, "billingMethod", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBillingMethodUndefined: Self = StObject.set(x, "billingMethod", js.undefined)
          
          @scala.inline
          def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
          
          @scala.inline
          def setCustomerDomain(value: String): Self = StObject.set(x, "customerDomain", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCustomerDomainUndefined: Self = StObject.set(x, "customerDomain", js.undefined)
          
          @scala.inline
          def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
          
          @scala.inline
          def setDealCode(value: String): Self = StObject.set(x, "dealCode", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDealCodeUndefined: Self = StObject.set(x, "dealCode", js.undefined)
          
          @scala.inline
          def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          @scala.inline
          def setPlan(value: CommitmentInterval): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
          
          @scala.inline
          def setPurchaseOrderId(value: String): Self = StObject.set(x, "purchaseOrderId", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPurchaseOrderIdUndefined: Self = StObject.set(x, "purchaseOrderId", js.undefined)
          
          @scala.inline
          def setRenewalSettings(value: RenewalSettings): Self = StObject.set(x, "renewalSettings", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRenewalSettingsUndefined: Self = StObject.set(x, "renewalSettings", js.undefined)
          
          @scala.inline
          def setResourceUiUrl(value: String): Self = StObject.set(x, "resourceUiUrl", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setResourceUiUrlUndefined: Self = StObject.set(x, "resourceUiUrl", js.undefined)
          
          @scala.inline
          def setSeats(value: Seats): Self = StObject.set(x, "seats", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSeatsUndefined: Self = StObject.set(x, "seats", js.undefined)
          
          @scala.inline
          def setSkuId(value: String): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSkuIdUndefined: Self = StObject.set(x, "skuId", js.undefined)
          
          @scala.inline
          def setSkuName(value: String): Self = StObject.set(x, "skuName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSkuNameUndefined: Self = StObject.set(x, "skuName", js.undefined)
          
          @scala.inline
          def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
          
          @scala.inline
          def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSubscriptionIdUndefined: Self = StObject.set(x, "subscriptionId", js.undefined)
          
          @scala.inline
          def setSuspensionReasons(value: js.Array[String]): Self = StObject.set(x, "suspensionReasons", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSuspensionReasonsUndefined: Self = StObject.set(x, "suspensionReasons", js.undefined)
          
          @scala.inline
          def setSuspensionReasonsVarargs(value: String*): Self = StObject.set(x, "suspensionReasons", js.Array(value :_*))
          
          @scala.inline
          def setTransferInfo(value: MinimumTransferableSeats): Self = StObject.set(x, "transferInfo", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTransferInfoUndefined: Self = StObject.set(x, "transferInfo", js.undefined)
          
          @scala.inline
          def setTrialSettings(value: IsInTrial): Self = StObject.set(x, "trialSettings", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTrialSettingsUndefined: Self = StObject.set(x, "trialSettings", js.undefined)
        }
      }
      
      @js.native
      trait Subscriptions extends StObject {
        
        /** Identifies the resource as a collection of subscriptions. Value: reseller#subscriptions */
        var kind: js.UndefOr[String] = js.native
        
        /** The continuation token, used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
        var nextPageToken: js.UndefOr[String] = js.native
        
        /** The subscriptions in this page of results. */
        var subscriptions: js.UndefOr[js.Array[Subscription]] = js.native
      }
      object Subscriptions {
        
        @scala.inline
        def apply(): Subscriptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Subscriptions]
        }
        
        @scala.inline
        implicit class SubscriptionsMutableBuilder[Self <: Subscriptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          @scala.inline
          def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
          
          @scala.inline
          def setSubscriptions(value: js.Array[Subscription]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
          
          @scala.inline
          def setSubscriptionsVarargs(value: Subscription*): Self = StObject.set(x, "subscriptions", js.Array(value :_*))
        }
      }
      
      @js.native
      trait SubscriptionsResource extends StObject {
        
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
    }
  }
}
