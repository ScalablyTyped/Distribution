package typings.ol

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gpxMod {
  
  @JSImport("ol/format/GPX", JSImport.Default)
  @js.native
  class default () extends GPX {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait GPX
    extends typings.ol.xmlfeatureMod.default
  
  @js.native
  trait LayoutOptions extends StObject {
    
    var hasM: js.UndefOr[Boolean] = js.native
    
    var hasZ: js.UndefOr[Boolean] = js.native
  }
  object LayoutOptions {
    
    @scala.inline
    def apply(): LayoutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutOptions]
    }
    
    @scala.inline
    implicit class LayoutOptionsMutableBuilder[Self <: LayoutOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasM(value: Boolean): Self = StObject.set(x, "hasM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasMUndefined: Self = StObject.set(x, "hasM", js.undefined)
      
      @scala.inline
      def setHasZ(value: Boolean): Self = StObject.set(x, "hasZ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasZUndefined: Self = StObject.set(x, "hasZ", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var readExtensions: js.UndefOr[
        js.Function2[
          /* p0 */ typings.ol.olFeatureMod.default[typings.ol.geometryMod.default], 
          /* p1 */ Node, 
          Unit
        ]
      ] = js.native
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
      def setReadExtensions(
        value: (/* p0 */ typings.ol.olFeatureMod.default[typings.ol.geometryMod.default], /* p1 */ Node) => Unit
      ): Self = StObject.set(x, "readExtensions", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReadExtensionsUndefined: Self = StObject.set(x, "readExtensions", js.undefined)
    }
  }
}
