package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.TitleLevel
import typings.openui5.sapUxapLibraryMod.Importance
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUxapObjectPageSectionBaseMod {
  
  @JSImport("sap/uxap/ObjectPageSectionBase", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `ObjectPageSectionBase`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ObjectPageSectionBase {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ObjectPageSectionBaseSettings) = this()
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
    mSettings: ObjectPageSectionBaseSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ObjectPageSectionBaseSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/uxap/ObjectPageSectionBase", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.uxap.ObjectPageSectionBase with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, ObjectPageSectionBase]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ObjectPageSectionBase],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.uxap.ObjectPageSectionBase.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ObjectPageSectionBase
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Explicitly ask to connect to the UI5 model tree
      */
    def connectToModels(): Unit = js.native
    
    /**
      * Destroys the customAnchorBarButton in the aggregation {@link #getCustomAnchorBarButton customAnchorBarButton}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCustomAnchorBarButton(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getCustomAnchorBarButton customAnchorBarButton}.
      *
      * The custom button that will provide a link to the section in the ObjectPageLayout anchor bar. This button
      * will be used as a custom template to be into the ObjectPageLayout anchorBar area, therefore property
      * changes happening on this button template after the first rendering won't affect the actual button copy
      * used in the anchorBar.
      *
      * If you want to change some of the button properties, you would need to bind them to a model.
      */
    def getCustomAnchorBarButton(): typings.openui5.sapMButtonMod.default = js.native
    
    /**
      * @SINCE 1.32.0
      *
      * Gets current value of property {@link #getImportance importance}.
      *
      * Determines whether the section will be hidden on low resolutions.
      *
      * Default value is `High`.
      *
      * @returns Value of property `importance`
      */
    def getImportance(): Importance | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Importance * / any */ String) = js.native
    
    /**
      * Returns the control name text.
      *
      * To be overwritten by the specific control method.
      *
      * @returns control name text
      */
    def getSectionText(): String = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Defines the title of the respective section/subsection.
      *
      * **Note:** If a subsection is the only one (or the only one visible) within a section, its title is displayed
      * instead of the section title. This behavior is true even if the `showTitle` propeprty of {@link sap.uxap.ObjectPageSubSection}
      * is set to `false`.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * @SINCE 1.44.0
      *
      * Gets current value of property {@link #getTitleLevel titleLevel}.
      *
      * Determines the ARIA level of the `ObjectPageSectionBase` title. The ARIA level is used by assisting technologies,
      * such as screen readers, to create a hierarchical site map for faster navigation.
      *
      * **Note:** Defining a `titleLevel` will add `aria-level` attribute from 1 to 6, instead of changing the
      * `ObjectPageSectionBase` title HTML tag from H1 to H6.
      * For example: if `titleLevel` is `TitleLevel.H1`, it will result as aria-level of 1 added to the `ObjectPageSectionBase`
      * title.
      *
      * Default value is `Auto`.
      *
      * @returns Value of property `titleLevel`
      */
    def getTitleLevel(): TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) = js.native
    
    /**
      * Sets the aggregated {@link #getCustomAnchorBarButton customAnchorBarButton}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCustomAnchorBarButton(
      /**
      * The customAnchorBarButton to set
      */
    oCustomAnchorBarButton: typings.openui5.sapMButtonMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.32.0
      *
      * Sets a new value for property {@link #getImportance importance}.
      *
      * Determines whether the section will be hidden on low resolutions.
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
    
    /**
      * Returns the DOM Element that should get the focus.
      *
      * To be overwritten by the specific control method.
      *
      * @returns this for chaining
      */
    def setInvisibleTextLabelValue(): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Defines the title of the respective section/subsection.
      *
      * **Note:** If a subsection is the only one (or the only one visible) within a section, its title is displayed
      * instead of the section title. This behavior is true even if the `showTitle` propeprty of {@link sap.uxap.ObjectPageSubSection}
      * is set to `false`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(): this.type = js.native
    def setTitle(/**
      * New value for property `title`
      */
    sTitle: String): this.type = js.native
    
    /**
      * @SINCE 1.44.0
      *
      * Sets a new value for property {@link #getTitleLevel titleLevel}.
      *
      * Determines the ARIA level of the `ObjectPageSectionBase` title. The ARIA level is used by assisting technologies,
      * such as screen readers, to create a hierarchical site map for faster navigation.
      *
      * **Note:** Defining a `titleLevel` will add `aria-level` attribute from 1 to 6, instead of changing the
      * `ObjectPageSectionBase` title HTML tag from H1 to H6.
      * For example: if `titleLevel` is `TitleLevel.H1`, it will result as aria-level of 1 added to the `ObjectPageSectionBase`
      * title.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Auto`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleLevel(): this.type = js.native
    def setTitleLevel(
      /**
      * New value for property `titleLevel`
      */
    sTitleLevel: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String
    ): this.type = js.native
    def setTitleLevel(/**
      * New value for property `titleLevel`
      */
    sTitleLevel: TitleLevel): this.type = js.native
  }
  
  trait ObjectPageSectionBaseSettings
    extends StObject
       with ControlSettings {
    
    /**
      * The custom button that will provide a link to the section in the ObjectPageLayout anchor bar. This button
      * will be used as a custom template to be into the ObjectPageLayout anchorBar area, therefore property
      * changes happening on this button template after the first rendering won't affect the actual button copy
      * used in the anchorBar.
      *
      * If you want to change some of the button properties, you would need to bind them to a model.
      */
    var customAnchorBarButton: js.UndefOr[typings.openui5.sapMButtonMod.default] = js.undefined
    
    /**
      * @SINCE 1.32.0
      *
      * Determines whether the section will be hidden on low resolutions.
      */
    var importance: js.UndefOr[
        Importance | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Importance * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the title of the respective section/subsection.
      *
      * **Note:** If a subsection is the only one (or the only one visible) within a section, its title is displayed
      * instead of the section title. This behavior is true even if the `showTitle` propeprty of {@link sap.uxap.ObjectPageSubSection}
      * is set to `false`.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.44.0
      *
      * Determines the ARIA level of the `ObjectPageSectionBase` title. The ARIA level is used by assisting technologies,
      * such as screen readers, to create a hierarchical site map for faster navigation.
      *
      * **Note:** Defining a `titleLevel` will add `aria-level` attribute from 1 to 6, instead of changing the
      * `ObjectPageSectionBase` title HTML tag from H1 to H6.
      * For example: if `titleLevel` is `TitleLevel.H1`, it will result as aria-level of 1 added to the `ObjectPageSectionBase`
      * title.
      */
    var titleLevel: js.UndefOr[
        TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object ObjectPageSectionBaseSettings {
    
    inline def apply(): ObjectPageSectionBaseSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectPageSectionBaseSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectPageSectionBaseSettings] (val x: Self) extends AnyVal {
      
      inline def setCustomAnchorBarButton(value: typings.openui5.sapMButtonMod.default): Self = StObject.set(x, "customAnchorBarButton", value.asInstanceOf[js.Any])
      
      inline def setCustomAnchorBarButtonUndefined: Self = StObject.set(x, "customAnchorBarButton", js.undefined)
      
      inline def setImportance(
        value: Importance | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Importance * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
      
      inline def setImportanceUndefined: Self = StObject.set(x, "importance", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleLevel(
        value: TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "titleLevel", value.asInstanceOf[js.Any])
      
      inline def setTitleLevelUndefined: Self = StObject.set(x, "titleLevel", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
