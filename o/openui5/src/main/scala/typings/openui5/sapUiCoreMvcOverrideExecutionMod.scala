package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreMvcOverrideExecutionMod {
  
  /**
    * Execution option for overrides defined by a `ControllerExtension`.
    * See:
    * 	sap.ui.core.mvc.ControllerExtension
    */
  @JSImport("sap/ui/core/mvc/OverrideExecution", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[OverrideExecution & String] = js.native
    
    /* "After" */ val After: typings.openui5.sapUiCoreMvcOverrideExecutionMod.OverrideExecution.After & String = js.native
    
    /* "Before" */ val Before: typings.openui5.sapUiCoreMvcOverrideExecutionMod.OverrideExecution.Before & String = js.native
    
    /* "Instead" */ val Instead: typings.openui5.sapUiCoreMvcOverrideExecutionMod.OverrideExecution.Instead & String = js.native
  }
  
  @js.native
  sealed trait OverrideExecution extends StObject
  /**
    * Execution option for overrides defined by a `ControllerExtension`.
    * See:
    * 	sap.ui.core.mvc.ControllerExtension
    */
  @JSImport("sap/ui/core/mvc/OverrideExecution", "OverrideExecution")
  @js.native
  object OverrideExecution extends StObject {
    
    /**
      * The override function gets executed after the original function
      */
    @js.native
    sealed trait After
      extends StObject
         with OverrideExecution
    
    /**
      * The override function gets executed before the original function
      */
    @js.native
    sealed trait Before
      extends StObject
         with OverrideExecution
    
    /**
      * The override function is called instead of the original function
      *
      * This is the default option for ControllerExtension overrides
      */
    @js.native
    sealed trait Instead
      extends StObject
         with OverrideExecution
  }
}
