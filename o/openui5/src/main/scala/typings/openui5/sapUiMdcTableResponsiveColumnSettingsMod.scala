package typings.openui5

import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiCoreLibraryMod.Priority
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcTableResponsiveColumnSettingsMod {
  
  @JSImport("sap/ui/mdc/table/ResponsiveColumnSettings", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `ResponsiveColumnSettings`.
    *
    * Provides the following settings that are supported by the {@link sap.m.Column}:
    *
    *
    * 	 - importance
    * 	 - mergeFunction
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ResponsiveColumnSettings {
    def this(/**
      * Initial settings for the new object
      */
    mSettings: ResponsiveColumnSettingsSettings) = this()
    def this(/**
      * Optional ID for the new object; generated automatically if no non-empty ID is given
      */
    sId: String) = this()
    def this(
      /**
      * Optional ID for the new object; generated automatically if no non-empty ID is given
      */
    sId: String,
      /**
      * Initial settings for the new object
      */
    mSettings: ResponsiveColumnSettingsSettings
    ) = this()
    def this(
      /**
      * Optional ID for the new object; generated automatically if no non-empty ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new object
      */
    mSettings: ResponsiveColumnSettingsSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/table/ResponsiveColumnSettings", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a metadata object for class sap.ui.mdc.table.ResponsiveColumnSettings.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ResponsiveColumnSettings
    extends typings.openui5.sapUiMdcTableColumnSettingsMod.default {
    
    /**
      * @since 1.110
      *
      * Gets current value of property {@link #getImportance importance}.
      *
      * Defines the column importance.
      *
      * The column importance is taken into consideration for calculating the `minScreenWidth` property and for
      * setting the `demandPopin` property of the column. See {@link sap.m.Table#getAutoPopinMode} for more details,
      * which is automatically set to `true`.
      *
      * Default value is `"None"`.
      *
      * @returns Value of property `importance`
      */
    def getImportance(): Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String) = js.native
    
    /**
      * @since 1.110
      *
      * Gets current value of property {@link #getMergeFunction mergeFunction}.
      *
      * Defines the control serialization function to merge duplicate cells into one cell block. The control
      * itself uses this function to compare values of two duplicate cells.
      *
      * **Note:** Providing this property will automatically set {@link sap.m.Column#getMergeDuplicates} to `true`,
      * and the property itself is mapped to {@link sap.m.Column#getMergeFunctionName} of the inner column. Don't
      * set this property for cells for which the content provides a user interaction, such as `sap.m.Link`.
      *
      * @returns Value of property `mergeFunction`
      */
    def getMergeFunction(): String = js.native
    
    /**
      * @since 1.110
      *
      * Sets a new value for property {@link #getImportance importance}.
      *
      * Defines the column importance.
      *
      * The column importance is taken into consideration for calculating the `minScreenWidth` property and for
      * setting the `demandPopin` property of the column. See {@link sap.m.Table#getAutoPopinMode} for more details,
      * which is automatically set to `true`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"None"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setImportance(): this.type = js.native
    def setImportance(
      /**
      * New value for property `importance`
      */
    sImportance: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String
    ): this.type = js.native
    def setImportance(/**
      * New value for property `importance`
      */
    sImportance: Priority): this.type = js.native
    
    /**
      * @since 1.110
      *
      * Sets a new value for property {@link #getMergeFunction mergeFunction}.
      *
      * Defines the control serialization function to merge duplicate cells into one cell block. The control
      * itself uses this function to compare values of two duplicate cells.
      *
      * **Note:** Providing this property will automatically set {@link sap.m.Column#getMergeDuplicates} to `true`,
      * and the property itself is mapped to {@link sap.m.Column#getMergeFunctionName} of the inner column. Don't
      * set this property for cells for which the content provides a user interaction, such as `sap.m.Link`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMergeFunction(/**
      * New value for property `mergeFunction`
      */
    sMergeFunction: String): this.type = js.native
  }
  
  trait ResponsiveColumnSettingsSettings
    extends StObject
       with ElementSettings {
    
    /**
      * @since 1.110
      *
      * Defines the column importance.
      *
      * The column importance is taken into consideration for calculating the `minScreenWidth` property and for
      * setting the `demandPopin` property of the column. See {@link sap.m.Table#getAutoPopinMode} for more details,
      * which is automatically set to `true`.
      */
    var importance: js.UndefOr[
        Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @since 1.110
      *
      * Defines the control serialization function to merge duplicate cells into one cell block. The control
      * itself uses this function to compare values of two duplicate cells.
      *
      * **Note:** Providing this property will automatically set {@link sap.m.Column#getMergeDuplicates} to `true`,
      * and the property itself is mapped to {@link sap.m.Column#getMergeFunctionName} of the inner column. Don't
      * set this property for cells for which the content provides a user interaction, such as `sap.m.Link`.
      */
    var mergeFunction: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object ResponsiveColumnSettingsSettings {
    
    inline def apply(): ResponsiveColumnSettingsSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveColumnSettingsSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResponsiveColumnSettingsSettings] (val x: Self) extends AnyVal {
      
      inline def setImportance(
        value: Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
      
      inline def setImportanceUndefined: Self = StObject.set(x, "importance", js.undefined)
      
      inline def setMergeFunction(value: String | PropertyBindingInfo): Self = StObject.set(x, "mergeFunction", value.asInstanceOf[js.Any])
      
      inline def setMergeFunctionUndefined: Self = StObject.set(x, "mergeFunction", js.undefined)
    }
  }
}
