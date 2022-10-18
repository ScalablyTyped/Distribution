package typings.nextSeo.libTypesMod

import typings.nextSeo.nextSeoStrings.PerformingGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Performer extends StObject {
  
  var name: String
  
  var `type`: js.UndefOr[typings.nextSeo.nextSeoStrings.Person | PerformingGroup] = js.undefined
}
object Performer {
  
  inline def apply(name: String): Performer = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Performer]
  }
  
  extension [Self <: Performer](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.nextSeo.nextSeoStrings.Person | PerformingGroup): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
