package typings.openui5.sapFLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AvatarGroupType extends StObject
@JSImport("sap/f/library", "AvatarGroupType")
@js.native
object AvatarGroupType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AvatarGroupType & String] = js.native
  
  /**
    * The avatars are displayed as partially overlapped on top of each other and the entire group has one click/tap
    * area.
    */
  @js.native
  sealed trait Group
    extends StObject
       with AvatarGroupType
  /* "Group" */ val Group: typings.openui5.sapFLibraryMod.AvatarGroupType.Group & String = js.native
  
  /**
    * The avatars are displayed side-by-side and each avatar has its own click/tap area.
    */
  @js.native
  sealed trait Individual
    extends StObject
       with AvatarGroupType
  /* "Individual" */ val Individual: typings.openui5.sapFLibraryMod.AvatarGroupType.Individual & String = js.native
}
