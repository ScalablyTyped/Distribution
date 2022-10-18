package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiSuiteLibraryMod {
  
  @js.native
  sealed trait TaskCircleColor extends StObject
  @JSImport("sap/ui/suite/library", "TaskCircleColor")
  @js.native
  object TaskCircleColor extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TaskCircleColor & String] = js.native
    
    /**
      * Default value
      */
    @js.native
    sealed trait Gray
      extends StObject
         with TaskCircleColor
    /* "Gray" */ val Gray: typings.openui5.sapUiSuiteLibraryMod.TaskCircleColor.Gray & String = js.native
    
    /**
      * Green
      */
    @js.native
    sealed trait Green
      extends StObject
         with TaskCircleColor
    /* "Green" */ val Green: typings.openui5.sapUiSuiteLibraryMod.TaskCircleColor.Green & String = js.native
    
    /**
      * Red
      */
    @js.native
    sealed trait Red
      extends StObject
         with TaskCircleColor
    /* "Red" */ val Red: typings.openui5.sapUiSuiteLibraryMod.TaskCircleColor.Red & String = js.native
    
    /**
      * Yellow
      */
    @js.native
    sealed trait Yellow
      extends StObject
         with TaskCircleColor
    /* "Yellow" */ val Yellow: typings.openui5.sapUiSuiteLibraryMod.TaskCircleColor.Yellow & String = js.native
  }
}
