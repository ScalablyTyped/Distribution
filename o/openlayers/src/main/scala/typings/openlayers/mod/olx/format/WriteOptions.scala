package typings.openlayers.mod.olx.format

import typings.openlayers.mod.ProjectionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteOptions extends StObject {
  
  var dataProjection: ProjectionLike
  
  var decimals: js.UndefOr[Double] = js.undefined
  
  var featureProjection: js.UndefOr[ProjectionLike] = js.undefined
  
  var rightHanded: js.UndefOr[Boolean] = js.undefined
}
object WriteOptions {
  
  inline def apply(): WriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WriteOptions] (val x: Self) extends AnyVal {
    
    inline def setDataProjection(value: ProjectionLike): Self = StObject.set(x, "dataProjection", value.asInstanceOf[js.Any])
    
    inline def setDataProjectionUndefined: Self = StObject.set(x, "dataProjection", js.undefined)
    
    inline def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
    
    inline def setDecimalsUndefined: Self = StObject.set(x, "decimals", js.undefined)
    
    inline def setFeatureProjection(value: ProjectionLike): Self = StObject.set(x, "featureProjection", value.asInstanceOf[js.Any])
    
    inline def setFeatureProjectionUndefined: Self = StObject.set(x, "featureProjection", js.undefined)
    
    inline def setRightHanded(value: Boolean): Self = StObject.set(x, "rightHanded", value.asInstanceOf[js.Any])
    
    inline def setRightHandedUndefined: Self = StObject.set(x, "rightHanded", js.undefined)
  }
}
