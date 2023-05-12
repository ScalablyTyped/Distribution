package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamePrivate extends StObject {
  
  /** @description A name for the new repository. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * @description Whether the new repository should be private.
    * @default false
    */
  var `private`: js.UndefOr[Boolean] = js.undefined
}
object NamePrivate {
  
  inline def apply(): NamePrivate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamePrivate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NamePrivate] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
  }
}
