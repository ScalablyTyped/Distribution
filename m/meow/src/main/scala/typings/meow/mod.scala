package typings.meow

import typings.meow.meowBooleans.`false`
import typings.meow.meowBooleans.`true`
import typings.meow.meowStrings.boolean
import typings.meow.meowStrings.number
import typings.meow.meowStrings.string
import typings.std.ImportMeta
import typings.std.Record
import typings.typeFest.sourceCamelCasedPropertiesMod.CamelCasedProperties
import typings.typeFest.sourcePackageJsonMod.PackageJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("meow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Flags /* <: AnyFlags */](): Result[Flags] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Result[Flags]]
  inline def default[Flags /* <: AnyFlags */](options: Options[Flags]): Result[Flags] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Result[Flags]]
  
  type AnyFlag = StringFlag | BooleanFlag | NumberFlag
  
  type AnyFlags = Record[String, AnyFlag]
  
  type BooleanFlag = Flag[boolean, js.Array[Boolean] | Boolean, `false` | `true`]
  
  trait Flag[Type /* <: FlagType */, Default, IsMultiple] extends StObject {
    
    val default: js.UndefOr[Default] = js.undefined
    
    val alias: js.UndefOr[String] = js.undefined
    
    val isMultiple: js.UndefOr[IsMultiple] = js.undefined
    
    val isRequired: js.UndefOr[Boolean | IsRequiredPredicate] = js.undefined
    
    val `type`: js.UndefOr[Type] = js.undefined
  }
  object Flag {
    
    inline def apply[Type /* <: FlagType */, Default, IsMultiple](): Flag[Type, Default, IsMultiple] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Flag[Type, Default, IsMultiple]]
    }
    
    extension [Self <: Flag[?, ?, ?], Type /* <: FlagType */, Default, IsMultiple](x: Self & (Flag[Type, Default, IsMultiple])) {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setDefault(value: Default): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setIsMultiple(value: IsMultiple): Self = StObject.set(x, "isMultiple", value.asInstanceOf[js.Any])
      
      inline def setIsMultipleUndefined: Self = StObject.set(x, "isMultiple", js.undefined)
      
      inline def setIsRequired(value: Boolean | IsRequiredPredicate): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
      
      inline def setIsRequiredFunction2(value: (/* flags */ AnyFlags, /* input */ js.Array[String]) => Boolean): Self = StObject.set(x, "isRequired", js.Any.fromFunction2(value))
      
      inline def setIsRequiredUndefined: Self = StObject.set(x, "isRequired", js.undefined)
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.meow.meowStrings.string
    - typings.meow.meowStrings.boolean
    - typings.meow.meowStrings.number
  */
  trait FlagType extends StObject
  object FlagType {
    
    inline def boolean: typings.meow.meowStrings.boolean = "boolean".asInstanceOf[typings.meow.meowStrings.boolean]
    
    inline def number: typings.meow.meowStrings.number = "number".asInstanceOf[typings.meow.meowStrings.number]
    
    inline def string: typings.meow.meowStrings.string = "string".asInstanceOf[typings.meow.meowStrings.string]
  }
  
  type IsRequiredPredicate = js.Function2[/* flags */ AnyFlags, /* input */ js.Array[String], Boolean]
  
  type NumberFlag = Flag[number, js.Array[Double] | Double, `false` | `true`]
  
  trait Options[Flags /* <: AnyFlags */] extends StObject {
    
    /**
    	Whether to allow unknown flags or not.
    	@default true
    	*/
    val allowUnknownFlags: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Custom arguments object.
    	@default process.argv.slice(2)
    	*/
    val argv: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
    	Automatically show the help text when the `--help` flag is present. Useful to set this value to `false` when a CLI manages child CLIs with their own help text.
    	This option is only considered when there is only one argument in `process.argv`.
    	*/
    val autoHelp: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Automatically show the version text when the `--version` flag is present. Useful to set this value to `false` when a CLI manages child CLIs with their own version text.
    	This option is only considered when there is only one argument in `process.argv`.
    	*/
    val autoVersion: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Value of `boolean` flags not defined in `argv`.
    	If set to `undefined`, the flags not defined in `argv` will be excluded from the result. The `default` value set in `boolean` flags take precedence over `booleanDefault`.
    	_Note: If used in conjunction with `isMultiple`, the default flag value is set to `[]`._
    	__Caution: Explicitly specifying `undefined` for `booleanDefault` has different meaning from omitting key itself.__
    	@example
    	```
    	import meow from 'meow';
    	const cli = meow(`
    		Usage
    			$ foo
    		Options
    			--rainbow, -r  Include a rainbow
    			--unicorn, -u  Include a unicorn
    			--no-sparkles  Exclude sparkles
    		Examples
    			$ foo
    			🌈 unicorns✨🌈
    	`, {
    		importMeta: import.meta,
    		booleanDefault: undefined,
    		flags: {
    			rainbow: {
    				type: 'boolean',
    				default: true,
    				alias: 'r'
    			},
    				unicorn: {
    				type: 'boolean',
    				default: false,
    				alias: 'u'
    			},
    			cake: {
    				type: 'boolean',
    				alias: 'c'
    			},
    			sparkles: {
    				type: 'boolean',
    				default: true
    			}
    		}
    	});
    	//{
    	//	flags: {
    	//		rainbow: true,
    	//		unicorn: false,
    	//		sparkles: true
    	//	},
    	//	unnormalizedFlags: {
    	//		rainbow: true,
    	//		r: true,
    	//		unicorn: false,
    	//		u: false,
    	//		sparkles: true
    	//	},
    	//	…
    	//}
    	```
    	*/
    // eslint-disable-next-line @typescript-eslint/ban-types
    val booleanDefault: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
    	Description to show above the help text. Default: The package.json `"description"` property.
    	Set it to `false` to disable it altogether.
    	*/
    val description: js.UndefOr[String | `false`] = js.undefined
    
    /**
    	Define argument flags.
    	The key is the flag name in camel-case and the value is an object with any of:
    	- `type`: Type of value. (Possible values: `string` `boolean` `number`)
    	- `alias`: Usually used to define a short flag alias.
    	- `default`: Default value when the flag is not specified.
    	- `isRequired`: Determine if the flag is required.
    		If it's only known at runtime whether the flag is required or not you can pass a Function instead of a boolean, which based on the given flags and other non-flag arguments should decide if the flag is required.
    	- `isMultiple`: Indicates a flag can be set multiple times. Values are turned into an array. (Default: false)
    		Multiple values are provided by specifying the flag multiple times, for example, `$ foo -u rainbow -u cat`. Space- or comma-separated values are *not* supported.
    	Note that flags are always defined using a camel-case key (`myKey`), but will match arguments in kebab-case (`--my-key`).
    	@example
    	```
    	flags: {
    		unicorn: {
    			type: 'string',
    			alias: 'u',
    			default: ['rainbow', 'cat'],
    			isMultiple: true,
    			isRequired: (flags, input) => {
    				if (flags.otherFlag) {
    					return true;
    				}
    				return false;
    			}
    		}
    	}
    	```
    	*/
    val flags: js.UndefOr[Flags] = js.undefined
    
    /**
    	Whether to use [hard-rejection](https://github.com/sindresorhus/hard-rejection) or not. Disabling this can be useful if you need to handle `process.on('unhandledRejection')` yourself.
    	@default true
    	*/
    val hardRejection: js.UndefOr[Boolean] = js.undefined
    
    /**
    	The help text you want shown.
    	The input is reindented and starting/ending newlines are trimmed which means you can use a [template literal](https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/template_strings) without having to care about using the correct amount of indent.
    	The description will be shown above your help text automatically.
    	Set it to `false` to disable it altogether.
    	*/
    val help: js.UndefOr[String | `false`] = js.undefined
    
    /**
    	Pass in [`import.meta`](https://nodejs.org/dist/latest/docs/api/esm.html#esm_import_meta). This is used to find the correct package.json file.
    	*/
    val importMeta: ImportMeta
    
    /**
    	Infer the argument type.
    	By default, the argument `5` in `$ foo 5` becomes a string. Enabling this would infer it as a number.
    	@default false
    	*/
    val inferType: js.UndefOr[Boolean] = js.undefined
    
    /**
    	`package.json` as an `Object`. Default: Closest `package.json` upwards.
    	_You most likely don't need this option._
    	*/
    val pkg: js.UndefOr[Record[String, Any]] = js.undefined
    
    /**
    	Set a custom version output. Default: The package.json `"version"` property.
    	Set it to `false` to disable it altogether.
    	*/
    val version: js.UndefOr[String | `false`] = js.undefined
  }
  object Options {
    
    inline def apply[Flags /* <: AnyFlags */](importMeta: ImportMeta): Options[Flags] = {
      val __obj = js.Dynamic.literal(importMeta = importMeta.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options[Flags]]
    }
    
    extension [Self <: Options[?], Flags /* <: AnyFlags */](x: Self & Options[Flags]) {
      
      inline def setAllowUnknownFlags(value: Boolean): Self = StObject.set(x, "allowUnknownFlags", value.asInstanceOf[js.Any])
      
      inline def setAllowUnknownFlagsUndefined: Self = StObject.set(x, "allowUnknownFlags", js.undefined)
      
      inline def setArgv(value: js.Array[String]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
      
      inline def setArgvUndefined: Self = StObject.set(x, "argv", js.undefined)
      
      inline def setArgvVarargs(value: String*): Self = StObject.set(x, "argv", js.Array(value*))
      
      inline def setAutoHelp(value: Boolean): Self = StObject.set(x, "autoHelp", value.asInstanceOf[js.Any])
      
      inline def setAutoHelpUndefined: Self = StObject.set(x, "autoHelp", js.undefined)
      
      inline def setAutoVersion(value: Boolean): Self = StObject.set(x, "autoVersion", value.asInstanceOf[js.Any])
      
      inline def setAutoVersionUndefined: Self = StObject.set(x, "autoVersion", js.undefined)
      
      inline def setBooleanDefault(value: Boolean): Self = StObject.set(x, "booleanDefault", value.asInstanceOf[js.Any])
      
      inline def setBooleanDefaultNull: Self = StObject.set(x, "booleanDefault", null)
      
      inline def setBooleanDefaultUndefined: Self = StObject.set(x, "booleanDefault", js.undefined)
      
      inline def setDescription(value: String | `false`): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setFlags(value: Flags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setHardRejection(value: Boolean): Self = StObject.set(x, "hardRejection", value.asInstanceOf[js.Any])
      
      inline def setHardRejectionUndefined: Self = StObject.set(x, "hardRejection", js.undefined)
      
      inline def setHelp(value: String | `false`): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      inline def setImportMeta(value: ImportMeta): Self = StObject.set(x, "importMeta", value.asInstanceOf[js.Any])
      
      inline def setInferType(value: Boolean): Self = StObject.set(x, "inferType", value.asInstanceOf[js.Any])
      
      inline def setInferTypeUndefined: Self = StObject.set(x, "inferType", js.undefined)
      
      inline def setPkg(value: Record[String, Any]): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
      
      inline def setPkgUndefined: Self = StObject.set(x, "pkg", js.undefined)
      
      inline def setVersion(value: String | `false`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Flag extends {  isRequired :true} ? FlagType : Flag extends {  default :any} ? FlagType : FlagType | undefined
    }}}
    */
  type PossiblyOptionalFlag[Flag /* <: AnyFlag */, FlagType] = FlagType
  
  @js.native
  trait Result[Flags /* <: AnyFlags */] extends StObject {
    
    /**
    	Flags converted to camelCase excluding aliases.
    	*/
    var flags: CamelCasedProperties[TypedFlags[Flags]] & (Record[String, Any]) = js.native
    
    /**
    	The help text used with `--help`.
    	*/
    var help: String = js.native
    
    /**
    	Non-flag arguments.
    	*/
    var input: js.Array[String] = js.native
    
    /**
    	The `package.json` object.
    	*/
    var pkg: PackageJson = js.native
    
    /**
    	Show the help text and exit with code.
    	@param exitCode - The exit code to use. Default: `2`.
    	*/
    def showHelp(): scala.Nothing = js.native
    def showHelp(exitCode: Double): scala.Nothing = js.native
    
    /**
    	Show the version text and exit.
    	*/
    def showVersion(): Unit = js.native
    
    /**
    	Flags converted camelCase including aliases.
    	*/
    var unnormalizedFlags: TypedFlags[Flags] & (Record[String, Any]) = js.native
  }
  
  type StringFlag = Flag[string, js.Array[String] | String, `false` | `true`]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Flag extends {  type :'number'} ? number : Flag extends {  type :'string'} ? string : Flag extends {  type :'boolean'} ? boolean : unknown
    }}}
    */
  type TypedFlag[Flag /* <: AnyFlag */] = Double
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ F in keyof Flags ]: Flags[F] extends {  isMultiple :true}? meow.meow.PossiblyOptionalFlag<Flags[F], std.Array<meow.meow.TypedFlag<Flags[F]>>> : meow.meow.PossiblyOptionalFlag<Flags[F], meow.meow.TypedFlag<Flags[F]>>}
    }}}
    */
  @js.native
  trait TypedFlags[Flags /* <: AnyFlags */] extends StObject
}
