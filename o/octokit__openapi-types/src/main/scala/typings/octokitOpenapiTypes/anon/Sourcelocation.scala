package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sourcelocation extends StObject {
  
  /**
    * @description The path of the manifest file relative to the root of the Git repository.
    * @example /src/build/package-lock.json
    */
  var source_location: js.UndefOr[String] = js.undefined
}
object Sourcelocation {
  
  inline def apply(): Sourcelocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sourcelocation]
  }
  
  extension [Self <: Sourcelocation](x: Self) {
    
    inline def setSource_location(value: String): Self = StObject.set(x, "source_location", value.asInstanceOf[js.Any])
    
    inline def setSource_locationUndefined: Self = StObject.set(x, "source_location", js.undefined)
  }
}
