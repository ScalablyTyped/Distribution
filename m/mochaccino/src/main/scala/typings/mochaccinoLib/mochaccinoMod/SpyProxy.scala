package typings
package mochaccinoLib.mochaccinoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpyProxy extends js.Object {
  var and: SpyProxy
  var spyProxy: mochaccinoLib.mochaccinoLibNumbers.`true`
  def callFake(fake: js.Function1[/* repeated */ js.Any, _]): scala.Unit
  def callThrough(): scala.Unit
  def getSubject(): sinonLib.sinonMod.SinonNs.SinonStub
  def returnValue(obj: js.Any): scala.Unit
}

object SpyProxy {
  @scala.inline
  def apply(
    and: SpyProxy,
    callFake: js.Function1[/* repeated */ js.Any, _] => scala.Unit,
    callThrough: () => scala.Unit,
    getSubject: () => sinonLib.sinonMod.SinonNs.SinonStub,
    returnValue: js.Any => scala.Unit,
    spyProxy: mochaccinoLib.mochaccinoLibNumbers.`true`
  ): SpyProxy = {
    val __obj = js.Dynamic.literal(and = and, callFake = js.Any.fromFunction1(callFake), callThrough = js.Any.fromFunction0(callThrough), getSubject = js.Any.fromFunction0(getSubject), returnValue = js.Any.fromFunction1(returnValue), spyProxy = spyProxy)
  
    __obj.asInstanceOf[SpyProxy]
  }
}

