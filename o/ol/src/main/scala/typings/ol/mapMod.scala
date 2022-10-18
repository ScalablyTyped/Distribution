package typings.ol

import typings.ol.pluggableMapMod.MapOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapMod {
  
  @JSImport("ol/Map", JSImport.Default)
  @js.native
  open class default protected () extends Map {
    def this(options: MapOptions) = this()
  }
  
  @js.native
  trait Map
    extends typings.ol.pluggableMapMod.default
}
