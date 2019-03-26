package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.Lookup")
@js.native
class Lookup ()
  extends mfilesLib.ILookup {
  /* CompleteClass */
  override var Deleted: scala.Boolean = js.native
  /* CompleteClass */
  override val DisplayID: java.lang.String = js.native
  /* CompleteClass */
  override val DisplayIDAvailable: scala.Boolean = js.native
  /* CompleteClass */
  override var DisplayValue: java.lang.String = js.native
  /* CompleteClass */
  override val Hidden: scala.Boolean = js.native
  /* CompleteClass */
  override var Item: scala.Double = js.native
  /* CompleteClass */
  override var ItemGUID: java.lang.String = js.native
  /* CompleteClass */
  override val ObjectFlags: MFSpecialObjectFlag = js.native
  /* CompleteClass */
  override var ObjectType: MFBuiltInObjectType | scala.Double = js.native
  /* CompleteClass */
  override var Version: scala.Double = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.ILookup = js.native
  /* CompleteClass */
  override def CloneFrom(Lookup: mfilesLib.ILookup): scala.Unit = js.native
  /* CompleteClass */
  override def GetFormattedDisplayValue(
    Localized: scala.Boolean,
    EmptyLookupDispValuesAsHidden: scala.Boolean,
    AddDeletedSuffixIfDeleted: scala.Boolean
  ): java.lang.String = js.native
}

