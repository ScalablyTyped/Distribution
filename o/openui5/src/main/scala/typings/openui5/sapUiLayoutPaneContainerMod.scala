package typings.openui5

import typings.openui5.anon.NewSizes
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiCoreLibraryMod.Orientation
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiLayoutPaneContainerMod {
  
  @JSImport("sap/ui/layout/PaneContainer", JSImport.Default)
  @js.native
  /**
    * Constructor for a new PaneContainer.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends PaneContainer {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: PaneContainerSettings) = this()
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
    mSettings: PaneContainerSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: PaneContainerSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/layout/PaneContainer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.layout.PaneContainer with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, PaneContainer]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, PaneContainer],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.layout.PaneContainer.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait PaneContainer
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Adds some pane to the aggregation {@link #getPanes panes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addPane(
      /**
      * The pane to add; if empty, nothing is inserted
      */
    oPane: typings.openui5.sapUiCoreElementMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:resize resize} event of this `sap.ui.layout.PaneContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.layout.PaneContainer` itself.
      *
      * Fired when contents are resized.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachResize(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachResize(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.layout.PaneContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:resize resize} event of this `sap.ui.layout.PaneContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.layout.PaneContainer` itself.
      *
      * Fired when contents are resized.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachResize(
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
    def attachResize(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.layout.PaneContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the panes in the aggregation {@link #getPanes panes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyPanes(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:resize resize} event of this `sap.ui.layout.PaneContainer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachResize(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachResize(
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
      * Fires event {@link #event:resize resize} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireResize(): this.type = js.native
    def fireResize(/**
      * Parameters to pass along with the event
      */
    mParameters: NewSizes): this.type = js.native
    
    /**
      * Gets current value of property {@link #getOrientation orientation}.
      *
      * The orientation of the Splitter
      *
      * Default value is `Horizontal`.
      *
      * @returns Value of property `orientation`
      */
    def getOrientation(): Orientation | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Orientation * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getPanes panes}.
      *
      * The panes to be split. The control will show n-1 splitter bars between n controls in this aggregation.
      */
    def getPanes(): js.Array[typings.openui5.sapUiCoreElementMod.default] = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Element` in the aggregation {@link #getPanes panes}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfPane(/**
      * The pane whose index is looked for
      */
    oPane: typings.openui5.sapUiCoreElementMod.default): int = js.native
    
    /**
      * Pane insertion
      */
    def insertPane(oObject: Unit, iIndex: Unit): typings.openui5.sapUiBaseManagedObjectMod.default = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getPanes panes}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllPanes(): js.Array[typings.openui5.sapUiCoreElementMod.default] = js.native
    
    /**
      * Pane removal
      */
    def removePane(oObject: Unit): typings.openui5.sapUiBaseManagedObjectMod.default = js.native
    
    def setOrientation(
      /**
      * The Orientation type.
      */
    sOrientation: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Orientation * / any */ String
    ): this.type = js.native
    /**
      * Setter for property orientation. Default value is sap.ui.core.Orientation.Horizontal
      *
      * @returns this to allow method chaining.
      */
    def setOrientation(/**
      * The Orientation type.
      */
    sOrientation: Orientation): this.type = js.native
  }
  
  trait PaneContainerSettings
    extends StObject
       with ElementSettings {
    
    /**
      * The orientation of the Splitter
      */
    var orientation: js.UndefOr[
        Orientation | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Orientation * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The panes to be split. The control will show n-1 splitter bars between n controls in this aggregation.
      */
    var panes: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreElementMod.default] | typings.openui5.sapUiCoreElementMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when contents are resized.
      */
    var resize: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
  }
  object PaneContainerSettings {
    
    inline def apply(): PaneContainerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaneContainerSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaneContainerSettings] (val x: Self) extends AnyVal {
      
      inline def setOrientation(
        value: Orientation | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Orientation * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setPanes(
        value: js.Array[typings.openui5.sapUiCoreElementMod.default] | typings.openui5.sapUiCoreElementMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "panes", value.asInstanceOf[js.Any])
      
      inline def setPanesUndefined: Self = StObject.set(x, "panes", js.undefined)
      
      inline def setPanesVarargs(value: typings.openui5.sapUiCoreElementMod.default*): Self = StObject.set(x, "panes", js.Array(value*))
      
      inline def setResize(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    }
  }
}
