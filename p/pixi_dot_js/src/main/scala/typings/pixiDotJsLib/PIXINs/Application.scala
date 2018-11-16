package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.Application")
@js.native
class Application () extends js.Object {
  def this(options: ApplicationOptions) = this()
  def this(width: js.UndefOr[scala.Double], height: js.UndefOr[scala.Double], options: js.UndefOr[ApplicationOptions], noWebGL: js.UndefOr[scala.Boolean], sharedTicker: js.UndefOr[scala.Boolean], sharedLoader: js.UndefOr[scala.Boolean]) = this()
  var _ticker: pixiDotJsLib.PIXINs.tickerNs.Ticker = js.native
  var loader: pixiDotJsLib.PIXINs.loadersNs.Loader = js.native
  var renderer: WebGLRenderer | CanvasRenderer = js.native
  val screen: Rectangle = js.native
  var stage: Container = js.native
  var ticker: pixiDotJsLib.PIXINs.tickerNs.Ticker = js.native
  val view: stdLib.HTMLCanvasElement = js.native
  def destroy(): scala.Unit = js.native
  def destroy(removeView: scala.Boolean): scala.Unit = js.native
  def destroy(removeView: scala.Boolean, stageOptions: StageOptions): scala.Unit = js.native
  def destroy(removeView: scala.Boolean, stageOptions: scala.Boolean): scala.Unit = js.native
  def render(): scala.Unit = js.native
  def start(): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

