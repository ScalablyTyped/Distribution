package typings.ol

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textpathMod {
  
  @JSImport("ol/geom/flat/textpath", "drawTextOnPath")
  @js.native
  def drawTextOnPath(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    text: String,
    startM: Double,
    maxAngle: Double,
    scale: Double,
    measureAndCacheTextWidth: js.Function3[/* p0 */ String, /* p1 */ String, /* p2 */ StringDictionary[Double], Double],
    font: String,
    cache: StringDictionary[Double],
    rotation: Double
  ): js.Array[js.Array[_]] = js.native
}
