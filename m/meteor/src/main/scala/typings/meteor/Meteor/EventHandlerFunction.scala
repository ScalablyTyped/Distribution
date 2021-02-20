package typings.meteor.Meteor

import typings.meteor.Blaze.TemplateInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventHandlerFunction
  extends js.Function {
  
  def apply(): Unit = js.native
  def apply(event: js.UndefOr[scala.Nothing], templateInstance: TemplateInstance): Unit = js.native
  def apply(event: Event): Unit = js.native
  def apply(event: Event, templateInstance: TemplateInstance): Unit = js.native
}
