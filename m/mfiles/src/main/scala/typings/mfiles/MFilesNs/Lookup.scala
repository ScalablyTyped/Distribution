package typings.mfiles.MFilesNs

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.ILookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.Lookup")
@js.native
class Lookup () extends ILookup {
  /* CompleteClass */
  override var Deleted: Boolean = js.native
  /* CompleteClass */
  override val DisplayID: String = js.native
  /* CompleteClass */
  override val DisplayIDAvailable: Boolean = js.native
  /* CompleteClass */
  override var DisplayValue: String = js.native
  /* CompleteClass */
  override val Hidden: Boolean = js.native
  /* CompleteClass */
  override var Item: Double = js.native
  /* CompleteClass */
  override var ItemGUID: String = js.native
  /* CompleteClass */
  override val ObjectFlags: MFSpecialObjectFlag = js.native
  /* CompleteClass */
  override var ObjectType: MFBuiltInObjectType | Double = js.native
  /* CompleteClass */
  override var Version: Double = js.native
  /* CompleteClass */
  override def Clone(): ILookup = js.native
  /* CompleteClass */
  override def CloneFrom(Lookup: ILookup): Unit = js.native
  /* CompleteClass */
  override def GetFormattedDisplayValue(Localized: Boolean, EmptyLookupDispValuesAsHidden: Boolean, AddDeletedSuffixIfDeleted: Boolean): String = js.native
}

@JSGlobal("MFiles.Lookup")
@js.native
object Lookup extends Instantiable0[ILookup]

