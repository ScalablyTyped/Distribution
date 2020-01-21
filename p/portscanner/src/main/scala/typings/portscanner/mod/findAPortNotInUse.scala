package typings.portscanner.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("portscanner", "findAPortNotInUse")
@js.native
object findAPortNotInUse extends js.Object {
  def apply(portList: js.Array[Double]): js.Promise[Double] = js.native
  def apply(portList: js.Array[Double], findPortCallback: PortCallback): Unit = js.native
  def apply(portList: js.Array[Double], host: String): js.Promise[Double] = js.native
  def apply(startPort: Double): js.Promise[Double] = js.native
  def apply(startPort: Double, endPort: Double): js.Promise[Double] = js.native
  def apply(startPort: Double, endPort: Double, findPortCallback: PortCallback): Unit = js.native
  def apply(startPort: Double, endPort: Double, host: String): js.Promise[Double] = js.native
  def apply(startPort: Double, endPort: Double, host: String, findPortCallback: PortCallback): Unit = js.native
  def apply(startPort: Double, findPortCallback: PortCallback): Unit = js.native
  def apply(startPort: Double, host: String): js.Promise[Double] = js.native
}

