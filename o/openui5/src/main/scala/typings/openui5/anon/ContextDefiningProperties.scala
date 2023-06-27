package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextDefiningProperties extends StObject {
  
  /**
    * A list of related properties (by name) that are the context-defining properties of the `CustomAggregate`.
    */
  var contextDefiningProperties: js.UndefOr[js.Array[String]] = js.undefined
}
object ContextDefiningProperties {
  
  inline def apply(): ContextDefiningProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextDefiningProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContextDefiningProperties] (val x: Self) extends AnyVal {
    
    inline def setContextDefiningProperties(value: js.Array[String]): Self = StObject.set(x, "contextDefiningProperties", value.asInstanceOf[js.Any])
    
    inline def setContextDefiningPropertiesUndefined: Self = StObject.set(x, "contextDefiningProperties", js.undefined)
    
    inline def setContextDefiningPropertiesVarargs(value: String*): Self = StObject.set(x, "contextDefiningProperties", js.Array(value*))
  }
}
