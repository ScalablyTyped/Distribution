package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCommonsLibraryMod.FormattedTextViewControl
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.AccessibleRole
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsFormattedTextViewMod {
  
  @JSImport("sap/ui/commons/FormattedTextView", JSImport.Default)
  @js.native
  /**
    * Constructor for a new FormattedTextView.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends FormattedTextView {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: FormattedTextViewSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: FormattedTextViewSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: FormattedTextViewSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/FormattedTextView", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.FormattedTextView with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Control.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FormattedTextView]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FormattedTextView],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.FormattedTextView.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait FormattedTextView
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some control to the aggregation {@link #getControls controls}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addControl(
      /**
      * The control to add; if empty, nothing is inserted
      */
    oControl: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the controls in the aggregation {@link #getControls controls}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyControls(): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAccessibleRole accessibleRole}.
      *
      * The ARIA role for the control.
      *
      * Default value is `Document`.
      *
      * @returns Value of property `accessibleRole`
      */
    def getAccessibleRole(): AccessibleRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleRole * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getControls controls}.
      *
      * Array of controls that should be replaced within htmlText.
      */
    def getControls(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getHtmlText htmlText}.
      *
      * Determines text with placeholders.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `htmlText`
      */
    def getHtmlText(): String = js.native
    
    /**
      * Indicates whether the FormattedTextView contains other controls.
      */
    def hasControls(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getControls controls}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfControl(
      /**
      * The control whose index is looked for
      */
    oControl: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Inserts a control into the aggregation {@link #getControls controls}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertControl(
      /**
      * The control to insert; if empty, nothing is inserted
      */
    oControl: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the control should be inserted at; for a negative value of `iIndex`, the control
      * is inserted at position 0; for a value greater than the current size of the aggregation, the control
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getControls controls}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllControls(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeControl(/**
      * The control to remove or its index or id
      */
    vControl: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a control from the aggregation {@link #getControls controls}.
      *
      * @returns The removed control or `null`
      */
    def removeControl(/**
      * The control to remove or its index or id
      */
    vControl: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeControl(
      /**
      * The control to remove or its index or id
      */
    vControl: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getAccessibleRole accessibleRole}.
      *
      * The ARIA role for the control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Document`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAccessibleRole(): this.type = js.native
    def setAccessibleRole(
      /**
      * New value for property `accessibleRole`
      */
    sAccessibleRole: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleRole * / any */ String
    ): this.type = js.native
    def setAccessibleRole(/**
      * New value for property `accessibleRole`
      */
    sAccessibleRole: AccessibleRole): this.type = js.native
    
    /**
      * Sets text with placeholders and given array of controls.
      */
    def setContent(
      /**
      * Contains the corresponding HTML text
      */
    sHtmlText: String,
      /**
      * Array of controls that should be used within given HTML text
      */
    aControls: FormattedTextViewControl
    ): Unit = js.native
    
    /**
      * Sets the HTML text to be displayed.
      */
    def setHtmlText(/**
      * HTML text as a string
      */
    sText: String): Unit = js.native
  }
  
  trait FormattedTextViewSettings
    extends StObject
       with ControlSettings {
    
    /**
      * The ARIA role for the control.
      */
    var accessibleRole: js.UndefOr[
        AccessibleRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleRole * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Array of controls that should be replaced within htmlText.
      */
    var controls: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines text with placeholders.
      */
    var htmlText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object FormattedTextViewSettings {
    
    inline def apply(): FormattedTextViewSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormattedTextViewSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormattedTextViewSettings] (val x: Self) extends AnyVal {
      
      inline def setAccessibleRole(
        value: AccessibleRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleRole * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "accessibleRole", value.asInstanceOf[js.Any])
      
      inline def setAccessibleRoleUndefined: Self = StObject.set(x, "accessibleRole", js.undefined)
      
      inline def setControls(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setControlsVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "controls", js.Array(value*))
      
      inline def setHtmlText(value: String | PropertyBindingInfo): Self = StObject.set(x, "htmlText", value.asInstanceOf[js.Any])
      
      inline def setHtmlTextUndefined: Self = StObject.set(x, "htmlText", js.undefined)
    }
  }
}
