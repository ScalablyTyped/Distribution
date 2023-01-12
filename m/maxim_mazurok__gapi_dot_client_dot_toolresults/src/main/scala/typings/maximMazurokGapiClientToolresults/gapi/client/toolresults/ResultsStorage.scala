package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultsStorage extends StObject {
  
  /** The root directory for test results. */
  var resultsStoragePath: js.UndefOr[FileReference] = js.undefined
  
  /** The path to the Xunit XML file. */
  var xunitXmlFile: js.UndefOr[FileReference] = js.undefined
}
object ResultsStorage {
  
  inline def apply(): ResultsStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultsStorage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResultsStorage] (val x: Self) extends AnyVal {
    
    inline def setResultsStoragePath(value: FileReference): Self = StObject.set(x, "resultsStoragePath", value.asInstanceOf[js.Any])
    
    inline def setResultsStoragePathUndefined: Self = StObject.set(x, "resultsStoragePath", js.undefined)
    
    inline def setXunitXmlFile(value: FileReference): Self = StObject.set(x, "xunitXmlFile", value.asInstanceOf[js.Any])
    
    inline def setXunitXmlFileUndefined: Self = StObject.set(x, "xunitXmlFile", js.undefined)
  }
}
