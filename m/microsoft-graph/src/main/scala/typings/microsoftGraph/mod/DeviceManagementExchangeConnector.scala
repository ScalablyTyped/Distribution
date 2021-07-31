package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceManagementExchangeConnector
  extends StObject
     with Entity {
  
  // The name of the server hosting the Exchange Connector.
  var connectorServerName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // An alias assigned to the Exchange server
  var exchangeAlias: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The type of Exchange Connector Configured. Possible values are: onPremises, hosted, serviceToService, dedicated.
  var exchangeConnectorType: js.UndefOr[DeviceManagementExchangeConnectorType] = js.undefined
  
  // Exchange Organization to the Exchange server
  var exchangeOrganization: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Last sync time for the Exchange Connector
  var lastSyncDateTime: js.UndefOr[String] = js.undefined
  
  // Email address used to configure the Service To Service Exchange Connector.
  var primarySmtpAddress: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The name of the Exchange server.
  var serverName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Exchange Connector Status. Possible values are: none, connectionPending, connected, disconnected.
  var status: js.UndefOr[DeviceManagementExchangeConnectorStatus] = js.undefined
  
  // The version of the ExchangeConnectorAgent
  var version: js.UndefOr[NullableOption[String]] = js.undefined
}
object DeviceManagementExchangeConnector {
  
  @scala.inline
  def apply(): DeviceManagementExchangeConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceManagementExchangeConnector]
  }
  
  @scala.inline
  implicit class DeviceManagementExchangeConnectorMutableBuilder[Self <: DeviceManagementExchangeConnector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorServerName(value: NullableOption[String]): Self = StObject.set(x, "connectorServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorServerNameNull: Self = StObject.set(x, "connectorServerName", null)
    
    @scala.inline
    def setConnectorServerNameUndefined: Self = StObject.set(x, "connectorServerName", js.undefined)
    
    @scala.inline
    def setExchangeAlias(value: NullableOption[String]): Self = StObject.set(x, "exchangeAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchangeAliasNull: Self = StObject.set(x, "exchangeAlias", null)
    
    @scala.inline
    def setExchangeAliasUndefined: Self = StObject.set(x, "exchangeAlias", js.undefined)
    
    @scala.inline
    def setExchangeConnectorType(value: DeviceManagementExchangeConnectorType): Self = StObject.set(x, "exchangeConnectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchangeConnectorTypeUndefined: Self = StObject.set(x, "exchangeConnectorType", js.undefined)
    
    @scala.inline
    def setExchangeOrganization(value: NullableOption[String]): Self = StObject.set(x, "exchangeOrganization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchangeOrganizationNull: Self = StObject.set(x, "exchangeOrganization", null)
    
    @scala.inline
    def setExchangeOrganizationUndefined: Self = StObject.set(x, "exchangeOrganization", js.undefined)
    
    @scala.inline
    def setLastSyncDateTime(value: String): Self = StObject.set(x, "lastSyncDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSyncDateTimeUndefined: Self = StObject.set(x, "lastSyncDateTime", js.undefined)
    
    @scala.inline
    def setPrimarySmtpAddress(value: NullableOption[String]): Self = StObject.set(x, "primarySmtpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimarySmtpAddressNull: Self = StObject.set(x, "primarySmtpAddress", null)
    
    @scala.inline
    def setPrimarySmtpAddressUndefined: Self = StObject.set(x, "primarySmtpAddress", js.undefined)
    
    @scala.inline
    def setServerName(value: NullableOption[String]): Self = StObject.set(x, "serverName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerNameNull: Self = StObject.set(x, "serverName", null)
    
    @scala.inline
    def setServerNameUndefined: Self = StObject.set(x, "serverName", js.undefined)
    
    @scala.inline
    def setStatus(value: DeviceManagementExchangeConnectorStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setVersion(value: NullableOption[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNull: Self = StObject.set(x, "version", null)
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
