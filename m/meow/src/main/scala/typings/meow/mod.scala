package typings.meow

import typings.meow.meowBooleans.`false`
import typings.meow.meowBooleans.`true`
import typings.meow.meowStrings.boolean
import typings.meow.meowStrings.number
import typings.meow.meowStrings.string
import typings.std.ImportMeta
import typings.std.Record
import typings.typeFest.anon.PreserveConsecutiveUppercase
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
  inline def default[Flags /* <: AnyFlags */](helpMessage: String): Result[Flags] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(helpMessage.asInstanceOf[js.Any]).asInstanceOf[Result[Flags]]
  inline def default[Flags /* <: AnyFlags */](helpMessage: String, options: Options[Flags]): Result[Flags] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(helpMessage.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Result[Flags]]
  inline def default[Flags /* <: AnyFlags */](options: Options[Flags]): Result[Flags] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Result[Flags]]
  
  type AnyFlag = StringFlag | BooleanFlag | NumberFlag
  
  type AnyFlags = Record[String, AnyFlag]
  
  type BooleanFlag = Flag[boolean, js.Array[Boolean] | Boolean, `false` | `true`]
  
  trait Flag[PrimitiveType /* <: FlagType */, Type, IsMultiple] extends StObject {
    
    /**
    	Default value when the flag is not specified.
    	@example
    	```
    	unicorn: {
    		type: 'boolean',
    		default: true
    	}
    	```
    	*/
    val default: js.UndefOr[Type] = js.undefined
    
    /**
    	Other names for the flag.
    	@example
    	```
    	unicorn: {
    		aliases: ['unicorns', 'uni']
    	}
    	```
    	*/
    val aliases: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
    	Limit valid values to a predefined set of choices.
    	@example
    	```
    	unicorn: {
    		isMultiple: true,
    		choices: ['rainbow', 'cat', 'unicorn']
    	}
    	```
    	*/
    val choices: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: Type extends std.Array<unknown> ? Type : std.Array<Type> */ js.Any
      ] = js.undefined
    
    /**
    	Indicates a flag can be set multiple times. Values are turned into an array.
    	Multiple values are provided by specifying the flag multiple times, for example, `$ foo -u rainbow -u cat`. Space- or comma-separated values [currently *not* supported](https://github.com/sindresorhus/meow/issues/164).
    	@default false
    	*/
    val isMultiple: js.UndefOr[IsMultiple] = js.undefined
    
    /**
    	Determine if the flag is required.
    	If it's only known at runtime whether the flag is required or not you can pass a Function instead of a boolean, which based on the given flags and other non-flag arguments should decide if the flag is required.
    	- The first argument is the **flags** object, which contains the flags converted to camel-case excluding aliases.
    	- The second argument is the **input** string array, which contains the non-flag arguments.
    	- The function should return a `boolean`, true if the flag is required, otherwise false.
    	@default false
    	@example
    	```
    	isRequired: (flags, input) => {
    		if (flags.otherFlag) {
    			return true;
    		}
    		return false;
    	}
    	```
    	*/
    val isRequired: js.UndefOr[Boolean | IsRequiredPredicate] = js.undefined
    
    /**
    	A short flag alias.
    	@example
    	```
    	unicorn: {
    		shortFlag: 'u'
    	}
    	```
    	*/
    val shortFlag: js.UndefOr[String] = js.undefined
    
    /**
    	Type of value. (Possible values: `string` `boolean` `number`)
    	*/
    val `type`: js.UndefOr[PrimitiveType] = js.undefined
  }
  object Flag {
    
    inline def apply[PrimitiveType /* <: FlagType */, Type, IsMultiple](): Flag[PrimitiveType, Type, IsMultiple] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Flag[PrimitiveType, Type, IsMultiple]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Flag[?, ?, ?], PrimitiveType /* <: FlagType */, Type, IsMultiple] (val x: Self & (Flag[PrimitiveType, Type, IsMultiple])) extends AnyVal {
      
      inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
      
      inline def setChoices(
        value: /* import warning: importer.ImportType#apply Failed type conversion: Type extends std.Array<unknown> ? Type : std.Array<Type> */ js.Any
      ): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      inline def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
      
      inline def setDefault(value: Type): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setIsMultiple(value: IsMultiple): Self = StObject.set(x, "isMultiple", value.asInstanceOf[js.Any])
      
      inline def setIsMultipleUndefined: Self = StObject.set(x, "isMultiple", js.undefined)
      
      inline def setIsRequired(value: Boolean | IsRequiredPredicate): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
      
      inline def setIsRequiredFunction2(value: (/* flags */ AnyFlags, /* input */ js.Array[String]) => Boolean): Self = StObject.set(x, "isRequired", js.Any.fromFunction2(value))
      
      inline def setIsRequiredUndefined: Self = StObject.set(x, "isRequired", js.undefined)
      
      inline def setShortFlag(value: String): Self = StObject.set(x, "shortFlag", value.asInstanceOf[js.Any])
      
      inline def setShortFlagUndefined: Self = StObject.set(x, "shortFlag", js.undefined)
      
      inline def setType(value: PrimitiveType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
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
    				shortFlag: 'r'
    			},
    				unicorn: {
    				type: 'boolean',
    				default: false,
    				shortFlag: 'u'
    			},
    			cake: {
    				type: 'boolean',
    				shortFlag: 'c'
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
    	- `choices`: Limit valid values to a predefined set of choices.
    	- `default`: Default value when the flag is not specified.
    	- `shortFlag`: A short flag alias.
    	- `aliases`: Other names for the flag.
    	- `isMultiple`: Indicates a flag can be set multiple times. Values are turned into an array. (Default: false)
    		- Multiple values are provided by specifying the flag multiple times, for example, `$ foo -u rainbow -u cat`. Space- or comma-separated values [currently *not* supported](https://github.com/sindresorhus/meow/issues/164).
    	- `isRequired`: Determine if the flag is required. (Default: false)
    		- If it's only known at runtime whether the flag is required or not, you can pass a `Function` instead of a `boolean`, which based on the given flags and other non-flag arguments, should decide if the flag is required. Two arguments are passed to the function:
    		- The first argument is the **flags** object, which contains the flags converted to camel-case excluding aliases.
    		- The second argument is the **input** string array, which contains the non-flag arguments.
    		- The function should return a `boolean`, true if the flag is required, otherwise false.
    	Note that flags are always defined using a camel-case key (`myKey`), but will match arguments in kebab-case (`--my-key`).
    	@example
    	```
    	flags: {
    		unicorn: {
    			type: 'string',
    			choices: ['rainbow', 'cat', 'unicorn'],
    			default: ['rainbow', 'cat'],
    			shortFlag: 'u',
    			aliases: ['unicorns']
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
    	Note: Setting this stops `meow` from finding a package.json.
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], Flags /* <: AnyFlags */] (val x: Self & Options[Flags]) extends AnyVal {
      
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
    var flags: (CamelCasedProperties[TypedFlags[Flags], PreserveConsecutiveUppercase]) & (Record[String, Any]) = js.native
    
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
