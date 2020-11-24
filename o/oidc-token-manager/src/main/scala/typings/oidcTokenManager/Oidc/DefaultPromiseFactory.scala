package typings.oidcTokenManager.Oidc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultPromiseFactory extends js.Object {
  
  def create(callback: js.Any): DefaultPromise = js.native
  
  def reject(reason: js.Any): DefaultPromise = js.native
  
  def resolve(value: js.Any): DefaultPromise = js.native
}
object DefaultPromiseFactory {
  
  @scala.inline
  def apply(
    create: js.Any => DefaultPromise,
    reject: js.Any => DefaultPromise,
    resolve: js.Any => DefaultPromise
  ): DefaultPromiseFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[DefaultPromiseFactory]
  }
  
  @scala.inline
  implicit class DefaultPromiseFactoryOps[Self <: DefaultPromiseFactory] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: js.Any => DefaultPromise): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReject(value: js.Any => DefaultPromise): Self = this.set("reject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolve(value: js.Any => DefaultPromise): Self = this.set("resolve", js.Any.fromFunction1(value))
  }
}
