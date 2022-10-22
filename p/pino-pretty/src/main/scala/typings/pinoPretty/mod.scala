package typings.pinoPretty

import typings.pino.mod.LogDescriptor
import typings.pinoPretty.pinoPrettyBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Prettifier = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Prettifier]
  inline def apply(options: PrettyOptions): Prettifier = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Prettifier]
  
  @JSImport("pino-pretty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type MessageFormatFunc = js.Function3[/* log */ LogDescriptor, /* messageKey */ String, /* levelLabel */ String, String]
  
  type Prettifier = js.Function1[/* inputData */ String | js.Object, String]
  
  trait PrettyOptions extends StObject {
    
    /**
      * If set to true, will add color information to the formatted output message.
      * @default false
      */
    var colorize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Appends carriage return and line feed, instead of just a line feed, to the formatted log line.
      * @default false
      */
    var crlf: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Define the log keys that are associated with error like objects.
      * @default ["err", "error"]
      */
    var errorLikeObjectKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      *  When formatting an error object, display this list of properties.
      *  The list should be a comma separated list of properties.
      * @default ""
      */
    var errorProps: js.UndefOr[String] = js.undefined
    
    /**
      * Hide objects from output (but not error object).
      * @default false
      */
    var hideObject: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Ignore one or several keys.
      * @example "time,hostname"
      */
    var ignore: js.UndefOr[String] = js.undefined
    
    /**
      * If set to true, it will print the name of the log level as the first field in the log line.
      * @default false
      */
    var levelFirst: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Define the key that contains the level of the log.
      * @default "level"
      */
    var levelKey: js.UndefOr[String] = js.undefined
    
    /**
      * Output the log level using the specified label.
      * @default "levelLabel"
      */
    var levelLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Format output of message, e.g. {level} - {pid} will output message: INFO - 1123
      * @default false
      *
      * @example
      * ```typescript
      * {
      *   messageFormat: (log, messageKey) => {
      *     const message = log[messageKey];
      *     if (log.requestId) return `[${log.requestId}] ${message}`;
      *     return message;
      *   }
      * }
      * ```
      */
    var messageFormat: js.UndefOr[`false` | String | MessageFormatFunc] = js.undefined
    
    /**
      * The key in the JSON object to use as the highlighted message.
      * @default "msg"
      */
    var messageKey: js.UndefOr[String] = js.undefined
    
    /**
      * Specify a search pattern according to {@link http://jmespath.org|jmespath}
      */
    var search: js.UndefOr[String] = js.undefined
    
    /**
      * Print each log message on a single line (errors will still be multi-line).
      * @default false
      */
    var singleLine: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The key in the JSON object to use for timestamp display.
      * @default "time"
      */
    var timestampKey: js.UndefOr[String] = js.undefined
    
    /**
      * Translate the epoch time value into a human readable date and time string. This flag also can set the format
      * string to apply when translating the date to human readable format. For a list of available pattern letters
      * see the {@link https://www.npmjs.com/package/dateformat|dateformat documentation}.
      * - The default format is `yyyy-mm-dd HH:MM:ss.l o` in UTC.
      * - Requires a `SYS:` prefix to translate time to the local system's timezone. Use the shortcut `SYS:standard`
      *   to translate time to `yyyy-mm-dd HH:MM:ss.l o` in system timezone.
      * @default false
      */
    var translateTime: js.UndefOr[Boolean | String] = js.undefined
  }
  object PrettyOptions {
    
    inline def apply(): PrettyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrettyOptions]
    }
    
    extension [Self <: PrettyOptions](x: Self) {
      
      inline def setColorize(value: Boolean): Self = StObject.set(x, "colorize", value.asInstanceOf[js.Any])
      
      inline def setColorizeUndefined: Self = StObject.set(x, "colorize", js.undefined)
      
      inline def setCrlf(value: Boolean): Self = StObject.set(x, "crlf", value.asInstanceOf[js.Any])
      
      inline def setCrlfUndefined: Self = StObject.set(x, "crlf", js.undefined)
      
      inline def setErrorLikeObjectKeys(value: js.Array[String]): Self = StObject.set(x, "errorLikeObjectKeys", value.asInstanceOf[js.Any])
      
      inline def setErrorLikeObjectKeysUndefined: Self = StObject.set(x, "errorLikeObjectKeys", js.undefined)
      
      inline def setErrorLikeObjectKeysVarargs(value: String*): Self = StObject.set(x, "errorLikeObjectKeys", js.Array(value*))
      
      inline def setErrorProps(value: String): Self = StObject.set(x, "errorProps", value.asInstanceOf[js.Any])
      
      inline def setErrorPropsUndefined: Self = StObject.set(x, "errorProps", js.undefined)
      
      inline def setHideObject(value: Boolean): Self = StObject.set(x, "hideObject", value.asInstanceOf[js.Any])
      
      inline def setHideObjectUndefined: Self = StObject.set(x, "hideObject", js.undefined)
      
      inline def setIgnore(value: String): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setLevelFirst(value: Boolean): Self = StObject.set(x, "levelFirst", value.asInstanceOf[js.Any])
      
      inline def setLevelFirstUndefined: Self = StObject.set(x, "levelFirst", js.undefined)
      
      inline def setLevelKey(value: String): Self = StObject.set(x, "levelKey", value.asInstanceOf[js.Any])
      
      inline def setLevelKeyUndefined: Self = StObject.set(x, "levelKey", js.undefined)
      
      inline def setLevelLabel(value: String): Self = StObject.set(x, "levelLabel", value.asInstanceOf[js.Any])
      
      inline def setLevelLabelUndefined: Self = StObject.set(x, "levelLabel", js.undefined)
      
      inline def setMessageFormat(value: `false` | String | MessageFormatFunc): Self = StObject.set(x, "messageFormat", value.asInstanceOf[js.Any])
      
      inline def setMessageFormatFunction3(value: (/* log */ LogDescriptor, /* messageKey */ String, /* levelLabel */ String) => String): Self = StObject.set(x, "messageFormat", js.Any.fromFunction3(value))
      
      inline def setMessageFormatUndefined: Self = StObject.set(x, "messageFormat", js.undefined)
      
      inline def setMessageKey(value: String): Self = StObject.set(x, "messageKey", value.asInstanceOf[js.Any])
      
      inline def setMessageKeyUndefined: Self = StObject.set(x, "messageKey", js.undefined)
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setSingleLine(value: Boolean): Self = StObject.set(x, "singleLine", value.asInstanceOf[js.Any])
      
      inline def setSingleLineUndefined: Self = StObject.set(x, "singleLine", js.undefined)
      
      inline def setTimestampKey(value: String): Self = StObject.set(x, "timestampKey", value.asInstanceOf[js.Any])
      
      inline def setTimestampKeyUndefined: Self = StObject.set(x, "timestampKey", js.undefined)
      
      inline def setTranslateTime(value: Boolean | String): Self = StObject.set(x, "translateTime", value.asInstanceOf[js.Any])
      
      inline def setTranslateTimeUndefined: Self = StObject.set(x, "translateTime", js.undefined)
    }
  }
}
