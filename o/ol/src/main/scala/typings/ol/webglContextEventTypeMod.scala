package typings.ol

import typings.ol.webglContextEventTypeMod.ContextEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/webgl/ContextEventType", JSImport.Namespace)
@js.native
object webglContextEventTypeMod extends js.Object {
  @js.native
  sealed trait ContextEventType extends js.Object
  
  @js.native
  object ContextEventType extends js.Object {
    @js.native
    sealed trait LOST extends ContextEventType
    
    @js.native
    sealed trait RESTORED extends ContextEventType
    
  }
  
  @js.native
  object default extends js.Object {
    /* "webglcontextlost" */ val LOST: typings.ol.webglContextEventTypeMod.ContextEventType.LOST with String = js.native
    /* "webglcontextrestored" */ val RESTORED: typings.ol.webglContextEventTypeMod.ContextEventType.RESTORED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ContextEventType with String] = js.native
  }
  
}

