package typings.pixiDotJs.pixiDotJsMod

import typings.pixiDotJs.PIXINs.ApplicationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "Application")
@js.native
class Application ()
  extends typings.pixiDotJs.PIXINs.Application {
  def this(options: ApplicationOptions) = this()
  def this(
    width: js.UndefOr[Double],
    height: js.UndefOr[Double],
    options: js.UndefOr[ApplicationOptions],
    noWebGL: js.UndefOr[Boolean],
    sharedTicker: js.UndefOr[Boolean],
    sharedLoader: js.UndefOr[Boolean]
  ) = this()
}

