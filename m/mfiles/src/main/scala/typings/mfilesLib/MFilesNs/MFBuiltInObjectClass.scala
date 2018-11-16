package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFBuiltInObjectClass extends js.Object

@JSGlobal("MFiles.MFBuiltInObjectClass")
@js.native
object MFBuiltInObjectClass extends js.Object {
  @js.native
  sealed trait Any
    extends mfilesLib.MFilesNs.MFBuiltInObjectClass
  
  @js.native
  sealed trait GenericAssignment
    extends mfilesLib.MFilesNs.MFBuiltInObjectClass
  
  @js.native
  sealed trait NotSet
    extends mfilesLib.MFilesNs.MFBuiltInObjectClass
  
  /* -3 */ val Any: Any with scala.Double = js.native
  /* -100 */ val GenericAssignment: GenericAssignment with scala.Double = js.native
  /* -2 */ val NotSet: NotSet with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFBuiltInObjectClass with scala.Double] = js.native
}

