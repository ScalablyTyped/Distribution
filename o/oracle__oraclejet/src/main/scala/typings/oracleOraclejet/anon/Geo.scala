package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geo extends StObject {
  
  var geo: js.Object = js.native
  
  var propertiesKeys: LongLabel = js.native
}
object Geo {
  
  @scala.inline
  def apply(geo: js.Object, propertiesKeys: LongLabel): Geo = {
    val __obj = js.Dynamic.literal(geo = geo.asInstanceOf[js.Any], propertiesKeys = propertiesKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geo]
  }
  
  @scala.inline
  implicit class GeoMutableBuilder[Self <: Geo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeo(value: js.Object): Self = StObject.set(x, "geo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesKeys(value: LongLabel): Self = StObject.set(x, "propertiesKeys", value.asInstanceOf[js.Any])
  }
}
