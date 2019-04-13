package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.Impersonation")
@js.native
class Impersonation ()
  extends mfilesLib.IImpersonation {
  /* CompleteClass */
  override var Account: java.lang.String = js.native
  /* CompleteClass */
  override var ImpersonationType: MFImpersonationType = js.native
  /* CompleteClass */
  override var Password: java.lang.String = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IImpersonation = js.native
}

@JSGlobal("MFiles.Impersonation")
@js.native
object Impersonation
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IImpersonation]

