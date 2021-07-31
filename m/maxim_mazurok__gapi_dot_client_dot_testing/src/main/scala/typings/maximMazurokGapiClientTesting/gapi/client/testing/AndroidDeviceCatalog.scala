package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidDeviceCatalog extends StObject {
  
  /** The set of supported Android device models. */
  var models: js.UndefOr[js.Array[AndroidModel]] = js.undefined
  
  /** The set of supported runtime configurations. */
  var runtimeConfiguration: js.UndefOr[AndroidRuntimeConfiguration] = js.undefined
  
  /** The set of supported Android OS versions. */
  var versions: js.UndefOr[js.Array[AndroidVersion]] = js.undefined
}
object AndroidDeviceCatalog {
  
  @scala.inline
  def apply(): AndroidDeviceCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidDeviceCatalog]
  }
  
  @scala.inline
  implicit class AndroidDeviceCatalogMutableBuilder[Self <: AndroidDeviceCatalog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModels(value: js.Array[AndroidModel]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelsUndefined: Self = StObject.set(x, "models", js.undefined)
    
    @scala.inline
    def setModelsVarargs(value: AndroidModel*): Self = StObject.set(x, "models", js.Array(value :_*))
    
    @scala.inline
    def setRuntimeConfiguration(value: AndroidRuntimeConfiguration): Self = StObject.set(x, "runtimeConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeConfigurationUndefined: Self = StObject.set(x, "runtimeConfiguration", js.undefined)
    
    @scala.inline
    def setVersions(value: js.Array[AndroidVersion]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: AndroidVersion*): Self = StObject.set(x, "versions", js.Array(value :_*))
  }
}
