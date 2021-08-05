package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object igcMod {
  
  @JSImport("ol/format/IGC", JSImport.Default)
  @js.native
  class default () extends IGC {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  sealed trait IGCZ extends StObject
  /**
    * IGC altitude/z. One of 'barometric', 'gps', 'none'.
    */
  @JSImport("ol/format/IGC", "IGCZ")
  @js.native
  object IGCZ extends StObject {
    
    @js.native
    sealed trait BAROMETRIC
      extends StObject
         with IGCZ
    
    @js.native
    sealed trait GPS
      extends StObject
         with IGCZ
    
    @js.native
    sealed trait NONE
      extends StObject
         with IGCZ
  }
  
  @js.native
  trait IGC
    extends typings.ol.textFeatureMod.default
  
  trait Options extends StObject {
    
    var altitudeMode: js.UndefOr[IGCZ | String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAltitudeMode(value: IGCZ | String): Self = StObject.set(x, "altitudeMode", value.asInstanceOf[js.Any])
      
      inline def setAltitudeModeUndefined: Self = StObject.set(x, "altitudeMode", js.undefined)
    }
  }
}
