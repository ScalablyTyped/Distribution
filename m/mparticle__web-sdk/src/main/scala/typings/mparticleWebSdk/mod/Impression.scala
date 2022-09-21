package typings.mparticleWebSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Impression extends StObject {
  
  var Name: String
  
  var Product: typings.mparticleWebSdk.mod.Product
}
object Impression {
  
  inline def apply(Name: String, Product: Product): Impression = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Product = Product.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impression]
  }
  
  extension [Self <: Impression](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setProduct(value: Product): Self = StObject.set(x, "Product", value.asInstanceOf[js.Any])
  }
}
