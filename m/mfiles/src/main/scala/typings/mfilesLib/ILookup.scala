package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ILookup extends js.Object {
  var Deleted: scala.Boolean
  val DisplayID: java.lang.String
  val DisplayIDAvailable: scala.Boolean
  var DisplayValue: java.lang.String
  val Hidden: scala.Boolean
  var Item: scala.Double
  var ItemGUID: java.lang.String
  val ObjectFlags: mfilesLib.MFilesNs.MFSpecialObjectFlag
  var ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType | scala.Double
  var Version: scala.Double
  def Clone(): ILookup
  def CloneFrom(Lookup: ILookup): scala.Unit
  def GetFormattedDisplayValue(
    Localized: scala.Boolean,
    EmptyLookupDispValuesAsHidden: scala.Boolean,
    AddDeletedSuffixIfDeleted: scala.Boolean
  ): java.lang.String
}

