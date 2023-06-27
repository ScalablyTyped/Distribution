package typings.netmask

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("netmask", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("netmask", "Netmask")
  @js.native
  open class Netmask protected () extends StObject {
    /**
      *
      * @param net A network - e.g 216.240.32.0/24
      * @param mask - optional netmask if not provided in `net`
      */
    def this(net: String) = this()
    def this(net: String, mask: String) = this()
    
    /**
      * The base address of the network block as a string (eg: 216.240.32.0). Base does not give an indication of the size of the network block.
      */
    var base: String = js.native
    
    /**
      * The netmask as a number of bits in the network portion of the address for this block (eg: 24).
      */
    var bitmask: Double = js.native
    
    /**
      * The blocks broadcast address (eg: 192.168.1.0/24 => 192.168.1.255)
      */
    var broadcast: String = js.native
    
    /**
      * Returns a true if the IP number ip is part of the network. That is, a true value is returned if ip is between base and broadcast.
      * If a Netmask object or a block is given, it returns true only of the given block fits inside the network.
      */
    def contains(address: String): Boolean = js.native
    def contains(address: Double): Boolean = js.native
    def contains(address: Netmask): Boolean = js.native
    
    /**
      * First useable address
      */
    var first: String = js.native
    
    /**
      * Similar to the Array prototype method. It loops through all the useable addresses, ie between first and last.
      */
    def forEach(cb: js.Function3[/* ip */ String, /* long */ Double, /* index */ Double, Unit]): Unit = js.native
    
    /**
      * The host mask which is the opposite of the netmask (eg: 0.0.0.255).
      */
    var hostmask: String = js.native
    
    /**
      * Last useable address
      */
    var last: String = js.native
    
    /**
      * The netmask as a string (eg: 255.255.255.0).
      */
    var mask: String = js.native
    
    var maskLong: Double = js.native
    
    var netLong: Double = js.native
    
    /**
      * Without a count, return the next block of the same size after the current one. With a count, return the Nth block after the current one.
      * A count of -1 returns the previous block. Undef will be returned if out of legal address space.
      */
    def next(): Netmask = js.native
    def next(count: Double): Netmask = js.native
    
    /**
      * The number of IP addresses in a block (eg: 256).
      */
    var size: Double = js.native
  }
  
  inline def ip2long(ip: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ip2long")(ip.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def long2ip(long: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("long2ip")(long.asInstanceOf[js.Any]).asInstanceOf[String]
}
