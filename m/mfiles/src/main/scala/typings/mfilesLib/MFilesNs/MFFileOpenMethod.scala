package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFFileOpenMethod extends js.Object

@JSGlobal("MFiles.MFFileOpenMethod")
@js.native
object MFFileOpenMethod extends js.Object {
  @js.native
  sealed trait Edit
    extends mfilesLib.MFilesNs.MFFileOpenMethod
  
  @js.native
  sealed trait Open
    extends mfilesLib.MFilesNs.MFFileOpenMethod
  
  @js.native
  sealed trait ShowInShell
    extends mfilesLib.MFilesNs.MFFileOpenMethod
  
  @js.native
  sealed trait View
    extends mfilesLib.MFilesNs.MFFileOpenMethod
  
  /* 3 */ val Edit: Edit with scala.Double = js.native
  /* 1 */ val Open: Open with scala.Double = js.native
  /* 0 */ val ShowInShell: ShowInShell with scala.Double = js.native
  /* 2 */ val View: View with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFFileOpenMethod with scala.Double] = js.native
}

