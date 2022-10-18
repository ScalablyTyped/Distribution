package typings.openui5

import typings.openui5.anon.LeadIndex
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelSelectionModelMod {
  
  @JSImport("sap/ui/model/SelectionModel", JSImport.Default)
  @js.native
  open class default protected () extends SelectionModel {
    /**
      * Constructs an instance of an sap.ui.model.SelectionModel.
      */
    def this(/**
      * `sap.ui.model.SelectionModel.SINGLE_SELECTION` or `sap.ui.model.SelectionModel.MULTI_SELECTION`
      */
    iSelectionMode: int) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/SelectionModel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * SelectionMode: Multi Selection
      */
    @JSImport("sap/ui/model/SelectionModel", "default.MULTI_SELECTION")
    @js.native
    def MULTI_SELECTION: int = js.native
    inline def MULTI_SELECTION_=(x: int): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MULTI_SELECTION")(x.asInstanceOf[js.Any])
    
    /**
      * SelectionMode: Single Selection
      */
    @JSImport("sap/ui/model/SelectionModel", "default.SINGLE_SELECTION")
    @js.native
    def SINGLE_SELECTION: int = js.native
    inline def SINGLE_SELECTION_=(x: int): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SINGLE_SELECTION")(x.asInstanceOf[js.Any])
    
    /**
      * Creates a new subclass of class sap.ui.model.SelectionModel with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.EventProvider.extend}.
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
    oClassInfo: ClassInfo[T, SelectionModel]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SelectionModel],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.SelectionModel.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait SelectionModel
    extends typings.openui5.sapUiBaseEventProviderMod.default {
    
    /**
      * Changes the selection to be the union of the current selection and the range between `iFromIndex` and
      * `iToIndex` inclusive. If `iFromIndex` is smaller than `iToIndex`, both parameters are swapped.
      *
      * In `SINGLE_SELECTION` selection mode, this is equivalent to calling `setSelectionInterval`, and only
      * the second index is used.
      *
      * If this call results in a change to the current selection or lead selection, then a `SelectionChanged`
      * event is fired.
      *
      * @returns `this` to allow method chaining
      */
    def addSelectionInterval(
      /**
      * one end of the interval.
      */
    iFromIndex: int,
      /**
      * other end of the interval
      */
    iToIndex: int
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChanged selectionChanged} event of
      * this `sap.ui.model.SelectionModel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.SelectionModel` itself.
      *
      * @returns `this` to allow method chaining
      */
    def attachSelectionChanged(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachSelectionChanged(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `SelectionModel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChanged selectionChanged} event of
      * this `sap.ui.model.SelectionModel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.SelectionModel` itself.
      *
      * @returns `this` to allow method chaining
      */
    def attachSelectionChanged(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function
    ): this.type = js.native
    def attachSelectionChanged(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `SelectionModel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Change the selection to the empty set and clears the lead selection.
      *
      * If this call results in a change to the current selection or lead selection, then a `SelectionChanged`
      * event is fired.
      *
      * @returns `this` to allow method chaining
      */
    def clearSelection(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:selectionChanged selectionChanged} event of
      * this `sap.ui.model.SelectionModel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelectionChanged(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachSelectionChanged(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Fires event {@link #event:selectionChanged selectionChanged} to attached listeners.
      *
      * Expects following event parameters:
      * 	 - 'leadIndex' of type `int` Lead selection index.
      * 	 - 'rowIndices' of type `int[]` Other selected indices (if available)
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelectionChanged(/**
      * Parameters to pass along with the event.
      */
    oParameters: LeadIndex): this.type = js.native
    
    /**
      * Return the second index argument from the most recent call to setSelectionInterval(), addSelectionInterval()
      * or removeSelectionInterval().
      *
      * @returns lead selected index
      */
    def getLeadSelectedIndex(): int = js.native
    
    /**
      * Returns the selected indices as array.
      *
      * @returns array of selected indices
      */
    def getSelectedIndices(): js.Array[int] = js.native
    
    /**
      * Returns the current selection mode.
      *
      * @returns the current selection mode
      */
    def getSelectionMode(): int = js.native
    
    /**
      * Returns true if the specified index is selected.
      *
      * @returns true if the specified index is selected.
      */
    def isSelectedIndex(iIndex: int): Boolean = js.native
    
    /**
      * Moves all selected indices starting at the position `iStartIndex` `iMove` items.
      *
      * This can be used if new items are inserted to the item set and you want to keep the selection. To handle
      * a deletion of items use `sliceSelectionInterval`.
      *
      * If this call results in a change to the current selection or lead selection, then a `SelectionChanged`
      * event is fired.
      *
      * @returns `this` to allow method chaining
      */
    def moveSelectionInterval(/**
      * start at this position
      */
    iStartIndex: int, iMove: int): this.type = js.native
    
    /**
      * Changes the selection to be the set difference of the current selection and the indices between `iFromIndex`
      * and `iToIndex` inclusive. If `iFromIndex` is smaller than `iToIndex`, both parameters are swapped.
      *
      * If the range of removed selection indices includes the current lead selection, then the lead selection
      * will be unset (set to -1).
      *
      * If this call results in a change to the current selection or lead selection, then a `SelectionChanged`
      * event is fired.
      *
      * @returns `this` to allow method chaining
      */
    def removeSelectionInterval(
      /**
      * one end of the interval.
      */
    iFromIndex: int,
      /**
      * other end of the interval
      */
    iToIndex: int
    ): this.type = js.native
    
    /**
      * Selects all rows up to the `iToIndex`.
      *
      * If this call results in a change to the current selection, then a `SelectionChanged` event is fired.
      *
      * @returns `this` to allow method chaining
      */
    def selectAll(/**
      * end of the interval
      */
    iToIndex: int): this.type = js.native
    
    /**
      * Changes the selection to be equal to the range `iFromIndex` and `iToIndex` inclusive. If `iFromIndex`
      * is smaller than `iToIndex`, both parameters are swapped.
      *
      * In `SINGLE_SELECTION` selection mode, only `iToIndex` is used.
      *
      * If this call results in a change to the current selection, then a `SelectionChanged` event is fired.
      *
      * @returns `this` to allow method chaining
      */
    def setSelectionInterval(
      /**
      * one end of the interval.
      */
    iFromIndex: int,
      /**
      * other end of the interval
      */
    iToIndex: int
    ): this.type = js.native
    
    /**
      * Sets the selection mode. The following list describes the accepted selection modes:
      * 	`sap.ui.model.SelectionModel.SINGLE_SELECTION` - Only one list index can be selected at a time. In this
      * mode, `setSelectionInterval` and `addSelectionInterval` are equivalent, both replacing the current selection
      * with the index represented by the second argument (the "lead"). `sap.ui.model.SelectionModel.MULTI_SELECTION`
      * - In this mode, there's no restriction on what can be selected.
      */
    def setSelectionMode(/**
      * selection mode
      */
    iSelectionMode: int): Unit = js.native
    
    /**
      * Slices a the indices between the two indices from the selection. If `iFromIndex` is smaller than `iToIndex`,
      * both parameters are swapped.
      *
      * If the range of removed selection indices includes the current lead selection, then the lead selection
      * will be unset (set to -1).
      *
      * If this call results in a change to the current selection or lead selection, then a `SelectionChanged`
      * event is fired.
      *
      * @returns `this` to allow method chaining
      */
    def sliceSelectionInterval(
      /**
      * one end of the interval.
      */
    iFromIndex: int,
      /**
      * other end of the interval
      */
    iToIndex: int
    ): this.type = js.native
  }
}
