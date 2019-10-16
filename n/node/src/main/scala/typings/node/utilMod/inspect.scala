package typings.node.utilMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("util", "inspect")
@js.native
object inspect extends js.Object {
  val custom: js.Symbol = js.native
  var defaultOptions: InspectOptions = js.native
  /**
    * Allows changing inspect settings from the repl.
    */
  var replDefaults: InspectOptions = js.native
  def apply(`object`: js.Any): java.lang.String = js.native
  def apply(`object`: js.Any, options: InspectOptions): java.lang.String = js.native
  def apply(`object`: js.Any, showHidden: Boolean): java.lang.String = js.native
  def apply(`object`: js.Any, showHidden: Boolean, depth: Double): java.lang.String = js.native
  def apply(`object`: js.Any, showHidden: Boolean, depth: Double, color: Boolean): java.lang.String = js.native
  def apply(`object`: js.Any, showHidden: Boolean, depth: Null, color: Boolean): java.lang.String = js.native
  @js.native
  object colors
    extends /* color */ StringDictionary[js.UndefOr[js.Tuple2[Double, Double]]]
  
  @js.native
  object styles
    extends /* style */ StringDictionary[js.UndefOr[java.lang.String]]
  
}

