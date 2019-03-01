package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITraditionalFolder extends js.Object {
  val ID: scala.Double
  val Name: java.lang.String
}

object ITraditionalFolder {
  @scala.inline
  def apply(ID: scala.Double, Name: java.lang.String): ITraditionalFolder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ID")(ID)
    __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[ITraditionalFolder]
  }
}

