package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISourceObjectFiles extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, SourceObjectFile: ISourceObjectFile): scala.Unit
  def AddEmptyFile(Title: java.lang.String, Extension: java.lang.String): ISourceObjectFile
  def AddFile(Title: java.lang.String, Extension: java.lang.String, SourcePath: java.lang.String): ISourceObjectFile
  def Item(Index: scala.Double): ISourceObjectFile
  def Remove(Index: scala.Double): scala.Unit
}

