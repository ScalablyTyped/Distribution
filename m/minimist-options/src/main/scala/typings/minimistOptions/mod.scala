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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("minimist-options", JSImport.Default)
  @js.native
  def default(): Opts = js.native
  @JSImport("minimist-options", JSImport.Default)
  @js.native
  def default(options: Options): Opts = js.native
  
  @js.native
  trait BaseOption[TypeOptionType /* <: OptionType */, DefaultOptionType] extends StObject {
    
    /**
    	 * The default value for the option.
    	 */
    val default: js.UndefOr[DefaultOptionType] = js.native
    
    /**
    	 * An alias/list of aliases for the option.
    	 */
    val alias: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
    	 * The data type the option should be parsed to.
    	 */
    val `type`: js.UndefOr[TypeOptionType] = js.native
  }
  object BaseOption {
    
    @scala.inline
    def apply[TypeOptionType /* <: OptionType */, DefaultOptionType](): BaseOption[TypeOptionType, DefaultOptionType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOption[TypeOptionType, DefaultOptionType]]
    }
    
    @scala.inline
    implicit class BaseOptionMutableBuilder[Self <: BaseOption[_, _], TypeOptionType /* <: OptionType */, DefaultOptionType] (val x: Self with (BaseOption[TypeOptionType, DefaultOptionType])) extends AnyVal {
      
      @scala.inline
      def setAlias(value: String | js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value :_*))
      
      @scala.inline
      def setDefault(value: DefaultOptionType): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setType(value: TypeOptionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
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
    
    @scala.inline
    def array: typings.minimistOptions.minimistOptionsStrings.array = "array".asInstanceOf[typings.minimistOptions.minimistOptionsStrings.array]
    
    @scala.inline
    def boolean: typings.minimistOptions.minimistOptionsStrings.boolean = "boolean".asInstanceOf[typings.minimistOptions.minimistOptionsStrings.boolean]
    
    @scala.inline
    def `boolean-array`: typings.minimistOptions.minimistOptionsStrings.`boolean-array` = "boolean-array".asInstanceOf[typings.minimistOptions.minimistOptionsStrings.`boolean-array`]
    
    @scala.inline
    def number: typings.minimistOptions.minimistOptionsStrings.number = "number".asInstanceOf[typings.minimistOptions.minimistOptionsStrings.number]
    
    @scala.inline
    def `number-array`: typings.minimistOptions.minimistOptionsStrings.`number-array` = "number-array".asInstanceOf[typings.minimistOptions.minimistOptionsStrings.`number-array`]
    
    @scala.inline
    def string: typings.minimistOptions.minimistOptionsStrings.string = "string".asInstanceOf[typings.minimistOptions.minimistOptionsStrings.string]
    
    @scala.inline
    def `string-array`: typings.minimistOptions.minimistOptionsStrings.`string-array` = "string-array".asInstanceOf[typings.minimistOptions.minimistOptionsStrings.`string-array`]
  }
  
  type Options = StringDictionary[
    OptionType | StringOption | BooleanOption | NumberOption | DefaultArrayOption | StringArrayOption | BooleanArrayOption | NumberArrayOption | MinimistOption
  ]
  
  type StringArrayOption = BaseOption[`string-array`, js.Array[String]]
  
  type StringOption = BaseOption[string, String]
}
