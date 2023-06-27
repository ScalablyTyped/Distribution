package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMButtonMod.ButtonSettings
import typings.openui5.sapMLibraryMod.IOverflowToolbarContent
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUxapLibraryMod.Importance
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUxapObjectPageHeaderActionButtonMod {
  
  @JSImport("sap/uxap/ObjectPageHeaderActionButton", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `ObjectPageHeaderActionButton`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ObjectPageHeaderActionButton {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ObjectPageHeaderActionButtonSettings) = this()
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
    mSettings: ObjectPageHeaderActionButtonSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ObjectPageHeaderActionButtonSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_m_IOverflowToolbarContent: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/uxap/ObjectPageHeaderActionButton", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.uxap.ObjectPageHeaderActionButton with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.Button.extend}.
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
    oClassInfo: ClassInfo[T, ObjectPageHeaderActionButton]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ObjectPageHeaderActionButton],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.uxap.ObjectPageHeaderActionButton.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ObjectPageHeaderActionButton
    extends typings.openui5.sapMButtonMod.default
       with IOverflowToolbarContent {
    
    /**
      * Gets current value of property {@link #getHideIcon hideIcon}.
      *
      * Hide the button icon when rendered into the headerTitle part of the ObjectPageLayout. This is useful
      * if you want to display texts only in the headerTitle part but still want to display text + icon in the
      * actionSheet that appears when not enough space is available on the screen for displaying all actions.
      *
      * Default value is `false`.
      *
      * @returns Value of property `hideIcon`
      */
    def getHideIcon(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHideText hideText}.
      *
      * Hide the button text when rendered into the headerTitle part of the ObjectPageLayout. This is useful
      * if you want to display icons only in the headerTitle part but still want to display text + icon in the
      * actionSheet that appears when not enough space is available on the screen for displaying all actions.
      *
      * Default value is `true`.
      *
      * @returns Value of property `hideText`
      */
    def getHideText(): Boolean = js.native
    
    /**
      * @since 1.34.0
      *
      * Gets current value of property {@link #getImportance importance}.
      *
      * Determines the order in which the button overflows.
      *
      * Default value is `High`.
      *
      * @returns Value of property `importance`
      */
    def getImportance(): Importance | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Importance * / any */ String) = js.native
    
    /**
      * Sets a new value for property {@link #getHideIcon hideIcon}.
      *
      * Hide the button icon when rendered into the headerTitle part of the ObjectPageLayout. This is useful
      * if you want to display texts only in the headerTitle part but still want to display text + icon in the
      * actionSheet that appears when not enough space is available on the screen for displaying all actions.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHideIcon(): this.type = js.native
    def setHideIcon(/**
      * New value for property `hideIcon`
      */
    bHideIcon: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHideText hideText}.
      *
      * Hide the button text when rendered into the headerTitle part of the ObjectPageLayout. This is useful
      * if you want to display icons only in the headerTitle part but still want to display text + icon in the
      * actionSheet that appears when not enough space is available on the screen for displaying all actions.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHideText(): this.type = js.native
    def setHideText(/**
      * New value for property `hideText`
      */
    bHideText: Boolean): this.type = js.native
    
    /**
      * @since 1.34.0
      *
      * Sets a new value for property {@link #getImportance importance}.
      *
      * Determines the order in which the button overflows.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `High`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setImportance(): this.type = js.native
    def setImportance(
      /**
      * New value for property `importance`
      */
    sImportance: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Importance * / any */ String
    ): this.type = js.native
    def setImportance(/**
      * New value for property `importance`
      */
    sImportance: Importance): this.type = js.native
  }
  
  trait ObjectPageHeaderActionButtonSettings
    extends StObject
       with ButtonSettings {
    
    /**
      * Hide the button icon when rendered into the headerTitle part of the ObjectPageLayout. This is useful
      * if you want to display texts only in the headerTitle part but still want to display text + icon in the
      * actionSheet that appears when not enough space is available on the screen for displaying all actions.
      */
    var hideIcon: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Hide the button text when rendered into the headerTitle part of the ObjectPageLayout. This is useful
      * if you want to display icons only in the headerTitle part but still want to display text + icon in the
      * actionSheet that appears when not enough space is available on the screen for displaying all actions.
      */
    var hideText: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.34.0
      *
      * Determines the order in which the button overflows.
      */
    var importance: js.UndefOr[
        Importance | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Importance * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object ObjectPageHeaderActionButtonSettings {
    
    inline def apply(): ObjectPageHeaderActionButtonSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectPageHeaderActionButtonSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectPageHeaderActionButtonSettings] (val x: Self) extends AnyVal {
      
      inline def setHideIcon(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "hideIcon", value.asInstanceOf[js.Any])
      
      inline def setHideIconUndefined: Self = StObject.set(x, "hideIcon", js.undefined)
      
      inline def setHideText(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "hideText", value.asInstanceOf[js.Any])
      
      inline def setHideTextUndefined: Self = StObject.set(x, "hideText", js.undefined)
      
      inline def setImportance(
        value: Importance | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Importance * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
      
      inline def setImportanceUndefined: Self = StObject.set(x, "importance", js.undefined)
    }
  }
}
