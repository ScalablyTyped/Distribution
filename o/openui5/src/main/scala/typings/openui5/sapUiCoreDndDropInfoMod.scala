package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreDndDragDropBaseMod.DragDropBaseSettings
import typings.openui5.sapUiCoreLibraryMod.dnd.DropEffect
import typings.openui5.sapUiCoreLibraryMod.dnd.DropLayout
import typings.openui5.sapUiCoreLibraryMod.dnd.DropPosition
import typings.openui5.sapUiCoreLibraryMod.dnd.IDropInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreDndDropInfoMod {
  
  @JSImport("sap/ui/core/dnd/DropInfo", JSImport.Default)
  @js.native
  /**
    * Constructor for a new DropInfo.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends DropInfo {
    def this(/**
      * Initial settings for the DropInfo
      */
    mSettings: DropInfoSettings) = this()
    def this(/**
      * ID for the new DropInfo, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new DropInfo, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the DropInfo
      */
    mSettings: DropInfoSettings
    ) = this()
    def this(
      /**
      * ID for the new DropInfo, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the DropInfo
      */
    mSettings: DropInfoSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_dnd_IDropInfo: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/dnd/DropInfo", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.dnd.DropInfo with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.dnd.DragDropBase.extend}.
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
    oClassInfo: ClassInfo[T, DropInfo]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DropInfo],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.dnd.DropInfo.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait DropInfo
    extends typings.openui5.sapUiCoreDndDragDropBaseMod.default
       with IDropInfo {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:dragEnter dragEnter} event of this `sap.ui.core.dnd.DropInfo`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.dnd.DropInfo` itself.
      *
      * This event is fired when a dragged element enters a drop target.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDragEnter(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachDragEnter(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.dnd.DropInfo` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:dragEnter dragEnter} event of this `sap.ui.core.dnd.DropInfo`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.dnd.DropInfo` itself.
      *
      * This event is fired when a dragged element enters a drop target.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDragEnter(
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
    def attachDragEnter(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.core.dnd.DropInfo` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.56
      *
      * Attaches event handler `fnFunction` to the {@link #event:dragOver dragOver} event of this `sap.ui.core.dnd.DropInfo`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.dnd.DropInfo` itself.
      *
      * This event is fired when an element is being dragged over a valid drop target.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDragOver(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachDragOver(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.dnd.DropInfo` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.56
      *
      * Attaches event handler `fnFunction` to the {@link #event:dragOver dragOver} event of this `sap.ui.core.dnd.DropInfo`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.dnd.DropInfo` itself.
      *
      * This event is fired when an element is being dragged over a valid drop target.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDragOver(
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
    def attachDragOver(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.core.dnd.DropInfo` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:drop drop} event of this `sap.ui.core.dnd.DropInfo`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.dnd.DropInfo` itself.
      *
      * This event is fired when an element is dropped on a valid drop target, as specified by the drag-and-drop
      * info.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDrop(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachDrop(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.dnd.DropInfo` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:drop drop} event of this `sap.ui.core.dnd.DropInfo`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.dnd.DropInfo` itself.
      *
      * This event is fired when an element is dropped on a valid drop target, as specified by the drag-and-drop
      * info.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDrop(
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
    def attachDrop(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.core.dnd.DropInfo` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:dragEnter dragEnter} event of this `sap.ui.core.dnd.DropInfo`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachDragEnter(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachDragEnter(
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
      * @SINCE 1.56
      *
      * Detaches event handler `fnFunction` from the {@link #event:dragOver dragOver} event of this `sap.ui.core.dnd.DropInfo`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachDragOver(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachDragOver(
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
      * Detaches event handler `fnFunction` from the {@link #event:drop drop} event of this `sap.ui.core.dnd.DropInfo`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachDrop(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachDrop(
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
      * Fires event {@link #event:dragEnter dragEnter} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireDragEnter(): Boolean = js.native
    def fireDragEnter(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): Boolean = js.native
    
    /**
      * @SINCE 1.56
      *
      * Fires event {@link #event:dragOver dragOver} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireDragOver(): this.type = js.native
    def fireDragOver(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:drop drop} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireDrop(): this.type = js.native
    def fireDrop(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getDropEffect dropEffect}.
      *
      * Defines the visual drop effect.
      *
      * Default value is `"Move"`.
      *
      * @returns Value of property `dropEffect`
      */
    def getDropEffect(): DropEffect | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof dnd.DropEffect * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getDropLayout dropLayout}.
      *
      * Defines the layout of the droppable controls if `dropPosition` is set to `Between` or `OnOrBetween`.
      *
      * Default value is `"Default"`.
      *
      * @returns Value of property `dropLayout`
      */
    def getDropLayout(): DropLayout | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof dnd.DropLayout * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getDropPosition dropPosition}.
      *
      * Defines the position for the drop action, visualized by a rectangle.
      *
      * Default value is `"On"`.
      *
      * @returns Value of property `dropPosition`
      */
    def getDropPosition(): DropPosition | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof dnd.DropPosition * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getTargetAggregation targetAggregation}.
      *
      * The aggregation name in the drop target control which is the target of this drag-and-drop action. If
      * undefined, the entire control is the target. This can be handy if the target control does not have any
      * aggregations or if the drop position within the target does not matter.
      *
      * @returns Value of property `targetAggregation`
      */
    def getTargetAggregation(): String = js.native
    
    /**
      * Sets a new value for property {@link #getDropEffect dropEffect}.
      *
      * Defines the visual drop effect.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"Move"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDropEffect(): this.type = js.native
    def setDropEffect(
      /**
      * New value for property `dropEffect`
      */
    sDropEffect: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof dnd.DropEffect * / any */ String
    ): this.type = js.native
    def setDropEffect(/**
      * New value for property `dropEffect`
      */
    sDropEffect: DropEffect): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDropLayout dropLayout}.
      *
      * Defines the layout of the droppable controls if `dropPosition` is set to `Between` or `OnOrBetween`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"Default"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDropLayout(): this.type = js.native
    def setDropLayout(
      /**
      * New value for property `dropLayout`
      */
    sDropLayout: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof dnd.DropLayout * / any */ String
    ): this.type = js.native
    def setDropLayout(/**
      * New value for property `dropLayout`
      */
    sDropLayout: DropLayout): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDropPosition dropPosition}.
      *
      * Defines the position for the drop action, visualized by a rectangle.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"On"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDropPosition(): this.type = js.native
    def setDropPosition(
      /**
      * New value for property `dropPosition`
      */
    sDropPosition: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof dnd.DropPosition * / any */ String
    ): this.type = js.native
    def setDropPosition(/**
      * New value for property `dropPosition`
      */
    sDropPosition: DropPosition): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTargetAggregation targetAggregation}.
      *
      * The aggregation name in the drop target control which is the target of this drag-and-drop action. If
      * undefined, the entire control is the target. This can be handy if the target control does not have any
      * aggregations or if the drop position within the target does not matter.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTargetAggregation(): this.type = js.native
    def setTargetAggregation(/**
      * New value for property `targetAggregation`
      */
    sTargetAggregation: String): this.type = js.native
  }
  
  trait DropInfoSettings
    extends StObject
       with DragDropBaseSettings {
    
    /**
      * This event is fired when a dragged element enters a drop target.
      */
    var dragEnter: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.56
      *
      * This event is fired when an element is being dragged over a valid drop target.
      */
    var dragOver: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * This event is fired when an element is dropped on a valid drop target, as specified by the drag-and-drop
      * info.
      */
    var drop: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the visual drop effect.
      */
    var dropEffect: js.UndefOr[
        DropEffect | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof dnd.DropEffect * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the layout of the droppable controls if `dropPosition` is set to `Between` or `OnOrBetween`.
      */
    var dropLayout: js.UndefOr[
        DropLayout | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof dnd.DropLayout * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the position for the drop action, visualized by a rectangle.
      */
    var dropPosition: js.UndefOr[
        DropPosition | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof dnd.DropPosition * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The aggregation name in the drop target control which is the target of this drag-and-drop action. If
      * undefined, the entire control is the target. This can be handy if the target control does not have any
      * aggregations or if the drop position within the target does not matter.
      */
    var targetAggregation: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object DropInfoSettings {
    
    inline def apply(): DropInfoSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropInfoSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropInfoSettings] (val x: Self) extends AnyVal {
      
      inline def setDragEnter(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "dragEnter", js.Any.fromFunction1(value))
      
      inline def setDragEnterUndefined: Self = StObject.set(x, "dragEnter", js.undefined)
      
      inline def setDragOver(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "dragOver", js.Any.fromFunction1(value))
      
      inline def setDragOverUndefined: Self = StObject.set(x, "dragOver", js.undefined)
      
      inline def setDrop(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction1(value))
      
      inline def setDropEffect(
        value: DropEffect | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof dnd.DropEffect * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "dropEffect", value.asInstanceOf[js.Any])
      
      inline def setDropEffectUndefined: Self = StObject.set(x, "dropEffect", js.undefined)
      
      inline def setDropLayout(
        value: DropLayout | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof dnd.DropLayout * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "dropLayout", value.asInstanceOf[js.Any])
      
      inline def setDropLayoutUndefined: Self = StObject.set(x, "dropLayout", js.undefined)
      
      inline def setDropPosition(
        value: DropPosition | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof dnd.DropPosition * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
      
      inline def setDropPositionUndefined: Self = StObject.set(x, "dropPosition", js.undefined)
      
      inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
      
      inline def setTargetAggregation(value: String | PropertyBindingInfo): Self = StObject.set(x, "targetAggregation", value.asInstanceOf[js.Any])
      
      inline def setTargetAggregationUndefined: Self = StObject.set(x, "targetAggregation", js.undefined)
    }
  }
}
