package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTableRowSettingsMod {
  
  @JSImport("sap/ui/table/RowSettings", JSImport.Default)
  @js.native
  /**
    * Constructor for new RowSettings.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends RowSettings {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: RowSettingsSettings) = this()
    def this(/**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: RowSettingsSettings
    ) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: RowSettingsSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/table/RowSettings", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.table.RowSettings with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Element.extend}.
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
    oClassInfo: ClassInfo[T, RowSettings]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, RowSettings],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.table.RowSettings.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait RowSettings
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * @SINCE 1.48.0
      *
      * Gets current value of property {@link #getHighlight highlight}.
      *
      * The highlight state of the rows.
      *
      * If the highlight is set to {@link sap.ui.core.MessageType sap.ui.core.MessageType.None} (default), no
      * highlights are visible. Valid values for the `highlight` property are values of the enumerations {@link
      * sap.ui.core.MessageType} or {@link sap.ui.core.IndicationColor}.
      *
      * Accessibility support is provided through the associated {@link sap.ui.table.RowSettings#setHighlightText
      * highlightText} property. If the `highlight` property is set to a value of {@link sap.ui.core.MessageType},
      * the `highlightText` property does not need to be set because a default text is used. However, the default
      * text can be overridden by setting the `highlightText` property. In all other cases the `highlightText`
      * property must be set.
      *
      * Default value is `"None"`.
      *
      * @returns Value of property `highlight`
      */
    def getHighlight(): String = js.native
    
    /**
      * @SINCE 1.62
      *
      * Gets current value of property {@link #getHighlightText highlightText}.
      *
      * Defines the semantics of the {@link sap.ui.table.RowSettings#setHighlight highlight} property for accessibility
      * purposes. It is only used as an invisible text for screen reader support and does not add a tooltip to
      * the highlight.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `highlightText`
      */
    def getHighlightText(): String = js.native
    
    /**
      * @SINCE 1.72
      *
      * Gets current value of property {@link #getNavigated navigated}.
      *
      * The navigated state of a row.
      *
      * If set to `true`, a navigation indicator is displayed at the end of the row. **Note:** This property
      * must be set for **one** row only.
      *
      * Default value is `false`.
      *
      * @returns Value of property `navigated`
      */
    def getNavigated(): Boolean = js.native
    
    /**
      * @SINCE 1.48.0
      *
      * Sets a new value for property {@link #getHighlight highlight}.
      *
      * The highlight state of the rows.
      *
      * If the highlight is set to {@link sap.ui.core.MessageType sap.ui.core.MessageType.None} (default), no
      * highlights are visible. Valid values for the `highlight` property are values of the enumerations {@link
      * sap.ui.core.MessageType} or {@link sap.ui.core.IndicationColor}.
      *
      * Accessibility support is provided through the associated {@link sap.ui.table.RowSettings#setHighlightText
      * highlightText} property. If the `highlight` property is set to a value of {@link sap.ui.core.MessageType},
      * the `highlightText` property does not need to be set because a default text is used. However, the default
      * text can be overridden by setting the `highlightText` property. In all other cases the `highlightText`
      * property must be set.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"None"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHighlight(): this.type = js.native
    def setHighlight(/**
      * New value for property `highlight`
      */
    sHighlight: String): this.type = js.native
    
    /**
      * @SINCE 1.62
      *
      * Sets a new value for property {@link #getHighlightText highlightText}.
      *
      * Defines the semantics of the {@link sap.ui.table.RowSettings#setHighlight highlight} property for accessibility
      * purposes. It is only used as an invisible text for screen reader support and does not add a tooltip to
      * the highlight.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHighlightText(): this.type = js.native
    def setHighlightText(/**
      * New value for property `highlightText`
      */
    sHighlightText: String): this.type = js.native
    
    /**
      * @SINCE 1.72
      *
      * Sets a new value for property {@link #getNavigated navigated}.
      *
      * The navigated state of a row.
      *
      * If set to `true`, a navigation indicator is displayed at the end of the row. **Note:** This property
      * must be set for **one** row only.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNavigated(): this.type = js.native
    def setNavigated(/**
      * New value for property `navigated`
      */
    bNavigated: Boolean): this.type = js.native
  }
  
  trait RowSettingsSettings
    extends StObject
       with ElementSettings {
    
    /**
      * @SINCE 1.48.0
      *
      * The highlight state of the rows.
      *
      * If the highlight is set to {@link sap.ui.core.MessageType sap.ui.core.MessageType.None} (default), no
      * highlights are visible. Valid values for the `highlight` property are values of the enumerations {@link
      * sap.ui.core.MessageType} or {@link sap.ui.core.IndicationColor}.
      *
      * Accessibility support is provided through the associated {@link sap.ui.table.RowSettings#setHighlightText
      * highlightText} property. If the `highlight` property is set to a value of {@link sap.ui.core.MessageType},
      * the `highlightText` property does not need to be set because a default text is used. However, the default
      * text can be overridden by setting the `highlightText` property. In all other cases the `highlightText`
      * property must be set.
      */
    var highlight: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.62
      *
      * Defines the semantics of the {@link sap.ui.table.RowSettings#setHighlight highlight} property for accessibility
      * purposes. It is only used as an invisible text for screen reader support and does not add a tooltip to
      * the highlight.
      */
    var highlightText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.72
      *
      * The navigated state of a row.
      *
      * If set to `true`, a navigation indicator is displayed at the end of the row. **Note:** This property
      * must be set for **one** row only.
      */
    var navigated: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object RowSettingsSettings {
    
    inline def apply(): RowSettingsSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowSettingsSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowSettingsSettings] (val x: Self) extends AnyVal {
      
      inline def setHighlight(value: String | PropertyBindingInfo): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      inline def setHighlightText(value: String | PropertyBindingInfo): Self = StObject.set(x, "highlightText", value.asInstanceOf[js.Any])
      
      inline def setHighlightTextUndefined: Self = StObject.set(x, "highlightText", js.undefined)
      
      inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      inline def setNavigated(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "navigated", value.asInstanceOf[js.Any])
      
      inline def setNavigatedUndefined: Self = StObject.set(x, "navigated", js.undefined)
    }
  }
}
