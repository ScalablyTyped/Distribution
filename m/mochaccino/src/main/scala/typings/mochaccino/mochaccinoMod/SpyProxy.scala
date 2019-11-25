package typings.mochaccino.mochaccinoMod

import typings.mochaccino.mochaccinoNumbers.`true`
import typings.sinon.sinonMod.SinonStub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpyProxy extends js.Object {
  var and: SpyProxy
  var spyProxy: `true`
  def callFake(fake: js.Function1[/* repeated */ js.Any, _]): Unit
  def callThrough(): Unit
  def getSubject(): SinonStub
  def returnValue(obj: js.Any): Unit
}

object SpyProxy {
  @scala.inline
  def apply(
    and: SpyProxy,
    callFake: js.Function1[/* repeated */ js.Any, _] => Unit,
    callThrough: () => Unit,
    getSubject: () => SinonStub,
    returnValue: js.Any => Unit,
    spyProxy: `true`
  ): SpyProxy = {
    val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], callFake = js.Any.fromFunction1(callFake), callThrough = js.Any.fromFunction0(callThrough), getSubject = js.Any.fromFunction0(getSubject), returnValue = js.Any.fromFunction1(returnValue), spyProxy = spyProxy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SpyProxy]
  }
}

