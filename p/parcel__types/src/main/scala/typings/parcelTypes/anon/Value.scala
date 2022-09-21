package typings.parcelTypes.anon

import typings.parcelTypes.mod.BundleGraphTraversable
import typings.parcelTypes.mod.BundleTraversable
import typings.parcelTypes.parcelTypesStrings.dependency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value
  extends StObject
     with BundleGraphTraversable
     with BundleTraversable {
  
  val `type`: dependency
  
  var value: typings.parcelTypes.mod.Dependency
}
object Value {
  
  inline def apply(value: typings.parcelTypes.mod.Dependency): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dependency")
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setType(value: dependency): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: typings.parcelTypes.mod.Dependency): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
