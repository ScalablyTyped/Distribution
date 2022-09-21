package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceInfo extends StObject {
  
  /** All files used during config generation. */
  var sourceFiles: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientServiceconsumermanagement.maximMazurokGapiClientServiceconsumermanagementStrings.SourceInfo & TopLevel[Any]
    ]
  ] = js.undefined
}
object SourceInfo {
  
  inline def apply(): SourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceInfo]
  }
  
  extension [Self <: SourceInfo](x: Self) {
    
    inline def setSourceFiles(
      value: js.Array[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientServiceconsumermanagement.maximMazurokGapiClientServiceconsumermanagementStrings.SourceInfo & TopLevel[Any]
        ]
    ): Self = StObject.set(x, "sourceFiles", value.asInstanceOf[js.Any])
    
    inline def setSourceFilesUndefined: Self = StObject.set(x, "sourceFiles", js.undefined)
    
    inline def setSourceFilesVarargs(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientServiceconsumermanagement.maximMazurokGapiClientServiceconsumermanagementStrings.SourceInfo & TopLevel[Any])*
    ): Self = StObject.set(x, "sourceFiles", js.Array(value*))
  }
}
