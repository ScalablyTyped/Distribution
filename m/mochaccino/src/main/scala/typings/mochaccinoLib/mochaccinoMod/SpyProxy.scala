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
    callFake: js.Function1[js.Function1[/* repeated */ js.Any, _], scala.Unit],
    callThrough: js.Function0[scala.Unit],
    getSubject: js.Function0[sinonLib.sinonMod.SinonNs.SinonStub],
    returnValue: js.Function1[js.Any, scala.Unit],
    spyProxy: mochaccinoLib.mochaccinoLibNumbers.`true`
  ): SpyProxy = {
    val __obj = js.Dynamic.literal(and = and, callFake = callFake, callThrough = callThrough, getSubject = getSubject, returnValue = returnValue, spyProxy = spyProxy)
  
    __obj.asInstanceOf[SpyProxy]
  }
}

