package typings.openfin.shapesPlatformMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HostContextChangedReasons extends js.Object
@JSImport("openfin/_v2/shapes/Platform", "HostContextChangedReasons")
@js.native
object HostContextChangedReasons extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HostContextChangedReasons with String] = js.native
  
  @js.native
  sealed trait reparented extends HostContextChangedReasons
  /* "reparented" */ @js.native
  object reparented extends TopLevel[reparented with String]
  
  @js.native
  sealed trait updated extends HostContextChangedReasons
  /* "updated" */ @js.native
  object updated extends TopLevel[updated with String]
}
