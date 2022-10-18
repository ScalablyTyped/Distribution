package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StandardTileType extends StObject
@JSImport("sap/m/library", "StandardTileType")
@js.native
object StandardTileType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StandardTileType & String] = js.native
  
  /**
    * Tile representing that something needs to be created
    */
  @js.native
  sealed trait Create
    extends StObject
       with StandardTileType
  /* "Create" */ val Create: typings.openui5.sapMLibraryMod.StandardTileType.Create & String = js.native
  
  /**
    * Monitor tile
    */
  @js.native
  sealed trait Monitor
    extends StObject
       with StandardTileType
  /* "Monitor" */ val Monitor: typings.openui5.sapMLibraryMod.StandardTileType.Monitor & String = js.native
  
  /**
    * Default type
    */
  @js.native
  sealed trait None
    extends StObject
       with StandardTileType
  /* "None" */ val None: typings.openui5.sapMLibraryMod.StandardTileType.None & String = js.native
}
