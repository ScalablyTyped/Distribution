package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFWorkerParameters extends StObject {
  
  var name: js.UndefOr[String] = js.native
  
  var port: js.UndefOr[js.Any] = js.native
  
  var verbosity: js.UndefOr[VerbosityLevel] = js.native
}
object PDFWorkerParameters {
  
  @scala.inline
  def apply(): PDFWorkerParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFWorkerParameters]
  }
  
  @scala.inline
  implicit class PDFWorkerParametersMutableBuilder[Self <: PDFWorkerParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPort(value: js.Any): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setVerbosity(value: VerbosityLevel): Self = StObject.set(x, "verbosity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerbosityUndefined: Self = StObject.set(x, "verbosity", js.undefined)
  }
}
