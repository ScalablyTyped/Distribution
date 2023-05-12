package typings.openui5

import typings.openui5.anon.ActivePages
import typings.openui5.anon.NewActivePageId
import typings.openui5.anon.PageId
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.BackgroundDesign
import typings.openui5.sapMLibraryMod.CarouselArrowsPlacement
import typings.openui5.sapMLibraryMod.PlacementType
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMCarouselMod {
  
  @JSImport("sap/m/Carousel", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Carousel.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/carousel/ Carousel}
    */
  open class default () extends Carousel {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: CarouselSettings) = this()
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
    mSettings: CarouselSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: CarouselSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/Carousel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.Carousel with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, Carousel]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Carousel],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.Carousel.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Carousel
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some page to the aggregation {@link #getPages pages}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addPage(
      /**
      * The page to add; if empty, nothing is inserted
      */
    oPage: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforePageChanged beforePageChanged} event of
      * this `sap.m.Carousel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Carousel` itself.
      *
      * This event is fired before a carousel swipe has been completed. It is triggered both by physical swipe
      * events and through API carousel manipulations such as calling 'next', 'previous' or 'setActivePage' functions.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforePageChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachBeforePageChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Carousel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforePageChanged beforePageChanged} event of
      * this `sap.m.Carousel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Carousel` itself.
      *
      * This event is fired before a carousel swipe has been completed. It is triggered both by physical swipe
      * events and through API carousel manipulations such as calling 'next', 'previous' or 'setActivePage' functions.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforePageChanged(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachBeforePageChanged(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Carousel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.18.7) - Since 1.18.7 pages are no longer loaded or unloaded
      *
      * Attaches event handler `fnFunction` to the {@link #event:loadPage loadPage} event of this `sap.m.Carousel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Carousel` itself.
      *
      * Carousel requires a new page to be loaded. This event may be used to fill the content of that page
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLoadPage(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachLoadPage(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Carousel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @deprecated (since 1.18.7) - Since 1.18.7 pages are no longer loaded or unloaded
      *
      * Attaches event handler `fnFunction` to the {@link #event:loadPage loadPage} event of this `sap.m.Carousel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Carousel` itself.
      *
      * Carousel requires a new page to be loaded. This event may be used to fill the content of that page
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLoadPage(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachLoadPage(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Carousel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:pageChanged pageChanged} event of this `sap.m.Carousel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Carousel` itself.
      *
      * This event is fired after a carousel swipe has been completed. It is triggered both by physical swipe
      * events and through API carousel manipulations such as calling 'next', 'previous' or 'setActivePage' functions.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPageChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPageChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Carousel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:pageChanged pageChanged} event of this `sap.m.Carousel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Carousel` itself.
      *
      * This event is fired after a carousel swipe has been completed. It is triggered both by physical swipe
      * events and through API carousel manipulations such as calling 'next', 'previous' or 'setActivePage' functions.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPageChanged(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPageChanged(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Carousel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.18.7) - Since 1.18.7 pages are no longer loaded or unloaded
      *
      * Attaches event handler `fnFunction` to the {@link #event:unloadPage unloadPage} event of this `sap.m.Carousel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Carousel` itself.
      *
      * Carousel does not display a page any longer and unloads it. This event may be used to clean up the content
      * of that page.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUnloadPage(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachUnloadPage(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Carousel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @deprecated (since 1.18.7) - Since 1.18.7 pages are no longer loaded or unloaded
      *
      * Attaches event handler `fnFunction` to the {@link #event:unloadPage unloadPage} event of this `sap.m.Carousel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Carousel` itself.
      *
      * Carousel does not display a page any longer and unloads it. This event may be used to clean up the content
      * of that page.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUnloadPage(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachUnloadPage(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Carousel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.62
      *
      * Destroys the customLayout in the aggregation {@link #getCustomLayout customLayout}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCustomLayout(): this.type = js.native
    
    /**
      * Destroys all the pages in the aggregation {@link #getPages pages}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyPages(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:beforePageChanged beforePageChanged} event
      * of this `sap.m.Carousel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBeforePageChanged(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachBeforePageChanged(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.18.7) - Since 1.18.7 pages are no longer loaded or unloaded
      *
      * Detaches event handler `fnFunction` from the {@link #event:loadPage loadPage} event of this `sap.m.Carousel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachLoadPage(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachLoadPage(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:pageChanged pageChanged} event of this `sap.m.Carousel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPageChanged(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachPageChanged(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.18.7) - Since 1.18.7 pages are no longer loaded or unloaded
      *
      * Detaches event handler `fnFunction` from the {@link #event:unloadPage unloadPage} event of this `sap.m.Carousel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachUnloadPage(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachUnloadPage(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:beforePageChanged beforePageChanged} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireBeforePageChanged(): this.type = js.native
    def fireBeforePageChanged(/**
      * Parameters to pass along with the event
      */
    mParameters: ActivePages): this.type = js.native
    
    /**
      * @deprecated (since 1.18.7) - Since 1.18.7 pages are no longer loaded or unloaded
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:loadPage loadPage} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireLoadPage(): this.type = js.native
    def fireLoadPage(/**
      * Parameters to pass along with the event
      */
    mParameters: PageId): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:pageChanged pageChanged} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePageChanged(): this.type = js.native
    def firePageChanged(/**
      * Parameters to pass along with the event
      */
    mParameters: NewActivePageId): this.type = js.native
    
    /**
      * @deprecated (since 1.18.7) - Since 1.18.7 pages are no longer loaded or unloaded
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:unloadPage unloadPage} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireUnloadPage(): this.type = js.native
    def fireUnloadPage(/**
      * Parameters to pass along with the event
      */
    mParameters: PageId): this.type = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getActivePage activePage}, or
      * `null`.
      */
    def getActivePage(): ID = js.native
    
    /**
      * Gets current value of property {@link #getArrowsPlacement arrowsPlacement}.
      *
      * Defines where the carousel's arrows are placed. Default is `sap.m.CarouselArrowsPlacement.Content` used
      * to place the arrows on the sides of the carousel. Alternatively `sap.m.CarouselArrowsPlacement.PageIndicator`
      * can be used to place the arrows on the sides of the page indicator.
      *
      * Default value is `Content`.
      *
      * @returns Value of property `arrowsPlacement`
      */
    def getArrowsPlacement(): CarouselArrowsPlacement | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CarouselArrowsPlacement * / any */ String) = js.native
    
    /**
      * @SINCE 1.110
      *
      * Gets current value of property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Defines the carousel's background design. Default is `sap.m.BackgroundDesign.Translucent`.
      *
      * Default value is `Translucent`.
      *
      * @returns Value of property `backgroundDesign`
      */
    def getBackgroundDesign(): BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) = js.native
    
    /**
      * @SINCE 1.62
      *
      * Gets content of aggregation {@link #getCustomLayout customLayout}.
      *
      * Defines how many pages are displayed in the visible area of the `Carousel` control.
      *
      * **Note:** When this property is used, the `loop` property is ignored.
      */
    def getCustomLayout(): typings.openui5.sapMCarouselLayoutMod.default = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * The height of the carousel. Note that when a percentage value is used, the height of the surrounding
      * container must be defined.
      *
      * Default value is `'100%'`.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getLoop loop}.
      *
      * Defines whether the carousel should loop, i.e show the first page after the last page is reached and
      * vice versa.
      *
      * Default value is `false`.
      *
      * @returns Value of property `loop`
      */
    def getLoop(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getPageIndicatorPlacement pageIndicatorPlacement}.
      *
      * Defines where the carousel's page indicator is displayed. Possible values are sap.m.PlacementType.Top,
      * sap.m.PlacementType.Bottom. Other values are ignored and the default value will be applied. The default
      * value is sap.m.PlacementType.Bottom.
      *
      * Default value is `Bottom`.
      *
      * @returns Value of property `pageIndicatorPlacement`
      */
    def getPageIndicatorPlacement(): PlacementType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementType * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getPages pages}.
      *
      * The content which the carousel displays.
      */
    def getPages(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @deprecated (since 1.18.7) - Since 1.18.7 pages are no longer loaded or unloaded. Therefore busy indicator
      * is not necessary any longer.
      *
      * Gets current value of property {@link #getShowBusyIndicator showBusyIndicator}.
      *
      * Show or hide busy indicator in the carousel when loading pages after swipe.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showBusyIndicator`
      */
    def getShowBusyIndicator(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowPageIndicator showPageIndicator}.
      *
      * Show or hide carousel's page indicator.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showPageIndicator`
      */
    def getShowPageIndicator(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * The width of the carousel. Note that when a percentage value is used, the height of the surrounding container
      * must be defined.
      *
      * Default value is `'100%'`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getPages pages}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfPage(/**
      * The page whose index is looked for
      */
    oPage: typings.openui5.sapUiCoreControlMod.default): int = js.native
    
    /**
      * Inserts a page into the aggregation {@link #getPages pages}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertPage(
      /**
      * The page to insert; if empty, nothing is inserted
      */
    oPage: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the page should be inserted at; for a negative value of `iIndex`, the page is inserted
      * at position 0; for a value greater than the current size of the aggregation, the page is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Call this method to display the next page (corresponds to a swipe right).
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def next(): this.type = js.native
    
    /**
      * Call this method to display the previous page (corresponds to a swipe left).
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def previous(): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getPages pages}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllPages(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removePage(/**
      * The page to remove or its index or id
      */
    vPage: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a page from the aggregation {@link #getPages pages}.
      *
      * @returns The removed page or `null`
      */
    def removePage(/**
      * The page to remove or its index or id
      */
    vPage: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removePage(
      /**
      * The page to remove or its index or id
      */
    vPage: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def setActivePage(
      /**
      * ID of an element which becomes the new target of this activePage association; alternatively, an element
      * instance may be given
      */
    oActivePage: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Sets the associated {@link #getActivePage activePage}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setActivePage(
      /**
      * ID of an element which becomes the new target of this activePage association; alternatively, an element
      * instance may be given
      */
    oActivePage: ID
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getArrowsPlacement arrowsPlacement}.
      *
      * Defines where the carousel's arrows are placed. Default is `sap.m.CarouselArrowsPlacement.Content` used
      * to place the arrows on the sides of the carousel. Alternatively `sap.m.CarouselArrowsPlacement.PageIndicator`
      * can be used to place the arrows on the sides of the page indicator.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Content`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setArrowsPlacement(): this.type = js.native
    def setArrowsPlacement(
      /**
      * New value for property `arrowsPlacement`
      */
    sArrowsPlacement: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CarouselArrowsPlacement * / any */ String
    ): this.type = js.native
    def setArrowsPlacement(/**
      * New value for property `arrowsPlacement`
      */
    sArrowsPlacement: CarouselArrowsPlacement): this.type = js.native
    
    /**
      * @SINCE 1.110
      *
      * Sets a new value for property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Defines the carousel's background design. Default is `sap.m.BackgroundDesign.Translucent`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Translucent`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundDesign(): this.type = js.native
    def setBackgroundDesign(
      /**
      * New value for property `backgroundDesign`
      */
    sBackgroundDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String
    ): this.type = js.native
    def setBackgroundDesign(/**
      * New value for property `backgroundDesign`
      */
    sBackgroundDesign: BackgroundDesign): this.type = js.native
    
    /**
      * @SINCE 1.62
      *
      * Sets the aggregated {@link #getCustomLayout customLayout}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCustomLayout(/**
      * The customLayout to set
      */
    oCustomLayout: typings.openui5.sapMCarouselLayoutMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * The height of the carousel. Note that when a percentage value is used, the height of the surrounding
      * container must be defined.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'100%'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLoop loop}.
      *
      * Defines whether the carousel should loop, i.e show the first page after the last page is reached and
      * vice versa.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLoop(): this.type = js.native
    def setLoop(/**
      * New value for property `loop`
      */
    bLoop: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPageIndicatorPlacement pageIndicatorPlacement}.
      *
      * Defines where the carousel's page indicator is displayed. Possible values are sap.m.PlacementType.Top,
      * sap.m.PlacementType.Bottom. Other values are ignored and the default value will be applied. The default
      * value is sap.m.PlacementType.Bottom.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Bottom`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPageIndicatorPlacement(): this.type = js.native
    def setPageIndicatorPlacement(
      /**
      * New value for property `pageIndicatorPlacement`
      */
    sPageIndicatorPlacement: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementType * / any */ String
    ): this.type = js.native
    def setPageIndicatorPlacement(
      /**
      * New value for property `pageIndicatorPlacement`
      */
    sPageIndicatorPlacement: PlacementType
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.18.7) - Since 1.18.7 pages are no longer loaded or unloaded. Therefore busy indicator
      * is not necessary any longer.
      *
      * Sets a new value for property {@link #getShowBusyIndicator showBusyIndicator}.
      *
      * Show or hide busy indicator in the carousel when loading pages after swipe.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowBusyIndicator(): this.type = js.native
    def setShowBusyIndicator(/**
      * New value for property `showBusyIndicator`
      */
    bShowBusyIndicator: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowPageIndicator showPageIndicator}.
      *
      * Show or hide carousel's page indicator.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowPageIndicator(): this.type = js.native
    def setShowPageIndicator(/**
      * New value for property `showPageIndicator`
      */
    bShowPageIndicator: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * The width of the carousel. Note that when a percentage value is used, the height of the surrounding container
      * must be defined.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'100%'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait CarouselSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Provides getter and setter for the currently displayed page. For the setter, argument may be the control
      * itself, which must be member of the carousel's page list, or the control's id. The getter will return
      * the control id
      */
    var activePage: js.UndefOr[typings.openui5.sapUiCoreControlMod.default | String] = js.undefined
    
    /**
      * Defines where the carousel's arrows are placed. Default is `sap.m.CarouselArrowsPlacement.Content` used
      * to place the arrows on the sides of the carousel. Alternatively `sap.m.CarouselArrowsPlacement.PageIndicator`
      * can be used to place the arrows on the sides of the page indicator.
      */
    var arrowsPlacement: js.UndefOr[
        CarouselArrowsPlacement | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CarouselArrowsPlacement * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.110
      *
      * Defines the carousel's background design. Default is `sap.m.BackgroundDesign.Translucent`.
      */
    var backgroundDesign: js.UndefOr[
        BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * This event is fired before a carousel swipe has been completed. It is triggered both by physical swipe
      * events and through API carousel manipulations such as calling 'next', 'previous' or 'setActivePage' functions.
      */
    var beforePageChanged: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.62
      *
      * Defines how many pages are displayed in the visible area of the `Carousel` control.
      *
      * **Note:** When this property is used, the `loop` property is ignored.
      */
    var customLayout: js.UndefOr[typings.openui5.sapMCarouselLayoutMod.default] = js.undefined
    
    /**
      * The height of the carousel. Note that when a percentage value is used, the height of the surrounding
      * container must be defined.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.18.7) - Since 1.18.7 pages are no longer loaded or unloaded
      *
      * Carousel requires a new page to be loaded. This event may be used to fill the content of that page
      */
    var loadPage: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines whether the carousel should loop, i.e show the first page after the last page is reached and
      * vice versa.
      */
    var loop: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This event is fired after a carousel swipe has been completed. It is triggered both by physical swipe
      * events and through API carousel manipulations such as calling 'next', 'previous' or 'setActivePage' functions.
      */
    var pageChanged: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines where the carousel's page indicator is displayed. Possible values are sap.m.PlacementType.Top,
      * sap.m.PlacementType.Bottom. Other values are ignored and the default value will be applied. The default
      * value is sap.m.PlacementType.Bottom.
      */
    var pageIndicatorPlacement: js.UndefOr[
        PlacementType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The content which the carousel displays.
      */
    var pages: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.18.7) - Since 1.18.7 pages are no longer loaded or unloaded. Therefore busy indicator
      * is not necessary any longer.
      *
      * Show or hide busy indicator in the carousel when loading pages after swipe.
      */
    var showBusyIndicator: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Show or hide carousel's page indicator.
      */
    var showPageIndicator: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.18.7) - Since 1.18.7 pages are no longer loaded or unloaded
      *
      * Carousel does not display a page any longer and unloads it. This event may be used to clean up the content
      * of that page.
      */
    var unloadPage: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The width of the carousel. Note that when a percentage value is used, the height of the surrounding container
      * must be defined.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object CarouselSettings {
    
    inline def apply(): CarouselSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CarouselSettings] (val x: Self) extends AnyVal {
      
      inline def setActivePage(value: typings.openui5.sapUiCoreControlMod.default | String): Self = StObject.set(x, "activePage", value.asInstanceOf[js.Any])
      
      inline def setActivePageUndefined: Self = StObject.set(x, "activePage", js.undefined)
      
      inline def setArrowsPlacement(
        value: CarouselArrowsPlacement | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CarouselArrowsPlacement * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "arrowsPlacement", value.asInstanceOf[js.Any])
      
      inline def setArrowsPlacementUndefined: Self = StObject.set(x, "arrowsPlacement", js.undefined)
      
      inline def setBackgroundDesign(
        value: BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "backgroundDesign", value.asInstanceOf[js.Any])
      
      inline def setBackgroundDesignUndefined: Self = StObject.set(x, "backgroundDesign", js.undefined)
      
      inline def setBeforePageChanged(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "beforePageChanged", js.Any.fromFunction1(value))
      
      inline def setBeforePageChangedUndefined: Self = StObject.set(x, "beforePageChanged", js.undefined)
      
      inline def setCustomLayout(value: typings.openui5.sapMCarouselLayoutMod.default): Self = StObject.set(x, "customLayout", value.asInstanceOf[js.Any])
      
      inline def setCustomLayoutUndefined: Self = StObject.set(x, "customLayout", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLoadPage(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "loadPage", js.Any.fromFunction1(value))
      
      inline def setLoadPageUndefined: Self = StObject.set(x, "loadPage", js.undefined)
      
      inline def setLoop(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setPageChanged(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "pageChanged", js.Any.fromFunction1(value))
      
      inline def setPageChangedUndefined: Self = StObject.set(x, "pageChanged", js.undefined)
      
      inline def setPageIndicatorPlacement(
        value: PlacementType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "pageIndicatorPlacement", value.asInstanceOf[js.Any])
      
      inline def setPageIndicatorPlacementUndefined: Self = StObject.set(x, "pageIndicatorPlacement", js.undefined)
      
      inline def setPages(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
      
      inline def setPagesVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "pages", js.Array(value*))
      
      inline def setShowBusyIndicator(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showBusyIndicator", value.asInstanceOf[js.Any])
      
      inline def setShowBusyIndicatorUndefined: Self = StObject.set(x, "showBusyIndicator", js.undefined)
      
      inline def setShowPageIndicator(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showPageIndicator", value.asInstanceOf[js.Any])
      
      inline def setShowPageIndicatorUndefined: Self = StObject.set(x, "showPageIndicator", js.undefined)
      
      inline def setUnloadPage(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "unloadPage", js.Any.fromFunction1(value))
      
      inline def setUnloadPageUndefined: Self = StObject.set(x, "unloadPage", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
