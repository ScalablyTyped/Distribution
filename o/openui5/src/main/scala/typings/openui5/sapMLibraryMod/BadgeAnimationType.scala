package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BadgeAnimationType extends StObject
@JSImport("sap/m/library", "BadgeAnimationType")
@js.native
object BadgeAnimationType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BadgeAnimationType & String] = js.native
  
  /**
    * Badge indicator will perform Appear,Update,and Disappear animation.
    */
  @js.native
  sealed trait Full
    extends StObject
       with BadgeAnimationType
  /* "Full" */ val Full: typings.openui5.sapMLibraryMod.BadgeAnimationType.Full & String = js.native
  
  /**
    * No animation is performed.
    */
  @js.native
  sealed trait None
    extends StObject
       with BadgeAnimationType
  /* "None" */ val None: typings.openui5.sapMLibraryMod.BadgeAnimationType.None & String = js.native
  
  /**
    * Badge indicator will perform only Update animation (suitable for controls, which invalidate often).
    */
  @js.native
  sealed trait Update
    extends StObject
       with BadgeAnimationType
  /* "Update" */ val Update: typings.openui5.sapMLibraryMod.BadgeAnimationType.Update & String = js.native
}
