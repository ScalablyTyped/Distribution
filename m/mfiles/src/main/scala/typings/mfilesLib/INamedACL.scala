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

object INamedACL {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    Clone: () => INamedACL,
    GUID: java.lang.String,
    ID: scala.Double,
    Name: java.lang.String,
    NamedACLType: mfilesLib.MFilesNs.MFNamedACLType
  ): INamedACL = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList, Clone = js.Any.fromFunction0(Clone), GUID = GUID, ID = ID, Name = Name, NamedACLType = NamedACLType)
  
    __obj.asInstanceOf[INamedACL]
  }
}

