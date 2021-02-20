package typings.parseFilepath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Pollyfill for node.js `path.parse()`, parses a filepath into an object.
    *
    * @param filepath
    */
  @JSImport("parse-filepath", JSImport.Namespace)
  @js.native
  def apply(filepath: String): ParsedPath = js.native
  
  @js.native
  trait ParsedPath extends StObject {
    
    /**
      * fully resolved, absolute filepath
      */
    var absolute: String = js.native
    
    /**
      * The file name including extension (if any) such as `'index.html'`
      */
    var base: String = js.native
    
    /**
      * alias for `base`
      */
    var basename: String = js.native
    
    /**
      * The full directory path such as `'/home/user/dir'` or `'c:\path\dir'`
      */
    var dir: String = js.native
    
    /**
      * alias for `dir`
      */
    var dirname: String = js.native
    
    /**
      * The file extension (if any) such as `'.html'`
      */
    var ext: String = js.native
    
    /**
      * alias for `ext`
      */
    var extname: String = js.native
    
    /**
      * `true` if the given path is absolute
      */
    var isAbsolute: Boolean = js.native
    
    /**
      * The file name without extension (if any) such as `'index'`
      */
    var name: String = js.native
    
    /**
      * the original filepath
      */
    var path: String = js.native
    
    /**
      * The root of the path such as `'/'` or `'c:\'`
      */
    var root: String = js.native
    
    /**
      * alias for `name`
      */
    var stem: String = js.native
  }
  object ParsedPath {
    
    @scala.inline
    def apply(
      absolute: String,
      base: String,
      basename: String,
      dir: String,
      dirname: String,
      ext: String,
      extname: String,
      isAbsolute: Boolean,
      name: String,
      path: String,
      root: String,
      stem: String
    ): ParsedPath = {
      val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], basename = basename.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], dirname = dirname.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], extname = extname.asInstanceOf[js.Any], isAbsolute = isAbsolute.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], stem = stem.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedPath]
    }
    
    @scala.inline
    implicit class ParsedPathMutableBuilder[Self <: ParsedPath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolute(value: String): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtname(value: String): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAbsolute(value: Boolean): Self = StObject.set(x, "isAbsolute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStem(value: String): Self = StObject.set(x, "stem", value.asInstanceOf[js.Any])
    }
  }
}
