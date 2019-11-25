package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionSetProperties extends js.Object {
  var Properties: IDefaultProperties
  def Clone(): IActionSetProperties
}

object IActionSetProperties {
  @scala.inline
  def apply(Clone: () => IActionSetProperties, Properties: IDefaultProperties): IActionSetProperties = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Properties = Properties.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IActionSetProperties]
  }
}

