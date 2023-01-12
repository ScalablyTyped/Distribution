package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceInfo extends StObject {
  
  /** All files used during config generation. */
  var sourceFiles: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ]
  ] = js.undefined
}
object SourceInfo {
  
  inline def apply(): SourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceInfo] (val x: Self) extends AnyVal {
    
    inline def setSourceFiles(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
        ]
    ): Self = StObject.set(x, "sourceFiles", value.asInstanceOf[js.Any])
    
    inline def setSourceFilesUndefined: Self = StObject.set(x, "sourceFiles", js.undefined)
    
    inline def setSourceFilesVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any)*
    ): Self = StObject.set(x, "sourceFiles", js.Array(value*))
  }
}
