package typings.octokitTypes.anon

import typings.octokitTypes.octokitTypesStrings.mercy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `15` extends StObject {
  
  var previews: Array[mercy | String] = js.native
}
object `15` {
  
  @scala.inline
  def apply(previews: Array[mercy | String]): `15` = {
    val __obj = js.Dynamic.literal(previews = previews.asInstanceOf[js.Any])
    __obj.asInstanceOf[`15`]
  }
  
  @scala.inline
  implicit class `15MutableBuilder`[Self <: `15`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviews(value: Array[mercy | String]): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
  }
}
