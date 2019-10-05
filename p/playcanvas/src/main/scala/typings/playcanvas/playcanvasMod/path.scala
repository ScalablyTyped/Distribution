package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @namespace pc.path
  * @description File path API
  */
@JSImport("playcanvas", "path")
@js.native
object path extends js.Object {
  /**
    * @constant
    * @type {String}
    * @name pc.path.delimiter
    * @description The character that separates path segments
    */
  val delimiter: String = js.native
  /**
    * @function
    * @name pc.path.getBasename
    * @description Return the basename of the path. That is the second element of the pair returned by
    * passing path into {@link pc.path.split}.
    * @param {String} path The path to process.
    * @returns {String} The basename.
    * @example
    * pc.path.getBasename("/path/to/file.txt"); // returns "path.txt"
    * pc.path.getBasename("/path/to/dir"); // returns "dir"
    */
  def getBasename(path: String): String = js.native
  /**
    * @function
    * @name pc.path.getDirectory
    * @description Get the directory name from the path. This is everything up to the final instance of pc.path.delimiter.
    * @param {String} path The path to get the directory from
    * @returns {String} The directory part of the path.
    */
  def getDirectory(path: String): String = js.native
  /**
    * @function
    * @name pc.path.join
    * @description Join two sections of file path together, insert a delimiter if needed.
    * @param {String} one First part of path to join.
    * @param {String} two Second part of path to join.
    * @returns {String} The joined file path.
    */
  def join(one: String, two: String): String = js.native
  /**
    * @function
    * @name  pc.path.normalize
    * @description  Normalize the path by removing '.' and '..' instances
    * @param  {String} path The path to normalize
    * @returns {String} The normalized path
    */
  def normalize(path: String): String = js.native
  /**
    * @function
    * @name pc.path.split
    * @description Split the pathname path into a pair [head, tail] where tail is the final part of the path
    * after the last delimiter and head is everything leading up to that. tail will never contain a slash
    * @param {String} path The path to split.
    * @returns {String[]} The split path which is an array of two strings, the path and the filename.
    */
  def split(path: String): js.Array[String] = js.native
}

