package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelTreeAutoExpandModeMod {
  
  /**
    * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
    *
    * Different modes for setting the auto expand mode on tree or analytical bindings.
    */
  @JSImport("sap/ui/model/TreeAutoExpandMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TreeAutoExpandMode & String] = js.native
    
    /* "Bundled" */ val Bundled: typings.openui5.sapUiModelTreeAutoExpandModeMod.TreeAutoExpandMode.Bundled & String = js.native
    
    /* "Sequential" */ val Sequential: typings.openui5.sapUiModelTreeAutoExpandModeMod.TreeAutoExpandMode.Sequential & String = js.native
  }
  
  @js.native
  sealed trait TreeAutoExpandMode extends StObject
  /**
    * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
    *
    * Different modes for setting the auto expand mode on tree or analytical bindings.
    */
  @JSImport("sap/ui/model/TreeAutoExpandMode", "TreeAutoExpandMode")
  @js.native
  object TreeAutoExpandMode extends StObject {
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * If supported by a backend provider with analytical capabilities, the requests needed for an automatic
      * node expansion are bundled.
      */
    @js.native
    sealed trait Bundled
      extends StObject
         with TreeAutoExpandMode
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Tree nodes will be expanded in sequence, level by level (Single requests are sent).
      */
    @js.native
    sealed trait Sequential
      extends StObject
         with TreeAutoExpandMode
  }
}
