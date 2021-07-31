package typings.maximMazurokGapiClientSmartdevicemanagement

import org.scalablytyped.runtime.TopLevel
import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSmartdevicemanagement.anon.Accesstoken
import typings.maximMazurokGapiClientSmartdevicemanagement.anon.Alt
import typings.maximMazurokGapiClientSmartdevicemanagement.anon.Callback
import typings.maximMazurokGapiClientSmartdevicemanagement.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object smartdevicemanagement {
      
      @js.native
      trait DevicesResource extends StObject {
        
        /** Executes a command to device managed by the enterprise. */
        def executeCommand(request: Accesstoken): Request[GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse] = js.native
        def executeCommand(request: Alt, body: GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest): Request[GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse] = js.native
        
        /** Gets a device managed by the enterprise. */
        def get(): Request[GoogleHomeEnterpriseSdmV1Device] = js.native
        def get(request: Alt): Request[GoogleHomeEnterpriseSdmV1Device] = js.native
        
        /** Lists devices managed by the enterprise. */
        def list(): Request[GoogleHomeEnterpriseSdmV1ListDevicesResponse] = js.native
        def list(request: Callback): Request[GoogleHomeEnterpriseSdmV1ListDevicesResponse] = js.native
      }
      
      trait EnterprisesResource extends StObject {
        
        var devices: DevicesResource
        
        var structures: StructuresResource
      }
      object EnterprisesResource {
        
        @scala.inline
        def apply(devices: DevicesResource, structures: StructuresResource): EnterprisesResource = {
          val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], structures = structures.asInstanceOf[js.Any])
          __obj.asInstanceOf[EnterprisesResource]
        }
        
        @scala.inline
        implicit class EnterprisesResourceMutableBuilder[Self <: EnterprisesResource] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDevices(value: DevicesResource): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setStructures(value: StructuresResource): Self = StObject.set(x, "structures", value.asInstanceOf[js.Any])
        }
      }
      
      trait GoogleHomeEnterpriseSdmV1Device extends StObject {
        
        /** Required. The resource name of the device. For example: "enterprises/XYZ/devices/123". */
        var name: js.UndefOr[String] = js.undefined
        
        /** Assignee details of the device. */
        var parentRelations: js.UndefOr[js.Array[GoogleHomeEnterpriseSdmV1ParentRelation]] = js.undefined
        
        /** Output only. Device traits. */
        var traits: js.UndefOr[
                /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ P in string ]: any}
          */ typings.maximMazurokGapiClientSmartdevicemanagement.maximMazurokGapiClientSmartdevicemanagementStrings.GoogleHomeEnterpriseSdmV1Device & TopLevel[js.Any]
              ] = js.undefined
        
        /**
          * Output only. Type of the device for general display purposes. For example: "THERMOSTAT". The device type should not be used to deduce or infer functionality of the actual device it
          * is assigned to. Instead, use the returned traits for the device.
          */
        var `type`: js.UndefOr[String] = js.undefined
      }
      object GoogleHomeEnterpriseSdmV1Device {
        
        @scala.inline
        def apply(): GoogleHomeEnterpriseSdmV1Device = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleHomeEnterpriseSdmV1Device]
        }
        
        @scala.inline
        implicit class GoogleHomeEnterpriseSdmV1DeviceMutableBuilder[Self <: GoogleHomeEnterpriseSdmV1Device] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          @scala.inline
          def setParentRelations(value: js.Array[GoogleHomeEnterpriseSdmV1ParentRelation]): Self = StObject.set(x, "parentRelations", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setParentRelationsUndefined: Self = StObject.set(x, "parentRelations", js.undefined)
          
          @scala.inline
          def setParentRelationsVarargs(value: GoogleHomeEnterpriseSdmV1ParentRelation*): Self = StObject.set(x, "parentRelations", js.Array(value :_*))
          
          @scala.inline
          def setTraits(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: any}
            */ typings.maximMazurokGapiClientSmartdevicemanagement.maximMazurokGapiClientSmartdevicemanagementStrings.GoogleHomeEnterpriseSdmV1Device & TopLevel[js.Any]
          ): Self = StObject.set(x, "traits", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTraitsUndefined: Self = StObject.set(x, "traits", js.undefined)
          
          @scala.inline
          def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        }
      }
      
      trait GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest extends StObject {
        
        /** The command name to execute, represented by the fully qualified protobuf message name. */
        var command: js.UndefOr[String] = js.undefined
        
        /** The command message to execute, represented as a Struct. */
        var params: js.UndefOr[
                /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ P in string ]: any}
          */ typings.maximMazurokGapiClientSmartdevicemanagement.maximMazurokGapiClientSmartdevicemanagementStrings.GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest & TopLevel[js.Any]
              ] = js.undefined
      }
      object GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest {
        
        @scala.inline
        def apply(): GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest]
        }
        
        @scala.inline
        implicit class GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequestMutableBuilder[Self <: GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
          
          @scala.inline
          def setParams(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: any}
            */ typings.maximMazurokGapiClientSmartdevicemanagement.maximMazurokGapiClientSmartdevicemanagementStrings.GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest & TopLevel[js.Any]
          ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
        }
      }
      
      trait GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse extends StObject {
        
        /** The results of executing the command. */
        var results: js.UndefOr[
                /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ P in string ]: any}
          */ typings.maximMazurokGapiClientSmartdevicemanagement.maximMazurokGapiClientSmartdevicemanagementStrings.GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse & TopLevel[js.Any]
              ] = js.undefined
      }
      object GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse {
        
        @scala.inline
        def apply(): GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse]
        }
        
        @scala.inline
        implicit class GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponseMutableBuilder[Self <: GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setResults(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: any}
            */ typings.maximMazurokGapiClientSmartdevicemanagement.maximMazurokGapiClientSmartdevicemanagementStrings.GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse & TopLevel[js.Any]
          ): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
        }
      }
      
      trait GoogleHomeEnterpriseSdmV1ListDevicesResponse extends StObject {
        
        /** The list of devices. */
        var devices: js.UndefOr[js.Array[GoogleHomeEnterpriseSdmV1Device]] = js.undefined
        
        /** The pagination token to retrieve the next page of results. */
        var nextPageToken: js.UndefOr[String] = js.undefined
      }
      object GoogleHomeEnterpriseSdmV1ListDevicesResponse {
        
        @scala.inline
        def apply(): GoogleHomeEnterpriseSdmV1ListDevicesResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleHomeEnterpriseSdmV1ListDevicesResponse]
        }
        
        @scala.inline
        implicit class GoogleHomeEnterpriseSdmV1ListDevicesResponseMutableBuilder[Self <: GoogleHomeEnterpriseSdmV1ListDevicesResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDevices(value: js.Array[GoogleHomeEnterpriseSdmV1Device]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
          
          @scala.inline
          def setDevicesVarargs(value: GoogleHomeEnterpriseSdmV1Device*): Self = StObject.set(x, "devices", js.Array(value :_*))
          
          @scala.inline
          def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        }
      }
      
      trait GoogleHomeEnterpriseSdmV1ListRoomsResponse extends StObject {
        
        /** The pagination token to retrieve the next page of results. If this field is omitted, there are no subsequent pages. */
        var nextPageToken: js.UndefOr[String] = js.undefined
        
        /** The list of rooms. */
        var rooms: js.UndefOr[js.Array[GoogleHomeEnterpriseSdmV1Room]] = js.undefined
      }
      object GoogleHomeEnterpriseSdmV1ListRoomsResponse {
        
        @scala.inline
        def apply(): GoogleHomeEnterpriseSdmV1ListRoomsResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleHomeEnterpriseSdmV1ListRoomsResponse]
        }
        
        @scala.inline
        implicit class GoogleHomeEnterpriseSdmV1ListRoomsResponseMutableBuilder[Self <: GoogleHomeEnterpriseSdmV1ListRoomsResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
          
          @scala.inline
          def setRooms(value: js.Array[GoogleHomeEnterpriseSdmV1Room]): Self = StObject.set(x, "rooms", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRoomsUndefined: Self = StObject.set(x, "rooms", js.undefined)
          
          @scala.inline
          def setRoomsVarargs(value: GoogleHomeEnterpriseSdmV1Room*): Self = StObject.set(x, "rooms", js.Array(value :_*))
        }
      }
      
      trait GoogleHomeEnterpriseSdmV1ListStructuresResponse extends StObject {
        
        /** The pagination token to retrieve the next page of results. If this field is omitted, there are no subsequent pages. */
        var nextPageToken: js.UndefOr[String] = js.undefined
        
        /** The list of structures. */
        var structures: js.UndefOr[js.Array[GoogleHomeEnterpriseSdmV1Structure]] = js.undefined
      }
      object GoogleHomeEnterpriseSdmV1ListStructuresResponse {
        
        @scala.inline
        def apply(): GoogleHomeEnterpriseSdmV1ListStructuresResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleHomeEnterpriseSdmV1ListStructuresResponse]
        }
        
        @scala.inline
        implicit class GoogleHomeEnterpriseSdmV1ListStructuresResponseMutableBuilder[Self <: GoogleHomeEnterpriseSdmV1ListStructuresResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
          
          @scala.inline
          def setStructures(value: js.Array[GoogleHomeEnterpriseSdmV1Structure]): Self = StObject.set(x, "structures", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setStructuresUndefined: Self = StObject.set(x, "structures", js.undefined)
          
          @scala.inline
          def setStructuresVarargs(value: GoogleHomeEnterpriseSdmV1Structure*): Self = StObject.set(x, "structures", js.Array(value :_*))
        }
      }
      
      trait GoogleHomeEnterpriseSdmV1ParentRelation extends StObject {
        
        /** Output only. The custom name of the relation -- e.g., structure/room where the device is assigned to. */
        var displayName: js.UndefOr[String] = js.undefined
        
        /**
          * Output only. The name of the relation -- e.g., structure/room where the device is assigned to. For example: "enterprises/XYZ/structures/ABC" or
          * "enterprises/XYZ/structures/ABC/rooms/123"
          */
        var parent: js.UndefOr[String] = js.undefined
      }
      object GoogleHomeEnterpriseSdmV1ParentRelation {
        
        @scala.inline
        def apply(): GoogleHomeEnterpriseSdmV1ParentRelation = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleHomeEnterpriseSdmV1ParentRelation]
        }
        
        @scala.inline
        implicit class GoogleHomeEnterpriseSdmV1ParentRelationMutableBuilder[Self <: GoogleHomeEnterpriseSdmV1ParentRelation] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
          
          @scala.inline
          def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
        }
      }
      
      trait GoogleHomeEnterpriseSdmV1Room extends StObject {
        
        /** Output only. The resource name of the room. For example: "enterprises/XYZ/structures/ABC/rooms/123". */
        var name: js.UndefOr[String] = js.undefined
        
        /** Room traits. */
        var traits: js.UndefOr[
                /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ P in string ]: any}
          */ typings.maximMazurokGapiClientSmartdevicemanagement.maximMazurokGapiClientSmartdevicemanagementStrings.GoogleHomeEnterpriseSdmV1Room & TopLevel[js.Any]
              ] = js.undefined
      }
      object GoogleHomeEnterpriseSdmV1Room {
        
        @scala.inline
        def apply(): GoogleHomeEnterpriseSdmV1Room = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleHomeEnterpriseSdmV1Room]
        }
        
        @scala.inline
        implicit class GoogleHomeEnterpriseSdmV1RoomMutableBuilder[Self <: GoogleHomeEnterpriseSdmV1Room] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          @scala.inline
          def setTraits(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: any}
            */ typings.maximMazurokGapiClientSmartdevicemanagement.maximMazurokGapiClientSmartdevicemanagementStrings.GoogleHomeEnterpriseSdmV1Room & TopLevel[js.Any]
          ): Self = StObject.set(x, "traits", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTraitsUndefined: Self = StObject.set(x, "traits", js.undefined)
        }
      }
      
      trait GoogleHomeEnterpriseSdmV1Structure extends StObject {
        
        /** Output only. The resource name of the structure. For example: "enterprises/XYZ/structures/ABC". */
        var name: js.UndefOr[String] = js.undefined
        
        /** Structure traits. */
        var traits: js.UndefOr[
                /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ P in string ]: any}
          */ typings.maximMazurokGapiClientSmartdevicemanagement.maximMazurokGapiClientSmartdevicemanagementStrings.GoogleHomeEnterpriseSdmV1Structure & TopLevel[js.Any]
              ] = js.undefined
      }
      object GoogleHomeEnterpriseSdmV1Structure {
        
        @scala.inline
        def apply(): GoogleHomeEnterpriseSdmV1Structure = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleHomeEnterpriseSdmV1Structure]
        }
        
        @scala.inline
        implicit class GoogleHomeEnterpriseSdmV1StructureMutableBuilder[Self <: GoogleHomeEnterpriseSdmV1Structure] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          @scala.inline
          def setTraits(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: any}
            */ typings.maximMazurokGapiClientSmartdevicemanagement.maximMazurokGapiClientSmartdevicemanagementStrings.GoogleHomeEnterpriseSdmV1Structure & TopLevel[js.Any]
          ): Self = StObject.set(x, "traits", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTraitsUndefined: Self = StObject.set(x, "traits", js.undefined)
        }
      }
      
      @js.native
      trait RoomsResource extends StObject {
        
        /** Gets a room managed by the enterprise. */
        def get(): Request[GoogleHomeEnterpriseSdmV1Room] = js.native
        def get(request: Alt): Request[GoogleHomeEnterpriseSdmV1Room] = js.native
        
        /** Lists rooms managed by the enterprise. */
        def list(): Request[GoogleHomeEnterpriseSdmV1ListRoomsResponse] = js.native
        def list(request: Fields): Request[GoogleHomeEnterpriseSdmV1ListRoomsResponse] = js.native
      }
      
      @js.native
      trait StructuresResource extends StObject {
        
        /** Gets a structure managed by the enterprise. */
        def get(): Request[GoogleHomeEnterpriseSdmV1Structure] = js.native
        def get(request: Alt): Request[GoogleHomeEnterpriseSdmV1Structure] = js.native
        
        /** Lists structures managed by the enterprise. */
        def list(): Request[GoogleHomeEnterpriseSdmV1ListStructuresResponse] = js.native
        def list(request: Callback): Request[GoogleHomeEnterpriseSdmV1ListStructuresResponse] = js.native
        
        var rooms: RoomsResource = js.native
      }
    }
  }
}
