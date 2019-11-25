package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostSecurityState extends js.Object {
  // Host FQDN (Fully Qualified Domain Name) (for example, machine.company.com).
  var fqdn: js.UndefOr[String] = js.undefined
  var isAzureAdJoined: js.UndefOr[Boolean] = js.undefined
  var isAzureAdRegistered: js.UndefOr[Boolean] = js.undefined
  // True if the host is domain joined to an on-premises Active Directory domain.
  var isHybridAzureDomainJoined: js.UndefOr[Boolean] = js.undefined
  // The local host name, without the DNS domain name.
  var netBiosName: js.UndefOr[String] = js.undefined
  // Host Operating System. (For example, Windows10, MacOS, RHEL, etc.).
  var os: js.UndefOr[String] = js.undefined
  // Private (not routable) IPv4 or IPv6 address (see RFC 1918) at the time of the alert.
  var privateIpAddress: js.UndefOr[String] = js.undefined
  // Publicly routable IPv4 or IPv6 address (see RFC 1918) at time of the alert.
  var publicIpAddress: js.UndefOr[String] = js.undefined
  // Provider-generated/calculated risk score of the host. Recommended value range of 0-1, which equates to a percentage.
  var riskScore: js.UndefOr[String] = js.undefined
}

object HostSecurityState {
  @scala.inline
  def apply(
    fqdn: String = null,
    isAzureAdJoined: js.UndefOr[Boolean] = js.undefined,
    isAzureAdRegistered: js.UndefOr[Boolean] = js.undefined,
    isHybridAzureDomainJoined: js.UndefOr[Boolean] = js.undefined,
    netBiosName: String = null,
    os: String = null,
    privateIpAddress: String = null,
    publicIpAddress: String = null,
    riskScore: String = null
  ): HostSecurityState = {
    val __obj = js.Dynamic.literal()
    if (fqdn != null) __obj.updateDynamic("fqdn")(fqdn.asInstanceOf[js.Any])
    if (!js.isUndefined(isAzureAdJoined)) __obj.updateDynamic("isAzureAdJoined")(isAzureAdJoined.asInstanceOf[js.Any])
    if (!js.isUndefined(isAzureAdRegistered)) __obj.updateDynamic("isAzureAdRegistered")(isAzureAdRegistered.asInstanceOf[js.Any])
    if (!js.isUndefined(isHybridAzureDomainJoined)) __obj.updateDynamic("isHybridAzureDomainJoined")(isHybridAzureDomainJoined.asInstanceOf[js.Any])
    if (netBiosName != null) __obj.updateDynamic("netBiosName")(netBiosName.asInstanceOf[js.Any])
    if (os != null) __obj.updateDynamic("os")(os.asInstanceOf[js.Any])
    if (privateIpAddress != null) __obj.updateDynamic("privateIpAddress")(privateIpAddress.asInstanceOf[js.Any])
    if (publicIpAddress != null) __obj.updateDynamic("publicIpAddress")(publicIpAddress.asInstanceOf[js.Any])
    if (riskScore != null) __obj.updateDynamic("riskScore")(riskScore.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostSecurityState]
  }
}

