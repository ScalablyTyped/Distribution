package typings.mfiles.global.MFiles

import typings.mfiles.IMFResourceManager
import typings.mfiles.IStrings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.MFResourceManager")
@js.native
class MFResourceManager ()
  extends StObject
     with IMFResourceManager {
  
  /* CompleteClass */
  override def GetLocaleSpecificDateFormat(): String = js.native
  
  /* CompleteClass */
  override def GetUICultures(): IStrings = js.native
  
  /* CompleteClass */
  override def LoadResourceString(LanguageID: Double, ResourceID: Double): String = js.native
}
