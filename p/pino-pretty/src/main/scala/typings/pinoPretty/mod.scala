package typings.pinoPretty

import typings.node.NodeJS.WritableStream
import typings.node.streamMod.Transform
import typings.pino.mod.DestinationStream
import typings.pino.mod.Level
import typings.pinoAbstractTransport.mod.OnUnknown
import typings.pinoPretty.anon.Call
import typings.pinoPretty.mod.PinoPretty.MessageFormatFunc
import typings.pinoPretty.mod.PinoPretty.Prettifier
import typings.pinoPretty.mod.PinoPretty.PrettyStream
import typings.pinoPretty.pinoPrettyBooleans.`false`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pino-pretty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    inline def apply(): PrettyStream = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[PrettyStream]
    inline def apply(options: PrettyOptions): PrettyStream = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[PrettyStream]
    
    @JSImport("pino-pretty", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
  
  object PinoPretty {
    
    inline def apply(): PrettyStream = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[PrettyStream]
    inline def apply(options: typings.pinoPretty.mod.PrettyOptions): PrettyStream = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[PrettyStream]
    
    @JSImport("pino-pretty", "PinoPretty")
    @js.native
    val ^ : js.Any = js.native
    
    type ColorizerFactory = js.Function3[
        /* useColors */ js.UndefOr[Boolean], 
        /* customColors */ js.UndefOr[js.Array[js.Tuple2[Double, String]]], 
        /* useOnlyCustomProps */ js.UndefOr[Boolean], 
        Call
      ]
    
    type MessageFormatFunc = js.Function3[/* log */ LogDescriptor, /* messageKey */ String, /* levelLabel */ String, String]
    
    type Prettifier = js.Function1[/* inputData */ String | js.Object, String]
    
    type PrettyFactory = js.Function1[
        /* options */ typings.pinoPretty.mod.PrettyOptions, 
        js.Function1[/* inputData */ Any, String]
      ]
    
    type PrettyOptions = typings.pinoPretty.mod.PrettyOptions
    
    @js.native
    trait PrettyStream
      extends Transform
         with OnUnknown
  }
  
  inline def colorizerFactory(): Call = ^.asInstanceOf[js.Dynamic].applyDynamic("colorizerFactory")().asInstanceOf[Call]
  inline def colorizerFactory(useColors: Boolean): Call = ^.asInstanceOf[js.Dynamic].applyDynamic("colorizerFactory")(useColors.asInstanceOf[js.Any]).asInstanceOf[Call]
  inline def colorizerFactory(useColors: Boolean, customColors: js.Array[js.Tuple2[Double, String]]): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("colorizerFactory")(useColors.asInstanceOf[js.Any], customColors.asInstanceOf[js.Any])).asInstanceOf[Call]
  inline def colorizerFactory(useColors: Boolean, customColors: js.Array[js.Tuple2[Double, String]], useOnlyCustomProps: Boolean): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("colorizerFactory")(useColors.asInstanceOf[js.Any], customColors.asInstanceOf[js.Any], useOnlyCustomProps.asInstanceOf[js.Any])).asInstanceOf[Call]
  inline def colorizerFactory(useColors: Boolean, customColors: Unit, useOnlyCustomProps: Boolean): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("colorizerFactory")(useColors.asInstanceOf[js.Any], customColors.asInstanceOf[js.Any], useOnlyCustomProps.asInstanceOf[js.Any])).asInstanceOf[Call]
  inline def colorizerFactory(useColors: Unit, customColors: js.Array[js.Tuple2[Double, String]]): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("colorizerFactory")(useColors.asInstanceOf[js.Any], customColors.asInstanceOf[js.Any])).asInstanceOf[Call]
  inline def colorizerFactory(useColors: Unit, customColors: js.Array[js.Tuple2[Double, String]], useOnlyCustomProps: Boolean): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("colorizerFactory")(useColors.asInstanceOf[js.Any], customColors.asInstanceOf[js.Any], useOnlyCustomProps.asInstanceOf[js.Any])).asInstanceOf[Call]
  inline def colorizerFactory(useColors: Unit, customColors: Unit, useOnlyCustomProps: Boolean): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("colorizerFactory")(useColors.asInstanceOf[js.Any], customColors.asInstanceOf[js.Any], useOnlyCustomProps.asInstanceOf[js.Any])).asInstanceOf[Call]
  
  inline def prettyFactory(options: PrettyOptions): js.Function1[/* inputData */ Any, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyFactory")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* inputData */ Any, String]]
  
  type LogDescriptor = Record[String, Any]
  
  trait PrettyOptions extends StObject {
    
    /**
      * Opens the file with the 'a' flag.
      * @default true
      */
    var append: js.UndefOr[Boolean] = js.undefined
    
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
      * Provides the ability to add a custom prettify function for specific log properties.
      * `customPrettifiers` is an object, where keys are log properties that will be prettified
      * and value is the prettify function itself.
      * For example, if a log line contains a query property, you can specify a prettifier for it:
      * @default {}
      *
      * @example
      * ```typescript
      * {
      *   customPrettifiers: {
      *     query: prettifyQuery
      *   }
      * }
      * //...
      * const prettifyQuery = value => {
      *  // do some prettify magic
      * }
      * ```
      */
    var customPrettifiers: js.UndefOr[Record[String, Prettifier]] = js.undefined
    
    /**
      * The file, file descriptor, or stream to write to.  Defaults to 1 (stdout).
      * @default 1
      */
    var destination: js.UndefOr[String | Double | DestinationStream | WritableStream] = js.undefined
    
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
      * Will be overridden by the option include if include is presented.
      * @example "time,hostname"
      */
    var ignore: js.UndefOr[String] = js.undefined
    
    /**
      * Include one or several keys.
      * @example "time,level"
      */
    var include: js.UndefOr[String] = js.undefined
    
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
      * The minimum log level to include in the output.
      * @default "trace"
      */
    var minimumLevel: js.UndefOr[Level] = js.undefined
    
    /**
      * Ensure directory for destination file exists.
      * @default false
      */
    var mkdir: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Print each log message on a single line (errors will still be multi-line).
      * @default false
      */
    var singleLine: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Makes messaging synchronous.
      * @default false
      */
    var sync: js.UndefOr[Boolean] = js.undefined
    
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
      
      inline def setAppend(value: Boolean): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      inline def setColorize(value: Boolean): Self = StObject.set(x, "colorize", value.asInstanceOf[js.Any])
      
      inline def setColorizeUndefined: Self = StObject.set(x, "colorize", js.undefined)
      
      inline def setCrlf(value: Boolean): Self = StObject.set(x, "crlf", value.asInstanceOf[js.Any])
      
      inline def setCrlfUndefined: Self = StObject.set(x, "crlf", js.undefined)
      
      inline def setCustomPrettifiers(value: Record[String, Prettifier]): Self = StObject.set(x, "customPrettifiers", value.asInstanceOf[js.Any])
      
      inline def setCustomPrettifiersUndefined: Self = StObject.set(x, "customPrettifiers", js.undefined)
      
      inline def setDestination(value: String | Double | DestinationStream | WritableStream): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      
      inline def setErrorLikeObjectKeys(value: js.Array[String]): Self = StObject.set(x, "errorLikeObjectKeys", value.asInstanceOf[js.Any])
      
      inline def setErrorLikeObjectKeysUndefined: Self = StObject.set(x, "errorLikeObjectKeys", js.undefined)
      
      inline def setErrorLikeObjectKeysVarargs(value: String*): Self = StObject.set(x, "errorLikeObjectKeys", js.Array(value*))
      
      inline def setErrorProps(value: String): Self = StObject.set(x, "errorProps", value.asInstanceOf[js.Any])
      
      inline def setErrorPropsUndefined: Self = StObject.set(x, "errorProps", js.undefined)
      
      inline def setHideObject(value: Boolean): Self = StObject.set(x, "hideObject", value.asInstanceOf[js.Any])
      
      inline def setHideObjectUndefined: Self = StObject.set(x, "hideObject", js.undefined)
      
      inline def setIgnore(value: String): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setInclude(value: String): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
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
      
      inline def setMinimumLevel(value: Level): Self = StObject.set(x, "minimumLevel", value.asInstanceOf[js.Any])
      
      inline def setMinimumLevelUndefined: Self = StObject.set(x, "minimumLevel", js.undefined)
      
      inline def setMkdir(value: Boolean): Self = StObject.set(x, "mkdir", value.asInstanceOf[js.Any])
      
      inline def setMkdirUndefined: Self = StObject.set(x, "mkdir", js.undefined)
      
      inline def setSingleLine(value: Boolean): Self = StObject.set(x, "singleLine", value.asInstanceOf[js.Any])
      
      inline def setSingleLineUndefined: Self = StObject.set(x, "singleLine", js.undefined)
      
      inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      
      inline def setTimestampKey(value: String): Self = StObject.set(x, "timestampKey", value.asInstanceOf[js.Any])
      
      inline def setTimestampKeyUndefined: Self = StObject.set(x, "timestampKey", js.undefined)
      
      inline def setTranslateTime(value: Boolean | String): Self = StObject.set(x, "translateTime", value.asInstanceOf[js.Any])
      
      inline def setTranslateTimeUndefined: Self = StObject.set(x, "translateTime", js.undefined)
    }
  }
}
