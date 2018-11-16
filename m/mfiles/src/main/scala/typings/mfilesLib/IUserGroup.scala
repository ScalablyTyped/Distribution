package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IUserGroup extends js.Object {
  var ID: scala.Double
  var Members: IIDs
  var Name: java.lang.String
  val Predefined: scala.Boolean
  def AddMember(ID: scala.Double): scala.Unit
  def Clone(): IUserGroup
  def CloneFrom(UserGroup: IUserGroup): scala.Unit
  def RemoveMember(ID: scala.Double): scala.Unit
}

