package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcEnumsFieldDisplayMod {
  
  /**
    * @since 1.115
    *
    * Defines the output of a {@link sap.ui.mdc.Field Field}, {@link sap.ui.mdc.FilterField FilterField}, or
    * {@link sap.ui.mdc.MultiValueField MultiValueField} control.
    *
    * For the {@link sap.ui.mdc.Field Field} control, this enumeration defines how the `value` and `additionalValue`
    * properties are formatted.
    *
    * For the {@link sap.ui.mdc.MultiValueField MultiValueField} control, this enumeration defines how the
    * `key` and `description` properties of the items are formatted.
    *
    * For the {@link sap.ui.mdc.FilterField FilterField} control, this enumeration defines how key and description
    * of equal conditions are formatted.
    */
  @JSImport("sap/ui/mdc/enums/FieldDisplay", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FieldDisplay & String] = js.native
    
    /* "Description" */ val Description: typings.openui5.sapUiMdcEnumsFieldDisplayMod.FieldDisplay.Description & String = js.native
    
    /* "DescriptionValue" */ val DescriptionValue: typings.openui5.sapUiMdcEnumsFieldDisplayMod.FieldDisplay.DescriptionValue & String = js.native
    
    /* "Value" */ val Value: typings.openui5.sapUiMdcEnumsFieldDisplayMod.FieldDisplay.Value & String = js.native
    
    /* "ValueDescription" */ val ValueDescription: typings.openui5.sapUiMdcEnumsFieldDisplayMod.FieldDisplay.ValueDescription & String = js.native
  }
  
  @js.native
  sealed trait FieldDisplay extends StObject
  /**
    * @since 1.115
    *
    * Defines the output of a {@link sap.ui.mdc.Field Field}, {@link sap.ui.mdc.FilterField FilterField}, or
    * {@link sap.ui.mdc.MultiValueField MultiValueField} control.
    *
    * For the {@link sap.ui.mdc.Field Field} control, this enumeration defines how the `value` and `additionalValue`
    * properties are formatted.
    *
    * For the {@link sap.ui.mdc.MultiValueField MultiValueField} control, this enumeration defines how the
    * `key` and `description` properties of the items are formatted.
    *
    * For the {@link sap.ui.mdc.FilterField FilterField} control, this enumeration defines how key and description
    * of equal conditions are formatted.
    */
  @JSImport("sap/ui/mdc/enums/FieldDisplay", "FieldDisplay")
  @js.native
  object FieldDisplay extends StObject {
    
    /**
      * Only the description is displayed
      */
    @js.native
    sealed trait Description
      extends StObject
         with FieldDisplay
    
    /**
      * The description and the value (key) are displayed in the field. The value (key) is displayed after the
      * description in brackets.
      */
    @js.native
    sealed trait DescriptionValue
      extends StObject
         with FieldDisplay
    
    /**
      * Only the value (key) is displayed
      */
    @js.native
    sealed trait Value
      extends StObject
         with FieldDisplay
    
    /**
      * The value (key) and the description are displayed in the field. The description is displayed after the
      * value (key) in brackets.
      */
    @js.native
    sealed trait ValueDescription
      extends StObject
         with FieldDisplay
  }
}
