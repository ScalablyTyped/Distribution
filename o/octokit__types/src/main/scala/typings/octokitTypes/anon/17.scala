package typings.octokitTypes.anon

import typings.octokitTypes.octokitTypesStrings.groot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `17` extends StObject {
  
  var previews: Array[groot | String] = js.native
}
object `17` {
  
  @scala.inline
  def apply(previews: Array[groot | String]): `17` = {
    val __obj = js.Dynamic.literal(previews = previews.asInstanceOf[js.Any])
    __obj.asInstanceOf[`17`]
  }
  
  @scala.inline
  implicit class `17MutableBuilder`[Self <: `17`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviews(value: Array[groot | String]): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
  }
}
