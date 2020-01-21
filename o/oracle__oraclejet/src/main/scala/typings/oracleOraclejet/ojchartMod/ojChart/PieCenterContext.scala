package typings.oracleOraclejet.ojchartMod.ojChart

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait PieCenterContext extends js.Object {
  var componentElement: Element
  var innerBounds: js.Object
  var label: String
  var outerBounds: js.Object
}

object PieCenterContext {
  @scala.inline
  def apply(componentElement: Element, innerBounds: js.Object, label: String, outerBounds: js.Object): PieCenterContext = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], innerBounds = innerBounds.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], outerBounds = outerBounds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PieCenterContext]
  }
}

