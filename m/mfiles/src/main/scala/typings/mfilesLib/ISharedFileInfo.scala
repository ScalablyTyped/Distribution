package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISharedFileInfo extends js.Object {
  val ChangeTimeUtc: stdLib.Date
  val Extension: java.lang.String
  val LogicalSize: scala.Double
  val LogicalSize_32bit: scala.Double
  val Title: java.lang.String
  def Clone(): ISharedFileInfo
}

