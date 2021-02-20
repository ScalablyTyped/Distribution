package typings.octokitTypes.anon

import typings.octokitTypes.octokitTypesStrings.`squirrel-girl`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `9` extends StObject {
  
  var previews: Array[`squirrel-girl` | String] = js.native
}
object `9` {
  
  @scala.inline
  def apply(previews: Array[`squirrel-girl` | String]): `9` = {
    val __obj = js.Dynamic.literal(previews = previews.asInstanceOf[js.Any])
    __obj.asInstanceOf[`9`]
  }
  
  @scala.inline
  implicit class `9MutableBuilder`[Self <: `9`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviews(value: Array[`squirrel-girl` | String]): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
  }
}
