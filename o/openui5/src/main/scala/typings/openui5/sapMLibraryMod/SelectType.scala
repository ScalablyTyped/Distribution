package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectType extends StObject
@JSImport("sap/m/library", "SelectType")
@js.native
object SelectType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SelectType & String] = js.native
  
  /**
    * Will show the text.
    */
  @js.native
  sealed trait Default
    extends StObject
       with SelectType
  /* "Default" */ val Default: typings.openui5.sapMLibraryMod.SelectType.Default & String = js.native
  
  /**
    * Will show only the specified icon.
    */
  @js.native
  sealed trait IconOnly
    extends StObject
       with SelectType
  /* "IconOnly" */ val IconOnly: typings.openui5.sapMLibraryMod.SelectType.IconOnly & String = js.native
}
