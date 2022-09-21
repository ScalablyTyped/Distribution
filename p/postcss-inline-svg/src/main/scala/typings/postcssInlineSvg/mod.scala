package typings.postcssInlineSvg

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.PluginCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-inline-svg", JSImport.Namespace)
  @js.native
  val ^ : PluginCreator[Options] = js.native
  
  trait Options extends StObject {
    
    /**
      * Processes SVG after applying parameters
      */
    var encode: js.UndefOr[js.Function1[/* svg */ String, String]] = js.undefined
    
    /**
      * Array of paths to resolve URL. Paths are tried in order, until an existing file is found.
      * If omitted, path will be relative to source file if it was specified
      */
    var paths: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Removes all `fill` attributes before applying specified. Passed `RegExp` filters files by ID
      * @default false
      */
    val removeFill: js.UndefOr[js.RegExp | Boolean] = js.undefined
    
    /**
      * Removes all `stroke` attributes before applying specified. Passed `RegExp` filters files by ID
      * @default false
      */
    var removeStroke: js.UndefOr[js.RegExp | Boolean] = js.undefined
    
    /**
      * Transforms SVG after `encode` function and generates URL
      */
    var transform: js.UndefOr[js.Function2[/* svg */ String, /* path */ String, String]] = js.undefined
    
    /**
      * Adds `xmlns` attribute to SVG if not present
      * @default true
      */
    var xmlns: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setEncode(value: /* svg */ String => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
      
      inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def setRemoveFill(value: js.RegExp | Boolean): Self = StObject.set(x, "removeFill", value.asInstanceOf[js.Any])
      
      inline def setRemoveFillUndefined: Self = StObject.set(x, "removeFill", js.undefined)
      
      inline def setRemoveStroke(value: js.RegExp | Boolean): Self = StObject.set(x, "removeStroke", value.asInstanceOf[js.Any])
      
      inline def setRemoveStrokeUndefined: Self = StObject.set(x, "removeStroke", js.undefined)
      
      inline def setTransform(value: (/* svg */ String, /* path */ String) => String): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setXmlns(value: Boolean): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
      
      inline def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
    }
  }
  
  type _To = PluginCreator[Options]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PluginCreator[Options] = ^
}
