package typings.nodePostal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object expand {
    
    @JSImport("node-postal", "expand")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node-postal", "expand.expand_address")
    @js.native
    def expandAddress: js.Function1[/* address */ String, js.Array[String]] = js.native
    
    inline def expandAddress(address: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("expand_address")(address.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def expandAddress_=(x: js.Function1[/* address */ String, js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expand_address")(x.asInstanceOf[js.Any])
  }
  
  object parser {
    
    @JSImport("node-postal", "parser")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node-postal", "parser.parse_address")
    @js.native
    def parseAddress: js.Function1[/* address */ String, js.Array[PostalResult]] = js.native
    
    inline def parseAddress(address: String): js.Array[PostalResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse_address")(address.asInstanceOf[js.Any]).asInstanceOf[js.Array[PostalResult]]
    inline def parseAddress_=(x: js.Function1[/* address */ String, js.Array[PostalResult]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse_address")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodePostal.nodePostalStrings.category
    - typings.nodePostal.nodePostalStrings.city_district
    - typings.nodePostal.nodePostalStrings.city
    - typings.nodePostal.nodePostalStrings.country_region
    - typings.nodePostal.nodePostalStrings.country
    - typings.nodePostal.nodePostalStrings.entrance
    - typings.nodePostal.nodePostalStrings.house_number
    - typings.nodePostal.nodePostalStrings.house
    - typings.nodePostal.nodePostalStrings.island
    - typings.nodePostal.nodePostalStrings.level
    - typings.nodePostal.nodePostalStrings.near
    - typings.nodePostal.nodePostalStrings.po_box
    - typings.nodePostal.nodePostalStrings.postcode
    - typings.nodePostal.nodePostalStrings.road
    - typings.nodePostal.nodePostalStrings.staircase
    - typings.nodePostal.nodePostalStrings.state_district
    - typings.nodePostal.nodePostalStrings.state
    - typings.nodePostal.nodePostalStrings.suburb
    - typings.nodePostal.nodePostalStrings.unit
    - typings.nodePostal.nodePostalStrings.world_region
  */
  trait PostalLabels extends StObject
  object PostalLabels {
    
    inline def category: typings.nodePostal.nodePostalStrings.category = "category".asInstanceOf[typings.nodePostal.nodePostalStrings.category]
    
    inline def city: typings.nodePostal.nodePostalStrings.city = "city".asInstanceOf[typings.nodePostal.nodePostalStrings.city]
    
    inline def city_district: typings.nodePostal.nodePostalStrings.city_district = "city_district".asInstanceOf[typings.nodePostal.nodePostalStrings.city_district]
    
    inline def country: typings.nodePostal.nodePostalStrings.country = "country".asInstanceOf[typings.nodePostal.nodePostalStrings.country]
    
    inline def country_region: typings.nodePostal.nodePostalStrings.country_region = "country_region".asInstanceOf[typings.nodePostal.nodePostalStrings.country_region]
    
    inline def entrance: typings.nodePostal.nodePostalStrings.entrance = "entrance".asInstanceOf[typings.nodePostal.nodePostalStrings.entrance]
    
    inline def house: typings.nodePostal.nodePostalStrings.house = "house".asInstanceOf[typings.nodePostal.nodePostalStrings.house]
    
    inline def house_number: typings.nodePostal.nodePostalStrings.house_number = "house_number".asInstanceOf[typings.nodePostal.nodePostalStrings.house_number]
    
    inline def island: typings.nodePostal.nodePostalStrings.island = "island".asInstanceOf[typings.nodePostal.nodePostalStrings.island]
    
    inline def level: typings.nodePostal.nodePostalStrings.level = "level".asInstanceOf[typings.nodePostal.nodePostalStrings.level]
    
    inline def near: typings.nodePostal.nodePostalStrings.near = "near".asInstanceOf[typings.nodePostal.nodePostalStrings.near]
    
    inline def po_box: typings.nodePostal.nodePostalStrings.po_box = "po_box".asInstanceOf[typings.nodePostal.nodePostalStrings.po_box]
    
    inline def postcode: typings.nodePostal.nodePostalStrings.postcode = "postcode".asInstanceOf[typings.nodePostal.nodePostalStrings.postcode]
    
    inline def road: typings.nodePostal.nodePostalStrings.road = "road".asInstanceOf[typings.nodePostal.nodePostalStrings.road]
    
    inline def staircase: typings.nodePostal.nodePostalStrings.staircase = "staircase".asInstanceOf[typings.nodePostal.nodePostalStrings.staircase]
    
    inline def state: typings.nodePostal.nodePostalStrings.state = "state".asInstanceOf[typings.nodePostal.nodePostalStrings.state]
    
    inline def state_district: typings.nodePostal.nodePostalStrings.state_district = "state_district".asInstanceOf[typings.nodePostal.nodePostalStrings.state_district]
    
    inline def suburb: typings.nodePostal.nodePostalStrings.suburb = "suburb".asInstanceOf[typings.nodePostal.nodePostalStrings.suburb]
    
    inline def unit: typings.nodePostal.nodePostalStrings.unit = "unit".asInstanceOf[typings.nodePostal.nodePostalStrings.unit]
    
    inline def world_region: typings.nodePostal.nodePostalStrings.world_region = "world_region".asInstanceOf[typings.nodePostal.nodePostalStrings.world_region]
  }
  
  trait PostalResult extends StObject {
    
    var component: PostalLabels
    
    var value: String
  }
  object PostalResult {
    
    inline def apply(component: PostalLabels, value: String): PostalResult = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostalResult]
    }
    
    extension [Self <: PostalResult](x: Self) {
      
      inline def setComponent(value: PostalLabels): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
