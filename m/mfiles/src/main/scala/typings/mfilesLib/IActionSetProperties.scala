package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionSetProperties extends js.Object {
  var Properties: IDefaultProperties
  def Clone(): IActionSetProperties
}

object IActionSetProperties {
  @scala.inline
  def apply(Clone: js.Function0[IActionSetProperties], Properties: IDefaultProperties): IActionSetProperties = {
    val __obj = js.Dynamic.literal(Clone = Clone, Properties = Properties)
  
    __obj.asInstanceOf[IActionSetProperties]
  }
}

