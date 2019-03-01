package typings
package mqttLib.typesLibClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscriptionMap
  extends /**
  * object which has topic names as object keys and as value the QoS, like {'test1': 0, 'test2': 1}.
  */
/* topic */ org.scalablytyped.runtime.StringDictionary[mqttDashPacketLib.mqttDashPacketMod.QoS]

object ISubscriptionMap {
  @scala.inline
  def apply(
    StringDictionary: /**
    * object which has topic names as object keys and as value the QoS, like {'test1': 0, 'test2': 1}.
    */
  /* topic */ org.scalablytyped.runtime.StringDictionary[mqttDashPacketLib.mqttDashPacketMod.QoS] = null
  ): ISubscriptionMap = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ISubscriptionMap]
  }
}

