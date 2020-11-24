package typings.optimism.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscribe[TKey] extends js.Object {
  
  var subscribe: /* import warning: importer.ImportType#apply Failed type conversion: optimism.optimism.OptimisticWrapOptions<[TKey], [TKey]>['subscribe'] */ js.Any = js.native
}
object Subscribe {
  
  @scala.inline
  def apply[TKey](
    subscribe: /* import warning: importer.ImportType#apply Failed type conversion: optimism.optimism.OptimisticWrapOptions<[TKey], [TKey]>['subscribe'] */ js.Any
  ): Subscribe[TKey] = {
    val __obj = js.Dynamic.literal(subscribe = subscribe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscribe[TKey]]
  }
  
  @scala.inline
  implicit class SubscribeOps[Self <: Subscribe[_], TKey] (val x: Self with Subscribe[TKey]) extends AnyVal {
    
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
    def setSubscribe(
      value: /* import warning: importer.ImportType#apply Failed type conversion: optimism.optimism.OptimisticWrapOptions<[TKey], [TKey]>['subscribe'] */ js.Any
    ): Self = this.set("subscribe", value.asInstanceOf[js.Any])
  }
}
