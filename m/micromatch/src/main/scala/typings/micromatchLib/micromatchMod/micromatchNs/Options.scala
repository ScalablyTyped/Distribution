package typings
package micromatchLib.micromatchMod.micromatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Allow glob patterns without slashes to match a file path based on its basename. Same behavior as [minimatch](https://github.com/isaacs/minimatch) option `matchBase`.
    *
    * @default false
    *
    * @example
    * ```js
    * mm(['a/b.js', 'a/c.md'], '*.js');
    * //=> []
    *
    * mm(['a/b.js', 'a/c.md'], '*.js', {matchBase: true});
    * //=> ['a/b.js']
    * ```
    */
  var basename: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enabled by default, this option enforces bash-like behavior with stars immediately following a bracket expression.
    * Bash bracket expressions are similar to regex character classes, but unlike regex, a star following a bracket expression **does not repeat the bracketed characters**.
    * Instead, the star is treated the same as an other star.
    *
    * @default true
    *
    * @example
    * ```js
    * var files = ['abc', 'ajz'];
    * console.log(mm(files, '[a-c]*'));
    * //=> ['abc', 'ajz']
    *
    * console.log(mm(files, '[a-c]*', {bash: false}));
    * ```
    */
  var bash: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Disable regex and function memoization.
    *
    * @default undefined
    */
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Match dotfiles. Same behavior as [minimatch](https://github.com/isaacs/minimatch) option `dot`.
    *
    * @default false
    */
  var dot: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Similar to the `--failglob` behavior in Bash, throws an error when no matches are found.
    *
    * @default undefined
    */
  var failglob: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * String or array of glob patterns to match files to ignore.
    *
    * @default undefined
    */
  var ignore: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * Alias for [options.basename](#options-basename).
    */
  var matchBase: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Disable expansion of brace patterns. Same behavior as [minimatch](https://github.com/isaacs/minimatch) option `nobrace`.
    *
    * @default undefined
    */
  var nobrace: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Use a case-insensitive regex for matching files. Same behavior as [minimatch](https://github.com/isaacs/minimatch).
    *
    * @default undefined
    */
  var nocase: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Remove duplicate elements from the result array.
    *
    * @default undefined
    *
    * @example
    * Example of using the `unescape` and `nodupes` options together:
    *
    * ```js
    * mm.match(['a/b/c', 'a/b/c'], 'a/b/c');
    * //=> ['a/b/c', 'a/b/c']
    *
    * mm.match(['a/b/c', 'a/b/c'], 'a/b/c', {nodupes: true});
    * //=> ['abc']
    * ```
    */
  var nodupes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Disable extglob support, so that extglobs are regarded as literal characters.
    *
    * @default undefined
    *
    * @example
    * ```js
    * mm(['a/z', 'a/b', 'a/!(z)'], 'a/!(z)');
    * //=> ['a/b', 'a/!(z)']
    *
    * mm(['a/z', 'a/b', 'a/!(z)'], 'a/!(z)', {noext: true});
    * //=> ['a/!(z)'] (matches only as literal characters)
    * ```
    */
  var noext: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Disable matching with globstars (`**`).
    *
    * @default undefined
    */
  var noglobstar: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Disallow negation (`!`) patterns, and treat leading `!` as a literal character to match.
    *
    * @default undefined
    */
  var nonegate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Alias for [options.nullglob](#options-nullglob).
    */
  var nonull: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `true`, when no matches are found the actual (arrayified) glob pattern is returned instead of an empty array.
    * Same behavior as [minimatch](https://github.com/isaacs/minimatch) option `nonull`.
    *
    * @default undefined
    */
  var nullglob: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Pass your own instance of [snapdragon](https://github.com/jonschlinkert/snapdragon), to customize parsers or compilers.
    *
    * @default undefined
    */
  var snapdragon: js.UndefOr[js.Object] = js.undefined
  /**
    * Generate a source map by enabling the `sourcemap` option with the `.parse`, `.compile`, or `.create` methods.
    *
    * _(Note that sourcemaps are currently not enabled for brace patterns)_
    *
    * @example
    * ``` js
    * var mm = require('micromatch');
    * var pattern = '*(*(of*(a)x)z)';
    *
    * var res = mm.create('abc/ *.js', {sourcemap: true});
    * console.log(res.map);
    * // { version: 3,
    * //   sources: [ 'string' ],
    * //   names: [],
    * //   mappings: 'AAAA,GAAG,EAAC,iBAAC,EAAC,EAAE',
    * //   sourcesContent: [ 'abc/ *.js' ] }
    *
    * var ast = mm.parse('abc/ **\/ *.js');
    * var res = mm.compile(ast, {sourcemap: true});
    * console.log(res.map);
    * // { version: 3,
    * //   sources: [ 'string' ],
    * //   names: [],
    * //   mappings: 'AAAA,GAAG,EAAC,2BAAE,EAAC,iBAAC,EAAC,EAAE',
    * //   sourcesContent: [ 'abc/ **\/ *.js' ] }
    *
    * var ast = mm.parse(pattern);
    * var res = mm.compile(ast, {sourcemap: true});
    * console.log(res.map);
    * // { version: 3,
    * //   sources: [ 'string' ],
    * //   names: [],
    * //   mappings: 'AAAA,CAAE,CAAE,EAAE,CAAE,CAAC,EAAC,CAAC,EAAC,CAAC,EAAC',
    * //   sourcesContent: [ '*(*(of*(a)x)z)' ] }
    * ```
    */
  var sourcemap: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Remove backslashes from returned matches.
    *
    * @default undefined
    *
    * @example
    * In this example we want to match a literal `*`:
    *
    * ```js
    * mm.match(['abc', 'a\\*c'], 'a\\*c');
    * //=> ['a\\*c']
    *
    * mm.match(['abc', 'a\\*c'], 'a\\*c', {unescape: true});
    * //=> ['a*c']
    * ```
    */
  var unescape: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Convert path separators on returned files to posix/unix-style forward slashes.
    *
    * @default true
    *
    * @example
    * ```js
    * mm.match(['a\\b\\c'], 'a/ **');
    * //=> ['a/b/c']
    *
    * mm.match(['a\\b\\c'], {unixify: false});
    * //=> ['a\\b\\c']
    * ```
    */
  var unixify: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    basename: js.UndefOr[scala.Boolean] = js.undefined,
    bash: js.UndefOr[scala.Boolean] = js.undefined,
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    dot: js.UndefOr[scala.Boolean] = js.undefined,
    failglob: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: java.lang.String | js.Array[java.lang.String] = null,
    matchBase: js.UndefOr[scala.Boolean] = js.undefined,
    nobrace: js.UndefOr[scala.Boolean] = js.undefined,
    nocase: js.UndefOr[scala.Boolean] = js.undefined,
    nodupes: js.UndefOr[scala.Boolean] = js.undefined,
    noext: js.UndefOr[scala.Boolean] = js.undefined,
    noglobstar: js.UndefOr[scala.Boolean] = js.undefined,
    nonegate: js.UndefOr[scala.Boolean] = js.undefined,
    nonull: js.UndefOr[scala.Boolean] = js.undefined,
    nullglob: js.UndefOr[scala.Boolean] = js.undefined,
    snapdragon: js.Object = null,
    sourcemap: js.UndefOr[scala.Boolean] = js.undefined,
    unescape: js.UndefOr[scala.Boolean] = js.undefined,
    unixify: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(basename)) __obj.updateDynamic("basename")(basename)
    if (!js.isUndefined(bash)) __obj.updateDynamic("bash")(bash)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (!js.isUndefined(failglob)) __obj.updateDynamic("failglob")(failglob)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(matchBase)) __obj.updateDynamic("matchBase")(matchBase)
    if (!js.isUndefined(nobrace)) __obj.updateDynamic("nobrace")(nobrace)
    if (!js.isUndefined(nocase)) __obj.updateDynamic("nocase")(nocase)
    if (!js.isUndefined(nodupes)) __obj.updateDynamic("nodupes")(nodupes)
    if (!js.isUndefined(noext)) __obj.updateDynamic("noext")(noext)
    if (!js.isUndefined(noglobstar)) __obj.updateDynamic("noglobstar")(noglobstar)
    if (!js.isUndefined(nonegate)) __obj.updateDynamic("nonegate")(nonegate)
    if (!js.isUndefined(nonull)) __obj.updateDynamic("nonull")(nonull)
    if (!js.isUndefined(nullglob)) __obj.updateDynamic("nullglob")(nullglob)
    if (snapdragon != null) __obj.updateDynamic("snapdragon")(snapdragon)
    if (!js.isUndefined(sourcemap)) __obj.updateDynamic("sourcemap")(sourcemap)
    if (!js.isUndefined(unescape)) __obj.updateDynamic("unescape")(unescape)
    if (!js.isUndefined(unixify)) __obj.updateDynamic("unixify")(unixify)
    __obj.asInstanceOf[Options]
  }
}

