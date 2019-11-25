package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectTypeColumnMappings extends js.Object {
  val Count: Double
  def Add(Index: Double, ObjectTypeColumnMapping: IObjectTypeColumnMapping): Unit
  def Clone(): IObjectTypeColumnMappings
  def Item(Index: Double): IObjectTypeColumnMapping
  def Remove(Index: Double): Unit
}

object IObjectTypeColumnMappings {
  @scala.inline
  def apply(
    Add: (Double, IObjectTypeColumnMapping) => Unit,
    Clone: () => IObjectTypeColumnMappings,
    Count: Double,
    Item: Double => IObjectTypeColumnMapping,
    Remove: Double => Unit
  ): IObjectTypeColumnMappings = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IObjectTypeColumnMappings]
  }
}

