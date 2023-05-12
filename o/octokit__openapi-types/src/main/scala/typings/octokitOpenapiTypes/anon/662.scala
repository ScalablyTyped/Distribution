package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `662` extends StObject {
  
  var path: MigrationidNumber
}
object `662` {
  
  inline def apply(path: MigrationidNumber): `662` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`662`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `662`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: MigrationidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
