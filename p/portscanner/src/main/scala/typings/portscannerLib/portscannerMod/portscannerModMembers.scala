package typings
package portscannerLib.portscannerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("portscanner", JSImport.Namespace)
@js.native
object portscannerModMembers extends js.Object {
  def checkPortStatus(port: scala.Double): stdLib.Promise[Status] = js.native
  def checkPortStatus(port: scala.Double, checkPortCallback: StatusCallback): scala.Unit = js.native
  def checkPortStatus(port: scala.Double, host: java.lang.String): stdLib.Promise[Status] = js.native
  def checkPortStatus(port: scala.Double, host: java.lang.String, checkPortCallback: StatusCallback): scala.Unit = js.native
  def checkPortStatus(port: scala.Double, host: java.lang.String, opts: Options): stdLib.Promise[Status] = js.native
  def checkPortStatus(port: scala.Double, host: java.lang.String, opts: Options, checkPortCallback: StatusCallback): scala.Unit = js.native
  def checkPortStatus(port: scala.Double, opts: Options): stdLib.Promise[Status] = js.native
  def checkPortStatus(port: scala.Double, opts: Options, checkPortCallback: StatusCallback): scala.Unit = js.native
  def findAPortInUse(portList: js.Array[scala.Double]): stdLib.Promise[scala.Double] = js.native
  def findAPortInUse(portList: js.Array[scala.Double], findPortCallback: PortCallback): scala.Unit = js.native
  def findAPortInUse(portList: js.Array[scala.Double], host: java.lang.String): stdLib.Promise[scala.Double] = js.native
  def findAPortInUse(startPort: scala.Double): stdLib.Promise[scala.Double] = js.native
  def findAPortInUse(startPort: scala.Double, endPort: scala.Double): stdLib.Promise[scala.Double] = js.native
  def findAPortInUse(startPort: scala.Double, endPort: scala.Double, findPortCallback: PortCallback): scala.Unit = js.native
  def findAPortInUse(startPort: scala.Double, endPort: scala.Double, host: java.lang.String): stdLib.Promise[scala.Double] = js.native
  def findAPortInUse(
    startPort: scala.Double,
    endPort: scala.Double,
    host: java.lang.String,
    findPortCallback: PortCallback
  ): scala.Unit = js.native
  def findAPortInUse(startPort: scala.Double, findPortCallback: PortCallback): scala.Unit = js.native
  def findAPortInUse(startPort: scala.Double, host: java.lang.String): stdLib.Promise[scala.Double] = js.native
  def findAPortNotInUse(portList: js.Array[scala.Double]): stdLib.Promise[scala.Double] = js.native
  def findAPortNotInUse(portList: js.Array[scala.Double], findPortCallback: PortCallback): scala.Unit = js.native
  def findAPortNotInUse(portList: js.Array[scala.Double], host: java.lang.String): stdLib.Promise[scala.Double] = js.native
  def findAPortNotInUse(startPort: scala.Double): stdLib.Promise[scala.Double] = js.native
  def findAPortNotInUse(startPort: scala.Double, endPort: scala.Double): stdLib.Promise[scala.Double] = js.native
  def findAPortNotInUse(startPort: scala.Double, endPort: scala.Double, findPortCallback: PortCallback): scala.Unit = js.native
  def findAPortNotInUse(startPort: scala.Double, endPort: scala.Double, host: java.lang.String): stdLib.Promise[scala.Double] = js.native
  def findAPortNotInUse(
    startPort: scala.Double,
    endPort: scala.Double,
    host: java.lang.String,
    findPortCallback: PortCallback
  ): scala.Unit = js.native
  def findAPortNotInUse(startPort: scala.Double, findPortCallback: PortCallback): scala.Unit = js.native
  def findAPortNotInUse(startPort: scala.Double, host: java.lang.String): stdLib.Promise[scala.Double] = js.native
}

