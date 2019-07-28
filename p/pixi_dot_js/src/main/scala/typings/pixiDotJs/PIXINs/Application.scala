package typings.pixiDotJs.PIXINs

import typings.pixiDotJs.PIXINs.loadersNs.Loader
import typings.pixiDotJs.PIXINs.tickerNs.Ticker
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.Application")
@js.native
class Application () extends js.Object {
  def this(options: ApplicationOptions) = this()
  def this(
    width: js.UndefOr[Double],
    height: js.UndefOr[Double],
    options: js.UndefOr[ApplicationOptions],
    noWebGL: js.UndefOr[Boolean],
    sharedTicker: js.UndefOr[Boolean],
    sharedLoader: js.UndefOr[Boolean]
  ) = this()
  var _ticker: Ticker = js.native
  var loader: Loader = js.native
  var renderer: WebGLRenderer | CanvasRenderer = js.native
  val screen: Rectangle = js.native
  var stage: Container = js.native
  var ticker: Ticker = js.native
  val view: HTMLCanvasElement = js.native
  def destroy(): Unit = js.native
  def destroy(removeView: Boolean): Unit = js.native
  def destroy(removeView: Boolean, stageOptions: Boolean): Unit = js.native
  def destroy(removeView: Boolean, stageOptions: StageOptions): Unit = js.native
  def render(): Unit = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native
}

