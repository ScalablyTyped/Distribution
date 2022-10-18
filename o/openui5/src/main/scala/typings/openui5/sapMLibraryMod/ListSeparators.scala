package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListSeparators extends StObject
@JSImport("sap/m/library", "ListSeparators")
@js.native
object ListSeparators extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListSeparators & String] = js.native
  
  /**
    * Separators between the items including the last and the first one.
    */
  @js.native
  sealed trait All
    extends StObject
       with ListSeparators
  /* "All" */ val All: typings.openui5.sapMLibraryMod.ListSeparators.All & String = js.native
  
  /**
    * Separators between the items. **Note:** This enumeration depends on the theme.
    */
  @js.native
  sealed trait Inner
    extends StObject
       with ListSeparators
  /* "Inner" */ val Inner: typings.openui5.sapMLibraryMod.ListSeparators.Inner & String = js.native
  
  /**
    * No item separators.
    */
  @js.native
  sealed trait None
    extends StObject
       with ListSeparators
  /* "None" */ val None: typings.openui5.sapMLibraryMod.ListSeparators.None & String = js.native
}
