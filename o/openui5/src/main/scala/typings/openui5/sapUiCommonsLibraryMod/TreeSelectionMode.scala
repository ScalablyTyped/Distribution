package typings.openui5.sapUiCommonsLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TreeSelectionMode extends StObject
@JSImport("sap/ui/commons/library", "TreeSelectionMode")
@js.native
object TreeSelectionMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TreeSelectionMode & String] = js.native
  
  /**
    * Behavior of the former Tree. It is possible to select a plurality of nodes via the API.
    */
  @js.native
  sealed trait Legacy
    extends StObject
       with TreeSelectionMode
  /* "Legacy" */ val Legacy: typings.openui5.sapUiCommonsLibraryMod.TreeSelectionMode.Legacy & String = js.native
  
  /**
    * Select multiple rows at a time.
    */
  @js.native
  sealed trait Multi
    extends StObject
       with TreeSelectionMode
  /* "Multi" */ val Multi: typings.openui5.sapUiCommonsLibraryMod.TreeSelectionMode.Multi & String = js.native
  
  /**
    * No rows can be selected.
    */
  @js.native
  sealed trait None
    extends StObject
       with TreeSelectionMode
  /* "None" */ val None: typings.openui5.sapUiCommonsLibraryMod.TreeSelectionMode.None & String = js.native
  
  /**
    * Select one row at a time.
    */
  @js.native
  sealed trait Single
    extends StObject
       with TreeSelectionMode
  /* "Single" */ val Single: typings.openui5.sapUiCommonsLibraryMod.TreeSelectionMode.Single & String = js.native
}
