package typings
package nodeLib.utilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("util", "inspect")
@js.native
object inspectNs extends js.Object {
  val custom: js.Symbol = js.native
  var defaultOptions: nodeLib.utilMod.InspectOptions = js.native
  /**
    * Allows changing inspect settings from the repl.
    */
  var replDefaults: nodeLib.utilMod.InspectOptions = js.native
  @js.native
  object colors
    extends /* color */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Tuple2[scala.Double, scala.Double]]]
  
  @js.native
  object styles
    extends /* style */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  
}

