package typings.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IAutomaticPermissions
import typings.mfiles.INamedACL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.AutomaticPermissions")
@js.native
class AutomaticPermissions () extends IAutomaticPermissions {
  /* CompleteClass */
  override var CanDeactivate: Boolean = js.native
  /* CompleteClass */
  override val IsBasedOnObjectACL: Boolean = js.native
  /* CompleteClass */
  override val IsDefault: Boolean = js.native
  /* CompleteClass */
  override val NamedACL: INamedACL = js.native
  /* CompleteClass */
  override def Clone(): IAutomaticPermissions = js.native
  /* CompleteClass */
  override def SetBasedOnObjectACL(): Unit = js.native
  /* CompleteClass */
  override def SetNamedACL(NamedACL: INamedACL): Unit = js.native
}

@JSGlobal("MFiles.AutomaticPermissions")
@js.native
object AutomaticPermissions extends Instantiable0[IAutomaticPermissions]

