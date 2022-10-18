package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataV2BatchModeMod {
  
  /**
    * @deprecated - Use {@link sap.ui.model.odata.CountMode} to specify how the count of collections is retrieved.
    * Use the `useBatch` parameter of the {@link sap.ui.model.odata.v2.ODataModel} constructor to specify whether
    * requests are sent in $batch.
    *
    * Different modes for retrieving the count of collections.
    */
  @JSImport("sap/ui/model/odata/v2/BatchMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BatchMode & String] = js.native
    
    /* "Group" */ val Group: typings.openui5.sapUiModelOdataV2BatchModeMod.BatchMode.Group & String = js.native
    
    /* "None" */ val None: typings.openui5.sapUiModelOdataV2BatchModeMod.BatchMode.None & String = js.native
  }
  
  @js.native
  sealed trait BatchMode extends StObject
  /**
    * @deprecated - Use {@link sap.ui.model.odata.CountMode} to specify how the count of collections is retrieved.
    * Use the `useBatch` parameter of the {@link sap.ui.model.odata.v2.ODataModel} constructor to specify whether
    * requests are sent in $batch.
    *
    * Different modes for retrieving the count of collections.
    */
  @JSImport("sap/ui/model/odata/v2/BatchMode", "BatchMode")
  @js.native
  object BatchMode extends StObject {
    
    /**
      * Batch grouping enabled
      */
    @js.native
    sealed trait Group
      extends StObject
         with BatchMode
    
    /**
      * No batch requests
      */
    @js.native
    sealed trait None
      extends StObject
         with BatchMode
  }
}
