package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Sticky extends StObject
@JSImport("sap/m/library", "Sticky")
@js.native
object Sticky extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Sticky & String] = js.native
  
  /**
    * The column headers remain in a fixed position.
    */
  @js.native
  sealed trait ColumnHeaders
    extends StObject
       with Sticky
  /* "ColumnHeaders" */ val ColumnHeaders: typings.openui5.sapMLibraryMod.Sticky.ColumnHeaders & String = js.native
  
  /**
    * @SINCE 1.56
    *
    * The header toolbar remains in a fixed position.
    */
  @js.native
  sealed trait HeaderToolbar
    extends StObject
       with Sticky
  /* "HeaderToolbar" */ val HeaderToolbar: typings.openui5.sapMLibraryMod.Sticky.HeaderToolbar & String = js.native
  
  /**
    * @SINCE 1.56
    *
    * The info toolbar remains in a fixed position.
    */
  @js.native
  sealed trait InfoToolbar
    extends StObject
       with Sticky
  /* "InfoToolbar" */ val InfoToolbar: typings.openui5.sapMLibraryMod.Sticky.InfoToolbar & String = js.native
}
