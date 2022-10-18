package typings.openui5

import typings.openui5.anon.View
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUxapLibraryMod.BlockBaseColumnLayout
import typings.openui5.sapUxapLibraryMod.BlockBaseFormAdjustment
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUxapBlockBaseMod {
  
  @JSImport("sap/uxap/BlockBase", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `BlockBase`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link topic:4527729576cb4a4888275b6935aad03a Block Base}
    * 	{@link topic:2978f6064742456ebed31c5ccf4d051d Creating Blocks}
    */
  open class default () extends BlockBase {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: BlockBaseSettings) = this()
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
    mSettings: BlockBaseSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: BlockBaseSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/uxap/BlockBase", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.uxap.BlockBase with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, BlockBase]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, BlockBase],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.uxap.BlockBase.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait BlockBase
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some mapping to the aggregation {@link #getMappings mappings}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addMapping(
      /**
      * The mapping to add; if empty, nothing is inserted
      */
    oMapping: typings.openui5.sapUxapModelMappingMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.72
      *
      * Attaches event handler `fnFunction` to the {@link #event:viewInit viewInit} event of this `sap.uxap.BlockBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.uxap.BlockBase` itself.
      *
      * Fired when an aggregated view is instantiated.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachViewInit(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachViewInit(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.uxap.BlockBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.72
      *
      * Attaches event handler `fnFunction` to the {@link #event:viewInit viewInit} event of this `sap.uxap.BlockBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.uxap.BlockBase` itself.
      *
      * Fired when an aggregated view is instantiated.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachViewInit(
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
    def attachViewInit(
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
      * Context object to call the event handler with. Defaults to this `sap.uxap.BlockBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Creates a view.
      *
      * @returns A promise on the created view.
      */
    def createView(
      /**
      * View metadata
      */
    mParameter: js.Object,
      /**
      * Mode associated with the view
      */
    sMode: String
    ): js.Promise[typings.openui5.sapUiCoreMvcViewMod.default] = js.native
    
    /**
      * Destroys all the mappings in the aggregation {@link #getMappings mappings}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyMappings(): this.type = js.native
    
    /**
      * @SINCE 1.72
      *
      * Detaches event handler `fnFunction` from the {@link #event:viewInit viewInit} event of this `sap.uxap.BlockBase`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachViewInit(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachViewInit(
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
      * @SINCE 1.72
      *
      * Fires event {@link #event:viewInit viewInit} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireViewInit(): this.type = js.native
    def fireViewInit(/**
      * Parameters to pass along with the event
      */
    mParameters: View): this.type = js.native
    
    /**
      * Gets current value of property {@link #getColumnLayout columnLayout}.
      *
      * Determines on how many columns the layout will be rendered. Allowed values are integers from 1 to 4 and
      * "auto".
      *
      * Default value is `"auto"`.
      *
      * @returns Value of property `columnLayout`
      */
    def getColumnLayout(): BlockBaseColumnLayout = js.native
    
    /**
      * Gets current value of property {@link #getFormAdjustment formAdjustment}.
      *
      * Determines if the block should automatically adjust its inner forms. Allowed values are "BlockColumns"
      * and "OneColumn" and "None". If the value is "BlockColumns", then the inner form will have as many columns
      * as the colspan of its parent block. If the value is "OneColumn", the inner form will have exactly one
      * column, regardless the colspan of its parent block. If the value is "None", no automatic adjustment of
      * inner forms will be made and the form will keep its original column count.
      *
      * Default value is `BlockColumns`.
      *
      * @returns Value of property `formAdjustment`
      */
    def getFormAdjustment(): BlockBaseFormAdjustment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BlockBaseFormAdjustment * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getMappings mappings}.
      *
      * Map external UI5 model and internal Block model
      */
    def getMappings(): js.Array[typings.openui5.sapUxapModelMappingMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getMode mode}.
      *
      * Determines the mode of the block. See {@link sap.uxap.ObjectPageSubSectionMode ObjectPageSubSectionMode}.
      * When `BlockBase` is used inside an `ObjectPageLayout`, the `mode` property is inherited from the respective
      * {@link sap.uxap.ObjectPageSubSection SubSection}. The `mode` property of `BlockBase` changes when the
      * `mode` property of `ObjectPageSubSection` changes.
      *
      * @returns Value of property `mode`
      */
    def getMode(): String = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getSelectedView selectedView},
      * or `null`.
      */
    def getSelectedView(): ID = js.native
    
    /**
      * Gets current value of property {@link #getShowSubSectionMore showSubSectionMore}.
      *
      * Determines whether the show more button should be shown.
      *
      * **Note:** The property will take effect if the `BlockBase` is inside `ObjectPageSubSection` and would
      * be ignored in case the `BlockBase` is nested inside another `BlockBase`.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showSubSectionMore`
      */
    def getShowSubSectionMore(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.uxap.ModelMapping` in the aggregation {@link #getMappings mappings}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfMapping(
      /**
      * The mapping whose index is looked for
      */
    oMapping: typings.openui5.sapUxapModelMappingMod.default
    ): int = js.native
    
    /**
      * Inserts a mapping into the aggregation {@link #getMappings mappings}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertMapping(
      /**
      * The mapping to insert; if empty, nothing is inserted
      */
    oMapping: typings.openui5.sapUxapModelMappingMod.default,
      /**
      * The `0`-based index the mapping should be inserted at; for a negative value of `iIndex`, the mapping
      * is inserted at position 0; for a value greater than the current size of the aggregation, the mapping
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getMappings mappings}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllMappings(): js.Array[typings.openui5.sapUxapModelMappingMod.default] = js.native
    
    def removeMapping(/**
      * The mapping to remove or its index or id
      */
    vMapping: String): typings.openui5.sapUxapModelMappingMod.default | Null = js.native
    /**
      * Removes a mapping from the aggregation {@link #getMappings mappings}.
      *
      * @returns The removed mapping or `null`
      */
    def removeMapping(/**
      * The mapping to remove or its index or id
      */
    vMapping: int): typings.openui5.sapUxapModelMappingMod.default | Null = js.native
    def removeMapping(
      /**
      * The mapping to remove or its index or id
      */
    vMapping: typings.openui5.sapUxapModelMappingMod.default
    ): typings.openui5.sapUxapModelMappingMod.default | Null = js.native
    
    /**
      * Set the column layout for this particular block.
      *
      * @returns this
      */
    def setColumnLayout(/**
      * The column layout to apply to the control
      */
    sLayout: String): Any = js.native
    
    /**
      * Sets a new value for property {@link #getFormAdjustment formAdjustment}.
      *
      * Determines if the block should automatically adjust its inner forms. Allowed values are "BlockColumns"
      * and "OneColumn" and "None". If the value is "BlockColumns", then the inner form will have as many columns
      * as the colspan of its parent block. If the value is "OneColumn", the inner form will have exactly one
      * column, regardless the colspan of its parent block. If the value is "None", no automatic adjustment of
      * inner forms will be made and the form will keep its original column count.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `BlockColumns`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFormAdjustment(): this.type = js.native
    def setFormAdjustment(
      /**
      * New value for property `formAdjustment`
      */
    sFormAdjustment: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BlockBaseFormAdjustment * / any */ String
    ): this.type = js.native
    def setFormAdjustment(/**
      * New value for property `formAdjustment`
      */
    sFormAdjustment: BlockBaseFormAdjustment): this.type = js.native
    
    /**
      * Set the view mode for this particular block.
      *
      * @returns this
      */
    def setMode(
      /**
      * the mode to apply to the control (that should be synchronized with view declared)
      */
    sMode: String
    ): Any = js.native
    
    def setSelectedView(
      /**
      * ID of an element which becomes the new target of this selectedView association; alternatively, an element
      * instance may be given
      */
    oSelectedView: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Sets the associated {@link #getSelectedView selectedView}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelectedView(
      /**
      * ID of an element which becomes the new target of this selectedView association; alternatively, an element
      * instance may be given
      */
    oSelectedView: ID
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowSubSectionMore showSubSectionMore}.
      *
      * Determines whether the show more button should be shown.
      *
      * **Note:** The property will take effect if the `BlockBase` is inside `ObjectPageSubSection` and would
      * be ignored in case the `BlockBase` is nested inside another `BlockBase`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowSubSectionMore(): this.type = js.native
    def setShowSubSectionMore(/**
      * New value for property `showSubSectionMore`
      */
    bShowSubSectionMore: Boolean): this.type = js.native
  }
  
  trait BlockBaseSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Determines on how many columns the layout will be rendered. Allowed values are integers from 1 to 4 and
      * "auto".
      */
    var columnLayout: js.UndefOr[
        BlockBaseColumnLayout | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines if the block should automatically adjust its inner forms. Allowed values are "BlockColumns"
      * and "OneColumn" and "None". If the value is "BlockColumns", then the inner form will have as many columns
      * as the colspan of its parent block. If the value is "OneColumn", the inner form will have exactly one
      * column, regardless the colspan of its parent block. If the value is "None", no automatic adjustment of
      * inner forms will be made and the form will keep its original column count.
      */
    var formAdjustment: js.UndefOr[
        BlockBaseFormAdjustment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BlockBaseFormAdjustment * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Map external UI5 model and internal Block model
      */
    var mappings: js.UndefOr[
        js.Array[typings.openui5.sapUxapModelMappingMod.default] | typings.openui5.sapUxapModelMappingMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the mode of the block. See {@link sap.uxap.ObjectPageSubSectionMode ObjectPageSubSectionMode}.
      * When `BlockBase` is used inside an `ObjectPageLayout`, the `mode` property is inherited from the respective
      * {@link sap.uxap.ObjectPageSubSection SubSection}. The `mode` property of `BlockBase` changes when the
      * `mode` property of `ObjectPageSubSection` changes.
      */
    var mode: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The current view. Corresponds to the currently specified `mode` of the sap.uxap.BlockBase.
      * Can be used as a getter for the internally created view.
      *
      * **Note:** As the views are created asynchronously, this association will be updated only after the view
      * creation is completed. Applications that want to be notified when a view is created should subscribe
      * to the `viewInit` event.
      */
    var selectedView: js.UndefOr[typings.openui5.sapUiCoreControlMod.default | String] = js.undefined
    
    /**
      * Determines whether the show more button should be shown.
      *
      * **Note:** The property will take effect if the `BlockBase` is inside `ObjectPageSubSection` and would
      * be ignored in case the `BlockBase` is nested inside another `BlockBase`.
      */
    var showSubSectionMore: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.72
      *
      * Fired when an aggregated view is instantiated.
      */
    var viewInit: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
  }
  object BlockBaseSettings {
    
    inline def apply(): BlockBaseSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockBaseSettings]
    }
    
    extension [Self <: BlockBaseSettings](x: Self) {
      
      inline def setColumnLayout(
        value: BlockBaseColumnLayout | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "columnLayout", value.asInstanceOf[js.Any])
      
      inline def setColumnLayoutUndefined: Self = StObject.set(x, "columnLayout", js.undefined)
      
      inline def setFormAdjustment(
        value: BlockBaseFormAdjustment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BlockBaseFormAdjustment * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "formAdjustment", value.asInstanceOf[js.Any])
      
      inline def setFormAdjustmentUndefined: Self = StObject.set(x, "formAdjustment", js.undefined)
      
      inline def setMappings(
        value: js.Array[typings.openui5.sapUxapModelMappingMod.default] | typings.openui5.sapUxapModelMappingMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      inline def setMappingsUndefined: Self = StObject.set(x, "mappings", js.undefined)
      
      inline def setMappingsVarargs(value: typings.openui5.sapUxapModelMappingMod.default*): Self = StObject.set(x, "mappings", js.Array(value*))
      
      inline def setMode(value: String | PropertyBindingInfo): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setSelectedView(value: typings.openui5.sapUiCoreControlMod.default | String): Self = StObject.set(x, "selectedView", value.asInstanceOf[js.Any])
      
      inline def setSelectedViewUndefined: Self = StObject.set(x, "selectedView", js.undefined)
      
      inline def setShowSubSectionMore(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showSubSectionMore", value.asInstanceOf[js.Any])
      
      inline def setShowSubSectionMoreUndefined: Self = StObject.set(x, "showSubSectionMore", js.undefined)
      
      inline def setViewInit(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "viewInit", js.Any.fromFunction1(value))
      
      inline def setViewInitUndefined: Self = StObject.set(x, "viewInit", js.undefined)
    }
  }
}
