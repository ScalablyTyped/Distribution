package typings.minimistOptions

import org.scalablytyped.runtime.StringDictionary
import typings.minimist.mod.Opts
import typings.minimistOptions.minimistOptionsStrings.`boolean-array`
import typings.minimistOptions.minimistOptionsStrings.`number-array`
import typings.minimistOptions.minimistOptionsStrings.`string-array`
import typings.minimistOptions.minimistOptionsStrings.array
import typings.minimistOptions.minimistOptionsStrings.boolean
import typings.minimistOptions.minimistOptionsStrings.number
import typings.minimistOptions.minimistOptionsStrings.string
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("minimist-options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Opts = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Opts]
  inline def default(options: Options): Opts = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Opts]
  
  trait BaseOption[TypeOptionType /* <: OptionType */, DefaultOptionType] extends StObject {
    
    /**
    	 * The default value for the option.
    	 */
    val default: js.UndefOr[DefaultOptionType] = js.undefined
    
    /**
    	 * An alias/list of aliases for the option.
    	 */
    val alias: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
    	 * The data type the option should be parsed to.
    	 */
    val `type`: js.UndefOr[TypeOptionType] = js.undefined
  }
  object BaseOption {
    
    inline def apply[TypeOptionType /* <: OptionType */, DefaultOptionType](): BaseOption[TypeOptionType, DefaultOptionType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOption[TypeOptionType, DefaultOptionType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseOption[?, ?], TypeOptionType /* <: OptionType */, DefaultOptionType] (val x: Self & (BaseOption[TypeOptionType, DefaultOptionType])) extends AnyVal {
      
      inline def setAlias(value: String | js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value*))
      
      inline def setDefault(value: DefaultOptionType): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setType(value: TypeOptionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type BooleanArrayOption = BaseOption[`boolean-array`, js.Array[Boolean]]
  
  type BooleanOption = BaseOption[boolean, Boolean]
  
  type DefaultArrayOption = BaseOption[array, js.Array[String]]
  
  type MinimistOption = NonNullable[js.UndefOr[Boolean | (js.Function1[/* arg */ String, Boolean])]]
  
  type NumberArrayOption = BaseOption[`number-array`, js.Array[Double]]
  
  type NumberOption = BaseOption[number, Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.minimistOptions.minimistOptionsStrings.string
    - typings.minimistOptions.minimistOptionsStrings.boolean
    - typings.minimistOptions.minimistOptionsStrings.number
    - typings.minimistOptions.minimistOptionsStrings.array
    - typings.minimistOptions.minimistOptionsStrings.`string-array`
    - typings.minimistOptions.minimistOptionsStrings.`boolean-array`
    - typings.minimistOptions.minimistOptionsStrings.`number-array`
  */
  trait OptionType extends StObject
  object OptionType {
    
    inline def array: typings.minimistOptions.minimistOptionsStrings.array = "array".asInstanceOf[typings.minimistOptions.minimistOptionsStrings.array]
    
    inline def boolean: typings.minimistOptions.minimistOptionsStrings.boolean = "boolean".asInstanceOf[typings.minimistOptions.minimistOptionsStrings.boolean]
    
    inline def `boolean-array`: typings.minimistOptions.minimistOptionsStrings.`boolean-array` = "boolean-array".asInstanceOf[typings.minimistOptions.minimistOptionsStrings.`boolean-array`]
    
    inline def number: typings.minimistOptions.minimistOptionsStrings.number = "number".asInstanceOf[typings.minimistOptions.minimistOptionsStrings.number]
    
    inline def `number-array`: typings.minimistOptions.minimistOptionsStrings.`number-array` = "number-array".asInstanceOf[typings.minimistOptions.minimistOptionsStrings.`number-array`]
    
    inline def string: typings.minimistOptions.minimistOptionsStrings.string = "string".asInstanceOf[typings.minimistOptions.minimistOptionsStrings.string]
    
    inline def `string-array`: typings.minimistOptions.minimistOptionsStrings.`string-array` = "string-array".asInstanceOf[typings.minimistOptions.minimistOptionsStrings.`string-array`]
  }
  
  type Options = StringDictionary[
    OptionType | StringOption | BooleanOption | NumberOption | DefaultArrayOption | StringArrayOption | BooleanArrayOption | NumberArrayOption | MinimistOption
  ]
  
  type StringArrayOption = BaseOption[`string-array`, js.Array[String]]
  
  type StringOption = BaseOption[string, String]
}
