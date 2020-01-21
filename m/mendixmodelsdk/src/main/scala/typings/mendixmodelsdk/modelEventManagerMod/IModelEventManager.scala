package typings.mendixmodelsdk.modelEventManagerMod

import typings.mendixmodelsdk.commonMod.common.IErrorCallback
import typings.mendixmodelsdk.commonMod.common.IVoidCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModelEventManager extends js.Object {
  def loadUnitCompleted(eventId: Double, callback: IVoidCallback, errorCallback: IErrorCallback): Unit
  def loadUnitStarted(): Unit
  def onEventProcessed(callback: IVoidCallback): Unit
  def start(): Unit
  def stop(): Unit
}

object IModelEventManager {
  @scala.inline
  def apply(
    loadUnitCompleted: (Double, IVoidCallback, IErrorCallback) => Unit,
    loadUnitStarted: () => Unit,
    onEventProcessed: IVoidCallback => Unit,
    start: () => Unit,
    stop: () => Unit
  ): IModelEventManager = {
    val __obj = js.Dynamic.literal(loadUnitCompleted = js.Any.fromFunction3(loadUnitCompleted), loadUnitStarted = js.Any.fromFunction0(loadUnitStarted), onEventProcessed = js.Any.fromFunction1(onEventProcessed), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[IModelEventManager]
  }
}

