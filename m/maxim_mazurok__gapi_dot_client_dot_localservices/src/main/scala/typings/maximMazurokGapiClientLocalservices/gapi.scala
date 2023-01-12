package typings.maximMazurokGapiClientLocalservices

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientLocalservices.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object localservices {
      
      @js.native
      trait AccountReportsResource extends StObject {
        
        /**
          * Get account reports containing aggregate account data of all linked GLS accounts. Caller needs to provide their manager customer id and the associated auth credential that allows
          * them read permissions on their linked accounts.
          */
        def search(): Request[GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse] = js.native
        def search(request: Accesstoken): Request[GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse] = js.native
      }
      
      @js.native
      trait DetailedLeadReportsResource extends StObject {
        
        /**
          * Get detailed lead reports containing leads that have been received by all linked GLS accounts. Caller needs to provide their manager customer id and the associated auth credential
          * that allows them read permissions on their linked accounts.
          */
        def search(): Request[GoogleAdsHomeservicesLocalservicesV1SearchDetailedLeadReportsResponse] = js.native
        def search(request: Accesstoken): Request[GoogleAdsHomeservicesLocalservicesV1SearchDetailedLeadReportsResponse] = js.native
      }
      
      trait GoogleAdsHomeservicesLocalservicesV1AccountReport extends StObject {
        
        /** Unique identifier of the GLS account. */
        var accountId: js.UndefOr[String] = js.undefined
        
        /** Aggregator specific information related to the account. */
        var aggregatorInfo: js.UndefOr[GoogleAdsHomeservicesLocalservicesV1AggregatorInfo] = js.undefined
        
        /** Average review rating score from 1-5 stars. */
        var averageFiveStarRating: js.UndefOr[Double] = js.undefined
        
        /** Average weekly budget in the currency code of the account. */
        var averageWeeklyBudget: js.UndefOr[Double] = js.undefined
        
        /** Business name of the account. */
        var businessName: js.UndefOr[String] = js.undefined
        
        /** Currency code of the account. */
        var currencyCode: js.UndefOr[String] = js.undefined
        
        /** Number of charged leads the account received in current specified period. */
        var currentPeriodChargedLeads: js.UndefOr[String] = js.undefined
        
        /** Number of connected phone calls (duration over 30s) in current specified period. */
        var currentPeriodConnectedPhoneCalls: js.UndefOr[String] = js.undefined
        
        /** Number of phone calls in current specified period, including both connected and unconnected calls. */
        var currentPeriodPhoneCalls: js.UndefOr[String] = js.undefined
        
        /** Total cost of the account in current specified period in the account's specified currency. */
        var currentPeriodTotalCost: js.UndefOr[Double] = js.undefined
        
        /** Number of impressions that customers have had in the past 2 days. */
        var impressionsLastTwoDays: js.UndefOr[String] = js.undefined
        
        /**
          * Phone lead responsiveness of the account for the past 90 days from current date. This is computed by taking the total number of connected calls from charged phone leads and dividing
          * by the total number of calls received.
          */
        var phoneLeadResponsiveness: js.UndefOr[Double] = js.undefined
        
        /** Number of charged leads the account received in previous specified period. */
        var previousPeriodChargedLeads: js.UndefOr[String] = js.undefined
        
        /** Number of connected phone calls (duration over 30s) in previous specified period. */
        var previousPeriodConnectedPhoneCalls: js.UndefOr[String] = js.undefined
        
        /** Number of phone calls in previous specified period, including both connected and unconnected calls. */
        var previousPeriodPhoneCalls: js.UndefOr[String] = js.undefined
        
        /** Total cost of the account in previous specified period in the account's specified currency. */
        var previousPeriodTotalCost: js.UndefOr[Double] = js.undefined
        
        /** Total number of reviews the account has up to current date. */
        var totalReview: js.UndefOr[Double] = js.undefined
      }
      object GoogleAdsHomeservicesLocalservicesV1AccountReport {
        
        inline def apply(): GoogleAdsHomeservicesLocalservicesV1AccountReport = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleAdsHomeservicesLocalservicesV1AccountReport]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: GoogleAdsHomeservicesLocalservicesV1AccountReport] (val x: Self) extends AnyVal {
          
          inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
          
          inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
          
          inline def setAggregatorInfo(value: GoogleAdsHomeservicesLocalservicesV1AggregatorInfo): Self = StObject.set(x, "aggregatorInfo", value.asInstanceOf[js.Any])
          
          inline def setAggregatorInfoUndefined: Self = StObject.set(x, "aggregatorInfo", js.undefined)
          
          inline def setAverageFiveStarRating(value: Double): Self = StObject.set(x, "averageFiveStarRating", value.asInstanceOf[js.Any])
          
          inline def setAverageFiveStarRatingUndefined: Self = StObject.set(x, "averageFiveStarRating", js.undefined)
          
          inline def setAverageWeeklyBudget(value: Double): Self = StObject.set(x, "averageWeeklyBudget", value.asInstanceOf[js.Any])
          
          inline def setAverageWeeklyBudgetUndefined: Self = StObject.set(x, "averageWeeklyBudget", js.undefined)
          
          inline def setBusinessName(value: String): Self = StObject.set(x, "businessName", value.asInstanceOf[js.Any])
          
          inline def setBusinessNameUndefined: Self = StObject.set(x, "businessName", js.undefined)
          
          inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
          
          inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
          
          inline def setCurrentPeriodChargedLeads(value: String): Self = StObject.set(x, "currentPeriodChargedLeads", value.asInstanceOf[js.Any])
          
          inline def setCurrentPeriodChargedLeadsUndefined: Self = StObject.set(x, "currentPeriodChargedLeads", js.undefined)
          
          inline def setCurrentPeriodConnectedPhoneCalls(value: String): Self = StObject.set(x, "currentPeriodConnectedPhoneCalls", value.asInstanceOf[js.Any])
          
          inline def setCurrentPeriodConnectedPhoneCallsUndefined: Self = StObject.set(x, "currentPeriodConnectedPhoneCalls", js.undefined)
          
          inline def setCurrentPeriodPhoneCalls(value: String): Self = StObject.set(x, "currentPeriodPhoneCalls", value.asInstanceOf[js.Any])
          
          inline def setCurrentPeriodPhoneCallsUndefined: Self = StObject.set(x, "currentPeriodPhoneCalls", js.undefined)
          
          inline def setCurrentPeriodTotalCost(value: Double): Self = StObject.set(x, "currentPeriodTotalCost", value.asInstanceOf[js.Any])
          
          inline def setCurrentPeriodTotalCostUndefined: Self = StObject.set(x, "currentPeriodTotalCost", js.undefined)
          
          inline def setImpressionsLastTwoDays(value: String): Self = StObject.set(x, "impressionsLastTwoDays", value.asInstanceOf[js.Any])
          
          inline def setImpressionsLastTwoDaysUndefined: Self = StObject.set(x, "impressionsLastTwoDays", js.undefined)
          
          inline def setPhoneLeadResponsiveness(value: Double): Self = StObject.set(x, "phoneLeadResponsiveness", value.asInstanceOf[js.Any])
          
          inline def setPhoneLeadResponsivenessUndefined: Self = StObject.set(x, "phoneLeadResponsiveness", js.undefined)
          
          inline def setPreviousPeriodChargedLeads(value: String): Self = StObject.set(x, "previousPeriodChargedLeads", value.asInstanceOf[js.Any])
          
          inline def setPreviousPeriodChargedLeadsUndefined: Self = StObject.set(x, "previousPeriodChargedLeads", js.undefined)
          
          inline def setPreviousPeriodConnectedPhoneCalls(value: String): Self = StObject.set(x, "previousPeriodConnectedPhoneCalls", value.asInstanceOf[js.Any])
          
          inline def setPreviousPeriodConnectedPhoneCallsUndefined: Self = StObject.set(x, "previousPeriodConnectedPhoneCalls", js.undefined)
          
          inline def setPreviousPeriodPhoneCalls(value: String): Self = StObject.set(x, "previousPeriodPhoneCalls", value.asInstanceOf[js.Any])
          
          inline def setPreviousPeriodPhoneCallsUndefined: Self = StObject.set(x, "previousPeriodPhoneCalls", js.undefined)
          
          inline def setPreviousPeriodTotalCost(value: Double): Self = StObject.set(x, "previousPeriodTotalCost", value.asInstanceOf[js.Any])
          
          inline def setPreviousPeriodTotalCostUndefined: Self = StObject.set(x, "previousPeriodTotalCost", js.undefined)
          
          inline def setTotalReview(value: Double): Self = StObject.set(x, "totalReview", value.asInstanceOf[js.Any])
          
          inline def setTotalReviewUndefined: Self = StObject.set(x, "totalReview", js.undefined)
        }
      }
      
      trait GoogleAdsHomeservicesLocalservicesV1AggregatorInfo extends StObject {
        
        /** Provider id (listed in aggregator system) which maps to a account id in GLS system. */
        var aggregatorProviderId: js.UndefOr[String] = js.undefined
      }
      object GoogleAdsHomeservicesLocalservicesV1AggregatorInfo {
        
        inline def apply(): GoogleAdsHomeservicesLocalservicesV1AggregatorInfo = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleAdsHomeservicesLocalservicesV1AggregatorInfo]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: GoogleAdsHomeservicesLocalservicesV1AggregatorInfo] (val x: Self) extends AnyVal {
          
          inline def setAggregatorProviderId(value: String): Self = StObject.set(x, "aggregatorProviderId", value.asInstanceOf[js.Any])
          
          inline def setAggregatorProviderIdUndefined: Self = StObject.set(x, "aggregatorProviderId", js.undefined)
        }
      }
      
      trait GoogleAdsHomeservicesLocalservicesV1BookingLead extends StObject {
        
        /** Timestamp of when service is provided by advertiser. */
        var bookingAppointmentTimestamp: js.UndefOr[String] = js.undefined
        
        /** Consumer email associated with the booking lead. */
        var consumerEmail: js.UndefOr[String] = js.undefined
        
        /** Consumer phone number associated with the booking lead. */
        var consumerPhoneNumber: js.UndefOr[String] = js.undefined
        
        /** Name of the customer who created the lead. */
        var customerName: js.UndefOr[String] = js.undefined
        
        /** The job type of the specified lead. */
        var jobType: js.UndefOr[String] = js.undefined
      }
      object GoogleAdsHomeservicesLocalservicesV1BookingLead {
        
        inline def apply(): GoogleAdsHomeservicesLocalservicesV1BookingLead = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleAdsHomeservicesLocalservicesV1BookingLead]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: GoogleAdsHomeservicesLocalservicesV1BookingLead] (val x: Self) extends AnyVal {
          
          inline def setBookingAppointmentTimestamp(value: String): Self = StObject.set(x, "bookingAppointmentTimestamp", value.asInstanceOf[js.Any])
          
          inline def setBookingAppointmentTimestampUndefined: Self = StObject.set(x, "bookingAppointmentTimestamp", js.undefined)
          
          inline def setConsumerEmail(value: String): Self = StObject.set(x, "consumerEmail", value.asInstanceOf[js.Any])
          
          inline def setConsumerEmailUndefined: Self = StObject.set(x, "consumerEmail", js.undefined)
          
          inline def setConsumerPhoneNumber(value: String): Self = StObject.set(x, "consumerPhoneNumber", value.asInstanceOf[js.Any])
          
          inline def setConsumerPhoneNumberUndefined: Self = StObject.set(x, "consumerPhoneNumber", js.undefined)
          
          inline def setCustomerName(value: String): Self = StObject.set(x, "customerName", value.asInstanceOf[js.Any])
          
          inline def setCustomerNameUndefined: Self = StObject.set(x, "customerName", js.undefined)
          
          inline def setJobType(value: String): Self = StObject.set(x, "jobType", value.asInstanceOf[js.Any])
          
          inline def setJobTypeUndefined: Self = StObject.set(x, "jobType", js.undefined)
        }
      }
      
      trait GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport extends StObject {
        
        /** Identifies account that received the lead. */
        var accountId: js.UndefOr[String] = js.undefined
        
        /** Aggregator specific information related to the lead. */
        var aggregatorInfo: js.UndefOr[GoogleAdsHomeservicesLocalservicesV1AggregatorInfo] = js.undefined
        
        /** More information associated to only booking leads. */
        var bookingLead: js.UndefOr[GoogleAdsHomeservicesLocalservicesV1BookingLead] = js.undefined
        
        /** Business name associated to the account. */
        var businessName: js.UndefOr[String] = js.undefined
        
        /** Whether the lead has been charged. */
        var chargeStatus: js.UndefOr[String] = js.undefined
        
        /** Currency code. */
        var currencyCode: js.UndefOr[String] = js.undefined
        
        /** Dispute status related to the lead. */
        var disputeStatus: js.UndefOr[String] = js.undefined
        
        /** Location of the associated account's home city. */
        var geo: js.UndefOr[String] = js.undefined
        
        /** Lead category (e.g. hvac, plumber) */
        var leadCategory: js.UndefOr[String] = js.undefined
        
        /** Timestamp of when the lead was created. */
        var leadCreationTimestamp: js.UndefOr[String] = js.undefined
        
        /** Unique identifier of a Detailed Lead Report. */
        var leadId: js.UndefOr[String] = js.undefined
        
        /** Price of the lead (available only after it has been charged). */
        var leadPrice: js.UndefOr[Double] = js.undefined
        
        /** Lead type. */
        var leadType: js.UndefOr[String] = js.undefined
        
        /** More information associated to only message leads. */
        var messageLead: js.UndefOr[GoogleAdsHomeservicesLocalservicesV1MessageLead] = js.undefined
        
        /** More information associated to only phone leads. */
        var phoneLead: js.UndefOr[GoogleAdsHomeservicesLocalservicesV1PhoneLead] = js.undefined
        
        /** Timezone of the particular provider associated to a lead. */
        var timezone: js.UndefOr[GoogleTypeTimeZone] = js.undefined
      }
      object GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport {
        
        inline def apply(): GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport] (val x: Self) extends AnyVal {
          
          inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
          
          inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
          
          inline def setAggregatorInfo(value: GoogleAdsHomeservicesLocalservicesV1AggregatorInfo): Self = StObject.set(x, "aggregatorInfo", value.asInstanceOf[js.Any])
          
          inline def setAggregatorInfoUndefined: Self = StObject.set(x, "aggregatorInfo", js.undefined)
          
          inline def setBookingLead(value: GoogleAdsHomeservicesLocalservicesV1BookingLead): Self = StObject.set(x, "bookingLead", value.asInstanceOf[js.Any])
          
          inline def setBookingLeadUndefined: Self = StObject.set(x, "bookingLead", js.undefined)
          
          inline def setBusinessName(value: String): Self = StObject.set(x, "businessName", value.asInstanceOf[js.Any])
          
          inline def setBusinessNameUndefined: Self = StObject.set(x, "businessName", js.undefined)
          
          inline def setChargeStatus(value: String): Self = StObject.set(x, "chargeStatus", value.asInstanceOf[js.Any])
          
          inline def setChargeStatusUndefined: Self = StObject.set(x, "chargeStatus", js.undefined)
          
          inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
          
          inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
          
          inline def setDisputeStatus(value: String): Self = StObject.set(x, "disputeStatus", value.asInstanceOf[js.Any])
          
          inline def setDisputeStatusUndefined: Self = StObject.set(x, "disputeStatus", js.undefined)
          
          inline def setGeo(value: String): Self = StObject.set(x, "geo", value.asInstanceOf[js.Any])
          
          inline def setGeoUndefined: Self = StObject.set(x, "geo", js.undefined)
          
          inline def setLeadCategory(value: String): Self = StObject.set(x, "leadCategory", value.asInstanceOf[js.Any])
          
          inline def setLeadCategoryUndefined: Self = StObject.set(x, "leadCategory", js.undefined)
          
          inline def setLeadCreationTimestamp(value: String): Self = StObject.set(x, "leadCreationTimestamp", value.asInstanceOf[js.Any])
          
          inline def setLeadCreationTimestampUndefined: Self = StObject.set(x, "leadCreationTimestamp", js.undefined)
          
          inline def setLeadId(value: String): Self = StObject.set(x, "leadId", value.asInstanceOf[js.Any])
          
          inline def setLeadIdUndefined: Self = StObject.set(x, "leadId", js.undefined)
          
          inline def setLeadPrice(value: Double): Self = StObject.set(x, "leadPrice", value.asInstanceOf[js.Any])
          
          inline def setLeadPriceUndefined: Self = StObject.set(x, "leadPrice", js.undefined)
          
          inline def setLeadType(value: String): Self = StObject.set(x, "leadType", value.asInstanceOf[js.Any])
          
          inline def setLeadTypeUndefined: Self = StObject.set(x, "leadType", js.undefined)
          
          inline def setMessageLead(value: GoogleAdsHomeservicesLocalservicesV1MessageLead): Self = StObject.set(x, "messageLead", value.asInstanceOf[js.Any])
          
          inline def setMessageLeadUndefined: Self = StObject.set(x, "messageLead", js.undefined)
          
          inline def setPhoneLead(value: GoogleAdsHomeservicesLocalservicesV1PhoneLead): Self = StObject.set(x, "phoneLead", value.asInstanceOf[js.Any])
          
          inline def setPhoneLeadUndefined: Self = StObject.set(x, "phoneLead", js.undefined)
          
          inline def setTimezone(value: GoogleTypeTimeZone): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
          
          inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
        }
      }
      
      trait GoogleAdsHomeservicesLocalservicesV1MessageLead extends StObject {
        
        /** Consumer phone number associated with the message lead. */
        var consumerPhoneNumber: js.UndefOr[String] = js.undefined
        
        /** Name of the customer who created the lead. */
        var customerName: js.UndefOr[String] = js.undefined
        
        /** The job type of the specified lead. */
        var jobType: js.UndefOr[String] = js.undefined
        
        /** The postal code of the customer who created the lead. */
        var postalCode: js.UndefOr[String] = js.undefined
      }
      object GoogleAdsHomeservicesLocalservicesV1MessageLead {
        
        inline def apply(): GoogleAdsHomeservicesLocalservicesV1MessageLead = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleAdsHomeservicesLocalservicesV1MessageLead]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: GoogleAdsHomeservicesLocalservicesV1MessageLead] (val x: Self) extends AnyVal {
          
          inline def setConsumerPhoneNumber(value: String): Self = StObject.set(x, "consumerPhoneNumber", value.asInstanceOf[js.Any])
          
          inline def setConsumerPhoneNumberUndefined: Self = StObject.set(x, "consumerPhoneNumber", js.undefined)
          
          inline def setCustomerName(value: String): Self = StObject.set(x, "customerName", value.asInstanceOf[js.Any])
          
          inline def setCustomerNameUndefined: Self = StObject.set(x, "customerName", js.undefined)
          
          inline def setJobType(value: String): Self = StObject.set(x, "jobType", value.asInstanceOf[js.Any])
          
          inline def setJobTypeUndefined: Self = StObject.set(x, "jobType", js.undefined)
          
          inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
          
          inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
        }
      }
      
      trait GoogleAdsHomeservicesLocalservicesV1PhoneLead extends StObject {
        
        /** Timestamp of the phone call which resulted in a charged phone lead. */
        var chargedCallTimestamp: js.UndefOr[String] = js.undefined
        
        /** Duration of the charged phone call in seconds. */
        var chargedConnectedCallDurationSeconds: js.UndefOr[String] = js.undefined
        
        /** Consumer phone number associated with the phone lead. */
        var consumerPhoneNumber: js.UndefOr[String] = js.undefined
      }
      object GoogleAdsHomeservicesLocalservicesV1PhoneLead {
        
        inline def apply(): GoogleAdsHomeservicesLocalservicesV1PhoneLead = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleAdsHomeservicesLocalservicesV1PhoneLead]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: GoogleAdsHomeservicesLocalservicesV1PhoneLead] (val x: Self) extends AnyVal {
          
          inline def setChargedCallTimestamp(value: String): Self = StObject.set(x, "chargedCallTimestamp", value.asInstanceOf[js.Any])
          
          inline def setChargedCallTimestampUndefined: Self = StObject.set(x, "chargedCallTimestamp", js.undefined)
          
          inline def setChargedConnectedCallDurationSeconds(value: String): Self = StObject.set(x, "chargedConnectedCallDurationSeconds", value.asInstanceOf[js.Any])
          
          inline def setChargedConnectedCallDurationSecondsUndefined: Self = StObject.set(x, "chargedConnectedCallDurationSeconds", js.undefined)
          
          inline def setConsumerPhoneNumber(value: String): Self = StObject.set(x, "consumerPhoneNumber", value.asInstanceOf[js.Any])
          
          inline def setConsumerPhoneNumberUndefined: Self = StObject.set(x, "consumerPhoneNumber", js.undefined)
        }
      }
      
      trait GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse extends StObject {
        
        /** List of account reports which maps 1:1 to a particular linked GLS account. */
        var accountReports: js.UndefOr[js.Array[GoogleAdsHomeservicesLocalservicesV1AccountReport]] = js.undefined
        
        /** Pagination token to retrieve the next page of results. When `next_page_token` is not filled in, there is no next page and the list returned is the last page in the result set. */
        var nextPageToken: js.UndefOr[String] = js.undefined
      }
      object GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse {
        
        inline def apply(): GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse] (val x: Self) extends AnyVal {
          
          inline def setAccountReports(value: js.Array[GoogleAdsHomeservicesLocalservicesV1AccountReport]): Self = StObject.set(x, "accountReports", value.asInstanceOf[js.Any])
          
          inline def setAccountReportsUndefined: Self = StObject.set(x, "accountReports", js.undefined)
          
          inline def setAccountReportsVarargs(value: GoogleAdsHomeservicesLocalservicesV1AccountReport*): Self = StObject.set(x, "accountReports", js.Array(value*))
          
          inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
          
          inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        }
      }
      
      trait GoogleAdsHomeservicesLocalservicesV1SearchDetailedLeadReportsResponse extends StObject {
        
        /** List of detailed lead reports uniquely identified by external lead id. */
        var detailedLeadReports: js.UndefOr[js.Array[GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport]] = js.undefined
        
        /** Pagination token to retrieve the next page of results. When `next_page_token` is not filled in, there is no next page and the list returned is the last page in the result set. */
        var nextPageToken: js.UndefOr[String] = js.undefined
      }
      object GoogleAdsHomeservicesLocalservicesV1SearchDetailedLeadReportsResponse {
        
        inline def apply(): GoogleAdsHomeservicesLocalservicesV1SearchDetailedLeadReportsResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleAdsHomeservicesLocalservicesV1SearchDetailedLeadReportsResponse]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: GoogleAdsHomeservicesLocalservicesV1SearchDetailedLeadReportsResponse] (val x: Self) extends AnyVal {
          
          inline def setDetailedLeadReports(value: js.Array[GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport]): Self = StObject.set(x, "detailedLeadReports", value.asInstanceOf[js.Any])
          
          inline def setDetailedLeadReportsUndefined: Self = StObject.set(x, "detailedLeadReports", js.undefined)
          
          inline def setDetailedLeadReportsVarargs(value: GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport*): Self = StObject.set(x, "detailedLeadReports", js.Array(value*))
          
          inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
          
          inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        }
      }
      
      trait GoogleTypeTimeZone extends StObject {
        
        /** IANA Time Zone Database time zone, e.g. "America/New_York". */
        var id: js.UndefOr[String] = js.undefined
        
        /** Optional. IANA Time Zone Database version number, e.g. "2019a". */
        var version: js.UndefOr[String] = js.undefined
      }
      object GoogleTypeTimeZone {
        
        inline def apply(): GoogleTypeTimeZone = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleTypeTimeZone]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: GoogleTypeTimeZone] (val x: Self) extends AnyVal {
          
          inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
          
          inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
          
          inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
          
          inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
        }
      }
    }
  }
}
