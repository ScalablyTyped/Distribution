package typings.openfin

import typings.jquery.JQuery
import typings.openfin.GoldenLayout.Config
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object GoldenLayout {
    
    @JSGlobal("GoldenLayout.GoldenLayout")
    @js.native
    open class GoldenLayout protected ()
      extends StObject
         with typings.openfin.GoldenLayout.GoldenLayout {
      /**
        * @param config A GoldenLayout configuration object
        * @param container The DOM element the layout will be initialised in. Default: document.body
        */
      def this(configuration: Config) = this()
      def this(configuration: Config, container: JQuery[HTMLElement]) = this()
      def this(configuration: Config, container: Element) = this()
      def this(configuration: Config, container: HTMLElement) = this()
    }
    /* static members */
    object GoldenLayout {
      
      @JSGlobal("GoldenLayout.GoldenLayout")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Static method on the GoldenLayout constructor! This method will iterate through a GoldenLayout config object
        * and replace frequent keys and values with single letter substitutes.
        * @param config A GoldenLayout configuration object
        */
      inline def minifyConfig(config: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("minifyConfig")(config.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      /**
        * Static method on the GoldenLayout constructor! This method will reverse the minifications of minifyConfig.
        * @param minifiedConfig A minified GoldenLayout configuration object
        */
      inline def unminifyConfig(minifiedConfig: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unminifyConfig")(minifiedConfig.asInstanceOf[js.Any]).asInstanceOf[Any]
    }
  }
}
