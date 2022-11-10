package typings.pinoPretty

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    def apply(): String = js.native
    def apply(level: String): String = js.native
    def apply(level: String, opts: CustomLevelNames): String = js.native
    def apply(level: Double): String = js.native
    def apply(level: Double, opts: CustomLevelNames): String = js.native
    def apply(level: Unit, opts: CustomLevelNames): String = js.native
    
    def greyMessage(input: String): String = js.native
    def greyMessage(input: Double): String = js.native
    
    def message(input: String): String = js.native
    def message(input: Double): String = js.native
  }
  
  trait CustomLevelNames extends StObject {
    
    var customLevelNames: js.UndefOr[StringDictionary[Double]] = js.undefined
    
    var customLevels: js.UndefOr[NumberDictionary[String]] = js.undefined
  }
  object CustomLevelNames {
    
    inline def apply(): CustomLevelNames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomLevelNames]
    }
    
    extension [Self <: CustomLevelNames](x: Self) {
      
      inline def setCustomLevelNames(value: StringDictionary[Double]): Self = StObject.set(x, "customLevelNames", value.asInstanceOf[js.Any])
      
      inline def setCustomLevelNamesUndefined: Self = StObject.set(x, "customLevelNames", js.undefined)
      
      inline def setCustomLevels(value: NumberDictionary[String]): Self = StObject.set(x, "customLevels", value.asInstanceOf[js.Any])
      
      inline def setCustomLevelsUndefined: Self = StObject.set(x, "customLevels", js.undefined)
    }
  }
}
