package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AvatarSize extends StObject
@JSImport("sap/ui/webc/main/library", "AvatarSize")
@js.native
object AvatarSize extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AvatarSize & String] = js.native
  
  /**
    * component size - 5rem font size - 2.5rem
    */
  @js.native
  sealed trait L
    extends StObject
       with AvatarSize
  /* "L" */ val L: typings.openui5.sapUiWebcMainLibraryMod.AvatarSize.L & String = js.native
  
  /**
    * component size - 4rem font size - 2rem
    */
  @js.native
  sealed trait M
    extends StObject
       with AvatarSize
  /* "M" */ val M: typings.openui5.sapUiWebcMainLibraryMod.AvatarSize.M & String = js.native
  
  /**
    * component size - 3rem font size - 1.5rem
    */
  @js.native
  sealed trait S
    extends StObject
       with AvatarSize
  /* "S" */ val S: typings.openui5.sapUiWebcMainLibraryMod.AvatarSize.S & String = js.native
  
  /**
    * component size - 7rem font size - 3rem
    */
  @js.native
  sealed trait XL
    extends StObject
       with AvatarSize
  /* "XL" */ val XL: typings.openui5.sapUiWebcMainLibraryMod.AvatarSize.XL & String = js.native
  
  /**
    * component size - 2rem font size - 1rem
    */
  @js.native
  sealed trait XS
    extends StObject
       with AvatarSize
  /* "XS" */ val XS: typings.openui5.sapUiWebcMainLibraryMod.AvatarSize.XS & String = js.native
}
