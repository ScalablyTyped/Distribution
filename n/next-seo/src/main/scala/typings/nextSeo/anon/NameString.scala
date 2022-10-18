package typings.nextSeo.anon

import typings.nextSeo.nextSeoStrings.PerformingGroup
import typings.nextSeo.nextSeoStrings.Person
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameString extends StObject {
  
  var `@type`: Person | PerformingGroup
  
  var name: String
}
object NameString {
  
  inline def apply(`@type`: Person | PerformingGroup, name: String): NameString = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameString]
  }
  
  extension [Self <: NameString](x: Self) {
    
    inline def `set@type`(value: Person | PerformingGroup): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
