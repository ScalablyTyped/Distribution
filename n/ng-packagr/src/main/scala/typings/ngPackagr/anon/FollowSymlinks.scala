package typings.ngPackagr.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FollowSymlinks extends StObject {
  
  /**
    * Allow glob patterns to follow symlink directories. This allows subdirectories of the symlink to be searched.
    */
  var followSymlinks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The pattern to match.
    */
  var glob: String
  
  /**
    * An array of globs to ignore.
    */
  var ignore: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The input directory path in which to apply 'glob'. Defaults to the project root.
    */
  var input: String
  
  /**
    * Absolute path within the output.
    */
  var output: String
}
object FollowSymlinks {
  
  inline def apply(glob: String, input: String, output: String): FollowSymlinks = {
    val __obj = js.Dynamic.literal(glob = glob.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[FollowSymlinks]
  }
  
  extension [Self <: FollowSymlinks](x: Self) {
    
    inline def setFollowSymlinks(value: Boolean): Self = StObject.set(x, "followSymlinks", value.asInstanceOf[js.Any])
    
    inline def setFollowSymlinksUndefined: Self = StObject.set(x, "followSymlinks", js.undefined)
    
    inline def setGlob(value: String): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
    
    inline def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
    
    inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
    
    inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
  }
}
