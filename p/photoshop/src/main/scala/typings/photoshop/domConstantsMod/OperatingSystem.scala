package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OperatingSystem extends StObject
@JSImport("photoshop/dom/Constants", "OperatingSystem")
@js.native
object OperatingSystem extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OperatingSystem & String] = js.native
  
  @js.native
  sealed trait OS2
    extends StObject
       with OperatingSystem
  /* "OS2" */ val OS2: typings.photoshop.domConstantsMod.OperatingSystem.OS2 & String = js.native
  
  @js.native
  sealed trait WINDOWS
    extends StObject
       with OperatingSystem
  /* "windows" */ val WINDOWS: typings.photoshop.domConstantsMod.OperatingSystem.WINDOWS & String = js.native
}
