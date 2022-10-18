package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataV4SubmitModeMod {
  
  /**
    * Modes to control the use of batch requests for a group ID.
    */
  @JSImport("sap/ui/model/odata/v4/SubmitMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SubmitMode & String] = js.native
    
    /* "API" */ val API: typings.openui5.sapUiModelOdataV4SubmitModeMod.SubmitMode.API & String = js.native
    
    /* "Auto" */ val Auto: typings.openui5.sapUiModelOdataV4SubmitModeMod.SubmitMode.Auto & String = js.native
    
    /* "Direct" */ val Direct: typings.openui5.sapUiModelOdataV4SubmitModeMod.SubmitMode.Direct & String = js.native
  }
  
  @js.native
  sealed trait SubmitMode extends StObject
  /**
    * Modes to control the use of batch requests for a group ID.
    */
  @JSImport("sap/ui/model/odata/v4/SubmitMode", "SubmitMode")
  @js.native
  object SubmitMode extends StObject {
    
    /**
      * Requests associated with the group ID are sent in a batch request via {@link sap.ui.model.odata.v4.ODataModel#submitBatch}.
      */
    @js.native
    sealed trait API
      extends StObject
         with SubmitMode
    
    /**
      * Requests associated with the group ID are sent in a batch request which is triggered automatically before
      * rendering.
      */
    @js.native
    sealed trait Auto
      extends StObject
         with SubmitMode
    
    /**
      * Requests associated with the group ID are sent directly without batch.
      */
    @js.native
    sealed trait Direct
      extends StObject
         with SubmitMode
  }
}
