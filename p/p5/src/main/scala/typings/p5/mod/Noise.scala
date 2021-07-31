package typings.p5.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Noise
  extends StObject
     with Oscillator {
  
  /**
    *   Set type of noise to 'white', 'pink' or 'brown'.
    *   White is the default.
    *   @param [type] 'white', 'pink' or 'brown'
    */
  def setType(): Unit = js.native
}
