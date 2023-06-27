package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcEnumsFieldEditModeMod {
  
  /**
    * @since 1.115
    *
    * Defines in what mode a {@link sap.ui.mdc.Field Field}, {@link sap.ui.mdc.FilterField FilterField} or
    * {@link sap.ui.mdc.MultiValueField MultiValueField} is rendered.
    */
  @JSImport("sap/ui/mdc/enums/FieldEditMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FieldEditMode & String] = js.native
    
    /* "Disabled" */ val Disabled: typings.openui5.sapUiMdcEnumsFieldEditModeMod.FieldEditMode.Disabled & String = js.native
    
    /* "Display" */ val Display: typings.openui5.sapUiMdcEnumsFieldEditModeMod.FieldEditMode.Display & String = js.native
    
    /* "Editable" */ val Editable: typings.openui5.sapUiMdcEnumsFieldEditModeMod.FieldEditMode.Editable & String = js.native
    
    /* "EditableDisplay" */ val EditableDisplay: typings.openui5.sapUiMdcEnumsFieldEditModeMod.FieldEditMode.EditableDisplay & String = js.native
    
    /* "EditableReadOnly" */ val EditableReadOnly: typings.openui5.sapUiMdcEnumsFieldEditModeMod.FieldEditMode.EditableReadOnly & String = js.native
    
    /* "ReadOnly" */ val ReadOnly: typings.openui5.sapUiMdcEnumsFieldEditModeMod.FieldEditMode.ReadOnly & String = js.native
  }
  
  @js.native
  sealed trait FieldEditMode extends StObject
  /**
    * @since 1.115
    *
    * Defines in what mode a {@link sap.ui.mdc.Field Field}, {@link sap.ui.mdc.FilterField FilterField} or
    * {@link sap.ui.mdc.MultiValueField MultiValueField} is rendered.
    */
  @JSImport("sap/ui/mdc/enums/FieldEditMode", "FieldEditMode")
  @js.native
  object FieldEditMode extends StObject {
    
    /**
      * {@link sap.ui.mdc.Field Field}, {@link sap.ui.mdc.FilterField FilterField} or {@link sap.ui.mdc.MultiValueField MultiValueField }
      * is rendered in disabled mode
      */
    @js.native
    sealed trait Disabled
      extends StObject
         with FieldEditMode
    
    /**
      * {@link sap.ui.mdc.Field Field}, {@link sap.ui.mdc.FilterField FilterField} or {@link sap.ui.mdc.MultiValueField MultiValueField }
      * is rendered in display mode
      */
    @js.native
    sealed trait Display
      extends StObject
         with FieldEditMode
    
    /**
      * {@link sap.ui.mdc.Field Field}, {@link sap.ui.mdc.FilterField FilterField} or {@link sap.ui.mdc.MultiValueField MultiValueField }
      * is rendered in editable mode
      */
    @js.native
    sealed trait Editable
      extends StObject
         with FieldEditMode
    
    /**
      * If more than one control is rendered by the {@link sap.ui.mdc.Field Field}, {@link sap.ui.mdc.FilterField FilterField }
      * or {@link sap.ui.mdc.MultiValueField MultiValueField} control, the first part is editable, and the other
      * parts are in display mode.
      */
    @js.native
    sealed trait EditableDisplay
      extends StObject
         with FieldEditMode
    
    /**
      * If more than one control is rendered by the {@link sap.ui.mdc.Field Field}, {@link sap.ui.mdc.FilterField FilterField }
      * or {@link sap.ui.mdc.MultiValueField MultiValueField} control, the first part is editable, and the other
      * parts are read-only.
      */
    @js.native
    sealed trait EditableReadOnly
      extends StObject
         with FieldEditMode
    
    /**
      * {@link sap.ui.mdc.Field Field}, {@link sap.ui.mdc.FilterField FilterField} or {@link sap.ui.mdc.MultiValueField MultiValueField }
      * is rendered in read-only mode
      */
    @js.native
    sealed trait ReadOnly
      extends StObject
         with FieldEditMode
  }
}
