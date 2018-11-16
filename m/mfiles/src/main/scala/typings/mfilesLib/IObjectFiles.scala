package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IObjectFiles extends js.Object {
  val Count: scala.Double
  def GetObjectFileByNameForFileSystem(NameForFileSystem: java.lang.String): IObjectFile
  def GetObjectFileIndexByNameForFileSystem(NameForFileSystem: java.lang.String): scala.Double
  def Item(Index: scala.Double): IObjectFile
  def Sort(ObjectFileComparer: IObjectFileComparer): scala.Unit
  def ToJSON(): java.lang.String
}

