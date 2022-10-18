package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataCountModeMod {
  
  /**
    * Different modes for retrieving the count of collections.
    * See:
    * 	sap.ui.model.ODataModel#bindList
    * 	sap.ui.model.ODataModel#constructor
    * 	sap.ui.model.v2.ODataModel#bindList
    * 	sap.ui.model.v2.ODataModel#constructor
    */
  @JSImport("sap/ui/model/odata/CountMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CountMode & String] = js.native
    
    /* "Both" */ val Both: typings.openui5.sapUiModelOdataCountModeMod.CountMode.Both & String = js.native
    
    /* "Inline" */ val Inline: typings.openui5.sapUiModelOdataCountModeMod.CountMode.Inline & String = js.native
    
    /* "InlineRepeat" */ val InlineRepeat: typings.openui5.sapUiModelOdataCountModeMod.CountMode.InlineRepeat & String = js.native
    
    /* "None" */ val None: typings.openui5.sapUiModelOdataCountModeMod.CountMode.None & String = js.native
    
    /* "Request" */ val Request: typings.openui5.sapUiModelOdataCountModeMod.CountMode.Request & String = js.native
  }
  
  @js.native
  sealed trait CountMode extends StObject
  /**
    * Different modes for retrieving the count of collections.
    * See:
    * 	sap.ui.model.ODataModel#bindList
    * 	sap.ui.model.ODataModel#constructor
    * 	sap.ui.model.v2.ODataModel#bindList
    * 	sap.ui.model.v2.ODataModel#constructor
    */
  @JSImport("sap/ui/model/odata/CountMode", "CountMode")
  @js.native
  object CountMode extends StObject {
    
    /**
      * @deprecated (since 1.43) - this shouldn't be used any longer, decide for one of the other modes.
      *
      * Count is retrieved by a separate request upfront and inline with each data request.
      *
      * The only purpose of this mode is to reflect the behavior of the {@link sap.ui.model.odata.ODataModel
      * ODataModel (v1)} before the introduction of the `CountMode`. For compatibility reasons, it is the default
      * for the `ODataModel` (v1) and shouldn't be used otherwise.
      */
    @js.native
    sealed trait Both
      extends StObject
         with CountMode
    
    /**
      * Count is retrieved by adding `$inlinecount=allpages` to data requests as long as no count has been determined
      * yet.
      */
    @js.native
    sealed trait Inline
      extends StObject
         with CountMode
    
    /**
      * Count is retrieved by adding `$inlinecount=allpages` to every data request.
      */
    @js.native
    sealed trait InlineRepeat
      extends StObject
         with CountMode
    
    /**
      * Count is not requested from the server.
      */
    @js.native
    sealed trait None
      extends StObject
         with CountMode
    
    /**
      * Count is retrieved by sending a separate `$count` request before requesting data.
      *
      * It depends on the concrete model implementation whether and how the `$count` request and the data request
      * are synchronized.
      */
    @js.native
    sealed trait Request
      extends StObject
         with CountMode
  }
}
