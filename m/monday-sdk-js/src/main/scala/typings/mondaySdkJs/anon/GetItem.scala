package typings.mondaySdkJs.anon

import typings.mondaySdkJs.mod.GetResponse
import typings.mondaySdkJs.mod.SetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetItem extends js.Object {
  
  /**
    * Returns a stored value from the database under `key`
    * @param key
    */
  def getItem(key: String): js.Promise[GetResponse] = js.native
  
  /**
    * Stores `value` under `key` in the database
    * @param key
    * @param value
    */
  def setItem(key: String, value: js.Any): js.Promise[SetResponse] = js.native
}
object GetItem {
  
  @scala.inline
  def apply(getItem: String => js.Promise[GetResponse], setItem: (String, js.Any) => js.Promise[SetResponse]): GetItem = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), setItem = js.Any.fromFunction2(setItem))
    __obj.asInstanceOf[GetItem]
  }
  
  @scala.inline
  implicit class GetItemOps[Self <: GetItem] (val x: Self) extends AnyVal {
    
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
    def setGetItem(value: String => js.Promise[GetResponse]): Self = this.set("getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetItem(value: (String, js.Any) => js.Promise[SetResponse]): Self = this.set("setItem", js.Any.fromFunction2(value))
  }
}
