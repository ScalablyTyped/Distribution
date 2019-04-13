package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.AutomaticPermissions")
@js.native
class AutomaticPermissions ()
  extends mfilesLib.IAutomaticPermissions {
  /* CompleteClass */
  override var CanDeactivate: scala.Boolean = js.native
  /* CompleteClass */
  override val IsBasedOnObjectACL: scala.Boolean = js.native
  /* CompleteClass */
  override val IsDefault: scala.Boolean = js.native
  /* CompleteClass */
  override val NamedACL: mfilesLib.INamedACL = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IAutomaticPermissions = js.native
  /* CompleteClass */
  override def SetBasedOnObjectACL(): scala.Unit = js.native
  /* CompleteClass */
  override def SetNamedACL(NamedACL: mfilesLib.INamedACL): scala.Unit = js.native
}

@JSGlobal("MFiles.AutomaticPermissions")
@js.native
object AutomaticPermissions
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IAutomaticPermissions]

