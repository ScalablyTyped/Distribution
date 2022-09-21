package typings.oidcProvider.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Adapter extends StObject {
  
  // tslint:disable-line:void-return
  def consume(id: String): js.Promise[js.UndefOr[Unit]]
  
  // tslint:disable-line:void-return
  def destroy(id: String): js.Promise[js.UndefOr[Unit]]
  
  // tslint:disable-line:void-return
  def find(id: String): js.Promise[js.UndefOr[AdapterPayload | Unit]]
  
  // tslint:disable-line:void-return
  def findByUid(uid: String): js.Promise[js.UndefOr[AdapterPayload | Unit]]
  
  // tslint:disable-line:void-return
  def findByUserCode(userCode: String): js.Promise[js.UndefOr[AdapterPayload | Unit]]
  
  // tslint:disable-line:void-return
  def revokeByGrantId(grantId: String): js.Promise[js.UndefOr[Unit]]
  
  def upsert(id: String, payload: AdapterPayload, expiresIn: Double): js.Promise[js.UndefOr[Unit]]
}
object Adapter {
  
  inline def apply(
    consume: String => js.Promise[js.UndefOr[Unit]],
    destroy: String => js.Promise[js.UndefOr[Unit]],
    find: String => js.Promise[js.UndefOr[AdapterPayload | Unit]],
    findByUid: String => js.Promise[js.UndefOr[AdapterPayload | Unit]],
    findByUserCode: String => js.Promise[js.UndefOr[AdapterPayload | Unit]],
    revokeByGrantId: String => js.Promise[js.UndefOr[Unit]],
    upsert: (String, AdapterPayload, Double) => js.Promise[js.UndefOr[Unit]]
  ): Adapter = {
    val __obj = js.Dynamic.literal(consume = js.Any.fromFunction1(consume), destroy = js.Any.fromFunction1(destroy), find = js.Any.fromFunction1(find), findByUid = js.Any.fromFunction1(findByUid), findByUserCode = js.Any.fromFunction1(findByUserCode), revokeByGrantId = js.Any.fromFunction1(revokeByGrantId), upsert = js.Any.fromFunction3(upsert))
    __obj.asInstanceOf[Adapter]
  }
  
  extension [Self <: Adapter](x: Self) {
    
    inline def setConsume(value: String => js.Promise[js.UndefOr[Unit]]): Self = StObject.set(x, "consume", js.Any.fromFunction1(value))
    
    inline def setDestroy(value: String => js.Promise[js.UndefOr[Unit]]): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
    
    inline def setFind(value: String => js.Promise[js.UndefOr[AdapterPayload | Unit]]): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
    
    inline def setFindByUid(value: String => js.Promise[js.UndefOr[AdapterPayload | Unit]]): Self = StObject.set(x, "findByUid", js.Any.fromFunction1(value))
    
    inline def setFindByUserCode(value: String => js.Promise[js.UndefOr[AdapterPayload | Unit]]): Self = StObject.set(x, "findByUserCode", js.Any.fromFunction1(value))
    
    inline def setRevokeByGrantId(value: String => js.Promise[js.UndefOr[Unit]]): Self = StObject.set(x, "revokeByGrantId", js.Any.fromFunction1(value))
    
    inline def setUpsert(value: (String, AdapterPayload, Double) => js.Promise[js.UndefOr[Unit]]): Self = StObject.set(x, "upsert", js.Any.fromFunction3(value))
  }
}
