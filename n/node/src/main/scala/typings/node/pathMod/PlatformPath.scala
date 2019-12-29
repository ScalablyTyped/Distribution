package typings.node.pathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformPath extends js.Object {
  /**
    * The platform-specific file delimiter. ';' or ':'.
    */
  val delimiter: String = js.native
  /**
    * Posix specific pathing.
    * Same as parent object on posix.
    */
  val posix: PlatformPath = js.native
  /**
    * The platform-specific file separator. '\\' or '/'.
    */
  val sep: String = js.native
  /**
    * Windows specific pathing.
    * Same as parent object on windows
    */
  val win32: PlatformPath = js.native
  /**
    * Return the last portion of a path. Similar to the Unix basename command.
    * Often used to extract the file name from a fully qualified path.
    *
    * @param p the path to evaluate.
    * @param ext optionally, an extension to remove from the result.
    */
  def basename(p: String): String = js.native
  def basename(p: String, ext: String): String = js.native
  /**
    * Return the directory name of a path. Similar to the Unix dirname command.
    *
    * @param p the path to evaluate.
    */
  def dirname(p: String): String = js.native
  /**
    * Return the extension of the path, from the last '.' to end of string in the last portion of the path.
    * If there is no '.' in the last portion of the path or the first character of it is '.', then it returns an empty string
    *
    * @param p the path to evaluate.
    */
  def extname(p: String): String = js.native
  /**
    * Returns a path string from an object - the opposite of parse().
    *
    * @param pathString path to evaluate.
    */
  def format(pP: FormatInputPathObject): String = js.native
  /**
    * Determines whether {path} is an absolute path. An absolute path will always resolve to the same location, regardless of the working directory.
    *
    * @param path path to test.
    */
  def isAbsolute(p: String): Boolean = js.native
  /**
    * Join all arguments together and normalize the resulting path.
    * Arguments must be strings. In v0.8, non-string arguments were silently ignored. In v0.10 and up, an exception is thrown.
    *
    * @param paths paths to join.
    */
  def join(paths: String*): String = js.native
  /**
    * Normalize a string path, reducing '..' and '.' parts.
    * When multiple slashes are found, they're replaced by a single one; when the path contains a trailing slash, it is preserved. On Windows backslashes are used.
    *
    * @param p string path to normalize.
    */
  def normalize(p: String): String = js.native
  /**
    * Returns an object from a path string - the opposite of format().
    *
    * @param pathString path to evaluate.
    */
  def parse(p: String): ParsedPath = js.native
  /**
    * Solve the relative path from {from} to {to}.
    * At times we have two absolute paths, and we need to derive the relative path from one to the other. This is actually the reverse transform of path.resolve.
    */
  def relative(from: String, to: String): String = js.native
  /**
    * The right-most parameter is considered {to}.  Other parameters are considered an array of {from}.
    *
    * Starting from leftmost {from} parameter, resolves {to} to an absolute path.
    *
    * If {to} isn't already absolute, {from} arguments are prepended in right to left order,
    * until an absolute path is found. If after using all {from} paths still no absolute path is found,
    * the current working directory is used as well. The resulting path is normalized,
    * and trailing slashes are removed unless the path gets resolved to the root directory.
    *
    * @param pathSegments string paths to join.  Non-string arguments are ignored.
    */
  def resolve(pathSegments: String*): String = js.native
  /**
    * On Windows systems only, returns an equivalent namespace-prefixed path for the given path.
    * If path is not a string, path will be returned without modifications.
    * This method is meaningful only on Windows system.
    * On POSIX systems, the method is non-operational and always returns path without modifications.
    */
  def toNamespacedPath(path: String): String = js.native
}

