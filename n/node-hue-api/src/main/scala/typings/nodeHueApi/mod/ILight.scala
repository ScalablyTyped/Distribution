package typings.nodeHueApi.mod

import typings.nodeHueApi.anon.Alert
import typings.nodeHueApi.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILight extends StObject {
  
  var id: js.UndefOr[String] = js.native
  
  var manufacturername: String = js.native
  
  var modelid: String = js.native
  
  var name: String = js.native
  
  var pointsymbol: js.UndefOr[`1`] = js.native
  
  var state: Alert = js.native
  
  var swversion: String = js.native
  
  var `type`: String = js.native
  
  var uniqueid: String = js.native
}
object ILight {
  
  @scala.inline
  def apply(
    manufacturername: String,
    modelid: String,
    name: String,
    state: Alert,
    swversion: String,
    `type`: String,
    uniqueid: String
  ): ILight = {
    val __obj = js.Dynamic.literal(manufacturername = manufacturername.asInstanceOf[js.Any], modelid = modelid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], swversion = swversion.asInstanceOf[js.Any], uniqueid = uniqueid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILight]
  }
  
  @scala.inline
  implicit class ILightMutableBuilder[Self <: ILight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setManufacturername(value: String): Self = StObject.set(x, "manufacturername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelid(value: String): Self = StObject.set(x, "modelid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsymbol(value: `1`): Self = StObject.set(x, "pointsymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsymbolUndefined: Self = StObject.set(x, "pointsymbol", js.undefined)
    
    @scala.inline
    def setState(value: Alert): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwversion(value: String): Self = StObject.set(x, "swversion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueid(value: String): Self = StObject.set(x, "uniqueid", value.asInstanceOf[js.Any])
  }
}
