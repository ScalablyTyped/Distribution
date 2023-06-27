package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GenericTileScope extends StObject
@JSImport("sap/m/library", "GenericTileScope")
@js.native
object GenericTileScope extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[GenericTileScope & String] = js.native
  
  /**
    * @since 1.76
    *
    * More action scope (Only the More icon is added to the tile)
    */
  @js.native
  sealed trait ActionMore
    extends StObject
       with GenericTileScope
  /* "ActionMore" */ val ActionMore: typings.openui5.sapMLibraryMod.GenericTileScope.ActionMore & String = js.native
  
  /**
    * @since 1.76
    *
    * Remove action scope (Only the Remove icon is added to the tile)
    */
  @js.native
  sealed trait ActionRemove
    extends StObject
       with GenericTileScope
  /* "ActionRemove" */ val ActionRemove: typings.openui5.sapMLibraryMod.GenericTileScope.ActionRemove & String = js.native
  
  /**
    * Action scope (Possible footer and Error State information is overlaid, "Remove" and "More" icons are
    * added to the tile).
    */
  @js.native
  sealed trait Actions
    extends StObject
       with GenericTileScope
  /* "Actions" */ val Actions: typings.openui5.sapMLibraryMod.GenericTileScope.Actions & String = js.native
  
  /**
    * Default scope (The default scope of the tile, no action icons are rendered).
    */
  @js.native
  sealed trait Display
    extends StObject
       with GenericTileScope
  /* "Display" */ val Display: typings.openui5.sapMLibraryMod.GenericTileScope.Display & String = js.native
}
