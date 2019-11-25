package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDefaultProperties extends js.Object {
  val Count: Double
  def Add(Index: Double, DefaultProperty: IDefaultProperty): Unit
  def Item(Index: Double): IDefaultProperty
  def Remove(Index: Double): Unit
}

object IDefaultProperties {
  @scala.inline
  def apply(
    Add: (Double, IDefaultProperty) => Unit,
    Count: Double,
    Item: Double => IDefaultProperty,
    Remove: Double => Unit
  ): IDefaultProperties = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IDefaultProperties]
  }
}

