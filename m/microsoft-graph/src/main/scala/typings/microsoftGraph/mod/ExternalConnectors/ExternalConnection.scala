package typings.microsoftGraph.mod.ExternalConnectors

import typings.microsoftGraph.mod.Entity
import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalConnection
  extends StObject
     with Entity {
  
  /**
    * Specifies additional application IDs that are allowed to manage the connection and to index content in the connection.
    * Optional.
    */
  var configuration: js.UndefOr[NullableOption[Configuration]] = js.undefined
  
  // Description of the connection displayed in the Microsoft 365 admin center. Optional.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  var groups: js.UndefOr[NullableOption[js.Array[ExternalGroup]]] = js.undefined
  
  var items: js.UndefOr[NullableOption[js.Array[ExternalItem]]] = js.undefined
  
  /**
    * The display name of the connection to be displayed in the Microsoft 365 admin center. Maximum length of 128 characters.
    * Required.
    */
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  var operations: js.UndefOr[NullableOption[js.Array[ConnectionOperation]]] = js.undefined
  
  var schema: js.UndefOr[NullableOption[Schema]] = js.undefined
  
  /**
    * Indicates the current state of the connection. Possible values are: draft, ready, obsolete, limitExceeded,
    * unknownFutureValue.
    */
  var state: js.UndefOr[NullableOption[ConnectionState]] = js.undefined
}
object ExternalConnection {
  
  inline def apply(): ExternalConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalConnection]
  }
  
  extension [Self <: ExternalConnection](x: Self) {
    
    inline def setConfiguration(value: NullableOption[Configuration]): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationNull: Self = StObject.set(x, "configuration", null)
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGroups(value: NullableOption[js.Array[ExternalGroup]]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsNull: Self = StObject.set(x, "groups", null)
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: ExternalGroup*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setItems(value: NullableOption[js.Array[ExternalItem]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsNull: Self = StObject.set(x, "items", null)
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ExternalItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOperations(value: NullableOption[js.Array[ConnectionOperation]]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsNull: Self = StObject.set(x, "operations", null)
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: ConnectionOperation*): Self = StObject.set(x, "operations", js.Array(value*))
    
    inline def setSchema(value: NullableOption[Schema]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaNull: Self = StObject.set(x, "schema", null)
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setState(value: NullableOption[ConnectionState]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
