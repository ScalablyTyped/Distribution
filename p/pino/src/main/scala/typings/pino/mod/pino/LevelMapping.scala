package typings.pino.mod.pino

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LevelMapping extends StObject {
  
  /**
    * Returns the mappings of level internal level numbers to their string representations.
    */
  var labels: NumberDictionary[String]
  
  /**
    * Returns the mappings of level names to their respective internal number representation.
    */
  var values: StringDictionary[Double]
}
object LevelMapping {
  
  inline def apply(labels: NumberDictionary[String], values: StringDictionary[Double]): LevelMapping = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelMapping]
  }
  
  extension [Self <: LevelMapping](x: Self) {
    
    inline def setLabels(value: NumberDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setValues(value: StringDictionary[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
