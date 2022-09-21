package typings.mfiles.global.MFiles

import typings.mfiles.IOCROptions
import typings.mfiles.MFiles.MFOCRLanguage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.OCROptions")
@js.native
open class OCROptions ()
  extends StObject
     with IOCROptions {
  
  /* CompleteClass */
  override def Clone(): IOCROptions = js.native
  
  /* CompleteClass */
  var PrimaryLanguage: MFOCRLanguage = js.native
  
  /* CompleteClass */
  var SecondaryLanguage: MFOCRLanguage = js.native
}
