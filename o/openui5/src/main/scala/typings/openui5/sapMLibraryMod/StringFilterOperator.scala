package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StringFilterOperator extends StObject
@JSImport("sap/m/library", "StringFilterOperator")
@js.native
object StringFilterOperator extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StringFilterOperator & String] = js.native
  
  /**
    * Checks if any word in the text starts with the search string.
    */
  @js.native
  sealed trait AnyWordStartsWith
    extends StObject
       with StringFilterOperator
  /* "AnyWordStartsWith" */ val AnyWordStartsWith: typings.openui5.sapMLibraryMod.StringFilterOperator.AnyWordStartsWith & String = js.native
  
  /**
    * Checks if the text contains the search string.
    */
  @js.native
  sealed trait Contains
    extends StObject
       with StringFilterOperator
  /* "Contains" */ val Contains: typings.openui5.sapMLibraryMod.StringFilterOperator.Contains & String = js.native
  
  /**
    * Checks if the text is equal with the search string.
    */
  @js.native
  sealed trait Equals
    extends StObject
       with StringFilterOperator
  /* "Equals" */ val Equals: typings.openui5.sapMLibraryMod.StringFilterOperator.Equals & String = js.native
  
  /**
    * Checks if the text starts with the search string.
    */
  @js.native
  sealed trait StartsWith
    extends StObject
       with StringFilterOperator
  /* "StartsWith" */ val StartsWith: typings.openui5.sapMLibraryMod.StringFilterOperator.StartsWith & String = js.native
}
