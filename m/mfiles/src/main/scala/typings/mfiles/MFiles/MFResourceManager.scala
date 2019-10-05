package typings.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IMFResourceManager
import typings.mfiles.IStrings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.MFResourceManager")
@js.native
class MFResourceManager () extends IMFResourceManager {
  /* CompleteClass */
  override def GetLocaleSpecificDateFormat(): String = js.native
  /* CompleteClass */
  override def GetUICultures(): IStrings = js.native
  /* CompleteClass */
  override def LoadResourceString(LanguageID: Double, ResourceID: Double): String = js.native
}

@JSGlobal("MFiles.MFResourceManager")
@js.native
object MFResourceManager extends Instantiable0[IMFResourceManager]

