package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatIgcMod {
  
  /**
    * @typedef {Object} Options
    * @property {IGCZ} [altitudeMode='none'] Altitude mode. Possible
    * values are `'barometric'`, `'gps'`, and `'none'`.
    */
  /**
    * @classdesc
    * Feature format for `*.igc` flight recording files.
    *
    * As IGC sources contain a single feature,
    * {@link module:ol/format/IGC~IGC#readFeatures} will return the feature in an
    * array
    *
    * @api
    */
  @JSImport("ol/format/IGC", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends IGC {
    def this(options: Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {IGCZ} [altitudeMode='none'] Altitude mode. Possible
    * values are `'barometric'`, `'gps'`, and `'none'`.
    */
  /**
    * @classdesc
    * Feature format for `*.igc` flight recording files.
    *
    * As IGC sources contain a single feature,
    * {@link module:ol/format/IGC~IGC#readFeatures} will return the feature in an
    * array
    *
    * @api
    */
  @js.native
  trait IGC
    extends typings.ol.formatTextFeatureMod.default {
    
    /**
      * @private
      * @type {IGCZ}
      */
    /* private */ var altitudeMode_ : Any = js.native
    
    /**
      * @type {import("../proj/Projection.js").default}
      */
    @JSName("dataProjection")
    var dataProjection_IGC: typings.ol.projProjectionMod.default = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.barometric
    - typings.ol.olStrings.gps
    - typings.ol.olStrings.none
  */
  trait IGCZ extends StObject
  object IGCZ {
    
    inline def barometric: typings.ol.olStrings.barometric = "barometric".asInstanceOf[typings.ol.olStrings.barometric]
    
    inline def gps: typings.ol.olStrings.gps = "gps".asInstanceOf[typings.ol.olStrings.gps]
    
    inline def none: typings.ol.olStrings.none = "none".asInstanceOf[typings.ol.olStrings.none]
  }
  
  trait Options extends StObject {
    
    /**
      * Altitude mode. Possible
      * values are `'barometric'`, `'gps'`, and `'none'`.
      */
    var altitudeMode: js.UndefOr[IGCZ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAltitudeMode(value: IGCZ): Self = StObject.set(x, "altitudeMode", value.asInstanceOf[js.Any])
      
      inline def setAltitudeModeUndefined: Self = StObject.set(x, "altitudeMode", js.undefined)
    }
  }
}
