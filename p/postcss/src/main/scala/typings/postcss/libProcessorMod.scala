package typings.postcss

import typings.postcss.anon.ToString
import typings.postcss.mod.AcceptedPlugin
import typings.postcss.mod.ProcessOptions
import typings.postcss.mod.TransformCallback
import typings.postcss.mod._AcceptedPlugin
import typings.std.Plugin
import typings.std.Transformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProcessorMod {
  
  @JSImport("postcss/lib/processor", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Processor_
  
  /**
    * Contains plugins to process CSS. Create one `Processor` instance,
    * initialize its plugins, and then use that instance on numerous CSS files.
    *
    * ```js
    * const processor = postcss([autoprefixer, postcssNested])
    * processor.process(css1).then(result => console.log(result.css))
    * processor.process(css2).then(result => console.log(result.css))
    * ```
    */
  @JSImport("postcss/lib/processor", JSImport.Default)
  @js.native
  /**
    * @param plugins PostCSS plugins
    */
  open class default ()
    extends StObject
       with Processor_
       with _AcceptedPlugin {
    def this(plugins: js.Array[AcceptedPlugin]) = this()
  }
  
  type Processor = Processor_
  
  /**
    * Contains plugins to process CSS. Create one `Processor` instance,
    * initialize its plugins, and then use that instance on numerous CSS files.
    *
    * ```js
    * const processor = postcss([autoprefixer, postcssNested])
    * processor.process(css1).then(result => console.log(result.css))
    * processor.process(css2).then(result => console.log(result.css))
    * ```
    */
  @js.native
  trait Processor_ extends StObject {
    
    /**
      * Plugins added to this processor.
      *
      * ```js
      * const processor = postcss([autoprefixer, postcssNested])
      * processor.plugins.length //=> 2
      * ```
      */
    var plugins: js.Array[Plugin | (Transformer[Any, Any]) | TransformCallback] = js.native
    
    /**
      * Parses source CSS and returns a `LazyResult` Promise proxy.
      * Because some plugins can be asynchronous it doesn’t make
      * any transformations. Transformations will be applied
      * in the `LazyResult` methods.
      *
      * ```js
      * processor.process(css, { from: 'a.css', to: 'a.out.css' })
      *   .then(result => {
      *      console.log(result.css)
      *   })
      * ```
      *
      * @param css String with input CSS or any object with a `toString()` method,
      *            like a Buffer. Optionally, send a `Result` instance
      *            and the processor will take the `Root` from it.
      * @param opts Options.
      * @return Promise proxy.
      */
    def process(css: String): typings.postcss.libLazyResultMod.default | typings.postcss.libNoWorkResultMod.default = js.native
    def process(css: String, options: ProcessOptions): typings.postcss.libLazyResultMod.default | typings.postcss.libNoWorkResultMod.default = js.native
    def process(css: ToString): typings.postcss.libLazyResultMod.default | typings.postcss.libNoWorkResultMod.default = js.native
    def process(css: ToString, options: ProcessOptions): typings.postcss.libLazyResultMod.default | typings.postcss.libNoWorkResultMod.default = js.native
    def process(css: typings.postcss.libLazyResultMod.default): typings.postcss.libLazyResultMod.default | typings.postcss.libNoWorkResultMod.default = js.native
    def process(css: typings.postcss.libLazyResultMod.default, options: ProcessOptions): typings.postcss.libLazyResultMod.default | typings.postcss.libNoWorkResultMod.default = js.native
    def process(css: typings.postcss.libResultMod.default): typings.postcss.libLazyResultMod.default | typings.postcss.libNoWorkResultMod.default = js.native
    def process(css: typings.postcss.libResultMod.default, options: ProcessOptions): typings.postcss.libLazyResultMod.default | typings.postcss.libNoWorkResultMod.default = js.native
    def process(css: typings.postcss.libRootMod.default): typings.postcss.libLazyResultMod.default | typings.postcss.libNoWorkResultMod.default = js.native
    def process(css: typings.postcss.libRootMod.default, options: ProcessOptions): typings.postcss.libLazyResultMod.default | typings.postcss.libNoWorkResultMod.default = js.native
    
    /**
      * Adds a plugin to be used as a CSS processor.
      *
      * PostCSS plugin can be in 4 formats:
      * * A plugin in `Plugin` format.
      * * A plugin creator function with `pluginCreator.postcss = true`.
      *   PostCSS will call this function without argument to get plugin.
      * * A function. PostCSS will pass the function a {@link Root}
      *   as the first argument and current `Result` instance
      *   as the second.
      * * Another `Processor` instance. PostCSS will copy plugins
      *   from that instance into this one.
      *
      * Plugins can also be added by passing them as arguments when creating
      * a `postcss` instance (see [`postcss(plugins)`]).
      *
      * Asynchronous plugins should return a `Promise` instance.
      *
      * ```js
      * const processor = postcss()
      *   .use(autoprefixer)
      *   .use(postcssNested)
      * ```
      *
      * @param plugin PostCSS plugin or `Processor` with plugins.
      * @return Current processor to make methods chain.
      */
    def use(plugin: AcceptedPlugin): this.type = js.native
    
    /**
      * Current PostCSS version.
      *
      * ```js
      * if (result.processor.version.split('.')[0] !== '6') {
      *   throw new Error('This plugin works only with PostCSS 6')
      * }
      * ```
      */
    var version: String = js.native
  }
}
