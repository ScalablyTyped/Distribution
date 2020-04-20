package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataSet extends js.Object {
  val ID: Double
  val Name: String
  def Clone(): IDataSet
}

object IDataSet {
  @scala.inline
  def apply(Clone: () => IDataSet, ID: Double, Name: String): IDataSet = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataSet]
  }
}

