package typings.meteorDashTypings.meteorMeteorMod.Meteor

import typings.meteorDashTypings.Blaze.TemplateInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventHandlerFunction
  extends js.Function {
  def apply(): Unit = js.native
  def apply(event: Event): Unit = js.native
  def apply(event: Event, templateInstance: TemplateInstance): Unit = js.native
}

