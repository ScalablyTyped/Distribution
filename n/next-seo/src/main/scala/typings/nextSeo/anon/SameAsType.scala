package typings.nextSeo.anon

import typings.nextSeo.nextSeoStrings.Organization
import typings.nextSeo.nextSeoStrings.Person
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SameAsType extends StObject {
  
  var `@type`: Person | Organization
  
  var name: String
  
  var sameAs: js.UndefOr[String] = js.undefined
}
object SameAsType {
  
  inline def apply(`@type`: Person | Organization, name: String): SameAsType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SameAsType]
  }
  
  extension [Self <: SameAsType](x: Self) {
    
    inline def `set@type`(value: Person | Organization): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSameAs(value: String): Self = StObject.set(x, "sameAs", value.asInstanceOf[js.Any])
    
    inline def setSameAsUndefined: Self = StObject.set(x, "sameAs", js.undefined)
  }
}
