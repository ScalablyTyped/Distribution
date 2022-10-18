package typings.nextSeo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Calories extends StObject {
  
  var `@type`: String
  
  var calories: String
}
object Calories {
  
  inline def apply(`@type`: String, calories: String): Calories = {
    val __obj = js.Dynamic.literal(calories = calories.asInstanceOf[js.Any])
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calories]
  }
  
  extension [Self <: Calories](x: Self) {
    
    inline def `set@type`(value: String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    
    inline def setCalories(value: String): Self = StObject.set(x, "calories", value.asInstanceOf[js.Any])
  }
}
