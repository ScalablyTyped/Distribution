package typings
package mochaccinoLib.mochaccinoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SpyProxy extends js.Object {
  var and: SpyProxy
  var spyProxy: mochaccinoLib.mochaccinoLibNumbers.`true`
  def callFake(fake: js.Function1[/* repeated */js.Any, _]): scala.Unit
  def callThrough(): scala.Unit
  def getSubject(): sinonLib.sinonMod.SinonNs.SinonStub
  def returnValue(obj: js.Any): scala.Unit
}

