package typings.multiaddr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiaddrStrings {
  
  @scala.inline
  def IPv4: IPv4 = "IPv4".asInstanceOf[IPv4]
  
  @scala.inline
  def IPv6: IPv6 = "IPv6".asInstanceOf[IPv6]
  
  @scala.inline
  def ipv4_ : ipv4_ = "ipv4".asInstanceOf[ipv4_]
  
  @scala.inline
  def ipv6_ : ipv6_ = "ipv6".asInstanceOf[ipv6_]
  
  @scala.inline
  def tcp: tcp = "tcp".asInstanceOf[tcp]
  
  @scala.inline
  def udp: udp = "udp".asInstanceOf[udp]
  
  @js.native
  sealed trait IPv4 extends js.Object
  
  @js.native
  sealed trait IPv6 extends js.Object
  
  @js.native
  sealed trait ipv4_ extends js.Object
  
  @js.native
  sealed trait ipv6_ extends js.Object
  
  @js.native
  sealed trait tcp extends js.Object
  
  @js.native
  sealed trait udp extends js.Object
}
