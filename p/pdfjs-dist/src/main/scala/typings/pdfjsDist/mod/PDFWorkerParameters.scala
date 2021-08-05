package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFWorkerParameters extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var port: js.UndefOr[js.Any] = js.undefined
  
  var verbosity: js.UndefOr[VerbosityLevel] = js.undefined
}
object PDFWorkerParameters {
  
  inline def apply(): PDFWorkerParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFWorkerParameters]
  }
  
  extension [Self <: PDFWorkerParameters](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPort(value: js.Any): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setVerbosity(value: VerbosityLevel): Self = StObject.set(x, "verbosity", value.asInstanceOf[js.Any])
    
    inline def setVerbosityUndefined: Self = StObject.set(x, "verbosity", js.undefined)
  }
}
