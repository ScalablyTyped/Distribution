package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFIndirectPropertyIDLevelType extends js.Object

@JSGlobal("MFiles.MFIndirectPropertyIDLevelType")
@js.native
object MFIndirectPropertyIDLevelType extends js.Object {
  @js.native
  sealed trait ObjectType
    extends mfilesLib.MFilesNs.MFIndirectPropertyIDLevelType
  
  @js.native
  sealed trait PropertyDef
    extends mfilesLib.MFilesNs.MFIndirectPropertyIDLevelType
  
  @js.native
  sealed trait StateChanger
    extends mfilesLib.MFilesNs.MFIndirectPropertyIDLevelType
  
  /* 1 */ val ObjectType: ObjectType with scala.Double = js.native
  /* 0 */ val PropertyDef: PropertyDef with scala.Double = js.native
  /* 2 */ val StateChanger: StateChanger with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFIndirectPropertyIDLevelType with scala.Double] = js.native
}

