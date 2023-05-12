package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludeInclude extends StObject {
  
  /** @description Array of repository names or patterns to exclude. The condition will not pass if any of these patterns match. */
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  
  /** @description Array of repository names or patterns to include. One of these patterns must match for the condition to pass. Also accepts `~ALL` to include all repositories. */
  var include: js.UndefOr[js.Array[String]] = js.undefined
  
  /** @description Whether renaming of target repositories is prevented. */
  var `protected`: js.UndefOr[Boolean] = js.undefined
}
object ExcludeInclude {
  
  inline def apply(): ExcludeInclude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcludeInclude]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExcludeInclude] (val x: Self) extends AnyVal {
    
    inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setProtected(value: Boolean): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
    
    inline def setProtectedUndefined: Self = StObject.set(x, "protected", js.undefined)
  }
}
