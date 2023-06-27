package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.PopupInterface
import typings.openui5.sapUiMdcValuehelpBaseContainerMod.ContainerSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcValuehelpDialogMod {
  
  @JSImport("sap/ui/mdc/valuehelp/Dialog", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Dialog` container.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Dialog {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: DialogSettings) = this()
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
    mSettings: DialogSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: DialogSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_PopupInterface: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/valuehelp/Dialog", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.valuehelp.Dialog with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.mdc.valuehelp.base.Container.extend}.
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
    oClassInfo: ClassInfo[T, Dialog]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Dialog],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.valuehelp.Dialog.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Dialog
    extends typings.openui5.sapUiMdcValuehelpBaseContainerMod.default
       with PopupInterface {
    
    /**
      * Gets current value of property {@link #getGroupConfig groupConfig}.
      *
      * Configuration for groups (collective search).
      *
      * The object needs to contain an entry for every possible group. The labels of every group need to have
      * a structure of {@link sap.ui.mdc.valuehelp.content.GroupLabel}. If no configuration is provided a standard
      * text "search and select" is used.
      *
      * **Sample:**
      * ```javascript
      *
      * {
      * group1: {label: "Label 1", nnLabel: "Label 1 ({0})"},
      * group2: {label: "Label 2", nnLabel: "Label 2 ({0})"}
      * }
      * ```
      *
      *
      * Default value is `{}`.
      *
      * @returns Value of property `groupConfig`
      */
    def getGroupConfig(): js.Object = js.native
    
    /**
      * Sets a new value for property {@link #getGroupConfig groupConfig}.
      *
      * Configuration for groups (collective search).
      *
      * The object needs to contain an entry for every possible group. The labels of every group need to have
      * a structure of {@link sap.ui.mdc.valuehelp.content.GroupLabel}. If no configuration is provided a standard
      * text "search and select" is used.
      *
      * **Sample:**
      * ```javascript
      *
      * {
      * group1: {label: "Label 1", nnLabel: "Label 1 ({0})"},
      * group2: {label: "Label 2", nnLabel: "Label 2 ({0})"}
      * }
      * ```
      *
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `{}`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGroupConfig(): this.type = js.native
    def setGroupConfig(/**
      * New value for property `groupConfig`
      */
    oGroupConfig: js.Object): this.type = js.native
  }
  
  trait DialogSettings
    extends StObject
       with ContainerSettings {
    
    /**
      * Configuration for groups (collective search).
      *
      * The object needs to contain an entry for every possible group. The labels of every group need to have
      * a structure of {@link sap.ui.mdc.valuehelp.content.GroupLabel}. If no configuration is provided a standard
      * text "search and select" is used.
      *
      * **Sample:**
      * ```javascript
      *
      * {
      * group1: {label: "Label 1", nnLabel: "Label 1 ({0})"},
      * group2: {label: "Label 2", nnLabel: "Label 2 ({0})"}
      * }
      * ```
      */
    var groupConfig: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object DialogSettings {
    
    inline def apply(): DialogSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialogSettings] (val x: Self) extends AnyVal {
      
      inline def setGroupConfig(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "groupConfig", value.asInstanceOf[js.Any])
      
      inline def setGroupConfigUndefined: Self = StObject.set(x, "groupConfig", js.undefined)
    }
  }
  
  trait GroupLabel extends StObject {
    
    /**
      * Label with counter. The placeholder for counter needs to defined wihl `{0}`
      */
    var label: String
    
    /**
      * Label without counter
      */
    var nnLabel: String
  }
  object GroupLabel {
    
    inline def apply(label: String, nnLabel: String): GroupLabel = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], nnLabel = nnLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupLabel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GroupLabel] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setNnLabel(value: String): Self = StObject.set(x, "nnLabel", value.asInstanceOf[js.Any])
    }
  }
}
