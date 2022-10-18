package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Slug extends StObject {
  
  var slug: String
}
object Slug {
  
  inline def apply(slug: String): Slug = {
    val __obj = js.Dynamic.literal(slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slug]
  }
  
  extension [Self <: Slug](x: Self) {
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
  }
}
