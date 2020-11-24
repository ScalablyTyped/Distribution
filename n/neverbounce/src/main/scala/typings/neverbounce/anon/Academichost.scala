package typings.neverbounce.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Academichost extends js.Object {
  
  var academic_host: String = js.native
  
  var accepts_all: String = js.native
  
  var bad_dns: String = js.native
  
  var bad_syntax: String = js.native
  
  var connect_fails: String = js.native
  
  var contains_alias: String = js.native
  
  var contains_subdomain: String = js.native
  
  var disposable_email: String = js.native
  
  var free_email_host: String = js.native
  
  var government_host: String = js.native
  
  var has_dns: String = js.native
  
  var has_dns_mx: String = js.native
  
  var international_host: String = js.native
  
  var military_host: String = js.native
  
  var profanity: String = js.native
  
  var role_account: String = js.native
  
  var smtp_connectable: String = js.native
  
  var spamtrap_network: String = js.native
  
  var spelling_mistake: String = js.native
  
  var squatter_host: String = js.native
  
  var temporary_dns_error: String = js.native
}
object Academichost {
  
  @scala.inline
  def apply(
    academic_host: String,
    accepts_all: String,
    bad_dns: String,
    bad_syntax: String,
    connect_fails: String,
    contains_alias: String,
    contains_subdomain: String,
    disposable_email: String,
    free_email_host: String,
    government_host: String,
    has_dns: String,
    has_dns_mx: String,
    international_host: String,
    military_host: String,
    profanity: String,
    role_account: String,
    smtp_connectable: String,
    spamtrap_network: String,
    spelling_mistake: String,
    squatter_host: String,
    temporary_dns_error: String
  ): Academichost = {
    val __obj = js.Dynamic.literal(academic_host = academic_host.asInstanceOf[js.Any], accepts_all = accepts_all.asInstanceOf[js.Any], bad_dns = bad_dns.asInstanceOf[js.Any], bad_syntax = bad_syntax.asInstanceOf[js.Any], connect_fails = connect_fails.asInstanceOf[js.Any], contains_alias = contains_alias.asInstanceOf[js.Any], contains_subdomain = contains_subdomain.asInstanceOf[js.Any], disposable_email = disposable_email.asInstanceOf[js.Any], free_email_host = free_email_host.asInstanceOf[js.Any], government_host = government_host.asInstanceOf[js.Any], has_dns = has_dns.asInstanceOf[js.Any], has_dns_mx = has_dns_mx.asInstanceOf[js.Any], international_host = international_host.asInstanceOf[js.Any], military_host = military_host.asInstanceOf[js.Any], profanity = profanity.asInstanceOf[js.Any], role_account = role_account.asInstanceOf[js.Any], smtp_connectable = smtp_connectable.asInstanceOf[js.Any], spamtrap_network = spamtrap_network.asInstanceOf[js.Any], spelling_mistake = spelling_mistake.asInstanceOf[js.Any], squatter_host = squatter_host.asInstanceOf[js.Any], temporary_dns_error = temporary_dns_error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Academichost]
  }
  
  @scala.inline
  implicit class AcademichostOps[Self <: Academichost] (val x: Self) extends AnyVal {
    
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
    def setAcademic_host(value: String): Self = this.set("academic_host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccepts_all(value: String): Self = this.set("accepts_all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBad_dns(value: String): Self = this.set("bad_dns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBad_syntax(value: String): Self = this.set("bad_syntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnect_fails(value: String): Self = this.set("connect_fails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContains_alias(value: String): Self = this.set("contains_alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContains_subdomain(value: String): Self = this.set("contains_subdomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisposable_email(value: String): Self = this.set("disposable_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFree_email_host(value: String): Self = this.set("free_email_host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGovernment_host(value: String): Self = this.set("government_host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_dns(value: String): Self = this.set("has_dns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_dns_mx(value: String): Self = this.set("has_dns_mx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternational_host(value: String): Self = this.set("international_host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMilitary_host(value: String): Self = this.set("military_host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfanity(value: String): Self = this.set("profanity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole_account(value: String): Self = this.set("role_account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmtp_connectable(value: String): Self = this.set("smtp_connectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpamtrap_network(value: String): Self = this.set("spamtrap_network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpelling_mistake(value: String): Self = this.set("spelling_mistake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSquatter_host(value: String): Self = this.set("squatter_host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemporary_dns_error(value: String): Self = this.set("temporary_dns_error", value.asInstanceOf[js.Any])
  }
}
