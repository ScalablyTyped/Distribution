package typings.opentelemetryApi

import typings.opentelemetryApi.meterMod.Meter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meterProviderMod {
  
  @js.native
  trait MeterProvider extends StObject {
    
    /**
      * Returns a Meter, creating one if one with the given name and version is
      * not already created.
      *
      * @param name The name of the meter or instrumentation library.
      * @param version The version of the meter or instrumentation library.
      * @returns Meter A Meter with the given name and version
      */
    def getMeter(name: String): Meter = js.native
    def getMeter(name: String, version: String): Meter = js.native
  }
}
