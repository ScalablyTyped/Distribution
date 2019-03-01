package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWorkflow extends js.Object {
  var ID: scala.Double
  var Name: java.lang.String
  var ObjectClass: mfilesLib.MFilesNs.MFBuiltInDocumentClass | mfilesLib.MFilesNs.MFBuiltInObjectClass | scala.Double
  def Clone(): IWorkflow
  def GetAsLookup(): ILookup
  def GetAsTypedValue(): ITypedValue
}

object IWorkflow {
  @scala.inline
  def apply(
    Clone: js.Function0[IWorkflow],
    GetAsLookup: js.Function0[ILookup],
    GetAsTypedValue: js.Function0[ITypedValue],
    ID: scala.Double,
    Name: java.lang.String,
    ObjectClass: mfilesLib.MFilesNs.MFBuiltInDocumentClass | mfilesLib.MFilesNs.MFBuiltInObjectClass | scala.Double
  ): IWorkflow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("GetAsLookup")(GetAsLookup)
    __obj.updateDynamic("GetAsTypedValue")(GetAsTypedValue)
    __obj.updateDynamic("ID")(ID)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("ObjectClass")(ObjectClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkflow]
  }
}

