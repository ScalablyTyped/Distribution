package typings.pdfjsDist.typesSrcDisplayApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFWorkerParameters extends StObject {
  
  /**
    * - The name of the worker.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * - The `workerPort` object.
    */
  var port: js.UndefOr[js.Object] = js.undefined
  
  /**
    * - Controls the logging level;
    * the constants from {@link VerbosityLevel } should be used.
    */
  var verbosity: js.UndefOr[Double] = js.undefined
}
object PDFWorkerParameters {
  
  inline def apply(): PDFWorkerParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFWorkerParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PDFWorkerParameters] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPort(value: js.Object): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setVerbosity(value: Double): Self = StObject.set(x, "verbosity", value.asInstanceOf[js.Any])
    
    inline def setVerbosityUndefined: Self = StObject.set(x, "verbosity", js.undefined)
  }
}
