package typings.postcssReporter

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.Plugin_
import typings.postcss.mod.ResultMessage
import typings.postcssReporter.anon.Messages
import typings.postcssReporter.postcssReporterStrings.any
import typings.postcssReporter.postcssReporterStrings.first
import typings.postcssReporter.postcssReporterStrings.last
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-reporter", JSImport.Namespace)
  @js.native
  val ^ : PostCSSReporter = js.native
  
  /**
    * Default plugin options
    */
  trait DefaultOptions extends StObject {
    
    /**
      * If true, no exclamatory triangle icons will be printed next to warnings.
      * @default false
      */
    var noIcon: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, plugin names will not be printed in brackets after messages.
      * @default false
      */
    var noPlugin: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If false, messages will not be sorted by line/column position.
      * @default true
      */
    var sortByPosition: js.UndefOr[Boolean] = js.undefined
  }
  object DefaultOptions {
    
    @scala.inline
    def apply(): DefaultOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultOptions]
    }
    
    @scala.inline
    implicit class DefaultOptionsMutableBuilder[Self <: DefaultOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNoIcon(value: Boolean): Self = StObject.set(x, "noIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoIconUndefined: Self = StObject.set(x, "noIcon", js.undefined)
      
      @scala.inline
      def setNoPlugin(value: Boolean): Self = StObject.set(x, "noPlugin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoPluginUndefined: Self = StObject.set(x, "noPlugin", js.undefined)
      
      @scala.inline
      def setSortByPosition(value: Boolean): Self = StObject.set(x, "sortByPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortByPositionUndefined: Self = StObject.set(x, "sortByPosition", js.undefined)
    }
  }
  
  /**
    * Additional options
    */
  trait Options
    extends StObject
       with DefaultOptions {
    
    /**
      * If true, not pass any messages into other plugins, or the whatever runner you use, for logging.
      * @default false
      */
    var clearAllMessages: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the plugin will clear the result's messages after it logs them.
      * This prevents other plugins, or the whatever runner you use, from logging the same information again and causing confusion.
      * @default false
      */
    var clearReportedMessages: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Provide a filter function. It receives the message object and returns a truthy or falsy value,
      * indicating whether that particular message should be reported or not.
      */
    var filter: js.UndefOr[js.Function1[/* message */ ResultMessage, Boolean]] = js.undefined
    
    /**
      * By default, this reporter will format the messages for human legibility in the console.
      * To use another formatter, pass a function that
      * - accepts an object containing a messages array and a source string
      * - returns the string to report
      */
    var formatter: js.UndefOr[js.Function1[/* input */ Messages, String]] = js.undefined
    
    /**
      * If plugins is empty (as it is by default),
      * the reporter will log messages from every PostCSS plugin.
      * @default []
      */
    var plugins: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * By default, messages without line/column positions will be grouped at the beginning of the output.
      * To put them at the end, instead, use "last". To not bother sorting these, use "any".
      * @default 'first'
      */
    var positionless: js.UndefOr[first | last | any] = js.undefined
    
    /**
      * If true, after the plugin logs your messages it will throw an error if it found any warnings.
      * @default false
      */
    var throwError: js.UndefOr[Boolean] = js.undefined
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
      def setClearAllMessages(value: Boolean): Self = StObject.set(x, "clearAllMessages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearAllMessagesUndefined: Self = StObject.set(x, "clearAllMessages", js.undefined)
      
      @scala.inline
      def setClearReportedMessages(value: Boolean): Self = StObject.set(x, "clearReportedMessages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearReportedMessagesUndefined: Self = StObject.set(x, "clearReportedMessages", js.undefined)
      
      @scala.inline
      def setFilter(value: /* message */ ResultMessage => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFormatter(value: /* input */ Messages => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Array[String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: String*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setPositionless(value: first | last | any): Self = StObject.set(x, "positionless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionlessUndefined: Self = StObject.set(x, "positionless", js.undefined)
      
      @scala.inline
      def setThrowError(value: Boolean): Self = StObject.set(x, "throwError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowErrorUndefined: Self = StObject.set(x, "throwError", js.undefined)
    }
  }
  
  type PostCSSReporter = Plugin_[Options]
  
  type _To = PostCSSReporter
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PostCSSReporter = ^
}
