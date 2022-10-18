package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TitleLevel extends StObject
@JSImport("sap/ui/core/library", "TitleLevel")
@js.native
object TitleLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TitleLevel & String] = js.native
  
  /**
    * The level of the title is choosen by the control rendering the title.
    */
  @js.native
  sealed trait Auto
    extends StObject
       with TitleLevel
  /* "Auto" */ val Auto: typings.openui5.sapUiCoreLibraryMod.TitleLevel.Auto & String = js.native
  
  /**
    * The Title is of level 1.
    */
  @js.native
  sealed trait H1
    extends StObject
       with TitleLevel
  /* "H1" */ val H1: typings.openui5.sapUiCoreLibraryMod.TitleLevel.H1 & String = js.native
  
  /**
    * The Title is of level 2
    */
  @js.native
  sealed trait H2
    extends StObject
       with TitleLevel
  /* "H2" */ val H2: typings.openui5.sapUiCoreLibraryMod.TitleLevel.H2 & String = js.native
  
  /**
    * The Title is of level 3
    */
  @js.native
  sealed trait H3
    extends StObject
       with TitleLevel
  /* "H3" */ val H3: typings.openui5.sapUiCoreLibraryMod.TitleLevel.H3 & String = js.native
  
  /**
    * The Title is of level 4
    */
  @js.native
  sealed trait H4
    extends StObject
       with TitleLevel
  /* "H4" */ val H4: typings.openui5.sapUiCoreLibraryMod.TitleLevel.H4 & String = js.native
  
  /**
    * The Title is of level 5
    */
  @js.native
  sealed trait H5
    extends StObject
       with TitleLevel
  /* "H5" */ val H5: typings.openui5.sapUiCoreLibraryMod.TitleLevel.H5 & String = js.native
  
  /**
    * The Title is of level 6
    */
  @js.native
  sealed trait H6
    extends StObject
       with TitleLevel
  /* "H6" */ val H6: typings.openui5.sapUiCoreLibraryMod.TitleLevel.H6 & String = js.native
}
