package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerInfo extends StObject {
  
  var auth_required: js.UndefOr[Boolean] = js.undefined
  
  var client_id: Double
  
  var client_ip: js.UndefOr[String] = js.undefined
  
  var cluster: js.UndefOr[String] = js.undefined
  
  var connect_urls: js.UndefOr[js.Array[String]] = js.undefined
  
  var git_commit: js.UndefOr[String] = js.undefined
  
  var go: String
  
  var headers: js.UndefOr[Boolean] = js.undefined
  
  var host: String
  
  var jetstream: js.UndefOr[Boolean] = js.undefined
  
  var ldm: js.UndefOr[Boolean] = js.undefined
  
  var max_payload: Double
  
  var nonce: js.UndefOr[String] = js.undefined
  
  var port: Double
  
  var proto: Double
  
  var server_id: String
  
  var server_name: String
  
  var tls_available: js.UndefOr[Boolean] = js.undefined
  
  var tls_required: js.UndefOr[Boolean] = js.undefined
  
  var tls_verify: js.UndefOr[Boolean] = js.undefined
  
  var version: String
}
object ServerInfo {
  
  inline def apply(
    client_id: Double,
    go: String,
    host: String,
    max_payload: Double,
    port: Double,
    proto: Double,
    server_id: String,
    server_name: String,
    version: String
  ): ServerInfo = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], go = go.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], max_payload = max_payload.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], server_id = server_id.asInstanceOf[js.Any], server_name = server_name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerInfo]
  }
  
  extension [Self <: ServerInfo](x: Self) {
    
    inline def setAuth_required(value: Boolean): Self = StObject.set(x, "auth_required", value.asInstanceOf[js.Any])
    
    inline def setAuth_requiredUndefined: Self = StObject.set(x, "auth_required", js.undefined)
    
    inline def setClient_id(value: Double): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    inline def setClient_ip(value: String): Self = StObject.set(x, "client_ip", value.asInstanceOf[js.Any])
    
    inline def setClient_ipUndefined: Self = StObject.set(x, "client_ip", js.undefined)
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setConnect_urls(value: js.Array[String]): Self = StObject.set(x, "connect_urls", value.asInstanceOf[js.Any])
    
    inline def setConnect_urlsUndefined: Self = StObject.set(x, "connect_urls", js.undefined)
    
    inline def setConnect_urlsVarargs(value: String*): Self = StObject.set(x, "connect_urls", js.Array(value*))
    
    inline def setGit_commit(value: String): Self = StObject.set(x, "git_commit", value.asInstanceOf[js.Any])
    
    inline def setGit_commitUndefined: Self = StObject.set(x, "git_commit", js.undefined)
    
    inline def setGo(value: String): Self = StObject.set(x, "go", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Boolean): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setJetstream(value: Boolean): Self = StObject.set(x, "jetstream", value.asInstanceOf[js.Any])
    
    inline def setJetstreamUndefined: Self = StObject.set(x, "jetstream", js.undefined)
    
    inline def setLdm(value: Boolean): Self = StObject.set(x, "ldm", value.asInstanceOf[js.Any])
    
    inline def setLdmUndefined: Self = StObject.set(x, "ldm", js.undefined)
    
    inline def setMax_payload(value: Double): Self = StObject.set(x, "max_payload", value.asInstanceOf[js.Any])
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setProto(value: Double): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
    
    inline def setServer_id(value: String): Self = StObject.set(x, "server_id", value.asInstanceOf[js.Any])
    
    inline def setServer_name(value: String): Self = StObject.set(x, "server_name", value.asInstanceOf[js.Any])
    
    inline def setTls_available(value: Boolean): Self = StObject.set(x, "tls_available", value.asInstanceOf[js.Any])
    
    inline def setTls_availableUndefined: Self = StObject.set(x, "tls_available", js.undefined)
    
    inline def setTls_required(value: Boolean): Self = StObject.set(x, "tls_required", value.asInstanceOf[js.Any])
    
    inline def setTls_requiredUndefined: Self = StObject.set(x, "tls_required", js.undefined)
    
    inline def setTls_verify(value: Boolean): Self = StObject.set(x, "tls_verify", value.asInstanceOf[js.Any])
    
    inline def setTls_verifyUndefined: Self = StObject.set(x, "tls_verify", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
