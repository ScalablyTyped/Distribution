package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataMessageScopeMod {
  
  /**
    * Different scopes for retrieving messages from a service consumed via a {@link sap.ui.model.odata.v2.ODataModel}.
    * See:
    * 	sap.ui.model.ODataModel#constructor
    */
  @JSImport("sap/ui/model/odata/MessageScope", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MessageScope & String] = js.native
    
    /* "BusinessObject" */ val BusinessObject: typings.openui5.sapUiModelOdataMessageScopeMod.MessageScope.BusinessObject & String = js.native
    
    /* "RequestedObjects" */ val RequestedObjects: typings.openui5.sapUiModelOdataMessageScopeMod.MessageScope.RequestedObjects & String = js.native
  }
  
  @js.native
  sealed trait MessageScope extends StObject
  /**
    * Different scopes for retrieving messages from a service consumed via a {@link sap.ui.model.odata.v2.ODataModel}.
    * See:
    * 	sap.ui.model.ODataModel#constructor
    */
  @JSImport("sap/ui/model/odata/MessageScope", "MessageScope")
  @js.native
  object MessageScope extends StObject {
    
    /**
      * Retrieve messages for the requested or changed entities and for all their child entities that belong
      * to the same business object. The service needs to set the OData V2 annotation "message-scope-supported"
      * at the `EntityContainer` to `true`. If the service does set this OData V2 annotation, the OData model
      * falls back to `sap.ui.model.odata.MessageScope.RequestedObjects`.
      */
    @js.native
    sealed trait BusinessObject
      extends StObject
         with MessageScope
    
    /**
      * Retrieve messages only for the requested or changed entities.
      */
    @js.native
    sealed trait RequestedObjects
      extends StObject
         with MessageScope
  }
}
