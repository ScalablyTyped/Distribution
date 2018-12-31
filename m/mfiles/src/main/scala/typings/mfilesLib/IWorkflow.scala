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

