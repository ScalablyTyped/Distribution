package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnPremisesDirectorySynchronization
  extends StObject
     with Entity {
  
  /**
    * Consists of configurations that can be fine-tuned and impact the on-premises directory synchronization process for a
    * tenant.
    */
  var configuration: js.UndefOr[NullableOption[OnPremisesDirectorySynchronizationConfiguration]] = js.undefined
  
  // Consists of directory synchronization features that can be enabled or disabled.
  var features: js.UndefOr[OnPremisesDirectorySynchronizationFeature] = js.undefined
}
object OnPremisesDirectorySynchronization {
  
  inline def apply(): OnPremisesDirectorySynchronization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnPremisesDirectorySynchronization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnPremisesDirectorySynchronization] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: NullableOption[OnPremisesDirectorySynchronizationConfiguration]): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationNull: Self = StObject.set(x, "configuration", null)
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setFeatures(value: OnPremisesDirectorySynchronizationFeature): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
  }
}
