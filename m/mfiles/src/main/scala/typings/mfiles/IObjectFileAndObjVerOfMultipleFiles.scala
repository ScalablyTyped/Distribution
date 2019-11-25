package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectFileAndObjVerOfMultipleFiles extends js.Object {
  val Count: Double
  def Add(Index: Double, ObjectFileAndObjVer: IObjectFileAndObjVer): Unit
  def Clone(): IObjectFileAndObjVerOfMultipleFiles
  def Item(Index: Double): IObjectFileAndObjVer
  def Remove(Index: Double): Unit
}

object IObjectFileAndObjVerOfMultipleFiles {
  @scala.inline
  def apply(
    Add: (Double, IObjectFileAndObjVer) => Unit,
    Clone: () => IObjectFileAndObjVerOfMultipleFiles,
    Count: Double,
    Item: Double => IObjectFileAndObjVer,
    Remove: Double => Unit
  ): IObjectFileAndObjVerOfMultipleFiles = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IObjectFileAndObjVerOfMultipleFiles]
  }
}

