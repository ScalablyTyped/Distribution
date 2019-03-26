package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.Workflow")
@js.native
class Workflow ()
  extends mfilesLib.IWorkflow {
  /* CompleteClass */
  override var ID: scala.Double = js.native
  /* CompleteClass */
  override var Name: java.lang.String = js.native
  /* CompleteClass */
  override var ObjectClass: MFBuiltInDocumentClass | MFBuiltInObjectClass | scala.Double = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IWorkflow = js.native
  /* CompleteClass */
  override def GetAsLookup(): mfilesLib.ILookup = js.native
  /* CompleteClass */
  override def GetAsTypedValue(): mfilesLib.ITypedValue = js.native
}

