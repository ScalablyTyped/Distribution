package typings.otplibCore.totpMod

import typings.otplibCore.hotpMod.HOTPOptions_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TOTPOptions_[T] extends HOTPOptions_[T] {
  
  /**
    * The starting time since the JavasSript epoch (seconds) (UNIX epoch * 1000).
    */
  var epoch: Double = js.native
  
  /**
    * Time step (seconds).
    */
  var step: Double = js.native
  
  /**
    * How many windows (x * step) past and future do we consider as valid during check.
    */
  var window: Double | (js.Tuple2[Double, Double]) = js.native
}
