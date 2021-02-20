package typings.octokitTypes.anon

import typings.octokitTypes.octokitTypesStrings.inertia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `7` extends StObject {
  
  var previews: Array[inertia | String] = js.native
}
object `7` {
  
  @scala.inline
  def apply(previews: Array[inertia | String]): `7` = {
    val __obj = js.Dynamic.literal(previews = previews.asInstanceOf[js.Any])
    __obj.asInstanceOf[`7`]
  }
  
  @scala.inline
  implicit class `7MutableBuilder`[Self <: `7`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviews(value: Array[inertia | String]): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
  }
}
