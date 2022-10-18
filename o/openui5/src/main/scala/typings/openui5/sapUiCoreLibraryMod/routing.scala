package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routing {
  
  @js.native
  sealed trait HistoryDirection extends StObject
  /**
    * Enumeration for different HistoryDirections.
    */
  @JSImport("sap/ui/core/library", "routing.HistoryDirection")
  @js.native
  object HistoryDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[HistoryDirection & String] = js.native
    
    /**
      * The page has already been navigated to and it was the predecessor of the previous page.
      */
    @js.native
    sealed trait Backwards
      extends StObject
         with HistoryDirection
    /* "Backwards" */ val Backwards: typings.openui5.sapUiCoreLibraryMod.routing.HistoryDirection.Backwards & String = js.native
    
    /**
      * The page has already been navigated to and it was the successor of the previous page.
      */
    @js.native
    sealed trait Forwards
      extends StObject
         with HistoryDirection
    /* "Forwards" */ val Forwards: typings.openui5.sapUiCoreLibraryMod.routing.HistoryDirection.Forwards & String = js.native
    
    /**
      * A new entry is added to the history.
      */
    @js.native
    sealed trait NewEntry
      extends StObject
         with HistoryDirection
    /* "NewEntry" */ val NewEntry: typings.openui5.sapUiCoreLibraryMod.routing.HistoryDirection.NewEntry & String = js.native
    
    /**
      * A navigation took place, but it could be any of the other three states.
      */
    @js.native
    sealed trait Unknown
      extends StObject
         with HistoryDirection
    /* "Unknown" */ val Unknown: typings.openui5.sapUiCoreLibraryMod.routing.HistoryDirection.Unknown & String = js.native
  }
}
