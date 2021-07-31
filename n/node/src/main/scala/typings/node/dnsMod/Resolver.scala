package typings.node.dnsMod

import typings.node.NodeJS.ErrnoException
import typings.node.anon.Typeofresolve
import typings.node.anon.Typeofresolve4
import typings.node.anon.Typeofresolve6
import typings.node.anon.TypeofresolveAny
import typings.node.anon.TypeofresolveCname
import typings.node.anon.TypeofresolveMx
import typings.node.anon.TypeofresolveNaptr
import typings.node.anon.TypeofresolveNs
import typings.node.anon.TypeofresolvePtr
import typings.node.anon.TypeofresolveSoa
import typings.node.anon.TypeofresolveSrv
import typings.node.anon.TypeofresolveTxt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dns", "Resolver")
@js.native
class Resolver () extends StObject {
  
  def cancel(): Unit = js.native
  
  def getServers(): js.Array[String] = js.native
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
  
  def reverse(
    ip: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* hostnames */ js.Array[String], Unit]
  ): Unit = js.native
  @JSName("reverse")
  var reverse_Original: js.Function2[
    /* ip */ String, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* hostnames */ js.Array[String], Unit], 
    Unit
  ] = js.native
  
  def setServers(servers: js.Array[String]): Unit = js.native
  @JSName("setServers")
  var setServers_Original: js.Function1[/* servers */ js.Array[String], Unit] = js.native
}
