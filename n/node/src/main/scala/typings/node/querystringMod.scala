package typings.node

import typings.node.NodeJS.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object querystringMod {
  
  @JSImport("querystring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* was `typeof parse` */
  @scala.inline
  def decode(str: java.lang.String): ParsedUrlQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any]).asInstanceOf[ParsedUrlQuery]
  @scala.inline
  def decode(str: java.lang.String, sep: java.lang.String): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  @scala.inline
  def decode(str: java.lang.String, sep: java.lang.String, eq: java.lang.String): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  @scala.inline
  def decode(str: java.lang.String, sep: java.lang.String, eq: java.lang.String, options: ParseOptions): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  @scala.inline
  def decode(str: java.lang.String, sep: java.lang.String, eq: Unit, options: ParseOptions): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  @scala.inline
  def decode(str: java.lang.String, sep: Unit, eq: java.lang.String): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  @scala.inline
  def decode(str: java.lang.String, sep: Unit, eq: java.lang.String, options: ParseOptions): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  @scala.inline
  def decode(str: java.lang.String, sep: Unit, eq: Unit, options: ParseOptions): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  
  /* was `typeof stringify` */
  @scala.inline
  def encode(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")().asInstanceOf[java.lang.String]
  @scala.inline
  def encode(obj: Unit, sep: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def encode(obj: Unit, sep: java.lang.String, eq: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def encode(obj: Unit, sep: java.lang.String, eq: java.lang.String, options: StringifyOptions): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def encode(obj: Unit, sep: java.lang.String, eq: Unit, options: StringifyOptions): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def encode(obj: Unit, sep: Unit, eq: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def encode(obj: Unit, sep: Unit, eq: java.lang.String, options: StringifyOptions): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def encode(obj: Unit, sep: Unit, eq: Unit, options: StringifyOptions): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def encode(obj: ParsedUrlQueryInput): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def encode(obj: ParsedUrlQueryInput, sep: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def encode(obj: ParsedUrlQueryInput, sep: java.lang.String, eq: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def encode(obj: ParsedUrlQueryInput, sep: java.lang.String, eq: java.lang.String, options: StringifyOptions): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def encode(obj: ParsedUrlQueryInput, sep: java.lang.String, eq: Unit, options: StringifyOptions): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def encode(obj: ParsedUrlQueryInput, sep: Unit, eq: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def encode(obj: ParsedUrlQueryInput, sep: Unit, eq: java.lang.String, options: StringifyOptions): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def encode(obj: ParsedUrlQueryInput, sep: Unit, eq: Unit, options: StringifyOptions): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def escape(str: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(str.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def parse(str: java.lang.String): ParsedUrlQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[ParsedUrlQuery]
  @scala.inline
  def parse(str: java.lang.String, sep: java.lang.String): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  @scala.inline
  def parse(str: java.lang.String, sep: java.lang.String, eq: java.lang.String): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  @scala.inline
  def parse(str: java.lang.String, sep: java.lang.String, eq: java.lang.String, options: ParseOptions): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  @scala.inline
  def parse(str: java.lang.String, sep: java.lang.String, eq: Unit, options: ParseOptions): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  @scala.inline
  def parse(str: java.lang.String, sep: Unit, eq: java.lang.String): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  @scala.inline
  def parse(str: java.lang.String, sep: Unit, eq: java.lang.String, options: ParseOptions): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  @scala.inline
  def parse(str: java.lang.String, sep: Unit, eq: Unit, options: ParseOptions): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  
  @scala.inline
  def stringify(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")().asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(obj: Unit, sep: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(obj: Unit, sep: java.lang.String, eq: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(obj: Unit, sep: java.lang.String, eq: java.lang.String, options: StringifyOptions): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(obj: Unit, sep: java.lang.String, eq: Unit, options: StringifyOptions): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(obj: Unit, sep: Unit, eq: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(obj: Unit, sep: Unit, eq: java.lang.String, options: StringifyOptions): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(obj: Unit, sep: Unit, eq: Unit, options: StringifyOptions): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(obj: ParsedUrlQueryInput): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(obj: ParsedUrlQueryInput, sep: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(obj: ParsedUrlQueryInput, sep: java.lang.String, eq: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(obj: ParsedUrlQueryInput, sep: java.lang.String, eq: java.lang.String, options: StringifyOptions): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(obj: ParsedUrlQueryInput, sep: java.lang.String, eq: Unit, options: StringifyOptions): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(obj: ParsedUrlQueryInput, sep: Unit, eq: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(obj: ParsedUrlQueryInput, sep: Unit, eq: java.lang.String, options: StringifyOptions): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(obj: ParsedUrlQueryInput, sep: Unit, eq: Unit, options: StringifyOptions): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def unescape(str: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescape")(str.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  trait ParseOptions extends StObject {
    
    var decodeURIComponent: js.UndefOr[js.Function1[/* str */ java.lang.String, java.lang.String]] = js.undefined
    
    var maxKeys: js.UndefOr[Double] = js.undefined
  }
  object ParseOptions {
    
    @scala.inline
    def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecodeURIComponent(value: /* str */ java.lang.String => java.lang.String): Self = StObject.set(x, "decodeURIComponent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDecodeURIComponentUndefined: Self = StObject.set(x, "decodeURIComponent", js.undefined)
      
      @scala.inline
      def setMaxKeys(value: Double): Self = StObject.set(x, "maxKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxKeysUndefined: Self = StObject.set(x, "maxKeys", js.undefined)
    }
  }
  
  type ParsedUrlQuery = Dict[java.lang.String | js.Array[java.lang.String]]
  
  type ParsedUrlQueryInput = Dict[
    java.lang.String | Double | Boolean | (js.Array[Boolean | Double | java.lang.String]) | Null
  ]
  
  trait StringifyOptions extends StObject {
    
    var encodeURIComponent: js.UndefOr[js.Function1[/* str */ java.lang.String, java.lang.String]] = js.undefined
  }
  object StringifyOptions {
    
    @scala.inline
    def apply(): StringifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StringifyOptions]
    }
    
    @scala.inline
    implicit class StringifyOptionsMutableBuilder[Self <: StringifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncodeURIComponent(value: /* str */ java.lang.String => java.lang.String): Self = StObject.set(x, "encodeURIComponent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncodeURIComponentUndefined: Self = StObject.set(x, "encodeURIComponent", js.undefined)
    }
  }
}
