package typings.multimatch

import typings.minimatch.mod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("multimatch", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
  Extends [`minimatch.match()`](https://github.com/isaacs/minimatch#minimatchmatchlist-pattern-options) with support for multiple patterns.
  @param paths - Paths to match against.
  @param patterns - Globbing patterns to use. For example: `['*', '!cake']`. See supported [`minimatch` patterns](https://github.com/isaacs/minimatch#usage).
  @returns The matching paths.
  @example
  ```
  import multimatch = require('multimatch');
  multimatch(['unicorn', 'cake', 'rainbows'], ['*', '!cake']);
  //=> ['unicorn', 'rainbows']
  ```
  */
  def apply(paths: String, patterns: String): js.Array[String] = js.native
  def apply(paths: String, patterns: String, options: Options): js.Array[String] = js.native
  def apply(paths: String, patterns: js.Array[String]): js.Array[String] = js.native
  def apply(paths: String, patterns: js.Array[String], options: Options): js.Array[String] = js.native
  def apply(paths: js.Array[String], patterns: String): js.Array[String] = js.native
  def apply(paths: js.Array[String], patterns: String, options: Options): js.Array[String] = js.native
  def apply(paths: js.Array[String], patterns: js.Array[String]): js.Array[String] = js.native
  def apply(paths: js.Array[String], patterns: js.Array[String], options: Options): js.Array[String] = js.native
  type Options = IOptions
}

