package typings
package ngtoasterLib.ngtoasterMod.ngtoasterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IToasterEventRegistry extends js.Object {
  def setup(): scala.Unit
  def subscribeToClearToastsEvent(onClearToasts: IToastEventListener): scala.Unit
  def subscribeToNewToastEvent(onNewToast: IToastEventListener): scala.Unit
  def unsubscribeToClearToastsEvent(onClearToasts: IToastEventListener): scala.Unit
  def unsubscribeToNewToastEvent(onNewToast: IToastEventListener): scala.Unit
}

