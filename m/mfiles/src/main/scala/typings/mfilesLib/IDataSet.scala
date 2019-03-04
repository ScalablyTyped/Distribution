package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataSet extends js.Object {
  val ID: scala.Double
  val Name: java.lang.String
  def Clone(): IDataSet
}

object IDataSet {
  @scala.inline
  def apply(Clone: js.Function0[IDataSet], ID: scala.Double, Name: java.lang.String): IDataSet = {
    val __obj = js.Dynamic.literal(Clone = Clone, ID = ID, Name = Name)
  
    __obj.asInstanceOf[IDataSet]
  }
}

