package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExpandableTextOverflowMode extends StObject
@JSImport("sap/m/library", "ExpandableTextOverflowMode")
@js.native
object ExpandableTextOverflowMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ExpandableTextOverflowMode & String] = js.native
  
  /**
    * InPlace
    */
  @js.native
  sealed trait InPlace
    extends StObject
       with ExpandableTextOverflowMode
  /* "InPlace" */ val InPlace: typings.openui5.sapMLibraryMod.ExpandableTextOverflowMode.InPlace & String = js.native
  
  /**
    * Popover
    */
  @js.native
  sealed trait Popover
    extends StObject
       with ExpandableTextOverflowMode
  /* "Popover" */ val Popover: typings.openui5.sapMLibraryMod.ExpandableTextOverflowMode.Popover & String = js.native
}
