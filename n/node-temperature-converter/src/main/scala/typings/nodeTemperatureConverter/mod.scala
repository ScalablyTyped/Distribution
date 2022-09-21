package typings.nodeTemperatureConverter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-temperature-converter", "Celsius")
  @js.native
  open class Celsius protected () extends StObject {
    /**
      * Celsius constructor
      */
    def this(x: Double) = this()
    
    var degrees: Double = js.native
    
    /**
      * Converts celsius to fahrenheit
      */
    def toFahrenheit(): Double = js.native
    
    /**
      * Converts celsius to kelvin
      */
    def toKelvin(): Double = js.native
  }
  
  @JSImport("node-temperature-converter", "Fahrenheit")
  @js.native
  open class Fahrenheit protected () extends StObject {
    /**
      * Fahrenheit constructor
      */
    def this(x: Double) = this()
    
    var degrees: Double = js.native
    
    /**
      * Converts Fahrenheit to celsius
      */
    def toCelsius(): Double = js.native
    
    /**
      * Converts Fahrenheit to kelvin
      */
    def toKelvin(): Double = js.native
  }
  
  @JSImport("node-temperature-converter", "Kelvin")
  @js.native
  open class Kelvin protected () extends StObject {
    /**
      * Kelvin constructor
      */
    def this(x: Double) = this()
    
    var degrees: Double = js.native
    
    /**
      * Converts Kelvin to celsius
      */
    def toCelsius(): Double = js.native
    
    /**
      * Converts Kelvin to Fahrenheit
      */
    def toFahrenheit(): Double = js.native
  }
}
