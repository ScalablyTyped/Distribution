package typings.node.dnsMod

import typings.node.NodeJS.ErrnoException
import typings.node.Typeofresolve
import typings.node.Typeofresolve4
import typings.node.Typeofresolve6
import typings.node.TypeofresolveAny
import typings.node.TypeofresolveCname
import typings.node.TypeofresolveMx
import typings.node.TypeofresolveNaptr
import typings.node.TypeofresolveNs
import typings.node.TypeofresolvePtr
import typings.node.TypeofresolveSoa
import typings.node.TypeofresolveSrv
import typings.node.TypeofresolveTxt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dns", "Resolver")
@js.native
class Resolver () extends js.Object {
  @JSName("getServers")
  var getServers_Original: js.Function0[js.Array[String]] = js.native
  var resolve: Typeofresolve = js.native
  var resolve4: Typeofresolve4 = js.native
  var resolve6: Typeofresolve6 = js.native
  var resolveAny: TypeofresolveAny = js.native
  var resolveCname: TypeofresolveCname = js.native
  var resolveMx: TypeofresolveMx = js.native
  var resolveNaptr: TypeofresolveNaptr = js.native
  var resolveNs: TypeofresolveNs = js.native
  var resolvePtr: TypeofresolvePtr = js.native
  var resolveSoa: TypeofresolveSoa = js.native
  var resolveSrv: TypeofresolveSrv = js.native
  var resolveTxt: TypeofresolveTxt = js.native
  @JSName("reverse")
  var reverse_Original: js.Function2[
    /* ip */ String, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* hostnames */ js.Array[String], Unit], 
    Unit
  ] = js.native
  @JSName("setServers")
  var setServers_Original: js.Function1[/* servers */ js.Array[String], Unit] = js.native
  def cancel(): Unit = js.native
  def getServers(): js.Array[String] = js.native
  def reverse(
    ip: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* hostnames */ js.Array[String], Unit]
  ): Unit = js.native
  def setServers(servers: js.Array[String]): Unit = js.native
}

