package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatWktMod {
  
  /**
    * @classdesc
    * Geometry format for reading and writing data in the `WellKnownText` (WKT)
    * format.
    *
    * @api
    */
  @JSImport("ol/format/WKT", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends WKT {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * Whether to split GeometryCollections into
      * multiple features on reading.
      */
    var splitCollection: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setSplitCollection(value: Boolean): Self = StObject.set(x, "splitCollection", value.asInstanceOf[js.Any])
      
      inline def setSplitCollectionUndefined: Self = StObject.set(x, "splitCollection", js.undefined)
    }
  }
  
  trait Token extends StObject {
    
    /**
      * Position.
      */
    var position: Double
    
    /**
      * Type.
      */
    var `type`: Double
    
    /**
      * Value.
      */
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object Token {
    
    inline def apply(position: Double, `type`: Double): Token = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /**
    * @classdesc
    * Geometry format for reading and writing data in the `WellKnownText` (WKT)
    * format.
    *
    * @api
    */
  @js.native
  trait WKT
    extends typings.ol.formatTextFeatureMod.default {
    
    /**
      * Parse a WKT string.
      * @param {string} wkt WKT string.
      * @return {import("../geom/Geometry.js").default}
      *     The geometry created.
      * @private
      */
    /* private */ var parse_ : Any = js.native
    
    /**
      * Split GeometryCollection into multiple features.
      * @type {boolean}
      * @private
      */
    /* private */ var splitCollection_ : Any = js.native
  }
}
