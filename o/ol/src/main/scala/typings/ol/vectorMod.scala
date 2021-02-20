package typings.ol

import typings.ol.baseVectorMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vectorMod {
  
  @JSImport("ol/layer/Vector", JSImport.Default)
  @js.native
  class default () extends VectorLayer {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait VectorLayer
    extends typings.ol.baseVectorMod.default[typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default]]
}
