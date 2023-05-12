package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projUnitsMod {
  
  @JSImport("ol/proj/Units", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/proj/Units", "METERS_PER_UNIT")
  @js.native
  val METERS_PER_UNIT: MetersPerUnitLookup = js.native
  
  inline def fromCode(code: Double): Units = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCode")(code.asInstanceOf[js.Any]).asInstanceOf[Units]
  
  trait MetersPerUnitLookup extends StObject {
    
    /**
      * Degrees
      */
    var degrees: Double
    
    /**
      * Feet
      */
    var ft: Double
    
    /**
      * Meters
      */
    var m: Double
    
    /**
      * Radians
      */
    var radians: Double
    
    /**
      * US feet
      */
    var `us-ft`: Double
  }
  object MetersPerUnitLookup {
    
    inline def apply(degrees: Double, ft: Double, m: Double, radians: Double, `us-ft`: Double): MetersPerUnitLookup = {
      val __obj = js.Dynamic.literal(degrees = degrees.asInstanceOf[js.Any], ft = ft.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], radians = radians.asInstanceOf[js.Any])
      __obj.updateDynamic("us-ft")(`us-ft`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetersPerUnitLookup]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MetersPerUnitLookup] (val x: Self) extends AnyVal {
      
      inline def setDegrees(value: Double): Self = StObject.set(x, "degrees", value.asInstanceOf[js.Any])
      
      inline def setFt(value: Double): Self = StObject.set(x, "ft", value.asInstanceOf[js.Any])
      
      inline def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setRadians(value: Double): Self = StObject.set(x, "radians", value.asInstanceOf[js.Any])
      
      inline def `setUs-ft`(value: Double): Self = StObject.set(x, "us-ft", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.radians
    - typings.ol.olStrings.degrees
    - typings.ol.olStrings.ft
    - typings.ol.olStrings.m
    - typings.ol.olStrings.pixels
    - typings.ol.olStrings.`tile-pixels`
    - typings.ol.olStrings.`us-ft`
  */
  trait Units extends StObject
  object Units {
    
    inline def degrees: typings.ol.olStrings.degrees = "degrees".asInstanceOf[typings.ol.olStrings.degrees]
    
    inline def ft: typings.ol.olStrings.ft = "ft".asInstanceOf[typings.ol.olStrings.ft]
    
    inline def m: typings.ol.olStrings.m = "m".asInstanceOf[typings.ol.olStrings.m]
    
    inline def pixels: typings.ol.olStrings.pixels = "pixels".asInstanceOf[typings.ol.olStrings.pixels]
    
    inline def radians: typings.ol.olStrings.radians = "radians".asInstanceOf[typings.ol.olStrings.radians]
    
    inline def `tile-pixels`: typings.ol.olStrings.`tile-pixels` = "tile-pixels".asInstanceOf[typings.ol.olStrings.`tile-pixels`]
    
    inline def `us-ft`: typings.ol.olStrings.`us-ft` = "us-ft".asInstanceOf[typings.ol.olStrings.`us-ft`]
  }
}
