package typings.postgres.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnsafeQueryOptions extends StObject {
  
  /**
    * When executes query as prepared statement.
    * @default false
    */
  var prepare: js.UndefOr[Boolean] = js.undefined
}
object UnsafeQueryOptions {
  
  inline def apply(): UnsafeQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnsafeQueryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnsafeQueryOptions] (val x: Self) extends AnyVal {
    
    inline def setPrepare(value: Boolean): Self = StObject.set(x, "prepare", value.asInstanceOf[js.Any])
    
    inline def setPrepareUndefined: Self = StObject.set(x, "prepare", js.undefined)
  }
}
