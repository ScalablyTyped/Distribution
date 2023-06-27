package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataV4ValueListTypeMod {
  
  /**
    * @since 1.45.0
    *
    * Specifies the value list type of a property.
    * See:
    * 	sap.ui.model.odata.v4.ODataMetaModel#getValueListType
    */
  @JSImport("sap/ui/model/odata/v4/ValueListType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ValueListType & String] = js.native
    
    /* "Fixed" */ val Fixed: typings.openui5.sapUiModelOdataV4ValueListTypeMod.ValueListType.Fixed & String = js.native
    
    /* "None" */ val None: typings.openui5.sapUiModelOdataV4ValueListTypeMod.ValueListType.None & String = js.native
    
    /* "Standard" */ val Standard: typings.openui5.sapUiModelOdataV4ValueListTypeMod.ValueListType.Standard & String = js.native
  }
  
  @js.native
  sealed trait ValueListType extends StObject
  /**
    * @since 1.45.0
    *
    * Specifies the value list type of a property.
    * See:
    * 	sap.ui.model.odata.v4.ODataMetaModel#getValueListType
    */
  @JSImport("sap/ui/model/odata/v4/ValueListType", "ValueListType")
  @js.native
  object ValueListType extends StObject {
    
    /**
      * @since 1.45.0
      *
      * There is one enumeration of fixed values.
      */
    @js.native
    sealed trait Fixed
      extends StObject
         with ValueListType
    
    /**
      * @since 1.45.0
      *
      * There is no value list.
      */
    @js.native
    sealed trait None
      extends StObject
         with ValueListType
    
    /**
      * @since 1.45.0
      *
      * There is a dynamic value list with multiple queries including selection criteria.
      */
    @js.native
    sealed trait Standard
      extends StObject
         with ValueListType
  }
}
