package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelAnalyticsAnalyticalTreeBindingAdapterMod {
  
  @JSImport("sap/ui/model/analytics/AnalyticalTreeBindingAdapter", JSImport.Default)
  @js.native
  /**
    * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
    *
    * Adapter for TreeBindings to add the ListBinding functionality and use the tree structure in list based
    * controls.
    */
  open class default ()
    extends StObject
       with AnalyticalTreeBindingAdapter {
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Retrieves the currently set number of expanded levels from the Binding (commonly an AnalyticalBinding).
      *
      * @returns the number of expanded levels
      */
    /* CompleteClass */
    override def getNumberOfExpandedLevels(): int = js.native
    
    /**
      * Checks if the AnalyticalBinding has totaled measures available. Used for rendering sum rows.
      *
      * @returns Whether the binding has totaled measures or not
      */
    /* CompleteClass */
    override def hasTotaledMeasures(): Boolean = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Sets the number of expanded levels on the TreeBinding (commonly an AnalyticalBinding). This is NOT the
      * same as AnalyticalTreeBindingAdapter#collapse or AnalyticalTreeBindingAdapter#expand. Setting the number
      * of expanded levels leads to different requests. This function is used by the AnalyticalTable for the
      * ungroup/ungroup-all feature.
      */
    /* CompleteClass */
    override def setNumberOfExpandedLevels(/**
      * the number of levels which should be expanded, minimum is 0
      */
    iLevels: int): Unit = js.native
  }
  
  trait AnalyticalTreeBindingAdapter extends StObject {
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Retrieves the currently set number of expanded levels from the Binding (commonly an AnalyticalBinding).
      *
      * @returns the number of expanded levels
      */
    def getNumberOfExpandedLevels(): int
    
    /**
      * Checks if the AnalyticalBinding has totaled measures available. Used for rendering sum rows.
      *
      * @returns Whether the binding has totaled measures or not
      */
    def hasTotaledMeasures(): Boolean
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Sets the number of expanded levels on the TreeBinding (commonly an AnalyticalBinding). This is NOT the
      * same as AnalyticalTreeBindingAdapter#collapse or AnalyticalTreeBindingAdapter#expand. Setting the number
      * of expanded levels leads to different requests. This function is used by the AnalyticalTable for the
      * ungroup/ungroup-all feature.
      */
    def setNumberOfExpandedLevels(/**
      * the number of levels which should be expanded, minimum is 0
      */
    iLevels: int): Unit
  }
  object AnalyticalTreeBindingAdapter {
    
    inline def apply(
      getNumberOfExpandedLevels: () => int,
      hasTotaledMeasures: () => Boolean,
      setNumberOfExpandedLevels: int => Unit
    ): AnalyticalTreeBindingAdapter = {
      val __obj = js.Dynamic.literal(getNumberOfExpandedLevels = js.Any.fromFunction0(getNumberOfExpandedLevels), hasTotaledMeasures = js.Any.fromFunction0(hasTotaledMeasures), setNumberOfExpandedLevels = js.Any.fromFunction1(setNumberOfExpandedLevels))
      __obj.asInstanceOf[AnalyticalTreeBindingAdapter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnalyticalTreeBindingAdapter] (val x: Self) extends AnyVal {
      
      inline def setGetNumberOfExpandedLevels(value: () => int): Self = StObject.set(x, "getNumberOfExpandedLevels", js.Any.fromFunction0(value))
      
      inline def setHasTotaledMeasures(value: () => Boolean): Self = StObject.set(x, "hasTotaledMeasures", js.Any.fromFunction0(value))
      
      inline def setSetNumberOfExpandedLevels(value: int => Unit): Self = StObject.set(x, "setNumberOfExpandedLevels", js.Any.fromFunction1(value))
    }
  }
}
