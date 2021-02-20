package typings.maximMazurokGapiClientGmailpostmastertools

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGmailpostmastertools.anon.Accesstoken
import typings.maximMazurokGapiClientGmailpostmastertools.anon.Alt
import typings.maximMazurokGapiClientGmailpostmastertools.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object gmailpostmastertools {
      
      @js.native
      trait DeliveryError extends StObject {
        
        /** The class of delivery error. */
        var errorClass: js.UndefOr[String] = js.native
        
        /** The ratio of messages where the error occurred vs all authenticated traffic. */
        var errorRatio: js.UndefOr[Double] = js.native
        
        /** The type of delivery error. */
        var errorType: js.UndefOr[String] = js.native
      }
      object DeliveryError {
        
        @scala.inline
        def apply(): DeliveryError = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[DeliveryError]
        }
        
        @scala.inline
        implicit class DeliveryErrorMutableBuilder[Self <: DeliveryError] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setErrorClass(value: String): Self = StObject.set(x, "errorClass", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setErrorClassUndefined: Self = StObject.set(x, "errorClass", js.undefined)
          
          @scala.inline
          def setErrorRatio(value: Double): Self = StObject.set(x, "errorRatio", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setErrorRatioUndefined: Self = StObject.set(x, "errorRatio", js.undefined)
          
          @scala.inline
          def setErrorType(value: String): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
        }
      }
      
      @js.native
      trait Domain extends StObject {
        
        /** Timestamp when the user registered this domain. Assigned by the server. */
        var createTime: js.UndefOr[String] = js.native
        
        /** The resource name of the Domain. Domain names have the form `domains/{domain_name}`, where domain_name is the fully qualified domain name (i.e., mymail.mydomain.com). */
        var name: js.UndefOr[String] = js.native
        
        /** User’s permission for this domain. Assigned by the server. */
        var permission: js.UndefOr[String] = js.native
      }
      object Domain {
        
        @scala.inline
        def apply(): Domain = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Domain]
        }
        
        @scala.inline
        implicit class DomainMutableBuilder[Self <: Domain] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
          
          @scala.inline
          def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          @scala.inline
          def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
        }
      }
      
      @js.native
      trait DomainsResource extends StObject {
        
        /** Gets a specific domain registered by the client. Returns NOT_FOUND if the domain does not exist. */
        def get(): Request[Domain] = js.native
        def get(request: Accesstoken): Request[Domain] = js.native
        
        /**
          * Lists the domains that have been registered by the client. The order of domains in the response is unspecified and non-deterministic. Newly created domains will not necessarily be
          * added to the end of this list.
          */
        def list(): Request[ListDomainsResponse] = js.native
        def list(request: Callback): Request[ListDomainsResponse] = js.native
        
        var trafficStats: TrafficStatsResource = js.native
      }
      
      @js.native
      trait FeedbackLoop extends StObject {
        
        /** Feedback loop identifier that uniquely identifies individual campaigns. */
        var id: js.UndefOr[String] = js.native
        
        /** The ratio of user marked spam messages with the identifier vs the total number of inboxed messages with that identifier. */
        var spamRatio: js.UndefOr[Double] = js.native
      }
      object FeedbackLoop {
        
        @scala.inline
        def apply(): FeedbackLoop = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[FeedbackLoop]
        }
        
        @scala.inline
        implicit class FeedbackLoopMutableBuilder[Self <: FeedbackLoop] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
          
          @scala.inline
          def setSpamRatio(value: Double): Self = StObject.set(x, "spamRatio", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSpamRatioUndefined: Self = StObject.set(x, "spamRatio", js.undefined)
        }
      }
      
      @js.native
      trait IpReputation extends StObject {
        
        /** Total number of unique IPs in this reputation category. This metric only pertains to traffic that passed [SPF](http://www.openspf.org/) or [DKIM](http://www.dkim.org/). */
        var numIps: js.UndefOr[String] = js.native
        
        /** The reputation category this IP reputation represents. */
        var reputation: js.UndefOr[String] = js.native
        
        /** A sample of IPs in this reputation category. */
        var sampleIps: js.UndefOr[js.Array[String]] = js.native
      }
      object IpReputation {
        
        @scala.inline
        def apply(): IpReputation = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IpReputation]
        }
        
        @scala.inline
        implicit class IpReputationMutableBuilder[Self <: IpReputation] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setNumIps(value: String): Self = StObject.set(x, "numIps", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNumIpsUndefined: Self = StObject.set(x, "numIps", js.undefined)
          
          @scala.inline
          def setReputation(value: String): Self = StObject.set(x, "reputation", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setReputationUndefined: Self = StObject.set(x, "reputation", js.undefined)
          
          @scala.inline
          def setSampleIps(value: js.Array[String]): Self = StObject.set(x, "sampleIps", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSampleIpsUndefined: Self = StObject.set(x, "sampleIps", js.undefined)
          
          @scala.inline
          def setSampleIpsVarargs(value: String*): Self = StObject.set(x, "sampleIps", js.Array(value :_*))
        }
      }
      
      @js.native
      trait ListDomainsResponse extends StObject {
        
        /** The list of domains. */
        var domains: js.UndefOr[js.Array[Domain]] = js.native
        
        /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
        var nextPageToken: js.UndefOr[String] = js.native
      }
      object ListDomainsResponse {
        
        @scala.inline
        def apply(): ListDomainsResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ListDomainsResponse]
        }
        
        @scala.inline
        implicit class ListDomainsResponseMutableBuilder[Self <: ListDomainsResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDomains(value: js.Array[Domain]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
          
          @scala.inline
          def setDomainsVarargs(value: Domain*): Self = StObject.set(x, "domains", js.Array(value :_*))
          
          @scala.inline
          def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        }
      }
      
      @js.native
      trait ListTrafficStatsResponse extends StObject {
        
        /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
        var nextPageToken: js.UndefOr[String] = js.native
        
        /** The list of TrafficStats. */
        var trafficStats: js.UndefOr[js.Array[TrafficStats]] = js.native
      }
      object ListTrafficStatsResponse {
        
        @scala.inline
        def apply(): ListTrafficStatsResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ListTrafficStatsResponse]
        }
        
        @scala.inline
        implicit class ListTrafficStatsResponseMutableBuilder[Self <: ListTrafficStatsResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
          
          @scala.inline
          def setTrafficStats(value: js.Array[TrafficStats]): Self = StObject.set(x, "trafficStats", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTrafficStatsUndefined: Self = StObject.set(x, "trafficStats", js.undefined)
          
          @scala.inline
          def setTrafficStatsVarargs(value: TrafficStats*): Self = StObject.set(x, "trafficStats", js.Array(value :_*))
        }
      }
      
      @js.native
      trait TrafficStats extends StObject {
        
        /** Delivery errors for the domain. This metric only pertains to traffic that passed [SPF](http://www.openspf.org/) or [DKIM](http://www.dkim.org/). */
        var deliveryErrors: js.UndefOr[js.Array[DeliveryError]] = js.native
        
        /** The ratio of mail that successfully authenticated with DKIM vs. all mail that attempted to authenticate with [DKIM](http://www.dkim.org/). Spoofed mail is excluded. */
        var dkimSuccessRatio: js.UndefOr[Double] = js.native
        
        /**
          * The ratio of mail that passed [DMARC](https://dmarc.org/) alignment checks vs all mail received from the domain that successfully authenticated with either of
          * [SPF](http://www.openspf.org/) or [DKIM](http://www.dkim.org/).
          */
        var dmarcSuccessRatio: js.UndefOr[Double] = js.native
        
        /** Reputation of the domain. */
        var domainReputation: js.UndefOr[String] = js.native
        
        /**
          * The ratio of incoming mail (to Gmail), that passed secure transport (TLS) vs all mail received from that domain. This metric only pertains to traffic that passed
          * [SPF](http://www.openspf.org/) or [DKIM](http://www.dkim.org/).
          */
        var inboundEncryptionRatio: js.UndefOr[Double] = js.native
        
        /**
          * Reputation information pertaining to the IP addresses of the email servers for the domain. There is exactly one entry for each reputation category except
          * REPUTATION_CATEGORY_UNSPECIFIED.
          */
        var ipReputations: js.UndefOr[js.Array[IpReputation]] = js.native
        
        /**
          * The resource name of the traffic statistics. Traffic statistic names have the form `domains/{domain}/trafficStats/{date}`, where domain_name is the fully qualified domain name
          * (i.e., mymail.mydomain.com) of the domain this traffic statistics pertains to and date is the date in yyyymmdd format that these statistics corresponds to. For example:
          * domains/mymail.mydomain.com/trafficStats/20160807
          */
        var name: js.UndefOr[String] = js.native
        
        /** The ratio of outgoing mail (from Gmail) that was accepted over secure transport (TLS). */
        var outboundEncryptionRatio: js.UndefOr[Double] = js.native
        
        /**
          * Spammy [Feedback loop identifiers] (https://support.google.com/mail/answer/6254652) with their individual spam rates. This metric only pertains to traffic that is authenticated by
          * [DKIM](http://www.dkim.org/).
          */
        var spammyFeedbackLoops: js.UndefOr[js.Array[FeedbackLoop]] = js.native
        
        /** The ratio of mail that successfully authenticated with SPF vs. all mail that attempted to authenticate with [SPF](http://www.openspf.org/). Spoofed mail is excluded. */
        var spfSuccessRatio: js.UndefOr[Double] = js.native
        
        /** The ratio of user-report spam vs. email that was sent to the inbox. This metric only pertains to emails authenticated by [DKIM](http://www.dkim.org/). */
        var userReportedSpamRatio: js.UndefOr[Double] = js.native
      }
      object TrafficStats {
        
        @scala.inline
        def apply(): TrafficStats = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[TrafficStats]
        }
        
        @scala.inline
        implicit class TrafficStatsMutableBuilder[Self <: TrafficStats] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDeliveryErrors(value: js.Array[DeliveryError]): Self = StObject.set(x, "deliveryErrors", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDeliveryErrorsUndefined: Self = StObject.set(x, "deliveryErrors", js.undefined)
          
          @scala.inline
          def setDeliveryErrorsVarargs(value: DeliveryError*): Self = StObject.set(x, "deliveryErrors", js.Array(value :_*))
          
          @scala.inline
          def setDkimSuccessRatio(value: Double): Self = StObject.set(x, "dkimSuccessRatio", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDkimSuccessRatioUndefined: Self = StObject.set(x, "dkimSuccessRatio", js.undefined)
          
          @scala.inline
          def setDmarcSuccessRatio(value: Double): Self = StObject.set(x, "dmarcSuccessRatio", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDmarcSuccessRatioUndefined: Self = StObject.set(x, "dmarcSuccessRatio", js.undefined)
          
          @scala.inline
          def setDomainReputation(value: String): Self = StObject.set(x, "domainReputation", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDomainReputationUndefined: Self = StObject.set(x, "domainReputation", js.undefined)
          
          @scala.inline
          def setInboundEncryptionRatio(value: Double): Self = StObject.set(x, "inboundEncryptionRatio", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setInboundEncryptionRatioUndefined: Self = StObject.set(x, "inboundEncryptionRatio", js.undefined)
          
          @scala.inline
          def setIpReputations(value: js.Array[IpReputation]): Self = StObject.set(x, "ipReputations", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIpReputationsUndefined: Self = StObject.set(x, "ipReputations", js.undefined)
          
          @scala.inline
          def setIpReputationsVarargs(value: IpReputation*): Self = StObject.set(x, "ipReputations", js.Array(value :_*))
          
          @scala.inline
          def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          @scala.inline
          def setOutboundEncryptionRatio(value: Double): Self = StObject.set(x, "outboundEncryptionRatio", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOutboundEncryptionRatioUndefined: Self = StObject.set(x, "outboundEncryptionRatio", js.undefined)
          
          @scala.inline
          def setSpammyFeedbackLoops(value: js.Array[FeedbackLoop]): Self = StObject.set(x, "spammyFeedbackLoops", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSpammyFeedbackLoopsUndefined: Self = StObject.set(x, "spammyFeedbackLoops", js.undefined)
          
          @scala.inline
          def setSpammyFeedbackLoopsVarargs(value: FeedbackLoop*): Self = StObject.set(x, "spammyFeedbackLoops", js.Array(value :_*))
          
          @scala.inline
          def setSpfSuccessRatio(value: Double): Self = StObject.set(x, "spfSuccessRatio", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSpfSuccessRatioUndefined: Self = StObject.set(x, "spfSuccessRatio", js.undefined)
          
          @scala.inline
          def setUserReportedSpamRatio(value: Double): Self = StObject.set(x, "userReportedSpamRatio", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUserReportedSpamRatioUndefined: Self = StObject.set(x, "userReportedSpamRatio", js.undefined)
        }
      }
      
      @js.native
      trait TrafficStatsResource extends StObject {
        
        /** Get traffic statistics for a domain on a specific date. Returns PERMISSION_DENIED if user does not have permission to access TrafficStats for the domain. */
        def get(): Request[TrafficStats] = js.native
        def get(request: Accesstoken): Request[TrafficStats] = js.native
        
        /** List traffic statistics for all available days. Returns PERMISSION_DENIED if user does not have permission to access TrafficStats for the domain. */
        def list(): Request[ListTrafficStatsResponse] = js.native
        def list(request: Alt): Request[ListTrafficStatsResponse] = js.native
      }
    }
  }
}
