package typings.mochaccino.mod

import typings.mochaccino.mochaccinoBooleans.`true`
import typings.sinon.mod.SinonStub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpyProxy extends js.Object {
  
  var and: SpyProxy = js.native
  
  def callFake(fake: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  def callThrough(): Unit = js.native
  
  def getSubject(): SinonStub[js.Array[_], _] = js.native
  
  def returnValue(obj: js.Any): Unit = js.native
  
  var spyProxy: `true` = js.native
}
object SpyProxy {
  
  @scala.inline
  def apply(
    and: SpyProxy,
    callFake: js.Function1[/* repeated */ js.Any, _] => Unit,
    callThrough: () => Unit,
    getSubject: () => SinonStub[js.Array[_], _],
    returnValue: js.Any => Unit,
    spyProxy: `true`
  ): SpyProxy = {
    val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], callFake = js.Any.fromFunction1(callFake), callThrough = js.Any.fromFunction0(callThrough), getSubject = js.Any.fromFunction0(getSubject), returnValue = js.Any.fromFunction1(returnValue), spyProxy = spyProxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpyProxy]
  }
  
  @scala.inline
  implicit class SpyProxyOps[Self <: SpyProxy] (val x: Self) extends AnyVal {
    
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
    def setAnd(value: SpyProxy): Self = this.set("and", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallFake(value: js.Function1[/* repeated */ js.Any, _] => Unit): Self = this.set("callFake", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCallThrough(value: () => Unit): Self = this.set("callThrough", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSubject(value: () => SinonStub[js.Array[_], _]): Self = this.set("getSubject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReturnValue(value: js.Any => Unit): Self = this.set("returnValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSpyProxy(value: `true`): Self = this.set("spyProxy", value.asInstanceOf[js.Any])
  }
}
