package typings.node

import typings.node.NodeJS.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object querystringMod {
  
  @JSImport("querystring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The `querystring.parse()` method parses a URL query string (`str`) into a
    * collection of key and value pairs.
    *
    * For example, the query string `'foo=bar&#x26;abc=xyz&#x26;abc=123'` is parsed into:
    *
    * ```js
    * {
    *   foo: 'bar',
    *   abc: ['xyz', '123']
    * }
    * ```
    *
    * The object returned by the `querystring.parse()` method _does not_prototypically inherit from the JavaScript `Object`. This means that typical`Object` methods such as `obj.toString()`,
    * `obj.hasOwnProperty()`, and others
    * are not defined and _will not work_.
    *
    * By default, percent-encoded characters within the query string will be assumed
    * to use UTF-8 encoding. If an alternative character encoding is used, then an
    * alternative `decodeURIComponent` option will need to be specified:
    *
    * ```js
    * // Assuming gbkDecodeURIComponent function already exists...
    *
    * querystring.parse('w=%D6%D0%CE%C4&#x26;foo=bar', null, null,
    *                   { decodeURIComponent: gbkDecodeURIComponent });
    * ```
    * @since v0.1.25
    * @param str The URL query string to parse
    * @param [sep='&'] The substring used to delimit key and value pairs in the query string.
    * @param [eq='='] . The substring used to delimit keys and values in the query string.
    */
  /* was `typeof parse` */
  inline def decode(str: String): ParsedUrlQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any]).asInstanceOf[ParsedUrlQuery]
  inline def decode(str: String, sep: String): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  inline def decode(str: String, sep: String, eq: String): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  inline def decode(str: String, sep: String, eq: String, options: ParseOptions): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  inline def decode(str: String, sep: String, eq: Unit, options: ParseOptions): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  inline def decode(str: String, sep: Unit, eq: String): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  inline def decode(str: String, sep: Unit, eq: String, options: ParseOptions): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  inline def decode(str: String, sep: Unit, eq: Unit, options: ParseOptions): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  
  /**
    * The `querystring.stringify()` method produces a URL query string from a
    * given `obj` by iterating through the object's "own properties".
    *
    * It serializes the following types of values passed in `obj`:[string](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures#String_type) |
    * [number](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures#Number_type) |
    * [bigint](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/BigInt) |
    * [boolean](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures#Boolean_type) |
    * [string\[\]](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures#String_type) |
    * [number\[\]](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures#Number_type) |
    * [bigint\[\]](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/BigInt) |
    * [boolean\[\]](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures#Boolean_type) The numeric values must be finite. Any other input values will be coerced to
    * empty strings.
    *
    * ```js
    * querystring.stringify({ foo: 'bar', baz: ['qux', 'quux'], corge: '' });
    * // Returns 'foo=bar&#x26;baz=qux&#x26;baz=quux&#x26;corge='
    *
    * querystring.stringify({ foo: 'bar', baz: 'qux' }, ';', ':');
    * // Returns 'foo:bar;baz:qux'
    * ```
    *
    * By default, characters requiring percent-encoding within the query string will
    * be encoded as UTF-8\. If an alternative encoding is required, then an alternative`encodeURIComponent` option will need to be specified:
    *
    * ```js
    * // Assuming gbkEncodeURIComponent function already exists,
    *
    * querystring.stringify({ w: '中文', foo: 'bar' }, null, null,
    *                       { encodeURIComponent: gbkEncodeURIComponent });
    * ```
    * @since v0.1.25
    * @param obj The object to serialize into a URL query string
    * @param [sep='&'] The substring used to delimit key and value pairs in the query string.
    * @param [eq='='] . The substring used to delimit keys and values in the query string.
    */
  /* was `typeof stringify` */
  inline def encode(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")().asInstanceOf[String]
  inline def encode(obj: Unit, sep: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(obj: Unit, sep: String, eq: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(obj: Unit, sep: String, eq: String, options: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(obj: Unit, sep: String, eq: Unit, options: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(obj: Unit, sep: Unit, eq: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(obj: Unit, sep: Unit, eq: String, options: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(obj: Unit, sep: Unit, eq: Unit, options: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(obj: ParsedUrlQueryInput): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(obj: ParsedUrlQueryInput, sep: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(obj: ParsedUrlQueryInput, sep: String, eq: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(obj: ParsedUrlQueryInput, sep: String, eq: String, options: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(obj: ParsedUrlQueryInput, sep: String, eq: Unit, options: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(obj: ParsedUrlQueryInput, sep: Unit, eq: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(obj: ParsedUrlQueryInput, sep: Unit, eq: String, options: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(obj: ParsedUrlQueryInput, sep: Unit, eq: Unit, options: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * The `querystring.escape()` method performs URL percent-encoding on the given`str` in a manner that is optimized for the specific requirements of URL
    * query strings.
    *
    * The `querystring.escape()` method is used by `querystring.stringify()` and is
    * generally not expected to be used directly. It is exported primarily to allow
    * application code to provide a replacement percent-encoding implementation if
    * necessary by assigning `querystring.escape` to an alternative function.
    * @since v0.1.25
    */
  inline def escape(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * The `querystring.parse()` method parses a URL query string (`str`) into a
    * collection of key and value pairs.
    *
    * For example, the query string `'foo=bar&#x26;abc=xyz&#x26;abc=123'` is parsed into:
    *
    * ```js
    * {
    *   foo: 'bar',
    *   abc: ['xyz', '123']
    * }
    * ```
    *
    * The object returned by the `querystring.parse()` method _does not_prototypically inherit from the JavaScript `Object`. This means that typical`Object` methods such as `obj.toString()`,
    * `obj.hasOwnProperty()`, and others
    * are not defined and _will not work_.
    *
    * By default, percent-encoded characters within the query string will be assumed
    * to use UTF-8 encoding. If an alternative character encoding is used, then an
    * alternative `decodeURIComponent` option will need to be specified:
    *
    * ```js
    * // Assuming gbkDecodeURIComponent function already exists...
    *
    * querystring.parse('w=%D6%D0%CE%C4&#x26;foo=bar', null, null,
    *                   { decodeURIComponent: gbkDecodeURIComponent });
    * ```
    * @since v0.1.25
    * @param str The URL query string to parse
    * @param [sep='&'] The substring used to delimit key and value pairs in the query string.
    * @param [eq='='] . The substring used to delimit keys and values in the query string.
    */
  inline def parse(str: String): ParsedUrlQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[ParsedUrlQuery]
  inline def parse(str: String, sep: String): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  inline def parse(str: String, sep: String, eq: String): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  inline def parse(str: String, sep: String, eq: String, options: ParseOptions): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  inline def parse(str: String, sep: String, eq: Unit, options: ParseOptions): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  inline def parse(str: String, sep: Unit, eq: String): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  inline def parse(str: String, sep: Unit, eq: String, options: ParseOptions): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  inline def parse(str: String, sep: Unit, eq: Unit, options: ParseOptions): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  
  /**
    * The `querystring.stringify()` method produces a URL query string from a
    * given `obj` by iterating through the object's "own properties".
    *
    * It serializes the following types of values passed in `obj`:[string](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures#String_type) |
    * [number](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures#Number_type) |
    * [bigint](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/BigInt) |
    * [boolean](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures#Boolean_type) |
    * [string\[\]](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures#String_type) |
    * [number\[\]](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures#Number_type) |
    * [bigint\[\]](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/BigInt) |
    * [boolean\[\]](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures#Boolean_type) The numeric values must be finite. Any other input values will be coerced to
    * empty strings.
    *
    * ```js
    * querystring.stringify({ foo: 'bar', baz: ['qux', 'quux'], corge: '' });
    * // Returns 'foo=bar&#x26;baz=qux&#x26;baz=quux&#x26;corge='
    *
    * querystring.stringify({ foo: 'bar', baz: 'qux' }, ';', ':');
    * // Returns 'foo:bar;baz:qux'
    * ```
    *
    * By default, characters requiring percent-encoding within the query string will
    * be encoded as UTF-8\. If an alternative encoding is required, then an alternative`encodeURIComponent` option will need to be specified:
    *
    * ```js
    * // Assuming gbkEncodeURIComponent function already exists,
    *
    * querystring.stringify({ w: '中文', foo: 'bar' }, null, null,
    *                       { encodeURIComponent: gbkEncodeURIComponent });
    * ```
    * @since v0.1.25
    * @param obj The object to serialize into a URL query string
    * @param [sep='&'] The substring used to delimit key and value pairs in the query string.
    * @param [eq='='] . The substring used to delimit keys and values in the query string.
    */
  inline def stringify(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")().asInstanceOf[String]
  inline def stringify(obj: Unit, sep: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(obj: Unit, sep: String, eq: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(obj: Unit, sep: String, eq: String, options: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(obj: Unit, sep: String, eq: Unit, options: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(obj: Unit, sep: Unit, eq: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(obj: Unit, sep: Unit, eq: String, options: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(obj: Unit, sep: Unit, eq: Unit, options: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(obj: ParsedUrlQueryInput): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(obj: ParsedUrlQueryInput, sep: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(obj: ParsedUrlQueryInput, sep: String, eq: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(obj: ParsedUrlQueryInput, sep: String, eq: String, options: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(obj: ParsedUrlQueryInput, sep: String, eq: Unit, options: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(obj: ParsedUrlQueryInput, sep: Unit, eq: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(obj: ParsedUrlQueryInput, sep: Unit, eq: String, options: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(obj: ParsedUrlQueryInput, sep: Unit, eq: Unit, options: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * The `querystring.unescape()` method performs decoding of URL percent-encoded
    * characters on the given `str`.
    *
    * The `querystring.unescape()` method is used by `querystring.parse()` and is
    * generally not expected to be used directly. It is exported primarily to allow
    * application code to provide a replacement decoding implementation if
    * necessary by assigning `querystring.unescape` to an alternative function.
    *
    * By default, the `querystring.unescape()` method will attempt to use the
    * JavaScript built-in `decodeURIComponent()` method to decode. If that fails,
    * a safer equivalent that does not throw on malformed URLs will be used.
    * @since v0.1.25
    */
  inline def unescape(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescape")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait ParseOptions extends StObject {
    
    var decodeURIComponent: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
    
    var maxKeys: js.UndefOr[Double] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      inline def setDecodeURIComponent(value: /* str */ String => String): Self = StObject.set(x, "decodeURIComponent", js.Any.fromFunction1(value))
      
      inline def setDecodeURIComponentUndefined: Self = StObject.set(x, "decodeURIComponent", js.undefined)
      
      inline def setMaxKeys(value: Double): Self = StObject.set(x, "maxKeys", value.asInstanceOf[js.Any])
      
      inline def setMaxKeysUndefined: Self = StObject.set(x, "maxKeys", js.undefined)
    }
  }
  
  type ParsedUrlQuery = Dict[String | js.Array[String]]
  
  type ParsedUrlQueryInput = Dict[String | Double | Boolean | (js.Array[Boolean | Double | String]) | Null]
  
  trait StringifyOptions extends StObject {
    
    var encodeURIComponent: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
  }
  object StringifyOptions {
    
    inline def apply(): StringifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StringifyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StringifyOptions] (val x: Self) extends AnyVal {
      
      inline def setEncodeURIComponent(value: /* str */ String => String): Self = StObject.set(x, "encodeURIComponent", js.Any.fromFunction1(value))
      
      inline def setEncodeURIComponentUndefined: Self = StObject.set(x, "encodeURIComponent", js.undefined)
    }
  }
}
