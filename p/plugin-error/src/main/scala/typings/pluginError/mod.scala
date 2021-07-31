package typings.pluginError

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.TopLevel
import typings.pluginError.anon.Optionsmessagestring
import typings.pluginError.anon.Optionspluginstringmessag
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("plugin-error", JSImport.Namespace)
  @js.native
  val ^ : js.Object & Constructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("plugin-error", JSImport.Namespace)
  @js.native
  class Class protected ()
    extends StObject
       with typings.pluginError.anon.PluginError {
    /**
      * @param options Options with plugin name and message
      */
    def this(options: Optionspluginstringmessag) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Plugin name
      */
    /* CompleteClass */
    var plugin: String = js.native
    
    /**
      * Boolean controlling if properties will be shown in `err.toString()`.
      */
    /* CompleteClass */
    var showProperties: Boolean = js.native
    
    /**
      * Boolean controlling if the stack will be shown in `err.toString()`.
      */
    /* CompleteClass */
    var showStack: Boolean = js.native
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /**
    * @param options Options with plugin name and message
    */
  Instantiable1[/* options */ Optionspluginstringmessag, typings.pluginError.anon.PluginError]
       with /**
    * @param plugin Plugin name
    * @param error Base error
    * @param options Error options
    */
  /**
    * @param plugin Plugin name
    * @param error Base error, error message, or options with message
    */
  Instantiable2[
          /* plugin */ String, 
          (/* error */ Error) | (/* error */ Optionsmessagestring) | (/* error */ String), 
          PluginError[
            (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof std.Error ]: undefined}
    */ typings.pluginError.pluginErrorStrings.Constructor & TopLevel[js.Any]) | Error
          ]
        ]
       with /**
    * @param plugin Plugin name
    * @param error Base error or error message
    * @param options Error options
    */
  Instantiable3[
          /* plugin */ String, 
          (/* error */ Error) | (/* error */ String), 
          /* options */ Options, 
          PluginError[
            (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof std.Error ]: undefined}
    */ typings.pluginError.pluginErrorStrings.Constructor & TopLevel[js.Any]) | Error
          ]
        ]
  
  trait Options extends StObject {
    
    /**
      * File name where the error occurred
      */
    var fileName: js.UndefOr[String] = js.undefined
    
    /**
      * Line number where the error occurred
      */
    var lineNumber: js.UndefOr[Double] = js.undefined
    
    /**
      * Error message
      */
    var message: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Error name
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Error properties will be included in err.toString(). Can be omitted by
      * setting this to false.
      *
      * Default: `true`
      */
    var showProperties: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default the stack will not be shown. Set this to true if you think the
      * stack is important for your error.
      *
      * Default: `false`
      */
    var showStack: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Error stack to use for `err.toString()` if `showStack` is `true`.
      * By default it uses the `stack` of the original error if you used one, otherwise it captures a new stack.
      */
    var stack: js.UndefOr[String] = js.undefined
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
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      @scala.inline
      def setMessage(value: js.Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setShowProperties(value: Boolean): Self = StObject.set(x, "showProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPropertiesUndefined: Self = StObject.set(x, "showProperties", js.undefined)
      
      @scala.inline
      def setShowStack(value: Boolean): Self = StObject.set(x, "showStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowStackUndefined: Self = StObject.set(x, "showStack", js.undefined)
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  /**
    * Abstraction for error handling for Vinyl plugins
    */
  type PluginError[T] = SimplePluginError & T
  
  /**
    * The `SimplePluginError` interface defines the properties available on all the the instances of `PluginError`.
    *
    * @internal
    */
  trait SimplePluginError
    extends StObject
       with Error {
    
    /**
      * File name where the error occurred
      */
    var fileName: js.UndefOr[String] = js.undefined
    
    /**
      * Line number where the error occurred
      */
    var lineNumber: js.UndefOr[Double] = js.undefined
    
    /**
      * Plugin name
      */
    var plugin: String
    
    /**
      * Boolean controlling if properties will be shown in `err.toString()`.
      */
    var showProperties: Boolean
    
    /**
      * Boolean controlling if the stack will be shown in `err.toString()`.
      */
    var showStack: Boolean
  }
  object SimplePluginError {
    
    @scala.inline
    def apply(message: String, name: String, plugin: String, showProperties: Boolean, showStack: Boolean): SimplePluginError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], showProperties = showProperties.asInstanceOf[js.Any], showStack = showStack.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimplePluginError]
    }
    
    @scala.inline
    implicit class SimplePluginErrorMutableBuilder[Self <: SimplePluginError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      @scala.inline
      def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowProperties(value: Boolean): Self = StObject.set(x, "showProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowStack(value: Boolean): Self = StObject.set(x, "showStack", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Object & Constructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & Constructor = ^
}
