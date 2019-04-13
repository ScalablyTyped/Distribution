package typings
package nvd3Lib.nvd3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nvd3Static extends js.Object {
  /*stores all the ready to use charts*/
  var charts: js.Any = js.native
  /*set to false in production*/
  var dev: scala.Boolean = js.native
  /*stores some statistics and potential error messages*/
  var logs: js.Any = js.native
  var models: Models = js.native
  var tooltip: Nvd3TooltipStatic = js.native
  var utils: Utils = js.native
  def addGraph[TChart /* <: Nvd3Element */](factory: ChartFactory[TChart]): scala.Unit = js.native
  def addGraph[TChart /* <: Nvd3Element */](generate: js.Function0[TChart]): scala.Unit = js.native
  def addGraph[TChart /* <: Nvd3Element */](generate: js.Function0[TChart], callBack: js.Function1[/* chart */ TChart, scala.Unit]): scala.Unit = js.native
  //returns last argument
  def log(arg: js.Array[_]): js.Any = js.native
  def log(topic: java.lang.String): java.lang.String = js.native
  def log(topic: java.lang.String, value: java.lang.String): java.lang.String = js.native
}

