package typings.ol.drawMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DrawEventType extends js.Object

@JSImport("ol/interaction/Draw", "DrawEventType")
@js.native
object DrawEventType extends js.Object {
  @js.native
  sealed trait DRAWEND extends DrawEventType
  
  @js.native
  sealed trait DRAWSTART extends DrawEventType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DrawEventType with String] = js.native
  /* "drawend" */ @js.native
  object DRAWEND extends TopLevel[DRAWEND with String]
  
  /* "drawstart" */ @js.native
  object DRAWSTART extends TopLevel[DRAWSTART with String]
  
}

