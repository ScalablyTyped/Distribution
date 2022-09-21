package typings.mondaySdkJs.anon

import typings.mondaySdkJs.mod.SetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetItem extends StObject {
  
  /**
    * Returns a stored value from the database under `key`
    * @param key
    */
  def getItem(key: String): js.Promise[DataGetResponse]
  
  /**
    * Stores `value` under `key` in the database
    * @param key
    * @param value
    */
  def setItem(key: String, value: Any): js.Promise[SetResponse]
}
object GetItem {
  
  inline def apply(getItem: String => js.Promise[DataGetResponse], setItem: (String, Any) => js.Promise[SetResponse]): GetItem = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), setItem = js.Any.fromFunction2(setItem))
    __obj.asInstanceOf[GetItem]
  }
  
  extension [Self <: GetItem](x: Self) {
    
    inline def setGetItem(value: String => js.Promise[DataGetResponse]): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    inline def setSetItem(value: (String, Any) => js.Promise[SetResponse]): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
  }
}
