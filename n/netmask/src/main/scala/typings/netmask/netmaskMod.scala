package typings.netmask

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("netmask", JSImport.Namespace)
@js.native
object netmaskMod extends js.Object {
  @js.native
  class Netmask protected () extends js.Object {
    def this(netmask: String) = this()
    def this(net: String, mask: String) = this()
    // The address of the network block as a string (eg.: 216.240.32.0)
    var base: String = js.native
    var bitmask: Double = js.native
    // The block's broadcast address: the last address of the block (eg.: 192.168.1.255)
    var broadcast: String = js.native
    // The first usable address of the block
    var first: String = js.native
    // The host mask, the opposite of the netmask (eg.: 0.0.0.255)
    var hostmask: String = js.native
    // The last  usable address of the block
    var last: String = js.native
    // The netmask as a string (eg.: 255.255.255.0)
    var mask: String = js.native
    var maskLong: Double = js.native
    var netLong: Double = js.native
    // The number of IP address in the block (eg.: 254)
    var size: Double = js.native
    // Returns true if the given ip or netmask is contained in the block
    def contains(ip: String): Boolean = js.native
    def contains(ip: Double): Boolean = js.native
    def contains(ip: Netmask): Boolean = js.native
    // Evaluate a function on each IP address
    def forEach(fn: js.Function3[/* ip */ String, /* long */ Double, /* index */ Double, Unit]): Unit = js.native
    // Returns the Netmask object for the block which follow this one
    def next(): Netmask = js.native
    def next(count: Double): Netmask = js.native
  }
  
  def ip2long(ip: String): Double = js.native
  def long2ip(long: Double): String = js.native
}

