package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    sealed trait BAROMETRIC extends IGCZ
    
    @js.native
    sealed trait GPS extends IGCZ
    
    @js.native
    sealed trait NONE extends IGCZ
  }
  
  @js.native
  trait IGC
    extends typings.ol.textFeatureMod.default
  
  @js.native
  trait Options extends StObject {
    
    var altitudeMode: js.UndefOr[IGCZ | String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAltitudeMode(value: IGCZ | String): Self = StObject.set(x, "altitudeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltitudeModeUndefined: Self = StObject.set(x, "altitudeMode", js.undefined)
    }
  }
}
