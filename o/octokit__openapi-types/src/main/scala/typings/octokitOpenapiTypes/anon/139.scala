package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Plussign1
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`-1`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.confused
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.eyes
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.heart
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.hooray
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.laugh
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.rocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `139` extends StObject {
  
  /**
    * @description The [reaction type](https://docs.github.com/rest/reference/reactions#reaction-types) to add to the team discussion.
    * @enum {string}
    */
  var content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes
}
object `139` {
  
  inline def apply(content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes): `139` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`139`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `139`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
