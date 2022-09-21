package typings.preferredPm

import typings.preferredPm.preferredPmStrings.npm
import typings.preferredPm.preferredPmStrings.pnpm
import typings.preferredPm.preferredPmStrings.yarn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Name extends StObject {
    
    var name: npm | pnpm | yarn
    
    var version: String
  }
  object Name {
    
    inline def apply(name: npm | pnpm | yarn, version: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: npm | pnpm | yarn): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
