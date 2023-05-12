package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatWmsgetfeatureinfoMod {
  
  /**
    * @classdesc
    * Format for reading WMSGetFeatureInfo format. It uses
    * {@link module:ol/format/GML2~GML2} to read features.
    *
    * @api
    */
  @JSImport("ol/format/WMSGetFeatureInfo", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends WMSGetFeatureInfo {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * If set, only features of the given layers will be returned by the format when read.
      */
    var layers: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setLayers(value: js.Array[String]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: String*): Self = StObject.set(x, "layers", js.Array(value*))
    }
  }
  
  /**
    * @classdesc
    * Format for reading WMSGetFeatureInfo format. It uses
    * {@link module:ol/format/GML2~GML2} to read features.
    *
    * @api
    */
  @js.native
  trait WMSGetFeatureInfo
    extends typings.ol.formatXmlfeatureMod.default {
    
    /**
      * @private
      * @type {string}
      */
    /* private */ var featureNS_ : Any = js.native
    
    /**
      * @return {Array<string>|null} layers
      */
    def getLayers(): js.Array[String] | Null = js.native
    
    /**
      * @private
      * @type {GML2}
      */
    /* private */ var gmlFormat_ : Any = js.native
    
    /**
      * @private
      * @type {Array<string>|null}
      */
    /* private */ var layers_ : Any = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @return {Array<import("../Feature.js").default>} Features.
      * @private
      */
    /* private */ var readFeatures_ : Any = js.native
    
    /**
      * @param {Array<string>|null} layers Layers to parse.
      */
    def setLayers(): Unit = js.native
    def setLayers(layers: js.Array[String]): Unit = js.native
  }
}
