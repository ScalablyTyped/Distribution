package typings.minimist

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ParsedArgs = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ParsedArgs]
  inline def apply(args: js.Array[String]): ParsedArgs = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any]).asInstanceOf[ParsedArgs]
  inline def apply(args: js.Array[String], opts: Opts): ParsedArgs = (^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ParsedArgs]
  inline def apply(args: Unit, opts: Opts): ParsedArgs = (^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ParsedArgs]
  
  @JSImport("minimist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Opts extends StObject {
    
    /**
      * An object mapping string argument names to default values
      */
    var default: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    /**
      * When true, populate argv._ with everything before the -- and argv['--'] with everything after the --.
      * Note that with -- set, parsing for arguments still stops after the `--`.
      */
    var `--`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An object mapping string names to strings or arrays of string argument names to use as aliases
      */
    var alias: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.undefined
    
    /**
      * A boolean, string or array of strings to always treat as booleans. If true will treat
      * all double hyphenated arguments without equals signs as boolean (e.g. affects `--foo`, not `-f` or `--foo=bar`)
      */
    var boolean: js.UndefOr[Boolean | String | js.Array[String]] = js.undefined
    
    /**
      * When true, populate argv._ with everything after the first non-option
      */
    var stopEarly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A string or array of strings argument names to always treat as strings
      */
    var string: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * A function which is invoked with a command line parameter not defined in the opts
      * configuration object. If the function returns false, the unknown option is not added to argv
      */
    var unknown: js.UndefOr[js.Function1[/* arg */ String, Boolean]] = js.undefined
  }
  object Opts {
    
    inline def apply(): Opts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Opts]
    }
    
    extension [Self <: Opts](x: Self) {
      
      inline def `set--`(value: Boolean): Self = StObject.set(x, "--", value.asInstanceOf[js.Any])
      
      inline def `set--Undefined`: Self = StObject.set(x, "--", js.undefined)
      
      inline def setAlias(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setBoolean(value: Boolean | String | js.Array[String]): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      inline def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      inline def setBooleanVarargs(value: String*): Self = StObject.set(x, "boolean", js.Array(value :_*))
      
      inline def setDefault(value: StringDictionary[js.Any]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setStopEarly(value: Boolean): Self = StObject.set(x, "stopEarly", value.asInstanceOf[js.Any])
      
      inline def setStopEarlyUndefined: Self = StObject.set(x, "stopEarly", js.undefined)
      
      inline def setString(value: String | js.Array[String]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      inline def setStringVarargs(value: String*): Self = StObject.set(x, "string", js.Array(value :_*))
      
      inline def setUnknown(value: /* arg */ String => Boolean): Self = StObject.set(x, "unknown", js.Any.fromFunction1(value))
      
      inline def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
    }
  }
  
  trait ParsedArgs
    extends StObject
       with /* arg */ StringDictionary[js.Any] {
    
    /**
      * If opts['--'] is true, populated with everything after the --
      */
    var `--`: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Contains all the arguments that didn't have an option associated with them
      */
    @JSName("_")
    var _underscore: js.Array[String]
  }
  object ParsedArgs {
    
    inline def apply(_underscore: js.Array[String]): ParsedArgs = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedArgs]
    }
    
    extension [Self <: ParsedArgs](x: Self) {
      
      inline def `set--`(value: js.Array[String]): Self = StObject.set(x, "--", value.asInstanceOf[js.Any])
      
      inline def `set--Undefined`: Self = StObject.set(x, "--", js.undefined)
      
      inline def `set--Varargs`(value: String*): Self = StObject.set(x, "--", js.Array(value :_*))
      
      inline def set_underscore(value: js.Array[String]): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
      
      inline def set_underscoreVarargs(value: String*): Self = StObject.set(x, "_", js.Array(value :_*))
    }
  }
}
