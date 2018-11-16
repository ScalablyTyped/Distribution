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

