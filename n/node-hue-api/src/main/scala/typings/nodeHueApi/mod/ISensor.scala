package typings.nodeHueApi.mod

import org.scalablytyped.runtime.StringDictionary
import typings.nodeHueApi.anon.Dictkey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISensor extends StObject {
  
  var config: StringDictionary[Double | String]
  
  var id: js.UndefOr[String] = js.undefined
  
  var manufacturername: String
  
  var modelid: String
  
  var name: String
  
  var state: Dictkey
  
  var swversion: String
  
  var `type`: String
  
  var uniqueid: js.UndefOr[String] = js.undefined
}
object ISensor {
  
  inline def apply(
    config: StringDictionary[Double | String],
    manufacturername: String,
    modelid: String,
    name: String,
    state: Dictkey,
    swversion: String,
    `type`: String
  ): ISensor = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], manufacturername = manufacturername.asInstanceOf[js.Any], modelid = modelid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], swversion = swversion.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISensor]
  }
  
  extension [Self <: ISensor](x: Self) {
    
    inline def setConfig(value: StringDictionary[Double | String]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setManufacturername(value: String): Self = StObject.set(x, "manufacturername", value.asInstanceOf[js.Any])
    
    inline def setModelid(value: String): Self = StObject.set(x, "modelid", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setState(value: Dictkey): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setSwversion(value: String): Self = StObject.set(x, "swversion", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUniqueid(value: String): Self = StObject.set(x, "uniqueid", value.asInstanceOf[js.Any])
    
    inline def setUniqueidUndefined: Self = StObject.set(x, "uniqueid", js.undefined)
  }
}
