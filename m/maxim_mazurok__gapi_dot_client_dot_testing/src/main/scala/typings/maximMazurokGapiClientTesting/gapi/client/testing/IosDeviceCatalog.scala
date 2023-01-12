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
  
  inline def apply(): IosDeviceCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosDeviceCatalog]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IosDeviceCatalog] (val x: Self) extends AnyVal {
    
    inline def setModels(value: js.Array[IosModel]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    inline def setModelsUndefined: Self = StObject.set(x, "models", js.undefined)
    
    inline def setModelsVarargs(value: IosModel*): Self = StObject.set(x, "models", js.Array(value*))
    
    inline def setRuntimeConfiguration(value: IosRuntimeConfiguration): Self = StObject.set(x, "runtimeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRuntimeConfigurationUndefined: Self = StObject.set(x, "runtimeConfiguration", js.undefined)
    
    inline def setVersions(value: js.Array[IosVersion]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    inline def setVersionsVarargs(value: IosVersion*): Self = StObject.set(x, "versions", js.Array(value*))
    
    inline def setXcodeVersions(value: js.Array[XcodeVersion]): Self = StObject.set(x, "xcodeVersions", value.asInstanceOf[js.Any])
    
    inline def setXcodeVersionsUndefined: Self = StObject.set(x, "xcodeVersions", js.undefined)
    
    inline def setXcodeVersionsVarargs(value: XcodeVersion*): Self = StObject.set(x, "xcodeVersions", js.Array(value*))
  }
}
