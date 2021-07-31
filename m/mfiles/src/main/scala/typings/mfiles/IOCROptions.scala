package typings.mfiles

import typings.mfiles.MFiles.MFOCRLanguage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOCROptions extends StObject {
  
  def Clone(): IOCROptions
  
  var PrimaryLanguage: MFOCRLanguage
  
  var SecondaryLanguage: MFOCRLanguage
}
object IOCROptions {
  
  @scala.inline
  def apply(Clone: () => IOCROptions, PrimaryLanguage: MFOCRLanguage, SecondaryLanguage: MFOCRLanguage): IOCROptions = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), PrimaryLanguage = PrimaryLanguage.asInstanceOf[js.Any], SecondaryLanguage = SecondaryLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOCROptions]
  }
  
  @scala.inline
  implicit class IOCROptionsMutableBuilder[Self <: IOCROptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IOCROptions): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrimaryLanguage(value: MFOCRLanguage): Self = StObject.set(x, "PrimaryLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryLanguage(value: MFOCRLanguage): Self = StObject.set(x, "SecondaryLanguage", value.asInstanceOf[js.Any])
  }
}
