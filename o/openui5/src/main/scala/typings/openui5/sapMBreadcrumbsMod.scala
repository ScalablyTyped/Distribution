package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.BreadcrumbsSeparatorStyle
import typings.openui5.sapMLibraryMod.IBreadcrumbs
import typings.openui5.sapMLibraryMod.IOverflowToolbarContent
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.IShrinkable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMBreadcrumbsMod {
  
  @JSImport("sap/m/Breadcrumbs", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Breadcrumbs`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/breadcrumb/ Breadcrumbs}
    */
  open class default () extends Breadcrumbs {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: BreadcrumbsSettings) = this()
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
    mSettings: BreadcrumbsSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: BreadcrumbsSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_m_IBreadcrumbs: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_m_IOverflowToolbarContent: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_ui_core_IShrinkable: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/Breadcrumbs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.Breadcrumbs with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, Breadcrumbs]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Breadcrumbs],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.Breadcrumbs.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Breadcrumbs
    extends typings.openui5.sapUiCoreControlMod.default
       with IBreadcrumbs
       with IOverflowToolbarContent
       with IShrinkable {
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * @SINCE 1.92
      *
      * Adds some ariaLabelledBy into the association {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaLabelledBy(/**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: ID): this.type = js.native
    
    /**
      * @SINCE 1.34
      *
      * Adds some link to the aggregation {@link #getLinks links}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addLink(
      /**
      * The link to add; if empty, nothing is inserted
      */
    oLink: typings.openui5.sapMLinkMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.34
      *
      * Destroys all the links in the aggregation {@link #getLinks links}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyLinks(): this.type = js.native
    
    /**
      * @SINCE 1.92
      *
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.34
      *
      * Gets current value of property {@link #getCurrentLocationText currentLocationText}.
      *
      * Determines the text of current/last element in the Breadcrumbs path.
      *
      * @returns Value of property `currentLocationText`
      */
    def getCurrentLocationText(): String = js.native
    
    /**
      * @SINCE 1.34
      *
      * Gets content of aggregation {@link #getLinks links}.
      *
      * A list of all the active link elements in the Breadcrumbs control. **Note:** Enabling the property `wrapping`
      * of the link will not work since it's incompatible with the concept of the control. The other properties
      * will work, but their effect may be undesirable.
      */
    def getLinks(): js.Array[typings.openui5.sapMLinkMod.default] = js.native
    
    /**
      * @SINCE 1.69
      *
      * Gets current value of property {@link #getSeparatorStyle separatorStyle}.
      *
      * Determines the visual style of the separator between the `Breadcrumbs` elements.
      *
      * Default value is `Slash`.
      *
      * @returns Value of property `separatorStyle`
      */
    def getSeparatorStyle(): BreadcrumbsSeparatorStyle | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BreadcrumbsSeparatorStyle * / any */ String) = js.native
    
    /**
      * @SINCE 1.34
      *
      * Checks for the provided `sap.m.Link` in the aggregation {@link #getLinks links}. and returns its index
      * if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfLink(/**
      * The link whose index is looked for
      */
    oLink: typings.openui5.sapMLinkMod.default): int = js.native
    
    /**
      * @SINCE 1.34
      *
      * Inserts a link into the aggregation {@link #getLinks links}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertLink(
      /**
      * The link to insert; if empty, nothing is inserted
      */
    oLink: typings.openui5.sapMLinkMod.default,
      /**
      * The `0`-based index the link should be inserted at; for a negative value of `iIndex`, the link is inserted
      * at position 0; for a value greater than the current size of the aggregation, the link is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @SINCE 1.92
      *
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.34
      *
      * Removes all the controls from the aggregation {@link #getLinks links}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllLinks(): js.Array[typings.openui5.sapMLinkMod.default] = js.native
    
    /**
      * @SINCE 1.92
      *
      * Removes an ariaLabelledBy from the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns The removed ariaLabelledBy or `null`
      */
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: int): ID | Null = js.native
    def removeAriaLabelledBy(
      /**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: ID): ID | Null = js.native
    
    def removeLink(/**
      * The link to remove or its index or id
      */
    vLink: String): typings.openui5.sapMLinkMod.default | Null = js.native
    /**
      * @SINCE 1.34
      *
      * Removes a link from the aggregation {@link #getLinks links}.
      *
      * @returns The removed link or `null`
      */
    def removeLink(/**
      * The link to remove or its index or id
      */
    vLink: int): typings.openui5.sapMLinkMod.default | Null = js.native
    def removeLink(/**
      * The link to remove or its index or id
      */
    vLink: typings.openui5.sapMLinkMod.default): typings.openui5.sapMLinkMod.default | Null = js.native
    
    /**
      * @SINCE 1.34
      *
      * Sets a new value for property {@link #getCurrentLocationText currentLocationText}.
      *
      * Determines the text of current/last element in the Breadcrumbs path.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCurrentLocationText(): this.type = js.native
    def setCurrentLocationText(/**
      * New value for property `currentLocationText`
      */
    sCurrentLocationText: String): this.type = js.native
    
    def setSeparatorStyle(
      sSeparatorStyle: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BreadcrumbsSeparatorStyle * / any */ String
    ): Breadcrumbs = js.native
    /**
      * @SINCE 1.71
      *
      * Custom setter for the `Breadcrumbs` separator style.
      *
      * @returns this
      */
    def setSeparatorStyle(sSeparatorStyle: BreadcrumbsSeparatorStyle): Breadcrumbs = js.native
  }
  
  trait BreadcrumbsSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.92
      *
      * Association to controls / IDs which label this control (see WAI-ARIA attribute `aria-labelledby`).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * @SINCE 1.34
      *
      * Determines the text of current/last element in the Breadcrumbs path.
      */
    var currentLocationText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.34
      *
      * A list of all the active link elements in the Breadcrumbs control. **Note:** Enabling the property `wrapping`
      * of the link will not work since it's incompatible with the concept of the control. The other properties
      * will work, but their effect may be undesirable.
      */
    var links: js.UndefOr[
        js.Array[typings.openui5.sapMLinkMod.default] | typings.openui5.sapMLinkMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.69
      *
      * Determines the visual style of the separator between the `Breadcrumbs` elements.
      */
    var separatorStyle: js.UndefOr[
        BreadcrumbsSeparatorStyle | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BreadcrumbsSeparatorStyle * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object BreadcrumbsSettings {
    
    inline def apply(): BreadcrumbsSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbsSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BreadcrumbsSettings] (val x: Self) extends AnyVal {
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setCurrentLocationText(value: String | PropertyBindingInfo): Self = StObject.set(x, "currentLocationText", value.asInstanceOf[js.Any])
      
      inline def setCurrentLocationTextUndefined: Self = StObject.set(x, "currentLocationText", js.undefined)
      
      inline def setLinks(
        value: js.Array[typings.openui5.sapMLinkMod.default] | typings.openui5.sapMLinkMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      inline def setLinksVarargs(value: typings.openui5.sapMLinkMod.default*): Self = StObject.set(x, "links", js.Array(value*))
      
      inline def setSeparatorStyle(
        value: BreadcrumbsSeparatorStyle | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BreadcrumbsSeparatorStyle * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "separatorStyle", value.asInstanceOf[js.Any])
      
      inline def setSeparatorStyleUndefined: Self = StObject.set(x, "separatorStyle", js.undefined)
    }
  }
}
