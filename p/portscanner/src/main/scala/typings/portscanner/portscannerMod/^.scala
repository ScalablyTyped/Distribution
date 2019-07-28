package typings.portscanner.portscannerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("portscanner", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def checkPortStatus(port: Double): js.Promise[Status] = js.native
  def checkPortStatus(port: Double, checkPortCallback: StatusCallback): Unit = js.native
  def checkPortStatus(port: Double, host: String): js.Promise[Status] = js.native
  def checkPortStatus(port: Double, host: String, checkPortCallback: StatusCallback): Unit = js.native
  def checkPortStatus(port: Double, host: String, opts: Options): js.Promise[Status] = js.native
  def checkPortStatus(port: Double, host: String, opts: Options, checkPortCallback: StatusCallback): Unit = js.native
  def checkPortStatus(port: Double, opts: Options): js.Promise[Status] = js.native
  def checkPortStatus(port: Double, opts: Options, checkPortCallback: StatusCallback): Unit = js.native
  def findAPortInUse(portList: js.Array[Double]): js.Promise[Double] = js.native
  def findAPortInUse(portList: js.Array[Double], findPortCallback: PortCallback): Unit = js.native
  def findAPortInUse(portList: js.Array[Double], host: String): js.Promise[Double] = js.native
  def findAPortInUse(startPort: Double): js.Promise[Double] = js.native
  def findAPortInUse(startPort: Double, endPort: Double): js.Promise[Double] = js.native
  def findAPortInUse(startPort: Double, endPort: Double, findPortCallback: PortCallback): Unit = js.native
  def findAPortInUse(startPort: Double, endPort: Double, host: String): js.Promise[Double] = js.native
  def findAPortInUse(startPort: Double, endPort: Double, host: String, findPortCallback: PortCallback): Unit = js.native
  def findAPortInUse(startPort: Double, findPortCallback: PortCallback): Unit = js.native
  def findAPortInUse(startPort: Double, host: String): js.Promise[Double] = js.native
  def findAPortNotInUse(portList: js.Array[Double]): js.Promise[Double] = js.native
  def findAPortNotInUse(portList: js.Array[Double], findPortCallback: PortCallback): Unit = js.native
  def findAPortNotInUse(portList: js.Array[Double], host: String): js.Promise[Double] = js.native
  def findAPortNotInUse(startPort: Double): js.Promise[Double] = js.native
  def findAPortNotInUse(startPort: Double, endPort: Double): js.Promise[Double] = js.native
  def findAPortNotInUse(startPort: Double, endPort: Double, findPortCallback: PortCallback): Unit = js.native
  def findAPortNotInUse(startPort: Double, endPort: Double, host: String): js.Promise[Double] = js.native
  def findAPortNotInUse(startPort: Double, endPort: Double, host: String, findPortCallback: PortCallback): Unit = js.native
  def findAPortNotInUse(startPort: Double, findPortCallback: PortCallback): Unit = js.native
  def findAPortNotInUse(startPort: Double, host: String): js.Promise[Double] = js.native
}

