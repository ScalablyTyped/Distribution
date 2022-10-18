package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WrappingType extends StObject
@JSImport("sap/m/library", "WrappingType")
@js.native
object WrappingType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WrappingType & String] = js.native
  
  /**
    * Hyphenation will be used to break words on syllables where possible.
    */
  @js.native
  sealed trait Hyphenated
    extends StObject
       with WrappingType
  /* "Hyphenated" */ val Hyphenated: typings.openui5.sapMLibraryMod.WrappingType.Hyphenated & String = js.native
  
  /**
    * Normal text wrapping will be used. Words won't break based on hyphenation.
    */
  @js.native
  sealed trait Normal
    extends StObject
       with WrappingType
  /* "Normal" */ val Normal: typings.openui5.sapMLibraryMod.WrappingType.Normal & String = js.native
}
