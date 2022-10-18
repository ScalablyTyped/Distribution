package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.parcelTypes.anon.TypeValue
  - typings.parcelTypes.anon.ValueDependency
*/
trait BundleGraphTraversable extends StObject
object BundleGraphTraversable {
  
  inline def TypeValue(value: Asset): typings.parcelTypes.anon.TypeValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("asset")
    __obj.asInstanceOf[typings.parcelTypes.anon.TypeValue]
  }
  
  inline def ValueDependency(value: Dependency): typings.parcelTypes.anon.ValueDependency = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dependency")
    __obj.asInstanceOf[typings.parcelTypes.anon.ValueDependency]
  }
}
