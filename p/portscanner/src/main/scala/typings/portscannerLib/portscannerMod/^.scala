package typings
package portscannerLib.portscannerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("portscanner", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def checkPortStatus(port: scala.Double): js.Promise[portscannerLib.portscannerMod.Status] = js.native
  def checkPortStatus(port: scala.Double, checkPortCallback: portscannerLib.portscannerMod.StatusCallback): scala.Unit = js.native
  def checkPortStatus(port: scala.Double, host: java.lang.String): js.Promise[portscannerLib.portscannerMod.Status] = js.native
  def checkPortStatus(
    port: scala.Double,
    host: java.lang.String,
    checkPortCallback: portscannerLib.portscannerMod.StatusCallback
  ): scala.Unit = js.native
  def checkPortStatus(port: scala.Double, host: java.lang.String, opts: portscannerLib.portscannerMod.Options): js.Promise[portscannerLib.portscannerMod.Status] = js.native
  def checkPortStatus(
    port: scala.Double,
    host: java.lang.String,
    opts: portscannerLib.portscannerMod.Options,
    checkPortCallback: portscannerLib.portscannerMod.StatusCallback
  ): scala.Unit = js.native
  def checkPortStatus(port: scala.Double, opts: portscannerLib.portscannerMod.Options): js.Promise[portscannerLib.portscannerMod.Status] = js.native
  def checkPortStatus(
    port: scala.Double,
    opts: portscannerLib.portscannerMod.Options,
    checkPortCallback: portscannerLib.portscannerMod.StatusCallback
  ): scala.Unit = js.native
  def findAPortInUse(portList: js.Array[scala.Double]): js.Promise[scala.Double] = js.native
  def findAPortInUse(portList: js.Array[scala.Double], findPortCallback: portscannerLib.portscannerMod.PortCallback): scala.Unit = js.native
  def findAPortInUse(portList: js.Array[scala.Double], host: java.lang.String): js.Promise[scala.Double] = js.native
  def findAPortInUse(startPort: scala.Double): js.Promise[scala.Double] = js.native
  def findAPortInUse(startPort: scala.Double, endPort: scala.Double): js.Promise[scala.Double] = js.native
  def findAPortInUse(
    startPort: scala.Double,
    endPort: scala.Double,
    findPortCallback: portscannerLib.portscannerMod.PortCallback
  ): scala.Unit = js.native
  def findAPortInUse(startPort: scala.Double, endPort: scala.Double, host: java.lang.String): js.Promise[scala.Double] = js.native
  def findAPortInUse(
    startPort: scala.Double,
    endPort: scala.Double,
    host: java.lang.String,
    findPortCallback: portscannerLib.portscannerMod.PortCallback
  ): scala.Unit = js.native
  def findAPortInUse(startPort: scala.Double, findPortCallback: portscannerLib.portscannerMod.PortCallback): scala.Unit = js.native
  def findAPortInUse(startPort: scala.Double, host: java.lang.String): js.Promise[scala.Double] = js.native
  def findAPortNotInUse(portList: js.Array[scala.Double]): js.Promise[scala.Double] = js.native
  def findAPortNotInUse(portList: js.Array[scala.Double], findPortCallback: portscannerLib.portscannerMod.PortCallback): scala.Unit = js.native
  def findAPortNotInUse(portList: js.Array[scala.Double], host: java.lang.String): js.Promise[scala.Double] = js.native
  def findAPortNotInUse(startPort: scala.Double): js.Promise[scala.Double] = js.native
  def findAPortNotInUse(startPort: scala.Double, endPort: scala.Double): js.Promise[scala.Double] = js.native
  def findAPortNotInUse(
    startPort: scala.Double,
    endPort: scala.Double,
    findPortCallback: portscannerLib.portscannerMod.PortCallback
  ): scala.Unit = js.native
  def findAPortNotInUse(startPort: scala.Double, endPort: scala.Double, host: java.lang.String): js.Promise[scala.Double] = js.native
  def findAPortNotInUse(
    startPort: scala.Double,
    endPort: scala.Double,
    host: java.lang.String,
    findPortCallback: portscannerLib.portscannerMod.PortCallback
  ): scala.Unit = js.native
  def findAPortNotInUse(startPort: scala.Double, findPortCallback: portscannerLib.portscannerMod.PortCallback): scala.Unit = js.native
  def findAPortNotInUse(startPort: scala.Double, host: java.lang.String): js.Promise[scala.Double] = js.native
}

