package typings.octokitTypes.anon

import typings.octokitTypes.octokitTypesStrings.london
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `14` extends StObject {
  
  var previews: Array[london | String] = js.native
}
object `14` {
  
  @scala.inline
  def apply(previews: Array[london | String]): `14` = {
    val __obj = js.Dynamic.literal(previews = previews.asInstanceOf[js.Any])
    __obj.asInstanceOf[`14`]
  }
  
  @scala.inline
  implicit class `14MutableBuilder`[Self <: `14`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviews(value: Array[london | String]): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
  }
}
