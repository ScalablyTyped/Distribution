package typings.ol.interactionSelectMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectEventType extends js.Object

@JSImport("ol/interaction/Select", "SelectEventType")
@js.native
object SelectEventType extends js.Object {
  @js.native
  sealed trait SELECT extends SelectEventType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SelectEventType with String] = js.native
  /* "select" */ @js.native
  object SELECT extends TopLevel[SELECT with String]
  
}

