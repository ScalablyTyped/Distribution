package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.parcelTypes.anon.Type
  - typings.parcelTypes.anon.Value
*/
trait BundleGraphTraversable extends StObject
object BundleGraphTraversable {
  
  inline def Type(value: Asset): typings.parcelTypes.anon.Type = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("asset")
    __obj.asInstanceOf[typings.parcelTypes.anon.Type]
  }
  
  inline def Value(value: Dependency): typings.parcelTypes.anon.Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dependency")
    __obj.asInstanceOf[typings.parcelTypes.anon.Value]
  }
}
