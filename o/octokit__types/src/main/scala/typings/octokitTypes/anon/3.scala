package typings.octokitTypes.anon

import typings.octokitTypes.octokitTypesStrings.`scarlet-witch`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `3` extends StObject {
  
  var previews: Array[`scarlet-witch` | String] = js.native
}
object `3` {
  
  @scala.inline
  def apply(previews: Array[`scarlet-witch` | String]): `3` = {
    val __obj = js.Dynamic.literal(previews = previews.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit class `3MutableBuilder`[Self <: `3`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviews(value: Array[`scarlet-witch` | String]): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
  }
}
