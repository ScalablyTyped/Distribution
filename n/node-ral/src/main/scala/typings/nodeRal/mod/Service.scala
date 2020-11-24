package typings.nodeRal.mod

import org.scalablytyped.runtime.StringDictionary
import typings.nodeRal.nodeRalStrings.GBK
import typings.nodeRal.nodeRalStrings.GET
import typings.nodeRal.nodeRalStrings.POST
import typings.nodeRal.nodeRalStrings.`utf-8`
import typings.nodeRal.nodeRalStrings.hashring
import typings.nodeRal.nodeRalStrings.http
import typings.nodeRal.nodeRalStrings.https
import typings.nodeRal.nodeRalStrings.random
import typings.nodeRal.nodeRalStrings.redis
import typings.nodeRal.nodeRalStrings.roundrobin
import typings.nodeRal.nodeRalStrings.soap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Service extends js.Object {
  
  var balance: random | roundrobin | hashring = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var encoding: js.UndefOr[`utf-8` | GBK] = js.native
  
  var headers: js.UndefOr[StringDictionary[String | Double]] = js.native
  
  var hybird: js.UndefOr[Boolean] = js.native
  
  var method: js.UndefOr[GET | POST] = js.native
  
  var pack: buildInConverter = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var protocol: http | https | soap | redis = js.native
  
  var query: js.UndefOr[js.Any] = js.native
  
  var retry: js.UndefOr[Double] = js.native
  
  var server: js.Array[Server] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var unpack: buildInConverter = js.native
}
object Service {
  
  @scala.inline
  def apply(
    balance: random | roundrobin | hashring,
    pack: buildInConverter,
    protocol: http | https | soap | redis,
    server: js.Array[Server],
    unpack: buildInConverter
  ): Service = {
    val __obj = js.Dynamic.literal(balance = balance.asInstanceOf[js.Any], pack = pack.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], unpack = unpack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
  
  @scala.inline
  implicit class ServiceOps[Self <: Service] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBalance(value: random | roundrobin | hashring): Self = this.set("balance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPack(value: buildInConverter): Self = this.set("pack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: http | https | soap | redis): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerVarargs(value: Server*): Self = this.set("server", js.Array(value :_*))
    
    @scala.inline
    def setServer(value: js.Array[Server]): Self = this.set("server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnpack(value: buildInConverter): Self = this.set("unpack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setEncoding(value: `utf-8` | GBK): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String | Double]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHybird(value: Boolean): Self = this.set("hybird", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHybird: Self = this.set("hybird", js.undefined)
    
    @scala.inline
    def setMethod(value: GET | POST): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setQuery(value: js.Any): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setRetry(value: Double): Self = this.set("retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
