package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wktMod {
  
  @JSImport("ol/format/WKT", JSImport.Default)
  @js.native
  class default () extends WKT {
    def this(opt_options: Options) = this()
  }
  
  trait Options extends StObject {
    
    var splitCollection: js.UndefOr[Boolean] = js.undefined
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
      def setSplitCollection(value: Boolean): Self = StObject.set(x, "splitCollection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitCollectionUndefined: Self = StObject.set(x, "splitCollection", js.undefined)
    }
  }
  
  trait Token extends StObject {
    
    var position: Double
    
    var `type`: Double
    
    var value: js.UndefOr[Double | String] = js.undefined
  }
  object Token {
    
    @scala.inline
    def apply(position: Double, `type`: Double): Token = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit class TokenMutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait WKT
    extends typings.ol.textFeatureMod.default
}
