package typings.ol

import typings.ol.viewMod.AnimationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionLinkMod {
  
  /** @typedef {'x'|'y'|'z'|'r'|'l'} Params */
  /**
    * @typedef {Object} Options
    * @property {boolean|import('../View.js').AnimationOptions} [animate=true] Animate view transitions.
    * @property {Array<Params>} [params=['x', 'y', 'z', 'r', 'l']] Properties to track. Default is to track
    * `x` (center x), `y` (center y), `z` (zoom), `r` (rotation) and `l` (layers).
    * @property {boolean} [replace=false] Replace the current URL without creating the new entry in browser history.
    * By default, changes in the map state result in a new entry being added to the browser history.
    * @property {string} [prefix=''] By default, the URL will be updated with search parameters x, y, z, and r.  To
    * avoid collisions with existing search parameters that your application uses, you can supply a custom prefix for
    * the ones used by this interaction (e.g. 'ol:').
    */
  /**
    * @classdesc
    * An interaction that synchronizes the map state with the URL.
    *
    * @api
    */
  @JSImport("ol/interaction/Link", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Link options.
    */
  open class default () extends Link {
    def this(options: Options) = this()
  }
  
  /** @typedef {'x'|'y'|'z'|'r'|'l'} Params */
  /**
    * @typedef {Object} Options
    * @property {boolean|import('../View.js').AnimationOptions} [animate=true] Animate view transitions.
    * @property {Array<Params>} [params=['x', 'y', 'z', 'r', 'l']] Properties to track. Default is to track
    * `x` (center x), `y` (center y), `z` (zoom), `r` (rotation) and `l` (layers).
    * @property {boolean} [replace=false] Replace the current URL without creating the new entry in browser history.
    * By default, changes in the map state result in a new entry being added to the browser history.
    * @property {string} [prefix=''] By default, the URL will be updated with search parameters x, y, z, and r.  To
    * avoid collisions with existing search parameters that your application uses, you can supply a custom prefix for
    * the ones used by this interaction (e.g. 'ol:').
    */
  /**
    * @classdesc
    * An interaction that synchronizes the map state with the URL.
    *
    * @api
    */
  @js.native
  trait Link
    extends typings.ol.interactionInteractionMod.default {
    
    /**
      * @type {import('../View.js').AnimationOptions|null}
      * @private
      */
    /* private */ var animationOptions_ : Any = js.native
    
    /**
      * @private
      * @param {URLSearchParams} params The search params.
      * @param {string} name The unprefixed parameter name.
      */
    /* private */ var delete_ : Any = js.native
    
    /**
      * @private
      * @param {string} name A parameter name.
      * @return {string} A name with the prefix applied.
      */
    /* private */ var getParamName_ : Any = js.native
    
    /**
      * @private
      * @param {URLSearchParams} params The search params.
      * @param {string} name The unprefixed parameter name.
      * @return {string|null} The parameter value.
      */
    /* private */ var get_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var handleChangeLayerGroup_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var initial_ : Any = js.native
    
    /**
      * @private
      * @type {!Array<import("../events.js").EventsKey>}
      */
    /* private */ var listenerKeys_ : Any = js.native
    
    /**
      * @type {Object<Params, boolean>}
      * @private
      */
    /* private */ var params_ : Any = js.native
    
    /**
      * @private
      * @type {string}
      */
    /* private */ var prefix_ : Any = js.native
    
    /**
      * @param {import("../Map.js").default} map Map.
      * @private
      */
    /* private */ var registerListeners_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var replace_ : Any = js.native
    
    /**
      * @private
      * @param {URLSearchParams} params The search params.
      * @param {string} name The unprefixed parameter name.
      * @param {string} value The param value.
      */
    /* private */ var set_ : Any = js.native
    
    /**
      * @param {import("../Map.js").default} map Map.
      * @private
      */
    /* private */ var unregisterListeners_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var updateState_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var updateUrl_ : Any = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * Animate view transitions.
      */
    var animate: js.UndefOr[Boolean | AnimationOptions] = js.undefined
    
    /**
      * Properties to track. Default is to track
      * `x` (center x), `y` (center y), `z` (zoom), `r` (rotation) and `l` (layers).
      */
    var params: js.UndefOr[js.Array[Params]] = js.undefined
    
    /**
      * By default, the URL will be updated with search parameters x, y, z, and r.  To
      * avoid collisions with existing search parameters that your application uses, you can supply a custom prefix for
      * the ones used by this interaction (e.g. 'ol:').
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    /**
      * Replace the current URL without creating the new entry in browser history.
      * By default, changes in the map state result in a new entry being added to the browser history.
      */
    var replace: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAnimate(value: Boolean | AnimationOptions): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setParams(value: js.Array[Params]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setParamsVarargs(value: Params*): Self = StObject.set(x, "params", js.Array(value*))
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.x
    - typings.ol.olStrings.y
    - typings.ol.olStrings.z
    - typings.ol.olStrings.r
    - typings.ol.olStrings.l
  */
  trait Params extends StObject
  object Params {
    
    inline def l: typings.ol.olStrings.l = "l".asInstanceOf[typings.ol.olStrings.l]
    
    inline def r: typings.ol.olStrings.r = "r".asInstanceOf[typings.ol.olStrings.r]
    
    inline def x: typings.ol.olStrings.x = "x".asInstanceOf[typings.ol.olStrings.x]
    
    inline def y: typings.ol.olStrings.y = "y".asInstanceOf[typings.ol.olStrings.y]
    
    inline def z: typings.ol.olStrings.z = "z".asInstanceOf[typings.ol.olStrings.z]
  }
}
