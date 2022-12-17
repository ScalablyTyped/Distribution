package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Plussign1
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.eyes
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.heart
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.hooray
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.laugh
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.rocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `321` extends StObject {
  
  /**
    * @description The [reaction type](https://docs.github.com/rest/reference/reactions#reaction-types) to add to the release.
    * @enum {string}
    */
  var content: Plussign1 | laugh | heart | hooray | rocket | eyes
}
object `321` {
  
  inline def apply(content: Plussign1 | laugh | heart | hooray | rocket | eyes): `321` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`321`]
  }
  
  extension [Self <: `321`](x: Self) {
    
    inline def setContent(value: Plussign1 | laugh | heart | hooray | rocket | eyes): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
