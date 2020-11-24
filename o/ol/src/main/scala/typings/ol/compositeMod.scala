package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/renderer/Composite", JSImport.Namespace)
@js.native
object compositeMod extends js.Object {
  
  @js.native
  trait CompositeMapRenderer
    extends typings.ol.mapMod.default
  
  @js.native
  class default protected () extends CompositeMapRenderer {
    def this(map: typings.ol.pluggableMapMod.default) = this()
  }
}
