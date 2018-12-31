package typings
package micromatchLib.micromatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Micromatch extends js.Object {
  /**
    * The main function takes a list of strings and one or more glob patterns to use for matching.
    *
    * @param list A list of strings to match
    * @param patterns One or more glob patterns to use for matching.
    * @param options See available options for changing how matches are performed
    * @returns Returns an array of matches
    *
    * @example
    * ```js
    * var mm = require('micromatch');
    * mm(list, patterns[, options]);
    *
    * console.log(mm(['a.js', 'a.txt'], ['*.js']));
    * //=> [ 'a.js' ]
    * ```
    */
  def apply(list: js.Array[java.lang.String], patterns: java.lang.String): js.Array[java.lang.String] = js.native
  def apply(
    list: js.Array[java.lang.String],
    patterns: java.lang.String,
    options: micromatchLib.micromatchMod.micromatchNs.Options
  ): js.Array[java.lang.String] = js.native
  def apply(list: js.Array[java.lang.String], patterns: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def apply(
    list: js.Array[java.lang.String],
    patterns: js.Array[java.lang.String],
    options: micromatchLib.micromatchMod.micromatchNs.Options
  ): js.Array[java.lang.String] = js.native
  /**
    * Returns true if **all** of the given `patterns` match the specified string.
    *
    * @param str The string to test.
    * @param patterns One or more glob patterns to use for matching.
    * @param options See available options for changing how matches are performed
    * @returns Returns true if any patterns match `str`
    *
    * @example
    * ```js
    * var mm = require('micromatch');
    * mm.all(string, patterns[, options]);
    *
    * console.log(mm.all('foo.js', ['foo.js']));
    * // true
    *
    * console.log(mm.all('foo.js', ['*.js', '!foo.js']));
    * // false
    *
    * console.log(mm.all('foo.js', ['*.js', 'foo.js']));
    * // true
    *
    * console.log(mm.all('foo.js', ['*.js', 'f*', '*o*', '*o.js']));
    * // true
    * ```
    */
  def all(str: java.lang.String, patterns: java.lang.String): scala.Boolean = js.native
  def all(
    str: java.lang.String,
    patterns: java.lang.String,
    options: micromatchLib.micromatchMod.micromatchNs.Options
  ): scala.Boolean = js.native
  def all(str: java.lang.String, patterns: js.Array[java.lang.String]): scala.Boolean = js.native
  def all(
    str: java.lang.String,
    patterns: js.Array[java.lang.String],
    options: micromatchLib.micromatchMod.micromatchNs.Options
  ): scala.Boolean = js.native
  def all(str: js.Array[java.lang.String], patterns: java.lang.String): scala.Boolean = js.native
  def all(
    str: js.Array[java.lang.String],
    patterns: java.lang.String,
    options: micromatchLib.micromatchMod.micromatchNs.Options
  ): scala.Boolean = js.native
  def all(str: js.Array[java.lang.String], patterns: js.Array[java.lang.String]): scala.Boolean = js.native
  def all(
    str: js.Array[java.lang.String],
    patterns: js.Array[java.lang.String],
    options: micromatchLib.micromatchMod.micromatchNs.Options
  ): scala.Boolean = js.native
  /**
    * Returns true if **any** of the given glob `patterns` match the specified `string`.
    *
    * @param str The string to test.
    * @param patterns One or more glob patterns to use for matching.
    * @param options See available options for changing how matches are performed
    * @returns Returns true if any patterns match `str`
    *
    * @example
    * ```js
    * var mm = require('micromatch');
    * mm.any(string, patterns[, options]);
    *
    * console.log(mm.any('a.a', ['b.*', '*.a']));
    * //=> true
    * console.log(mm.any('a.a', 'b.*'));
    * //=> false
    * ```
    */
  def any(str: java.lang.String, patterns: java.lang.String): scala.Boolean = js.native
  def any(
    str: java.lang.String,
    patterns: java.lang.String,
    options: micromatchLib.micromatchMod.micromatchNs.Options
  ): scala.Boolean = js.native
  def any(str: java.lang.String, patterns: js.Array[java.lang.String]): scala.Boolean = js.native
  def any(
    str: java.lang.String,
    patterns: js.Array[java.lang.String],
    options: micromatchLib.micromatchMod.micromatchNs.Options
  ): scala.Boolean = js.native
  def any(str: js.Array[java.lang.String], patterns: java.lang.String): scala.Boolean = js.native
  def any(
    str: js.Array[java.lang.String],
    patterns: java.lang.String,
    options: micromatchLib.micromatchMod.micromatchNs.Options
  ): scala.Boolean = js.native
  def any(str: js.Array[java.lang.String], patterns: js.Array[java.lang.String]): scala.Boolean = js.native
  def any(
    str: js.Array[java.lang.String],
    patterns: js.Array[java.lang.String],
    options: micromatchLib.micromatchMod.micromatchNs.Options
  ): scala.Boolean = js.native
  /**
    * Expand the given brace `pattern`.
    *
    * @param pattern String with brace pattern to expand.
    * @param options Any options to change how expansion is performed. See the [braces](https://github.com/micromatch/braces) library for all available options.
    *
    * @example
    * ```js
    * var mm = require('micromatch');
    * console.log(mm.braces('foo/{a,b}/bar'));
    * //=> ['foo/(a|b)/bar']
    *
    * console.log(mm.braces('foo/{a,b}/bar', {expand: true}));
    * //=> ['foo/(a|b)/bar']
    * ```
    */
  def braces(pattern: java.lang.String): js.Array[java.lang.String] = js.native
  def braces(pattern: java.lang.String, options: bracesLib.bracesMod.bracesNs.Options): js.Array[java.lang.String] = js.native
  /**
    * Returns an array of matches captured by `pattern` in `string, or`null` if the pattern did not match.
    *
    * @param pattern Glob pattern to use for matching.
    * @param string String to match
    * @param options See available options for changing how matches are performed
    * @returns Returns an array of captures if the string matches the glob pattern, otherwise `null`.
    *
    * @example
    * ```js
    * var mm = require('micromatch');
    * mm.capture(pattern, string[, options]);
    *
    * console.log(mm.capture('test/ *.js', 'test/foo.js'));
    * //=> ['foo']
    * console.log(mm.capture('test/ *.js', 'foo/bar.css'));
    * //=> null
    * ```
    */
  def capture(pattern: java.lang.String, string: java.lang.String): js.Array[java.lang.String] | scala.Null = js.native
  def capture(
    pattern: java.lang.String,
    string: java.lang.String,
    options: micromatchLib.micromatchMod.micromatchNs.Options
  ): js.Array[java.lang.String] | scala.Null = js.native
  /**
    * Clear the regex cache.
    *
    * @example
    * ```js
    * mm.clearCache();
    * ```
    */
  def clearCache(): scala.Unit = js.native
  def compile(ast: java.lang.String): js.Object = js.native
  def compile(ast: java.lang.String, options: micromatchLib.micromatchMod.micromatchNs.Options): js.Object = js.native
  /**
    * Compile the given `ast` or string with the given `options`.
    *
    * @returns Returns an object that has an `output` property with the compiled string.
    *
    * @example
    * ```js
    * var mm = require('micromatch');
    * mm.compile(ast[, options]);
    *
    * var ast = mm.parse('a/{b,c}/d');
    * console.log(mm.compile(ast));
    * // { options: { source: 'string' },
    * //   state: {},
    * //   compilers:
    * //    { eos: [Function],
    * //      noop: [Function],
    * //      bos: [Function],
    * //      brace: [Function],
    * //      'brace.open': [Function],
    * //      text: [Function],
    * //      'brace.close': [Function] },
    * //   output: [ 'a/(b|c)/d' ],
    * //   ast:
    * //    { ... },
    * //   parsingErrors: [] }
    * ```
    */
  def compile(ast: js.Object): js.Object = js.native
  def compile(ast: js.Object, options: micromatchLib.micromatchMod.micromatchNs.Options): js.Object = js.native
  /**
    * Returns true if the given `string` contains the given pattern. Similar to [.isMatch](#isMatch) but the pattern can match any part of the string.
    *
    * @param str The string to match.
    * @param patterns Glob pattern to use for matching.
    * @param options See available options for changing how matches are performed
    * @returns Returns true if the patter matches any part of `str`.
    *
    * @example
    * ```js
    * var mm = require('micromatch');
    * mm.contains(string, pattern[, options]);
    *
    * console.log(mm.contains('aa/bb/cc', '*b'));
    * //=> true
    * console.log(mm.contains('aa/bb/cc', '*d'));
    * //=> false
    * ```
    */
  def contains(str: java.lang.String, patterns: java.lang.String): scala.Boolean = js.native
  def contains(
    str: java.lang.String,
    patterns: java.lang.String,
    options: micromatchLib.micromatchMod.micromatchNs.Options
  ): scala.Boolean = js.native
  def contains(str: java.lang.String, patterns: js.Array[java.lang.String]): scala.Boolean = js.native
  def contains(
    str: java.lang.String,
    patterns: js.Array[java.lang.String],
    options: micromatchLib.micromatchMod.micromatchNs.Options
  ): scala.Boolean = js.native
  /**
    * Parses the given glob `pattern` and returns an array of abstract syntax trees (ASTs), with the compiled `output` and optional source `map` on each AST.
    *
    * @param pattern Glob pattern to parse and compile.
    * @param options Any options to change how parsing and compiling is performed.
    * @returns Returns an object with the parsed AST, compiled string and optional source map.
    *
    * @example
    * ```js
    * var mm = require('micromatch');
    * mm.create(pattern[, options]);
    *
    * console.log(mm.create('abc/ *.js'));
    * // [{ options: { source: 'string', sourcemap: true },
    * //   state: {},
    * //   compilers:
    * //    { ... },
    * //   output: '(\\.[\\\\\\/])?abc\\/(?!\\.)(?=.)[^\\/]*?\\.js',
    * //   ast:
    * //    { type: 'root',
    * //      errors: [],
    * //      nodes:
    * //       [ ... ],
    * //      dot: false,
    * //      input: 'abc/ *.js' },
    * //   parsingErrors: [],
    * //   map:
    * //    { version: 3,
    * //      sources: [ 'string' ],
    * //      names: [],
    * //      mappings: 'AAAA,GAAG,EAAC,kBAAC,EAAC,EAAE',
    * //      sourcesContent: [ 'abc/ *.js' ] },
    * //   position: { line: 1, column: 28 },
    * //   content: {},
    * //   files: {},
    * //   idx: 6 }]
    * ```
    */
  def create(pattern: java.lang.String): js.Object = js.native
  def create(pattern: java.lang.String, options: micromatchLib.micromatchMod.micromatchNs.Options): js.Object = js.native
  /**
    * Returns true if every string in the given `list` matches any of the given glob `patterns`.
    *
    * @param list The string or array of strings to test.
    * @param patterns One or more glob patterns to use for matching.
    * @param options See available options for changing how matches are performed
    * @returns Returns true if any patterns match `str`
    *
    * @example
    * ```js
    * var mm = require('micromatch');
    * mm.every(list, patterns[, options]);
    *
    * console.log(mm.every('foo.js', ['foo.js']));
    * // true
    * console.log(mm.every(['foo.js', 'bar.js'], ['*.js']));
    * // true
    * console.log(mm.every(['foo.js', 'bar.js'], ['*.js', '!foo.js']));
    * // false
    * console.log(mm.every(['foo.js'], ['*.js', '!foo.js']));
    * // false
    * ```
    */
  def every(list: java.lang.String, patterns: java.lang.String): scala.Boolean = js.native
  def every(
    list: java.lang.String,
    patterns: java.lang.String,
    options: micromatchLib.micromatchMod.micromatchNs.Options
  ): scala.Boolean = js.native
  def every(list: java.lang.String, patterns: js.Array[java.lang.String]): scala.Boolean = js.native
  def every(
    list: java.lang.String,
    patterns: js.Array[java.lang.String],
    options: micromatchLib.micromatchMod.micromatchNs.Options
  ): scala.Boolean = js.native
  def every(list: js.Array[java.lang.String], patterns: java.lang.String): scala.Boolean = js.native
  def every(
    list: js.Array[java.lang.String],
    patterns: java.lang.String,
    options: micromatchLib.micromatchMod.micromatchNs.Options
  ): scala.Boolean = js.native
  def every(list: js.Array[java.lang.String], patterns: js.Array[java.lang.String]): scala.Boolean = js.native
  def every(
    list: js.Array[java.lang.String],
    patterns: js.Array[java.lang.String],
    options: micromatchLib.micromatchMod.micromatchNs.Options
  ): scala.Boolean = js.native
  /**
    * Returns true if the specified `string` matches the given glob `pattern`.
    *
    * @param string String to match
    * @param pattern Glob pattern to use for matching.
    * @param options See available options for changing how matches are performed
    * @returns Returns true if the string matches the glob pattern.
    *
    * @example
    * ```js
    * var mm = require('micromatch');
    * mm.isMatch(string, pattern[, options]);
    *
    * console.log(mm.isMatch('a.a', '*.a'));
    * //=> true
    * console.log(mm.isMatch('a.b', '*.a'));
    * //=> false
    * ```
    */
  def isMatch(string: java.lang.String, pattern: java.lang.String): scala.Boolean = js.native
  def isMatch(
    string: java.lang.String,
    pattern: java.lang.String,
    options: micromatchLib.micromatchMod.micromatchNs.Options
  ): scala.Boolean = js.native
  /**
    * Create a regular expression from the given glob `pattern`.
    *
    * @param pattern A glob pattern to convert to regex.
    * @param options See available options for changing how matches are performed.
    * @returns Returns a regex created from the given pattern.
    *
    * @example
    * ```js
    * var mm = require('micromatch');
    * mm.makeRe(pattern[, options]);
    *
    * console.log(mm.makeRe('*.js'));
    * //=> /^(?:(\.[\\\/])?(?!\.)(?=.)[^\/]*?\.js)$/
    * ```
    */
  def makeRe(pattern: java.lang.String): stdLib.RegExp = js.native
  def makeRe(pattern: java.lang.String, options: micromatchLib.micromatchMod.micromatchNs.Options): stdLib.RegExp = js.native
  /**
    * Similar to the main function, but `pattern` must be a string.
    *
    * @param list Array of strings to match
    * @param pattern Glob pattern to use for matching.
    * @param options See available options for changing how matches are performed
    * @returns Returns an array of matches
    *
    * @example
    * ```js
    * var mm = require('micromatch');
    * mm.match(list, pattern[, options]);
    *
    * console.log(mm.match(['a.a', 'a.aa', 'a.b', 'a.c'], '*.a'));
    * //=> ['a.a', 'a.aa']
    * ```
    */
  def `match`(list: js.Array[java.lang.String], pattern: java.lang.String): js.Array[java.lang.String] = js.native
  def `match`(
    list: js.Array[java.lang.String],
    pattern: java.lang.String,
    options: micromatchLib.micromatchMod.micromatchNs.Options
  ): js.Array[java.lang.String] = js.native
  /**
    * Filter the keys of the given object with the given `glob` pattern and `options`. Does not attempt to match nested keys.
    * If you need this feature, use [glob-object](https://github.com/jonschlinkert/glob-object) instead.
    *
    * @param object The object with keys to filter.
    * @param patterns One or more glob patterns to use for matching.
    * @param options See available options for changing how matches are performed
    * @returns Returns an object with only keys that match the given patterns.
    *
    * @example
    * ```js
    * var mm = require('micromatch');
    * mm.matchKeys(object, patterns[, options]);
    *
    * var obj = { aa: 'a', ab: 'b', ac: 'c' };
    * console.log(mm.matchKeys(obj, '*b'));
    * //=> { ab: 'b' }
    * ```
    */
  def matchKeys[T](`object`: T, patterns: java.lang.String): stdLib.Partial[T] = js.native
  def matchKeys[T](`object`: T, patterns: java.lang.String, options: micromatchLib.micromatchMod.micromatchNs.Options): stdLib.Partial[T] = js.native
  def matchKeys[T](`object`: T, patterns: js.Array[java.lang.String]): stdLib.Partial[T] = js.native
  def matchKeys[T](
    `object`: T,
    patterns: js.Array[java.lang.String],
    options: micromatchLib.micromatchMod.micromatchNs.Options
  ): stdLib.Partial[T] = js.native
  /**
    * Returns a memoized matcher function from the given glob `pattern` and `options`. The returned function takes a string to match as its only argument and returns true if the string is a match.
    *
    * @param pattern Glob pattern
    * @param options See available options for changing how matches are performed.
    * @returns Returns a matcher function.
    *
    * @example
    * ```js
    * var mm = require('micromatch');
    * mm.matcher(pattern[, options]);
    *
    * var isMatch = mm.matcher('*.!(*a)');
    * console.log(isMatch('a.a'));
    * //=> false
    * console.log(isMatch('a.b'));
    * //=> true
    * ```
    */
  def matcher(pattern: java.lang.String): js.Function1[/* str */ java.lang.String, scala.Boolean] = js.native
  def matcher(pattern: java.lang.String, options: micromatchLib.micromatchMod.micromatchNs.Options): js.Function1[/* str */ java.lang.String, scala.Boolean] = js.native
  /**
    * Returns a list of strings that _**do not match any**_ of the given `patterns`.
    *
    * @param list Array of strings to match.
    * @param patterns One or more glob pattern to use for matching.
    * @param options See available options for changing how matches are performed
    * @returns Returns an array of strings that **do not match** the given patterns.
    *
    * @example
    * ```js
    * var mm = require('micromatch');
    * mm.not(list, patterns[, options]);
    *
    * console.log(mm.not(['a.a', 'b.b', 'c.c'], '*.a'));
    * //=> ['b.b', 'c.c']
    * ```
    */
  def not(list: js.Array[java.lang.String], patterns: java.lang.String): js.Array[java.lang.String] = js.native
  def not(
    list: js.Array[java.lang.String],
    patterns: java.lang.String,
    options: micromatchLib.micromatchMod.micromatchNs.Options
  ): js.Array[java.lang.String] = js.native
  def not(list: js.Array[java.lang.String], patterns: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def not(
    list: js.Array[java.lang.String],
    patterns: js.Array[java.lang.String],
    options: micromatchLib.micromatchMod.micromatchNs.Options
  ): js.Array[java.lang.String] = js.native
  /**
    * Parse the given `str` with the given `options`.
    *
    * @returns Returns an AST
    *
    * @example
    * ```js
    * var mm = require('micromatch');
    * mm.parse(pattern[, options]);
    *
    * var ast = mm.parse('a/{b,c}/d');
    * console.log(ast);
    * // { type: 'root',
    * //   errors: [],
    * //   input: 'a/{b,c}/d',
    * //   nodes:
    * //    [ { type: 'bos', val: '' },
    * //      { type: 'text', val: 'a/' },
    * //      { type: 'brace',
    * //        nodes:
    * //         [ { type: 'brace.open', val: '{' },
    * //           { type: 'text', val: 'b,c' },
    * //           { type: 'brace.close', val: '}' } ] },
    * //      { type: 'text', val: '/d' },
    * //      { type: 'eos', val: '' } ] }
    * ```
    */
  def parse(str: java.lang.String): js.Object = js.native
  def parse(str: java.lang.String, options: micromatchLib.micromatchMod.micromatchNs.Options): js.Object = js.native
  /**
    * Returns true if some of the strings in the given `list` match any of the given glob `patterns`.
    *
    * @param list The string or array of strings to test. Returns as soon as the first match is found.
    * @param patterns One or more glob patterns to use for matching.
    * @param options See available options for changing how matches are performed
    * @returns Returns true if any patterns match `str`
    *
    * @example
    * ```js
    * var mm = require('micromatch');
    * mm.some(list, patterns[, options]);
    *
    * console.log(mm.some(['foo.js', 'bar.js'], ['*.js', '!foo.js']));
    * // true
    * console.log(mm.some(['foo.js'], ['*.js', '!foo.js']));
    * // false
    * ```
    */
  def some(list: java.lang.String, patterns: java.lang.String): scala.Boolean = js.native
  def some(
    list: java.lang.String,
    patterns: java.lang.String,
    options: micromatchLib.micromatchMod.micromatchNs.Options
  ): scala.Boolean = js.native
  def some(list: java.lang.String, patterns: js.Array[java.lang.String]): scala.Boolean = js.native
  def some(
    list: java.lang.String,
    patterns: js.Array[java.lang.String],
    options: micromatchLib.micromatchMod.micromatchNs.Options
  ): scala.Boolean = js.native
  def some(list: js.Array[java.lang.String], patterns: java.lang.String): scala.Boolean = js.native
  def some(
    list: js.Array[java.lang.String],
    patterns: java.lang.String,
    options: micromatchLib.micromatchMod.micromatchNs.Options
  ): scala.Boolean = js.native
  def some(list: js.Array[java.lang.String], patterns: js.Array[java.lang.String]): scala.Boolean = js.native
  def some(
    list: js.Array[java.lang.String],
    patterns: js.Array[java.lang.String],
    options: micromatchLib.micromatchMod.micromatchNs.Options
  ): scala.Boolean = js.native
}

