package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IconTabHeaderMode extends StObject
@JSImport("sap/m/library", "IconTabHeaderMode")
@js.native
object IconTabHeaderMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[IconTabHeaderMode & String] = js.native
  
  /**
    * Inline. In this mode when the `count` and the `text` are set, they are displayed in one line.
    */
  @js.native
  sealed trait Inline
    extends StObject
       with IconTabHeaderMode
  /* "Inline" */ val Inline: typings.openui5.sapMLibraryMod.IconTabHeaderMode.Inline & String = js.native
  
  /**
    * Standard. In this mode when the `count` and the `text` are set, they are displayed in two separate lines.
    */
  @js.native
  sealed trait Standard
    extends StObject
       with IconTabHeaderMode
  /* "Standard" */ val Standard: typings.openui5.sapMLibraryMod.IconTabHeaderMode.Standard & String = js.native
}
