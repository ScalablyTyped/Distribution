package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectVersionAndPropertiesOfMultipleObjects extends js.Object {
  val Count: Double
  def Add(Index: Double, ObjectVersionAndProperties: IObjectVersionAndProperties): Unit
  def Clone(): IObjectVersionAndPropertiesOfMultipleObjects
  def Item(Index: Double): IObjectVersionAndProperties
  def Remove(Index: Double): Unit
}

object IObjectVersionAndPropertiesOfMultipleObjects {
  @scala.inline
  def apply(
    Add: (Double, IObjectVersionAndProperties) => Unit,
    Clone: () => IObjectVersionAndPropertiesOfMultipleObjects,
    Count: Double,
    Item: Double => IObjectVersionAndProperties,
    Remove: Double => Unit
  ): IObjectVersionAndPropertiesOfMultipleObjects = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IObjectVersionAndPropertiesOfMultipleObjects]
  }
}

