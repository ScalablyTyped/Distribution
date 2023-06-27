package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BorderDesign extends StObject
@JSImport("sap/m/library", "BorderDesign")
@js.native
object BorderDesign extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BorderDesign & String] = js.native
  
  /**
    * Specifies no border.
    */
  @js.native
  sealed trait None
    extends StObject
       with BorderDesign
  /* "None" */ val None: typings.openui5.sapMLibraryMod.BorderDesign.None & String = js.native
  
  /**
    * A solid border color dependent on the theme.
    */
  @js.native
  sealed trait Solid
    extends StObject
       with BorderDesign
  /* "Solid" */ val Solid: typings.openui5.sapMLibraryMod.BorderDesign.Solid & String = js.native
}
