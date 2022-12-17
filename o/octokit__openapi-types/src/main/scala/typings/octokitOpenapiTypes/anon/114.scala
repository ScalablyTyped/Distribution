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

trait `114` extends StObject {
  
  /**
    * @description The [reaction type](https://docs.github.com/rest/reference/reactions#reaction-types) to add to the team discussion.
    * @enum {string}
    */
  var content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes
}
object `114` {
  
  inline def apply(content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes): `114` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`114`]
  }
  
  extension [Self <: `114`](x: Self) {
    
    inline def setContent(value: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
