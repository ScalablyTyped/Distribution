package typings.ol.drawMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DrawEventType extends js.Object
@JSImport("ol/interaction/Draw", "DrawEventType")
@js.native
object DrawEventType extends js.Object {
  
  @js.native
  sealed trait DRAWABORT extends DrawEventType
  
  @js.native
  sealed trait DRAWEND extends DrawEventType
  
  @js.native
  sealed trait DRAWSTART extends DrawEventType
}
