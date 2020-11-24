package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceInfo extends js.Object {
  
  /** All files used during config generation. */
  var sourceFiles: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientServicenetworking.maximMazurokGapiClientServicenetworkingStrings.SourceInfo with TopLevel[js.Any]
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
  implicit class SourceInfoOps[Self <: SourceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSourceFilesVarargs(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientServicenetworking.maximMazurokGapiClientServicenetworkingStrings.SourceInfo with TopLevel[js.Any])*
    ): Self = this.set("sourceFiles", js.Array(value :_*))
    
    @scala.inline
    def setSourceFiles(
      value: js.Array[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientServicenetworking.maximMazurokGapiClientServicenetworkingStrings.SourceInfo with TopLevel[js.Any]
        ]
    ): Self = this.set("sourceFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceFiles: Self = this.set("sourceFiles", js.undefined)
  }
}
