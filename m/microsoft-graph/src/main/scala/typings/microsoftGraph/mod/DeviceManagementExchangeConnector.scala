package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceManagementExchangeConnector extends Entity {
  // The name of the server hosting the Exchange Connector.
  var connectorServerName: js.UndefOr[String] = js.native
  // An alias assigned to the Exchange server
  var exchangeAlias: js.UndefOr[String] = js.native
  // The type of Exchange Connector Configured. Possible values are: onPremises, hosted, serviceToService, dedicated.
  var exchangeConnectorType: js.UndefOr[DeviceManagementExchangeConnectorType] = js.native
  // Exchange Organization to the Exchange server
  var exchangeOrganization: js.UndefOr[String] = js.native
  // Last sync time for the Exchange Connector
  var lastSyncDateTime: js.UndefOr[String] = js.native
  // Email address used to configure the Service To Service Exchange Connector.
  var primarySmtpAddress: js.UndefOr[String] = js.native
  // The name of the Exchange server.
  var serverName: js.UndefOr[String] = js.native
  // Exchange Connector Status. Possible values are: none, connectionPending, connected, disconnected.
  var status: js.UndefOr[DeviceManagementExchangeConnectorStatus] = js.native
  // The version of the ExchangeConnectorAgent
  var version: js.UndefOr[String] = js.native
}

object DeviceManagementExchangeConnector {
  @scala.inline
  def apply(): DeviceManagementExchangeConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceManagementExchangeConnector]
  }
  @scala.inline
  implicit class DeviceManagementExchangeConnectorOps[Self <: DeviceManagementExchangeConnector] (val x: Self) extends AnyVal {
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
    def setConnectorServerName(value: String): Self = this.set("connectorServerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectorServerName: Self = this.set("connectorServerName", js.undefined)
    @scala.inline
    def setExchangeAlias(value: String): Self = this.set("exchangeAlias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExchangeAlias: Self = this.set("exchangeAlias", js.undefined)
    @scala.inline
    def setExchangeConnectorType(value: DeviceManagementExchangeConnectorType): Self = this.set("exchangeConnectorType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExchangeConnectorType: Self = this.set("exchangeConnectorType", js.undefined)
    @scala.inline
    def setExchangeOrganization(value: String): Self = this.set("exchangeOrganization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExchangeOrganization: Self = this.set("exchangeOrganization", js.undefined)
    @scala.inline
    def setLastSyncDateTime(value: String): Self = this.set("lastSyncDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastSyncDateTime: Self = this.set("lastSyncDateTime", js.undefined)
    @scala.inline
    def setPrimarySmtpAddress(value: String): Self = this.set("primarySmtpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimarySmtpAddress: Self = this.set("primarySmtpAddress", js.undefined)
    @scala.inline
    def setServerName(value: String): Self = this.set("serverName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerName: Self = this.set("serverName", js.undefined)
    @scala.inline
    def setStatus(value: DeviceManagementExchangeConnectorStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

