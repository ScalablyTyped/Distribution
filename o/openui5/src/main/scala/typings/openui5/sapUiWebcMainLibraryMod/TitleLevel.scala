package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TitleLevel extends StObject
@JSImport("sap/ui/webc/main/library", "TitleLevel")
@js.native
object TitleLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TitleLevel & String] = js.native
  
  /**
    * Renders `h1` tag.
    */
  @js.native
  sealed trait H1
    extends StObject
       with TitleLevel
  /* "H1" */ val H1: typings.openui5.sapUiWebcMainLibraryMod.TitleLevel.H1 & String = js.native
  
  /**
    * Renders `h2` tag.
    */
  @js.native
  sealed trait H2
    extends StObject
       with TitleLevel
  /* "H2" */ val H2: typings.openui5.sapUiWebcMainLibraryMod.TitleLevel.H2 & String = js.native
  
  /**
    * Renders `h3` tag.
    */
  @js.native
  sealed trait H3
    extends StObject
       with TitleLevel
  /* "H3" */ val H3: typings.openui5.sapUiWebcMainLibraryMod.TitleLevel.H3 & String = js.native
  
  /**
    * Renders `h4` tag.
    */
  @js.native
  sealed trait H4
    extends StObject
       with TitleLevel
  /* "H4" */ val H4: typings.openui5.sapUiWebcMainLibraryMod.TitleLevel.H4 & String = js.native
  
  /**
    * Renders `h5` tag.
    */
  @js.native
  sealed trait H5
    extends StObject
       with TitleLevel
  /* "H5" */ val H5: typings.openui5.sapUiWebcMainLibraryMod.TitleLevel.H5 & String = js.native
  
  /**
    * Renders `h6` tag.
    */
  @js.native
  sealed trait H6
    extends StObject
       with TitleLevel
  /* "H6" */ val H6: typings.openui5.sapUiWebcMainLibraryMod.TitleLevel.H6 & String = js.native
}
