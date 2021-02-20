package typings.openfin

import typings.jquery.JQuery
import typings.openfin.GoldenLayout.Config
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object GoldenLayout {
    
    @JSGlobal("GoldenLayout.GoldenLayout")
    @js.native
    class GoldenLayout protected ()
      extends typings.openfin.GoldenLayout.GoldenLayout {
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
      
      /**
        * Static method on the GoldenLayout constructor! This method will iterate through a GoldenLayout config object
        * and replace frequent keys and values with single letter substitutes.
        * @param config A GoldenLayout configuration object
        */
      @JSGlobal("GoldenLayout.GoldenLayout.minifyConfig")
      @js.native
      def minifyConfig(config: js.Any): js.Any = js.native
      
      /**
        * Static method on the GoldenLayout constructor! This method will reverse the minifications of minifyConfig.
        * @param minifiedConfig A minified GoldenLayout configuration object
        */
      @JSGlobal("GoldenLayout.GoldenLayout.unminifyConfig")
      @js.native
      def unminifyConfig(minifiedConfig: js.Any): js.Any = js.native
    }
  }
}
