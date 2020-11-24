package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowedSubjectAltNames extends js.Object {
  
  /** Optional. Specifies if to allow custom X509Extension values. */
  var allowCustomSans: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. Specifies if glob patterns used for allowed_dns_names allow wildcard certificates. If this is set, certificate requests with wildcard domains will be permitted to match a
    * glob pattern specified in allowed_dns_names. Otherwise, certificate requests with wildcard domains will be permitted only if allowed_dns_names contains a literal wildcard.
    */
  var allowGlobbingDnsWildcards: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. Contains valid, fully-qualified host names. Glob patterns are also supported. To allow an explicit wildcard certificate, escape with backlash (i.e. "\*"). E.g. for globbed
    * entries: '*bar.com' will allow 'foo.bar.com', but not '*.bar.com', unless the allow_globbing_dns_wildcards field is set. E.g. for wildcard entries: '\*.bar.com' will allow
    * '*.bar.com', but not 'foo.bar.com'.
    */
  var allowedDnsNames: js.UndefOr[js.Array[String]] = js.native
  
  /** Optional. Contains valid RFC 2822 E-mail addresses. Glob patterns are also supported. */
  var allowedEmailAddresses: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. Contains valid 32-bit IPv4 addresses and subnet ranges or RFC 4291 IPv6 addresses and subnet ranges. Subnet ranges are specified using the '/' notation (e.g. 10.0.0.0/8,
    * 2001:700:300:1800::/64). Glob patterns are supported only for ip address entries (i.e. not for subnet ranges).
    */
  var allowedIps: js.UndefOr[js.Array[String]] = js.native
  
  /** Optional. Contains valid RFC 3986 URIs. Glob patterns are also supported. To match across path seperators (i.e. '/') use the double star glob pattern (i.e. '**'). */
  var allowedUris: js.UndefOr[js.Array[String]] = js.native
}
object AllowedSubjectAltNames {
  
  @scala.inline
  def apply(): AllowedSubjectAltNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedSubjectAltNames]
  }
  
  @scala.inline
  implicit class AllowedSubjectAltNamesOps[Self <: AllowedSubjectAltNames] (val x: Self) extends AnyVal {
    
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
    def setAllowCustomSans(value: Boolean): Self = this.set("allowCustomSans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCustomSans: Self = this.set("allowCustomSans", js.undefined)
    
    @scala.inline
    def setAllowGlobbingDnsWildcards(value: Boolean): Self = this.set("allowGlobbingDnsWildcards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowGlobbingDnsWildcards: Self = this.set("allowGlobbingDnsWildcards", js.undefined)
    
    @scala.inline
    def setAllowedDnsNamesVarargs(value: String*): Self = this.set("allowedDnsNames", js.Array(value :_*))
    
    @scala.inline
    def setAllowedDnsNames(value: js.Array[String]): Self = this.set("allowedDnsNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedDnsNames: Self = this.set("allowedDnsNames", js.undefined)
    
    @scala.inline
    def setAllowedEmailAddressesVarargs(value: String*): Self = this.set("allowedEmailAddresses", js.Array(value :_*))
    
    @scala.inline
    def setAllowedEmailAddresses(value: js.Array[String]): Self = this.set("allowedEmailAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedEmailAddresses: Self = this.set("allowedEmailAddresses", js.undefined)
    
    @scala.inline
    def setAllowedIpsVarargs(value: String*): Self = this.set("allowedIps", js.Array(value :_*))
    
    @scala.inline
    def setAllowedIps(value: js.Array[String]): Self = this.set("allowedIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedIps: Self = this.set("allowedIps", js.undefined)
    
    @scala.inline
    def setAllowedUrisVarargs(value: String*): Self = this.set("allowedUris", js.Array(value :_*))
    
    @scala.inline
    def setAllowedUris(value: js.Array[String]): Self = this.set("allowedUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedUris: Self = this.set("allowedUris", js.undefined)
  }
}
