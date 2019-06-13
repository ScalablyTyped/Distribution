package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostSecurityState extends js.Object {
  /** Host FQDN (Fully Qualified Domain Name) (for example, machine.company.com). */
  var fqdn: js.UndefOr[java.lang.String] = js.undefined
  var isAzureAdJoined: js.UndefOr[scala.Boolean] = js.undefined
  var isAzureAdRegistered: js.UndefOr[scala.Boolean] = js.undefined
  /** True if the host is domain joined to an on-premises Active Directory domain. */
  var isHybridAzureDomainJoined: js.UndefOr[scala.Boolean] = js.undefined
  /** The local host name, without the DNS domain name. */
  var netBiosName: js.UndefOr[java.lang.String] = js.undefined
  /** Host Operating System. (For example, Windows10, MacOS, RHEL, etc.). */
  var os: js.UndefOr[java.lang.String] = js.undefined
  /** Private (not routable) IPv4 or IPv6 address (see RFC 1918) at the time of the alert. */
  var privateIpAddress: js.UndefOr[java.lang.String] = js.undefined
  /** Publicly routable IPv4 or IPv6 address (see RFC 1918) at time of the alert. */
  var publicIpAddress: js.UndefOr[java.lang.String] = js.undefined
  /** Provider-generated/calculated risk score of the host.  Recommended value range of 0-1, which equates to a percentage. */
  var riskScore: js.UndefOr[java.lang.String] = js.undefined
}

object HostSecurityState {
  @scala.inline
  def apply(
    fqdn: java.lang.String = null,
    isAzureAdJoined: js.UndefOr[scala.Boolean] = js.undefined,
    isAzureAdRegistered: js.UndefOr[scala.Boolean] = js.undefined,
    isHybridAzureDomainJoined: js.UndefOr[scala.Boolean] = js.undefined,
    netBiosName: java.lang.String = null,
    os: java.lang.String = null,
    privateIpAddress: java.lang.String = null,
    publicIpAddress: java.lang.String = null,
    riskScore: java.lang.String = null
  ): HostSecurityState = {
    val __obj = js.Dynamic.literal()
    if (fqdn != null) __obj.updateDynamic("fqdn")(fqdn)
    if (!js.isUndefined(isAzureAdJoined)) __obj.updateDynamic("isAzureAdJoined")(isAzureAdJoined)
    if (!js.isUndefined(isAzureAdRegistered)) __obj.updateDynamic("isAzureAdRegistered")(isAzureAdRegistered)
    if (!js.isUndefined(isHybridAzureDomainJoined)) __obj.updateDynamic("isHybridAzureDomainJoined")(isHybridAzureDomainJoined)
    if (netBiosName != null) __obj.updateDynamic("netBiosName")(netBiosName)
    if (os != null) __obj.updateDynamic("os")(os)
    if (privateIpAddress != null) __obj.updateDynamic("privateIpAddress")(privateIpAddress)
    if (publicIpAddress != null) __obj.updateDynamic("publicIpAddress")(publicIpAddress)
    if (riskScore != null) __obj.updateDynamic("riskScore")(riskScore)
    __obj.asInstanceOf[HostSecurityState]
  }
}

