package typings.p5.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EQ
  extends StObject
     with Effect {
  
  /**
    *   The p5.EQ is built with abstracted p5.Filter
    *   objects. To modify any bands, use methods of the
    *   p5.Filter API, especially gain and freq. Bands are
    *   stored in an array, with indices 0 - 3, or 0 - 7
    */
  var bands: js.Array[Any] = js.native
  
  /**
    *   Process an input by connecting it to the EQ
    *   @param src Audio source
    */
  def process(src: js.Object): Unit = js.native
}
