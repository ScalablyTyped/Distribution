package typings
package nodeLib.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dns", "Resolver")
@js.native
class Resolver () extends js.Object {
  @JSName("getServers")
  var getServers_Original: js.Function0[js.Array[java.lang.String]] = js.native
  var resolve: nodeLib.Anon_PromisifyHostnameRrtype = js.native
  var resolve4: nodeLib.Anon_PromisifyHostnameOptions = js.native
  var resolve6: nodeLib.Anon_PromisifyHostnameOptions = js.native
  var resolveAny: nodeLib.Anon_PromisifyHostnameStringPromise = js.native
  var resolveCname: nodeLib.Anon_PromisifyHostnameStringPromiseArray_1349920349 = js.native
  var resolveMx: nodeLib.Anon_PromisifyHostnameString = js.native
  var resolveNaptr: nodeLib.Anon_Promisify = js.native
  var resolveNs: nodeLib.Anon_PromisifyHostnameStringPromiseArray_1349920349 = js.native
  var resolvePtr: nodeLib.Anon_PromisifyHostnameStringPromiseArray_1349920349 = js.native
  var resolveSoa: nodeLib.Anon_PromisifyHostname = js.native
  var resolveSrv: nodeLib.Anon_PromisifyHostnameStringPromiseArraySrvRecord = js.native
  var resolveTxt: nodeLib.Anon_PromisifyHostnameStringPromiseArray = js.native
  @JSName("reverse")
  var reverse_Original: js.Function2[
    /* ip */ java.lang.String, 
    /* callback */ js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* hostnames */ js.Array[java.lang.String], 
      scala.Unit
    ], 
    scala.Unit
  ] = js.native
  @JSName("setServers")
  var setServers_Original: js.Function1[/* servers */ js.Array[java.lang.String], scala.Unit] = js.native
  def cancel(): scala.Unit = js.native
  def getServers(): js.Array[java.lang.String] = js.native
  def reverse(
    ip: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* hostnames */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def setServers(servers: js.Array[java.lang.String]): scala.Unit = js.native
}

