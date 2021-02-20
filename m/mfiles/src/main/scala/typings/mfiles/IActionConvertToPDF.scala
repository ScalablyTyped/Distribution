package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IActionConvertToPDF extends StObject {
  
  def Clone(): IActionConvertToPDF = js.native
  
  var FailOnUnsupportedSourceFiles: Boolean = js.native
  
  var OverwriteExistingFile: Boolean = js.native
  
  var PDFA1b: Boolean = js.native
  
  var StoreAsSeparateFile: Boolean = js.native
}
object IActionConvertToPDF {
  
  @scala.inline
  def apply(
    Clone: () => IActionConvertToPDF,
    FailOnUnsupportedSourceFiles: Boolean,
    OverwriteExistingFile: Boolean,
    PDFA1b: Boolean,
    StoreAsSeparateFile: Boolean
  ): IActionConvertToPDF = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), FailOnUnsupportedSourceFiles = FailOnUnsupportedSourceFiles.asInstanceOf[js.Any], OverwriteExistingFile = OverwriteExistingFile.asInstanceOf[js.Any], PDFA1b = PDFA1b.asInstanceOf[js.Any], StoreAsSeparateFile = StoreAsSeparateFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionConvertToPDF]
  }
  
  @scala.inline
  implicit class IActionConvertToPDFMutableBuilder[Self <: IActionConvertToPDF] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IActionConvertToPDF): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailOnUnsupportedSourceFiles(value: Boolean): Self = StObject.set(x, "FailOnUnsupportedSourceFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwriteExistingFile(value: Boolean): Self = StObject.set(x, "OverwriteExistingFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPDFA1b(value: Boolean): Self = StObject.set(x, "PDFA1b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreAsSeparateFile(value: Boolean): Self = StObject.set(x, "StoreAsSeparateFile", value.asInstanceOf[js.Any])
  }
}
