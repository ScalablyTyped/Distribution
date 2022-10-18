package typings.openui5.sapUiUx3LibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FeederType extends StObject
@JSImport("sap/ui/ux3/library", "FeederType")
@js.native
object FeederType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FeederType & String] = js.native
  
  /**
    * comment feeder (small)
    */
  @js.native
  sealed trait Comment
    extends StObject
       with FeederType
  /* "Comment" */ val Comment: typings.openui5.sapUiUx3LibraryMod.FeederType.Comment & String = js.native
  
  /**
    * large Feeder
    */
  @js.native
  sealed trait Large
    extends StObject
       with FeederType
  /* "Large" */ val Large: typings.openui5.sapUiUx3LibraryMod.FeederType.Large & String = js.native
  
  /**
    * medium feeder
    */
  @js.native
  sealed trait Medium
    extends StObject
       with FeederType
  /* "Medium" */ val Medium: typings.openui5.sapUiUx3LibraryMod.FeederType.Medium & String = js.native
}
