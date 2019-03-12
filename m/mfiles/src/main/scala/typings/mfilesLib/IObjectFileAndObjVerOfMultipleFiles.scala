package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectFileAndObjVerOfMultipleFiles extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, ObjectFileAndObjVer: IObjectFileAndObjVer): scala.Unit
  def Clone(): IObjectFileAndObjVerOfMultipleFiles
  def Item(Index: scala.Double): IObjectFileAndObjVer
  def Remove(Index: scala.Double): scala.Unit
}

object IObjectFileAndObjVerOfMultipleFiles {
  @scala.inline
  def apply(
    Add: (scala.Double, IObjectFileAndObjVer) => scala.Unit,
    Clone: () => IObjectFileAndObjVerOfMultipleFiles,
    Count: scala.Double,
    Item: scala.Double => IObjectFileAndObjVer,
    Remove: scala.Double => scala.Unit
  ): IObjectFileAndObjVerOfMultipleFiles = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IObjectFileAndObjVerOfMultipleFiles]
  }
}

