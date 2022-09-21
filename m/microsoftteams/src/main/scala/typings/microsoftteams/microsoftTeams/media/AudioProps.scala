package typings.microsoftteams.microsoftTeams.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *  All properties in AudioProps are optional and have default values in the platform
  */
trait AudioProps extends StObject {
  
  /**
    * Optional; the maximum duration in minutes after which the recording should terminate automatically.
    * Default value is defined by the platform serving the API.
    */
  var maxDuration: js.UndefOr[Double] = js.undefined
}
object AudioProps {
  
  inline def apply(): AudioProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioProps]
  }
  
  extension [Self <: AudioProps](x: Self) {
    
    inline def setMaxDuration(value: Double): Self = StObject.set(x, "maxDuration", value.asInstanceOf[js.Any])
    
    inline def setMaxDurationUndefined: Self = StObject.set(x, "maxDuration", js.undefined)
  }
}
