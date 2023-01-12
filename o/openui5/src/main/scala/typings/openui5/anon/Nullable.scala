package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nullable extends StObject {
  
  /**
    * if `true`, the value `null` is accepted; note that {@link #parseValue} maps `""` to `null`
    */
  var nullable: js.UndefOr[Boolean | String] = js.undefined
}
object Nullable {
  
  inline def apply(): Nullable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Nullable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Nullable] (val x: Self) extends AnyVal {
    
    inline def setNullable(value: Boolean | String): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
  }
}
