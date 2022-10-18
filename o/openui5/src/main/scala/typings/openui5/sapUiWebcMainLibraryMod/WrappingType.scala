package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WrappingType extends StObject
@JSImport("sap/ui/webc/main/library", "WrappingType")
@js.native
object WrappingType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WrappingType & String] = js.native
  
  /**
    * The text will be truncated with an ellipsis.
    */
  @js.native
  sealed trait None
    extends StObject
       with WrappingType
  /* "None" */ val None: typings.openui5.sapUiWebcMainLibraryMod.WrappingType.None & String = js.native
  
  /**
    * The text will wrap. The words will not be broken based on hyphenation.
    */
  @js.native
  sealed trait Normal
    extends StObject
       with WrappingType
  /* "Normal" */ val Normal: typings.openui5.sapUiWebcMainLibraryMod.WrappingType.Normal & String = js.native
}
