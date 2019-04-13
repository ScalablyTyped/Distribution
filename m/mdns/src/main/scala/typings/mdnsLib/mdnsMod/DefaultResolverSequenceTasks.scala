package typings
package mdnsLib.mdnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultResolverSequenceTasks extends MDNSResolverSequenceTasks {
  def DNSServiceGetAddrInfo(): js.Function2[/* service */ Service, /* next */ js.Function0[scala.Unit], scala.Boolean] = js.native
  def DNSServiceGetAddrInfo(options: js.Any): js.Function2[/* service */ Service, /* next */ js.Function0[scala.Unit], scala.Boolean] = js.native
  def DNSServiceResolve(): js.Function2[/* service */ Service, /* next */ js.Function0[scala.Unit], scala.Boolean] = js.native
  def DNSServiceResolve(options: mdnsLib.Anon_Flags): js.Function2[/* service */ Service, /* next */ js.Function0[scala.Unit], scala.Boolean] = js.native
  def filterAddresses(
    fn: js.Function3[
      /* address */ java.lang.String, 
      /* index */ js.UndefOr[scala.Double], 
      /* addresses */ js.UndefOr[js.Array[java.lang.String]], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  def getaddrinfo(): js.Function2[/* service */ Service, /* next */ js.Function0[scala.Unit], scala.Boolean] = js.native
  def getaddrinfo(options: js.Any): js.Function2[/* service */ Service, /* next */ js.Function0[scala.Unit], scala.Boolean] = js.native
  def logService(): scala.Unit = js.native
  def makeAddressesUnique(): js.Function2[/* service */ Service, /* next */ js.Function0[scala.Unit], scala.Boolean] = js.native
}

