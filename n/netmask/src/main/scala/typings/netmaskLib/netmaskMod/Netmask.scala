package typings
package netmaskLib.netmaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("netmask", "Netmask")
@js.native
class Netmask protected () extends js.Object {
  def this(netmask: java.lang.String) = this()
  def this(net: java.lang.String, mask: java.lang.String) = this()
  // The address of the network block as a string (eg.: 216.240.32.0)
  var base: java.lang.String = js.native
  var bitmask: scala.Double = js.native
  // The block's broadcast address: the last address of the block (eg.: 192.168.1.255)
  var broadcast: java.lang.String = js.native
  // The first usable address of the block
  var first: java.lang.String = js.native
  // The host mask, the opposite of the netmask (eg.: 0.0.0.255)
  var hostmask: java.lang.String = js.native
  // The last  usable address of the block
  var last: java.lang.String = js.native
  // The netmask as a string (eg.: 255.255.255.0)
  var mask: java.lang.String = js.native
  var maskLong: scala.Double = js.native
  var netLong: scala.Double = js.native
  // The number of IP address in the block (eg.: 254)
  var size: scala.Double = js.native
  // Returns true if the given ip or netmask is contained in the block
  def contains(ip: java.lang.String): scala.Boolean = js.native
  // Returns true if the given ip or netmask is contained in the block
  def contains(ip: Netmask): scala.Boolean = js.native
  // Returns true if the given ip or netmask is contained in the block
  def contains(ip: scala.Double): scala.Boolean = js.native
  // Evaluate a function on each IP address
  def forEach(
    fn: js.Function3[
      /* ip */ java.lang.String, 
      /* long */ scala.Double, 
      /* index */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  // Returns the Netmask object for the block which follow this one
  def next(): Netmask = js.native
  // Returns the Netmask object for the block which follow this one
  def next(count: scala.Double): Netmask = js.native
}

