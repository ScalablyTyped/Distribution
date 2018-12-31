package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INamedACL extends js.Object {
  var AccessControlList: IAccessControlList
  val GUID: java.lang.String
  var ID: scala.Double
  var Name: java.lang.String
  val NamedACLType: mfilesLib.MFilesNs.MFNamedACLType
  def Clone(): INamedACL
}

