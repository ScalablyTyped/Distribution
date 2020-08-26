package typings.openfin.shapesPlatformMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HostContextChangedReasons extends js.Object

@JSImport("openfin/_v2/shapes/Platform", "HostContextChangedReasons")
@js.native
object HostContextChangedReasons extends js.Object {
  @js.native
  sealed trait reparented extends HostContextChangedReasons
  
  @js.native
  sealed trait updated extends HostContextChangedReasons
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HostContextChangedReasons with String] = js.native
  /* "reparented" */ @js.native
  object reparented extends TopLevel[reparented with String]
  
  /* "updated" */ @js.native
  object updated extends TopLevel[updated with String]
  
}

