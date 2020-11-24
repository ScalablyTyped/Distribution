package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosDeviceCatalog extends js.Object {
  
  /** The set of supported iOS device models. */
  var models: js.UndefOr[js.Array[IosModel]] = js.native
  
  /** The set of supported runtime configurations. */
  var runtimeConfiguration: js.UndefOr[IosRuntimeConfiguration] = js.native
  
  /** The set of supported iOS software versions. */
  var versions: js.UndefOr[js.Array[IosVersion]] = js.native
  
  /** The set of supported Xcode versions. */
  var xcodeVersions: js.UndefOr[js.Array[XcodeVersion]] = js.native
}
object IosDeviceCatalog {
  
  @scala.inline
  def apply(): IosDeviceCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosDeviceCatalog]
  }
  
  @scala.inline
  implicit class IosDeviceCatalogOps[Self <: IosDeviceCatalog] (val x: Self) extends AnyVal {
    
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
    def setModelsVarargs(value: IosModel*): Self = this.set("models", js.Array(value :_*))
    
    @scala.inline
    def setModels(value: js.Array[IosModel]): Self = this.set("models", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModels: Self = this.set("models", js.undefined)
    
    @scala.inline
    def setRuntimeConfiguration(value: IosRuntimeConfiguration): Self = this.set("runtimeConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntimeConfiguration: Self = this.set("runtimeConfiguration", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: IosVersion*): Self = this.set("versions", js.Array(value :_*))
    
    @scala.inline
    def setVersions(value: js.Array[IosVersion]): Self = this.set("versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersions: Self = this.set("versions", js.undefined)
    
    @scala.inline
    def setXcodeVersionsVarargs(value: XcodeVersion*): Self = this.set("xcodeVersions", js.Array(value :_*))
    
    @scala.inline
    def setXcodeVersions(value: js.Array[XcodeVersion]): Self = this.set("xcodeVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXcodeVersions: Self = this.set("xcodeVersions", js.undefined)
  }
}
