package typings
package meteorDashPublishDashCompositeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/reywood:publish-composite", JSImport.Namespace)
@js.native
object `reywood:publishDashCompositeMod` extends js.Object {
  def publishComposite(
    name: java.lang.String,
    configFunc: js.Function1[
      /* repeated */ js.Any, 
      meteorDashPublishDashCompositeLib.PublishCompositeConfig[_] | js.Array[meteorDashPublishDashCompositeLib.PublishCompositeConfig[_]]
    ]
  ): scala.Unit = js.native
  def publishComposite(
    name: java.lang.String,
    config: js.Array[meteorDashPublishDashCompositeLib.PublishCompositeConfig[_]]
  ): scala.Unit = js.native
  def publishComposite(name: java.lang.String, config: meteorDashPublishDashCompositeLib.PublishCompositeConfig[_]): scala.Unit = js.native
}

