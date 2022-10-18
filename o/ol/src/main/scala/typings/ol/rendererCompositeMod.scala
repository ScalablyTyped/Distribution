package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererCompositeMod {
  
  @JSImport("ol/renderer/Composite", JSImport.Default)
  @js.native
  open class default protected () extends CompositeMapRenderer {
    def this(map: typings.ol.pluggableMapMod.default) = this()
  }
  
  @js.native
  trait CompositeMapRenderer
    extends typings.ol.rendererMapMod.default
}
