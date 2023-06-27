package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCommonsLibraryMod.PaginatorEvent
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsPaginatorMod {
  
  @JSImport("sap/ui/commons/Paginator", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Paginator.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Paginator {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: PaginatorSettings) = this()
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
    mSettings: PaginatorSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: PaginatorSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/Paginator", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.Paginator with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, Paginator]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Paginator],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.Paginator.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Paginator
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:page page} event of this `sap.ui.commons.Paginator`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.Paginator` itself.
      *
      * Event is fired when the user navigates to another page by selecting it directly, or by jumping forward/backward.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPage(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ PaginatorPageEvent, Unit]
    ): this.type = js.native
    def attachPage(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ PaginatorPageEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.Paginator` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:page page} event of this `sap.ui.commons.Paginator`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.Paginator` itself.
      *
      * Event is fired when the user navigates to another page by selecting it directly, or by jumping forward/backward.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPage(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ PaginatorPageEvent, Unit]
    ): this.type = js.native
    def attachPage(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ PaginatorPageEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.Paginator` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:page page} event of this `sap.ui.commons.Paginator`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPage(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ PaginatorPageEvent, Unit]
    ): this.type = js.native
    def detachPage(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ PaginatorPageEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:page page} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePage(): this.type = js.native
    def firePage(/**
      * Parameters to pass along with the event
      */
    mParameters: Paginator$PageEventParameters): this.type = js.native
    
    /**
      * Gets current value of property {@link #getCurrentPage currentPage}.
      *
      * Represents the current page (first page has index 1, not 0, to match the visual number)
      *
      * Default value is `1`.
      *
      * @returns Value of property `currentPage`
      */
    def getCurrentPage(): int = js.native
    
    /**
      * Gets current value of property {@link #getNumberOfPages numberOfPages}.
      *
      * Represents the overall number of pages that are embedded into the parent control
      *
      * @returns Value of property `numberOfPages`
      */
    def getNumberOfPages(): int = js.native
    
    /**
      * Sets a new value for property {@link #getCurrentPage currentPage}.
      *
      * Represents the current page (first page has index 1, not 0, to match the visual number)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCurrentPage(): this.type = js.native
    def setCurrentPage(/**
      * New value for property `currentPage`
      */
    iCurrentPage: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getNumberOfPages numberOfPages}.
      *
      * Represents the overall number of pages that are embedded into the parent control
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNumberOfPages(): this.type = js.native
    def setNumberOfPages(/**
      * New value for property `numberOfPages`
      */
    iNumberOfPages: int): this.type = js.native
  }
  
  trait Paginator$PageEventParameters extends StObject {
    
    /**
      * The page which is the current one before the page event is fired (and another page is displayed)
      */
    var srcPage: js.UndefOr[int] = js.undefined
    
    /**
      * The page that shall be displayed next after the page event is fired.
      *
      * The page number is 1-based: the first page has index 1, not 0, to match the number visible in the UI.
      */
    var targetPage: js.UndefOr[int] = js.undefined
    
    /**
      * Provides the values 'First', 'Last', 'Next', 'Previous', 'Goto'. The event parameter informs the application
      * how the user navigated to the new page: Whether the 'Next' button was used, or another button, or whether
      * the page was directly selected
      */
    var `type`: js.UndefOr[
        PaginatorEvent | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PaginatorEvent * / any */ String)
      ] = js.undefined
  }
  object Paginator$PageEventParameters {
    
    inline def apply(): Paginator$PageEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Paginator$PageEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Paginator$PageEventParameters] (val x: Self) extends AnyVal {
      
      inline def setSrcPage(value: int): Self = StObject.set(x, "srcPage", value.asInstanceOf[js.Any])
      
      inline def setSrcPageUndefined: Self = StObject.set(x, "srcPage", js.undefined)
      
      inline def setTargetPage(value: int): Self = StObject.set(x, "targetPage", value.asInstanceOf[js.Any])
      
      inline def setTargetPageUndefined: Self = StObject.set(x, "targetPage", js.undefined)
      
      inline def setType(
        value: PaginatorEvent | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PaginatorEvent * / any */ String)
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type PaginatorPageEvent = typings.openui5.sapUiBaseEventMod.default[Paginator$PageEventParameters]
  
  type PaginatorPageEventParameters = Paginator$PageEventParameters
  
  trait PaginatorSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Represents the current page (first page has index 1, not 0, to match the visual number)
      */
    var currentPage: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Represents the overall number of pages that are embedded into the parent control
      */
    var numberOfPages: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Event is fired when the user navigates to another page by selecting it directly, or by jumping forward/backward.
      */
    var page: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Paginator$PageEventParameters], 
          Unit
        ]
      ] = js.undefined
  }
  object PaginatorSettings {
    
    inline def apply(): PaginatorSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginatorSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaginatorSettings] (val x: Self) extends AnyVal {
      
      inline def setCurrentPage(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      inline def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
      
      inline def setNumberOfPages(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "numberOfPages", value.asInstanceOf[js.Any])
      
      inline def setNumberOfPagesUndefined: Self = StObject.set(x, "numberOfPages", js.undefined)
      
      inline def setPage(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Paginator$PageEventParameters] => Unit
      ): Self = StObject.set(x, "page", js.Any.fromFunction1(value))
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    }
  }
}
