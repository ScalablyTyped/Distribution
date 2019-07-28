package typings.portfinder.portfinderMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("portfinder", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var basePort: Double = js.native
  def getPort(callback: PortfinderCallback): Unit = js.native
  def getPort(options: PortFinderOptions, callback: PortfinderCallback): Unit = js.native
  def getPortPromise(): js.Promise[Double] = js.native
  def getPortPromise(options: PortFinderOptions): js.Promise[Double] = js.native
  def getPorts(
    count: Double,
    options: PortFinderOptions,
    callback: js.Function2[/* err */ Error, /* ports */ js.Array[Double], Unit]
  ): Unit = js.native
}

