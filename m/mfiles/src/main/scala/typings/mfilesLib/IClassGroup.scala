package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClassGroup extends js.Object {
  var ID: scala.Double
  var Members: IIDs
  var Name: java.lang.String
  var ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType | scala.Double
  def AddMember(Member: scala.Double): scala.Unit
  def Clone(): IClassGroup
  def RemoveMember(Member: scala.Double): scala.Unit
}

