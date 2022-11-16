package typings.negativeIndex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Convert negative index to positive starting from the end. Same way
    * [Array.slice](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/slice)
    * arguments work.
    *
    * @example
    * import idx = require('negative-index');
    *
    * idx(-5, 8); // 3
    * idx(5, 8); // 5
    *
    * @example
    * // Works well for normalizing real numbers offset, like time etc:
    *
    * import normOffset = require('negative-index');
    *
    * const time = -.15, duration = 2.45;
    *
    * normOffset(time, duration); // 2.3
    */
  inline def apply(index: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].apply(index.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("negative-index", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
