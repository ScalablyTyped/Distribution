package typings.openlayers.mod.olx.format

import typings.openlayers.mod.format.IGCZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* tslint:disable-next-line:interface-name */
@js.native
trait IGCOptions extends StObject {
  
  var altitudeMode: js.UndefOr[IGCZ] = js.native
}
object IGCOptions {
  
  @scala.inline
  def apply(): IGCOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGCOptions]
  }
  
  @scala.inline
  implicit class IGCOptionsMutableBuilder[Self <: IGCOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitudeMode(value: IGCZ): Self = StObject.set(x, "altitudeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeModeUndefined: Self = StObject.set(x, "altitudeMode", js.undefined)
  }
}
