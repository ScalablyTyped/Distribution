package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceManagementExchangeConnector extends Entity {
  // The name of the server hosting the Exchange Connector.
  var connectorServerName: js.UndefOr[String] = js.undefined
  // An alias assigned to the Exchange server
  var exchangeAlias: js.UndefOr[String] = js.undefined
  // The type of Exchange Connector Configured. Possible values are: onPremises, hosted, serviceToService, dedicated.
  var exchangeConnectorType: js.UndefOr[DeviceManagementExchangeConnectorType] = js.undefined
  // Exchange Organization to the Exchange server
  var exchangeOrganization: js.UndefOr[String] = js.undefined
  // Last sync time for the Exchange Connector
  var lastSyncDateTime: js.UndefOr[String] = js.undefined
  // Email address used to configure the Service To Service Exchange Connector.
  var primarySmtpAddress: js.UndefOr[String] = js.undefined
  // The name of the Exchange server.
  var serverName: js.UndefOr[String] = js.undefined
  // Exchange Connector Status. Possible values are: none, connectionPending, connected, disconnected.
  var status: js.UndefOr[DeviceManagementExchangeConnectorStatus] = js.undefined
  // The version of the ExchangeConnectorAgent
  var version: js.UndefOr[String] = js.undefined
}

object DeviceManagementExchangeConnector {
  @scala.inline
  def apply(
    connectorServerName: String = null,
    exchangeAlias: String = null,
    exchangeConnectorType: DeviceManagementExchangeConnectorType = null,
    exchangeOrganization: String = null,
    id: String = null,
    lastSyncDateTime: String = null,
    primarySmtpAddress: String = null,
    serverName: String = null,
    status: DeviceManagementExchangeConnectorStatus = null,
    version: String = null
  ): DeviceManagementExchangeConnector = {
    val __obj = js.Dynamic.literal()
    if (connectorServerName != null) __obj.updateDynamic("connectorServerName")(connectorServerName.asInstanceOf[js.Any])
    if (exchangeAlias != null) __obj.updateDynamic("exchangeAlias")(exchangeAlias.asInstanceOf[js.Any])
    if (exchangeConnectorType != null) __obj.updateDynamic("exchangeConnectorType")(exchangeConnectorType.asInstanceOf[js.Any])
    if (exchangeOrganization != null) __obj.updateDynamic("exchangeOrganization")(exchangeOrganization.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastSyncDateTime != null) __obj.updateDynamic("lastSyncDateTime")(lastSyncDateTime.asInstanceOf[js.Any])
    if (primarySmtpAddress != null) __obj.updateDynamic("primarySmtpAddress")(primarySmtpAddress.asInstanceOf[js.Any])
    if (serverName != null) __obj.updateDynamic("serverName")(serverName.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceManagementExchangeConnector]
  }
}

