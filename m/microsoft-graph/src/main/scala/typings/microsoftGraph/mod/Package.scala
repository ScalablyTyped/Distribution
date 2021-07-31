package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Package extends StObject {
  
  /**
    * A string indicating the type of package. While oneNote is the only currently defined value, you should expect other
    * package types to be returned and handle them accordingly.
    */
  var `type`: js.UndefOr[NullableOption[String]] = js.undefined
}
object Package {
  
  @scala.inline
  def apply(): Package = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Package]
  }
  
  @scala.inline
  implicit class PackageMutableBuilder[Self <: Package] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
