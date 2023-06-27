package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcFilterbarIfiltercontainerMod {
  
  @JSImport("sap/ui/mdc/filterbar/IFilterContainer", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with IFilterContainer {
    
    /**
      * Overwrites the default exit to clean up the created layout properly.
      */
    /* CompleteClass */
    override def exit(): Unit = js.native
    
    /**
      * Returns the inner controls of the layout item.
      *
      * @returns Array of all inner controls in the layout item
      */
    /* CompleteClass */
    override def getFilterFields(): js.Array[/* was: sap.ui.mdc.FilterItem */ Any] = js.native
    
    /**
      * Getter for the inner layout item.
      *
      * @returns Control instance of the inner layout item
      */
    /* CompleteClass */
    override def getInner(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Creates the inner layout for the `IFilterContainer`.
      */
    /* CompleteClass */
    override def init(): Unit = js.native
    
    /**
      * Inserts the inner content into the layout item.
      */
    /* CompleteClass */
    override def insertFilterField(
      /**
      * to be inserted
      */
    oControl: /* was: sap.ui.mdc.FilterItem */ Any,
      /**
      * Position where the control is added
      */
    iIndex: int
    ): Unit = js.native
    
    /**
      * Removes the inner content from the layout item.
      */
    /* CompleteClass */
    override def removeFilterField(/**
      * Control that is removed
      */
    oControl: /* was: sap.ui.mdc.FilterItem */ Any): Unit = js.native
  }
  
  trait IFilterContainer extends StObject {
    
    /**
      * Overwrites the default exit to clean up the created layout properly.
      */
    def exit(): Unit
    
    /**
      * Returns the inner controls of the layout item.
      *
      * @returns Array of all inner controls in the layout item
      */
    def getFilterFields(): js.Array[/* was: sap.ui.mdc.FilterItem */ Any]
    
    /**
      * Getter for the inner layout item.
      *
      * @returns Control instance of the inner layout item
      */
    def getInner(): typings.openui5.sapUiCoreControlMod.default
    
    /**
      * Creates the inner layout for the `IFilterContainer`.
      */
    def init(): Unit
    
    /**
      * Inserts the inner content into the layout item.
      */
    def insertFilterField(
      /**
      * to be inserted
      */
    oControl: /* was: sap.ui.mdc.FilterItem */ Any,
      /**
      * Position where the control is added
      */
    iIndex: int
    ): Unit
    
    /**
      * Removes the inner content from the layout item.
      */
    def removeFilterField(/**
      * Control that is removed
      */
    oControl: /* was: sap.ui.mdc.FilterItem */ Any): Unit
  }
  object IFilterContainer {
    
    inline def apply(
      exit: () => Unit,
      getFilterFields: () => js.Array[/* was: sap.ui.mdc.FilterItem */ Any],
      getInner: () => typings.openui5.sapUiCoreControlMod.default,
      init: () => Unit,
      insertFilterField: (/* was: sap.ui.mdc.FilterItem */ Any, int) => Unit,
      removeFilterField: /* was: sap.ui.mdc.FilterItem */ Any => Unit
    ): IFilterContainer = {
      val __obj = js.Dynamic.literal(exit = js.Any.fromFunction0(exit), getFilterFields = js.Any.fromFunction0(getFilterFields), getInner = js.Any.fromFunction0(getInner), init = js.Any.fromFunction0(init), insertFilterField = js.Any.fromFunction2(insertFilterField), removeFilterField = js.Any.fromFunction1(removeFilterField))
      __obj.asInstanceOf[IFilterContainer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFilterContainer] (val x: Self) extends AnyVal {
      
      inline def setExit(value: () => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction0(value))
      
      inline def setGetFilterFields(value: () => js.Array[/* was: sap.ui.mdc.FilterItem */ Any]): Self = StObject.set(x, "getFilterFields", js.Any.fromFunction0(value))
      
      inline def setGetInner(value: () => typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "getInner", js.Any.fromFunction0(value))
      
      inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      inline def setInsertFilterField(value: (/* was: sap.ui.mdc.FilterItem */ Any, int) => Unit): Self = StObject.set(x, "insertFilterField", js.Any.fromFunction2(value))
      
      inline def setRemoveFilterField(value: /* was: sap.ui.mdc.FilterItem */ Any => Unit): Self = StObject.set(x, "removeFilterField", js.Any.fromFunction1(value))
    }
  }
}
