package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosDeviceCatalog extends StObject {
  
  /** The set of supported iOS device models. */
  var models: js.UndefOr[js.Array[IosModel]] = js.undefined
  
  /** The set of supported runtime configurations. */
  var runtimeConfiguration: js.UndefOr[IosRuntimeConfiguration] = js.undefined
  
  /** The set of supported iOS software versions. */
  var versions: js.UndefOr[js.Array[IosVersion]] = js.undefined
  
  /** The set of supported Xcode versions. */
  var xcodeVersions: js.UndefOr[js.Array[XcodeVersion]] = js.undefined
}
object IosDeviceCatalog {
  
  @scala.inline
  def apply(): IosDeviceCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosDeviceCatalog]
  }
  
  @scala.inline
  implicit class IosDeviceCatalogMutableBuilder[Self <: IosDeviceCatalog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModels(value: js.Array[IosModel]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelsUndefined: Self = StObject.set(x, "models", js.undefined)
    
    @scala.inline
    def setModelsVarargs(value: IosModel*): Self = StObject.set(x, "models", js.Array(value :_*))
    
    @scala.inline
    def setRuntimeConfiguration(value: IosRuntimeConfiguration): Self = StObject.set(x, "runtimeConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeConfigurationUndefined: Self = StObject.set(x, "runtimeConfiguration", js.undefined)
    
    @scala.inline
    def setVersions(value: js.Array[IosVersion]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: IosVersion*): Self = StObject.set(x, "versions", js.Array(value :_*))
    
    @scala.inline
    def setXcodeVersions(value: js.Array[XcodeVersion]): Self = StObject.set(x, "xcodeVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXcodeVersionsUndefined: Self = StObject.set(x, "xcodeVersions", js.undefined)
    
    @scala.inline
    def setXcodeVersionsVarargs(value: XcodeVersion*): Self = StObject.set(x, "xcodeVersions", js.Array(value :_*))
  }
}
