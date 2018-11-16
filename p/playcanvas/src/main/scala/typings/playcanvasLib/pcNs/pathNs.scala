package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * @namespace pc.path
     * @description File path API
     */
@JSGlobal("pc.path")
@js.native
object pathNs extends js.Object {
  /**
           * The character that separates path segments
           * @name pc.path.delimiter
           */
  val delimiter: /* / */ java.lang.String = js.native
  /**
          * @function
          * @name pc.path.getBasename
          * @description Return the basename of the path. That is the second element of the pair returned by
          * passing path into {@link pc.path.split}.
          * @example
          * pc.path.getBasename("/path/to/file.txt"); // returns "path.txt"
          * pc.path.getBasename("/path/to/dir"); // returns "dir"
          * @returns {String} The basename
          */
  def getBasename(path: java.lang.String): java.lang.String = js.native
  /**
           * Get the directory name from the path. This is everything up to the final instance of pc.path.delimiter
           * @param {String} path The path to get the directory from
           * @function
           * @name pc.path.getDirectory
           */
  def getDirectory(path: java.lang.String): java.lang.String = js.native
  /**
           * Join two sections of file path together, insert a delimiter if needed.
           * @param {String} one First part of path to join
           * @param {String} two Second part of path to join
           * @function
           * @name pc.path.join
           */
  /*
          join: function(one, two) {
              if(two[0] === pc.path.delimiter) {
                  return two;
              }
  
              if(one && two && one[one.length - 1] !== pc.path.delimiter && two[0] !== pc.path.delimiter) {
                  return one + pc.path.delimiter + two;
              }
              else {
                  return one + two;
              }
          },
          */
  def join(one: java.lang.String, two: java.lang.String): java.lang.String = js.native
  /**
          * @function
          * @name pc.path.split
          * @description Split the pathname path into a pair [head, tail] where tail is the final part of the path
          * after the last delimiter and head is everything leading up to that. tail will never contain a slash
          */
  def split(path: java.lang.String): js.Tuple2[java.lang.String, java.lang.String] = js.native
}

