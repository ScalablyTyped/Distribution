package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUxapLibraryMod.IHeaderContent
import typings.openui5.sapUxapLibraryMod.ObjectPageHeaderDesign
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUxapObjectPageHeaderContentMod {
  
  @JSImport("sap/uxap/ObjectPageHeaderContent", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `ObjectPageHeaderContent`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/snapping-header/#header-content Object Page
    * Header Content}
    */
  open class default () extends ObjectPageHeaderContent {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ObjectPageHeaderContentSettings) = this()
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
    mSettings: ObjectPageHeaderContentSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ObjectPageHeaderContentSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_uxap_IHeaderContent: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/uxap/ObjectPageHeaderContent", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.uxap.ObjectPageHeaderContent with name `sClassName` and enriches
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
    oClassInfo: ClassInfo[T, ObjectPageHeaderContent]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ObjectPageHeaderContent],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.uxap.ObjectPageHeaderContent.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ObjectPageHeaderContent
    extends typings.openui5.sapUiCoreControlMod.default
       with IHeaderContent {
    
    /**
      * Adds some content to the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addContent(
      /**
      * The content to add; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * The list of Objects of type sap.ui.core.Control.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @deprecated (since 1.40.1)
      *
      * Gets current value of property {@link #getContentDesign contentDesign}.
      *
      * Determines the design of the header - Light or Dark. **Note: **This property is deprecated. It will continue
      * to work in the Blue Crystal theme, but it will not be taken into account for the Belize themes.
      *
      * Default value is `Light`.
      *
      * @returns Value of property `contentDesign`
      */
    def getContentDesign(): ObjectPageHeaderDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectPageHeaderDesign * / any */ String) = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getContent content}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfContent(
      /**
      * The content whose index is looked for
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Inserts a content into the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertContent(
      /**
      * The content to insert; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the content should be inserted at; for a negative value of `iIndex`, the content
      * is inserted at position 0; for a value greater than the current size of the aggregation, the content
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getContent content}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a content from the aggregation {@link #getContent content}.
      *
      * @returns The removed content or `null`
      */
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeContent(
      /**
      * The content to remove or its index or id
      */
    vContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * @deprecated (since 1.40.1)
      *
      * Sets a new value for property {@link #getContentDesign contentDesign}.
      *
      * Determines the design of the header - Light or Dark. **Note: **This property is deprecated. It will continue
      * to work in the Blue Crystal theme, but it will not be taken into account for the Belize themes.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Light`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContentDesign(): this.type = js.native
    def setContentDesign(
      /**
      * New value for property `contentDesign`
      */
    sContentDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectPageHeaderDesign * / any */ String
    ): this.type = js.native
    def setContentDesign(/**
      * New value for property `contentDesign`
      */
    sContentDesign: ObjectPageHeaderDesign): this.type = js.native
  }
  
  trait ObjectPageHeaderContentSettings
    extends StObject
       with ControlSettings {
    
    /**
      * The list of Objects of type sap.ui.core.Control.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.40.1)
      *
      * Determines the design of the header - Light or Dark. **Note: **This property is deprecated. It will continue
      * to work in the Blue Crystal theme, but it will not be taken into account for the Belize themes.
      */
    var contentDesign: js.UndefOr[
        ObjectPageHeaderDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectPageHeaderDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object ObjectPageHeaderContentSettings {
    
    inline def apply(): ObjectPageHeaderContentSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectPageHeaderContentSettings]
    }
    
    extension [Self <: ObjectPageHeaderContentSettings](x: Self) {
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentDesign(
        value: ObjectPageHeaderDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectPageHeaderDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "contentDesign", value.asInstanceOf[js.Any])
      
      inline def setContentDesignUndefined: Self = StObject.set(x, "contentDesign", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
    }
  }
}
