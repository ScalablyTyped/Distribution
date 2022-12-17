package typings.pluginError

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined plugin-error.plugin-error.Options & {  message :string} */
  trait Optionsmessagestring extends StObject {
    
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
    var message: js.UndefOr[Any] = js.undefined
    
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
  object Optionsmessagestring {
    
    inline def apply(): Optionsmessagestring = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Optionsmessagestring]
    }
    
    extension [Self <: Optionsmessagestring](x: Self) {
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      inline def setMessage(value: Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setShowProperties(value: Boolean): Self = StObject.set(x, "showProperties", value.asInstanceOf[js.Any])
      
      inline def setShowPropertiesUndefined: Self = StObject.set(x, "showProperties", js.undefined)
      
      inline def setShowStack(value: Boolean): Self = StObject.set(x, "showStack", value.asInstanceOf[js.Any])
      
      inline def setShowStackUndefined: Self = StObject.set(x, "showStack", js.undefined)
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  /* Inlined plugin-error.plugin-error.Options & {  plugin :string,   message :string} */
  trait Optionspluginstringmessag extends StObject {
    
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
    var message: js.UndefOr[Any] = js.undefined
    
    /**
      * Error name
      */
    var name: js.UndefOr[String] = js.undefined
    
    var plugin: String
    
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
  object Optionspluginstringmessag {
    
    inline def apply(plugin: String): Optionspluginstringmessag = {
      val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionspluginstringmessag]
    }
    
    extension [Self <: Optionspluginstringmessag](x: Self) {
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      inline def setMessage(value: Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      inline def setShowProperties(value: Boolean): Self = StObject.set(x, "showProperties", value.asInstanceOf[js.Any])
      
      inline def setShowPropertiesUndefined: Self = StObject.set(x, "showProperties", js.undefined)
      
      inline def setShowStack(value: Boolean): Self = StObject.set(x, "showStack", value.asInstanceOf[js.Any])
      
      inline def setShowStackUndefined: Self = StObject.set(x, "showStack", js.undefined)
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  /* Inlined plugin-error.plugin-error.PluginError<{}> */
  trait PluginError extends StObject {
    
    /* standard es2022.error */
    var cause: js.UndefOr[Any] = js.undefined
    
    /**
      * File name where the error occurred
      */
    var fileName: js.UndefOr[String] = js.undefined
    
    /**
      * Line number where the error occurred
      */
    var lineNumber: js.UndefOr[Double] = js.undefined
    
    /* standard es5 */
    var message: String
    
    /* standard es5 */
    var name: String
    
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
    
    /* standard es5 */
    var stack: js.UndefOr[String] = js.undefined
  }
  object PluginError {
    
    inline def apply(message: String, name: String, plugin: String, showProperties: Boolean, showStack: Boolean): PluginError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], showProperties = showProperties.asInstanceOf[js.Any], showStack = showStack.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginError]
    }
    
    extension [Self <: PluginError](x: Self) {
      
      inline def setCause(value: Any): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      inline def setShowProperties(value: Boolean): Self = StObject.set(x, "showProperties", value.asInstanceOf[js.Any])
      
      inline def setShowStack(value: Boolean): Self = StObject.set(x, "showStack", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
}
