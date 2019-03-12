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
  def apply(Clone: () => IDataSet, ID: scala.Double, Name: java.lang.String): IDataSet = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ID = ID, Name = Name)
  
    __obj.asInstanceOf[IDataSet]
  }
}

