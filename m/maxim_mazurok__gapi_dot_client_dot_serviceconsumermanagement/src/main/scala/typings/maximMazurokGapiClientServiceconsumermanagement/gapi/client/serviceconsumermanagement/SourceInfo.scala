package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceInfo extends StObject {
  
  /** All files used during config generation. */
  var sourceFiles: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientServiceconsumermanagement.maximMazurokGapiClientServiceconsumermanagementStrings.SourceInfo with TopLevel[js.Any]
    ]
  ] = js.native
}
object SourceInfo {
  
  @scala.inline
  def apply(): SourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceInfo]
  }
  
  @scala.inline
  implicit class SourceInfoMutableBuilder[Self <: SourceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceFiles(
      value: js.Array[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientServiceconsumermanagement.maximMazurokGapiClientServiceconsumermanagementStrings.SourceInfo with TopLevel[js.Any]
        ]
    ): Self = StObject.set(x, "sourceFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFilesUndefined: Self = StObject.set(x, "sourceFiles", js.undefined)
    
    @scala.inline
    def setSourceFilesVarargs(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientServiceconsumermanagement.maximMazurokGapiClientServiceconsumermanagementStrings.SourceInfo with TopLevel[js.Any])*
    ): Self = StObject.set(x, "sourceFiles", js.Array(value :_*))
  }
}
