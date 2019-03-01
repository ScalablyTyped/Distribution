package typings
package atOracleOraclejetLib.ojprogresslistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressItem extends js.Object {
  def addEventListener(
    eventType: atOracleOraclejetLib.ojprogresslistMod.ProgressItemNs.EventType,
    listener: stdLib.EventListener
  ): scala.Unit
  def removeEventListener(
    eventType: atOracleOraclejetLib.ojprogresslistMod.ProgressItemNs.EventType,
    listener: stdLib.EventListener
  ): scala.Unit
}

object ProgressItem {
  @scala.inline
  def apply(
    addEventListener: js.Function2[
      atOracleOraclejetLib.ojprogresslistMod.ProgressItemNs.EventType, 
      stdLib.EventListener, 
      scala.Unit
    ],
    removeEventListener: js.Function2[
      atOracleOraclejetLib.ojprogresslistMod.ProgressItemNs.EventType, 
      stdLib.EventListener, 
      scala.Unit
    ]
  ): ProgressItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.asInstanceOf[ProgressItem]
  }
}

