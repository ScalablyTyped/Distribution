package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceLocation extends StObject {
  
  /** Source file name. Depending on the runtime environment, this might be a simple name or a fully-qualified name. */
  var file: js.UndefOr[String] = js.undefined
  
  /**
    * Human-readable name of the function or method being invoked, with optional context such as the class or package name. This information is used in contexts such as the logs viewer,
    * where a file and line number are less meaningful. The format can vary by language. For example: qual.if.ied.Class.method (Java), dir/package.func (Go), function (Python).
    */
  var functionName: js.UndefOr[String] = js.undefined
  
  /** Line within the source file. */
  var line: js.UndefOr[String] = js.undefined
}
object SourceLocation {
  
  inline def apply(): SourceLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceLocation]
  }
  
  extension [Self <: SourceLocation](x: Self) {
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    inline def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
    
    inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
