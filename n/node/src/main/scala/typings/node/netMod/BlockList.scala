package typings.node.netMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `BlockList` object can be used with some network APIs to specify rules for
  * disabling inbound or outbound access to specific IP addresses, IP ranges, or
  * IP subnets.
  * @since v15.0.0, v14.18.0
  */
@JSImport("net", "BlockList")
@js.native
open class BlockList () extends StObject {
  
  /**
    * Adds a rule to block the given IP address.
    * @since v15.0.0, v14.18.0
    * @param address An IPv4 or IPv6 address.
    * @param [type='ipv4'] Either `'ipv4'` or `'ipv6'`.
    */
  def addAddress(address: String): Unit = js.native
  def addAddress(address: String, `type`: IPVersion): Unit = js.native
  def addAddress(address: SocketAddress): Unit = js.native
  
  /**
    * Adds a rule to block a range of IP addresses from `start` (inclusive) to`end` (inclusive).
    * @since v15.0.0, v14.18.0
    * @param start The starting IPv4 or IPv6 address in the range.
    * @param end The ending IPv4 or IPv6 address in the range.
    * @param [type='ipv4'] Either `'ipv4'` or `'ipv6'`.
    */
  def addRange(start: String, end: String): Unit = js.native
  def addRange(start: String, end: String, `type`: IPVersion): Unit = js.native
  def addRange(start: SocketAddress, end: SocketAddress): Unit = js.native
  
  def addSubnet(net: String, prefix: Double): Unit = js.native
  def addSubnet(net: String, prefix: Double, `type`: IPVersion): Unit = js.native
  /**
    * Adds a rule to block a range of IP addresses specified as a subnet mask.
    * @since v15.0.0, v14.18.0
    * @param net The network IPv4 or IPv6 address.
    * @param prefix The number of CIDR prefix bits. For IPv4, this must be a value between `0` and `32`. For IPv6, this must be between `0` and `128`.
    * @param [type='ipv4'] Either `'ipv4'` or `'ipv6'`.
    */
  def addSubnet(net: SocketAddress, prefix: Double): Unit = js.native
  
  def check(address: String): Boolean = js.native
  def check(address: String, `type`: IPVersion): Boolean = js.native
  /**
    * Returns `true` if the given IP address matches any of the rules added to the`BlockList`.
    *
    * ```js
    * const blockList = new net.BlockList();
    * blockList.addAddress('123.123.123.123');
    * blockList.addRange('10.0.0.1', '10.0.0.10');
    * blockList.addSubnet('8592:757c:efae:4e45::', 64, 'ipv6');
    *
    * console.log(blockList.check('123.123.123.123'));  // Prints: true
    * console.log(blockList.check('10.0.0.3'));  // Prints: true
    * console.log(blockList.check('222.111.111.222'));  // Prints: false
    *
    * // IPv6 notation for IPv4 addresses works:
    * console.log(blockList.check('::ffff:7b7b:7b7b', 'ipv6')); // Prints: true
    * console.log(blockList.check('::ffff:123.123.123.123', 'ipv6')); // Prints: true
    * ```
    * @since v15.0.0, v14.18.0
    * @param address The IP address to check
    * @param [type='ipv4'] Either `'ipv4'` or `'ipv6'`.
    */
  def check(address: SocketAddress): Boolean = js.native
}
