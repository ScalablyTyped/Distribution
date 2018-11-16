package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFCustomApplicationType extends js.Object

@JSGlobal("MFiles.MFCustomApplicationType")
@js.native
object MFCustomApplicationType extends js.Object {
  @js.native
  sealed trait Client
    extends mfilesLib.MFilesNs.MFCustomApplicationType
  
  @js.native
  sealed trait Server
    extends mfilesLib.MFilesNs.MFCustomApplicationType
  
  @js.native
  sealed trait Unspecified
    extends mfilesLib.MFilesNs.MFCustomApplicationType
  
  /* 1 */ val Client: Client with scala.Double = js.native
  /* 2 */ val Server: Server with scala.Double = js.native
  /* 0 */ val Unspecified: Unspecified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFCustomApplicationType with scala.Double] = js.native
}

