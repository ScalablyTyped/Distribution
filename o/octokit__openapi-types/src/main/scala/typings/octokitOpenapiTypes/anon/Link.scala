package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Link extends StObject {
  
  var Link: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['headers']['link'] */ js.Any
}
object Link {
  
  inline def apply(
    Link: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['headers']['link'] */ js.Any
  ): Link = {
    val __obj = js.Dynamic.literal(Link = Link.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
    
    inline def setLink(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['headers']['link'] */ js.Any
    ): Self = StObject.set(x, "Link", value.asInstanceOf[js.Any])
  }
}
