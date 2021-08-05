package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * File path API.
  */
object path {
  
  @JSImport("playcanvas", "path")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The character that separates path segments.
    */
  @JSImport("playcanvas", "path.delimiter")
  @js.native
  val delimiter: String = js.native
  
  /**
    * Return the path without file name. If path is relative path, start with period.
    * @example
    * pc.path.extractPath("path/to/file.txt");    // returns "./path/to"
    * pc.path.extractPath("./path/to/file.txt");  // returns "./path/to"
    * pc.path.extractPath("../path/to/file.txt"); // returns "../path/to"
    * pc.path.extractPath("/path/to/file.txt");   // returns "/path/to"
    * @param pathname - The full path to process.
    * @returns The path without a last element from list split by slash.
    */
  inline def extractPath(pathname: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractPath")(pathname.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Return the basename of the path. That is the second element of the pair returned by
    * passing path into {@link pc.path.split}.
    * @example
    * pc.path.getBasename("/path/to/file.txt"); // returns "path.txt"
    * pc.path.getBasename("/path/to/dir"); // returns "dir"
    * @param pathname - The path to process.
    * @returns The basename.
    */
  inline def getBasename(pathname: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBasename")(pathname.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Get the directory name from the path. This is everything up to the final instance of pc.path.delimiter.
    * @param pathname - The path to get the directory from.
    * @returns The directory part of the path.
    */
  inline def getDirectory(pathname: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectory")(pathname.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Return the extension of the path. Pop the last value of a list after path is split by question mark and comma.
    * @example
    * pc.path.getExtension("/path/to/file.txt"); // returns ".txt"
    * pc.path.getExtension("/path/to/file.jpg"); // returns ".jpg"
    * pc.path.getExtension("/path/to/file.txt?function=getExtension"); // returns ".txt"
    * @param pathname - The path to process.
    * @returns The extension.
    */
  inline def getExtension(pathname: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(pathname.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Check if a string s is relative path.
    * @example
    * pc.path.isRelativePath("file.txt"); // returns true
    * pc.path.isRelativePath("path/to/file.txt"); // returns true
    * pc.path.isRelativePath("./path/to/file.txt"); // returns true
    * pc.path.isRelativePath("../path/to/file.jpg"); // returns true
    * pc.path.isRelativePath("/path/to/file.jpg"); // returns false
    * pc.path.isRelativePath("http://path/to/file.jpg"); // returns false
    * @param pathname - The path to process.
    * @returns True if s doesn't start with slash and doesn't include colon and double slash.
    */
  inline def isRelativePath(pathname: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRelativePath")(pathname.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Join two or more sections of file path together, inserting a
    * delimiter if needed.
    * @example
    * var path = pc.path.join('foo', 'bar');
    * console.log(path); // Prints 'foo/bar'
    * @example
    * var path = pc.path.join('alpha', 'beta', 'gamma');
    * console.log(path); // Prints 'alpha/beta/gamma'
    * @param section - Section of path to join. 2 or more can be
    * provided as parameters.
    * @returns The joined file path.
    */
  inline def join(section: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(section.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Normalize the path by removing '.' and '..' instances.
    * @param pathname - The path to normalize.
    * @returns The normalized path.
    */
  inline def normalize(pathname: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(pathname.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Split the pathname path into a pair [head, tail] where tail is the final part of the path
    * after the last delimiter and head is everything leading up to that. tail will never contain a slash.
    * @param pathname - The path to split.
    * @returns The split path which is an array of two strings, the path and the filename.
    */
  inline def split(pathname: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("split")(pathname.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
