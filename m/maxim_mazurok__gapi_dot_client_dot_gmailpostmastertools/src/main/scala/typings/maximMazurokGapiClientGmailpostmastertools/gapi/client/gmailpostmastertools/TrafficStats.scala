package typings.maximMazurokGapiClientGmailpostmastertools.gapi.client.gmailpostmastertools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrafficStats extends js.Object {
  
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
  implicit class TrafficStatsOps[Self <: TrafficStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeliveryErrorsVarargs(value: DeliveryError*): Self = this.set("deliveryErrors", js.Array(value :_*))
    
    @scala.inline
    def setDeliveryErrors(value: js.Array[DeliveryError]): Self = this.set("deliveryErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryErrors: Self = this.set("deliveryErrors", js.undefined)
    
    @scala.inline
    def setDkimSuccessRatio(value: Double): Self = this.set("dkimSuccessRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDkimSuccessRatio: Self = this.set("dkimSuccessRatio", js.undefined)
    
    @scala.inline
    def setDmarcSuccessRatio(value: Double): Self = this.set("dmarcSuccessRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDmarcSuccessRatio: Self = this.set("dmarcSuccessRatio", js.undefined)
    
    @scala.inline
    def setDomainReputation(value: String): Self = this.set("domainReputation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainReputation: Self = this.set("domainReputation", js.undefined)
    
    @scala.inline
    def setInboundEncryptionRatio(value: Double): Self = this.set("inboundEncryptionRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInboundEncryptionRatio: Self = this.set("inboundEncryptionRatio", js.undefined)
    
    @scala.inline
    def setIpReputationsVarargs(value: IpReputation*): Self = this.set("ipReputations", js.Array(value :_*))
    
    @scala.inline
    def setIpReputations(value: js.Array[IpReputation]): Self = this.set("ipReputations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpReputations: Self = this.set("ipReputations", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOutboundEncryptionRatio(value: Double): Self = this.set("outboundEncryptionRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutboundEncryptionRatio: Self = this.set("outboundEncryptionRatio", js.undefined)
    
    @scala.inline
    def setSpammyFeedbackLoopsVarargs(value: FeedbackLoop*): Self = this.set("spammyFeedbackLoops", js.Array(value :_*))
    
    @scala.inline
    def setSpammyFeedbackLoops(value: js.Array[FeedbackLoop]): Self = this.set("spammyFeedbackLoops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpammyFeedbackLoops: Self = this.set("spammyFeedbackLoops", js.undefined)
    
    @scala.inline
    def setSpfSuccessRatio(value: Double): Self = this.set("spfSuccessRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpfSuccessRatio: Self = this.set("spfSuccessRatio", js.undefined)
    
    @scala.inline
    def setUserReportedSpamRatio(value: Double): Self = this.set("userReportedSpamRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserReportedSpamRatio: Self = this.set("userReportedSpamRatio", js.undefined)
  }
}
