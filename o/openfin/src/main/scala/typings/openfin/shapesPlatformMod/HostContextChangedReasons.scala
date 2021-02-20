package typings.openfin.shapesPlatformMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HostContextChangedReasons extends StObject
@JSImport("openfin/_v2/shapes/Platform", "HostContextChangedReasons")
@js.native
object HostContextChangedReasons extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HostContextChangedReasons with String] = js.native
  
  @js.native
  sealed trait reparented extends HostContextChangedReasons
  /* "reparented" */ val reparented: typings.openfin.shapesPlatformMod.HostContextChangedReasons.reparented with String = js.native
  
  @js.native
  sealed trait updated extends HostContextChangedReasons
  /* "updated" */ val updated: typings.openfin.shapesPlatformMod.HostContextChangedReasons.updated with String = js.native
}
