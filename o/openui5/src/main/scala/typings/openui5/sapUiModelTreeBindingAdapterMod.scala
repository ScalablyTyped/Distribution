package typings.openui5

import typings.openui5.anon.LeadIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelTreeBindingAdapterMod {
  
  @JSImport("sap/ui/model/TreeBindingAdapter", JSImport.Default)
  @js.native
  /**
    * Adapter for TreeBindings to add the ListBinding functionality and use the tree structure in list based
    * controls.
    */
  open class default ()
    extends StObject
       with TreeBindingAdapter
  
  @js.native
  trait TreeBindingAdapter extends StObject {
    
    /**
      * @deprecated (since 1.52) - This method is marked as 'protected' which was meant to be overwritten by
      * its subclasses. It may be renamed or deleted and should only be called from this class or its subclasses.
      *
      * Calculate the request length based on the given information.
      *
      * @returns The calculated request length
      */
    def _calculateRequestLength(
      /**
      * The maximum group size
      */
    iMaxGroupSize: Double,
      /**
      * The information of the current section
      */
    oSection: js.Object
    ): Double = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChanged selectionChanged} event of
      * this `sap.ui.model.TreeBindingAdapter`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.TreeBindingAdapter` itself.
      *
      * Event is fired if the selection of tree nodes is changed in any way.
      *
      * @returns Reference to `this` in order to allow method chaining
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
      * Context object to call the event handler with. Defaults to this `TreeBindingAdapter` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChanged selectionChanged} event of
      * this `sap.ui.model.TreeBindingAdapter`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.TreeBindingAdapter` itself.
      *
      * Event is fired if the selection of tree nodes is changed in any way.
      *
      * @returns Reference to `this` in order to allow method chaining
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
      * Context object to call the event handler with. Defaults to this `TreeBindingAdapter` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:selectionChanged selectionChanged} event of
      * this `sap.ui.model.TreeBindingAdapter`.
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
      * Gets an array of contexts for the requested part of the tree.
      *
      * @returns The requested tree contexts
      */
    def getContexts(): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getContexts(/**
      * The index of the first requested context
      */
    iStartIndex: Double): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getContexts(
      /**
      * The index of the first requested context
      */
    iStartIndex: Double,
      /**
      * The maximum number of returned contexts; if not given the model's size limit is used; see {@link sap.ui.model.Model#setSizeLimit}
      */
    iLength: Double
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getContexts(
      /**
      * The index of the first requested context
      */
    iStartIndex: Double,
      /**
      * The maximum number of returned contexts; if not given the model's size limit is used; see {@link sap.ui.model.Model#setSizeLimit}
      */
    iLength: Double,
      /**
      * The maximum number of contexts to read to read additionally as buffer
      */
    iThreshold: Double
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getContexts(
      /**
      * The index of the first requested context
      */
    iStartIndex: Double,
      /**
      * The maximum number of returned contexts; if not given the model's size limit is used; see {@link sap.ui.model.Model#setSizeLimit}
      */
    iLength: Unit,
      /**
      * The maximum number of contexts to read to read additionally as buffer
      */
    iThreshold: Double
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getContexts(
      /**
      * The index of the first requested context
      */
    iStartIndex: Unit,
      /**
      * The maximum number of returned contexts; if not given the model's size limit is used; see {@link sap.ui.model.Model#setSizeLimit}
      */
    iLength: Double
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getContexts(
      /**
      * The index of the first requested context
      */
    iStartIndex: Unit,
      /**
      * The maximum number of returned contexts; if not given the model's size limit is used; see {@link sap.ui.model.Model#setSizeLimit}
      */
    iLength: Double,
      /**
      * The maximum number of contexts to read to read additionally as buffer
      */
    iThreshold: Double
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getContexts(
      /**
      * The index of the first requested context
      */
    iStartIndex: Unit,
      /**
      * The maximum number of returned contexts; if not given the model's size limit is used; see {@link sap.ui.model.Model#setSizeLimit}
      */
    iLength: Unit,
      /**
      * The maximum number of contexts to read to read additionally as buffer
      */
    iThreshold: Double
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    
    /**
      * Returns the number of entries in the tree.
      *
      * @returns Returns the number of entries in the tree
      */
    def getLength(): Double = js.native
  }
}
