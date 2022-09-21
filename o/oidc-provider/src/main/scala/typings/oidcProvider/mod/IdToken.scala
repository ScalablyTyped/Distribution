package typings.oidcProvider.mod

import typings.oidcProvider.anon.ExpiresAt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdToken extends StObject {
  
  val available: UnknownObject
  
  val client: Client
  
  val ctx: KoaContextWithOIDC
  
  val extra: UnknownObject
  
  def issue(context: ExpiresAt): js.Promise[String]
  
  def payload(): js.Promise[UnknownObject]
  
  def set(key: String, value: Any): Unit
}
object IdToken {
  
  inline def apply(
    available: UnknownObject,
    client: Client,
    ctx: KoaContextWithOIDC,
    extra: UnknownObject,
    issue: ExpiresAt => js.Promise[String],
    payload: () => js.Promise[UnknownObject],
    set: (String, Any) => Unit
  ): IdToken = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], issue = js.Any.fromFunction1(issue), payload = js.Any.fromFunction0(payload), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[IdToken]
  }
  
  extension [Self <: IdToken](x: Self) {
    
    inline def setAvailable(value: UnknownObject): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setCtx(value: KoaContextWithOIDC): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setExtra(value: UnknownObject): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setIssue(value: ExpiresAt => js.Promise[String]): Self = StObject.set(x, "issue", js.Any.fromFunction1(value))
    
    inline def setPayload(value: () => js.Promise[UnknownObject]): Self = StObject.set(x, "payload", js.Any.fromFunction0(value))
    
    inline def setSet(value: (String, Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
