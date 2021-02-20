package typings.parseGlob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Basename extends StObject {
    
    /**
      * File name with extension.
      */
    var basename: String = js.native
    
    /**
      * Directory.
      */
    var dirname: String = js.native
    
    /**
      * File extension without dot.
      */
    var ext: String = js.native
    
    /**
      * File extension with dot.
      */
    var extname: String = js.native
    
    /**
      * File name without extension.
      */
    var filename: String = js.native
  }
  object Basename {
    
    @scala.inline
    def apply(basename: String, dirname: String, ext: String, extname: String, filename: String): Basename = {
      val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], dirname = dirname.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], extname = extname.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[Basename]
    }
    
    @scala.inline
    implicit class BasenameMutableBuilder[Self <: Basename] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtname(value: String): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Braces extends StObject {
    
    /**
      * True if it has braces ({1..2} or .{txt,md}).
      */
    var braces: Boolean = js.native
    
    /**
      * True if it has POSIX brackets ([[:alpha:]]).
      */
    var brackets: Boolean = js.native
    
    /**
      * True if the pattern should match dot-directories (like .git).
      */
    var dotdir: Boolean = js.native
    
    /**
      * True if the pattern should match dotfiles.
      */
    var dotfile: Boolean = js.native
    
    /**
      * True if it has extglobs (@(foo|bar)).
      */
    var extglob: Boolean = js.native
    
    /**
      * True if the pattern actually is a glob pattern.
      */
    var glob: Boolean = js.native
    
    /**
      * True if the pattern has a globstar (double star, **).
      */
    var globstar: Boolean = js.native
    
    /**
      * True if it's a negation pattern (!/foo.js).
      */
    var negated: Boolean = js.native
  }
  object Braces {
    
    @scala.inline
    def apply(
      braces: Boolean,
      brackets: Boolean,
      dotdir: Boolean,
      dotfile: Boolean,
      extglob: Boolean,
      glob: Boolean,
      globstar: Boolean,
      negated: Boolean
    ): Braces = {
      val __obj = js.Dynamic.literal(braces = braces.asInstanceOf[js.Any], brackets = brackets.asInstanceOf[js.Any], dotdir = dotdir.asInstanceOf[js.Any], dotfile = dotfile.asInstanceOf[js.Any], extglob = extglob.asInstanceOf[js.Any], glob = glob.asInstanceOf[js.Any], globstar = globstar.asInstanceOf[js.Any], negated = negated.asInstanceOf[js.Any])
      __obj.asInstanceOf[Braces]
    }
    
    @scala.inline
    implicit class BracesMutableBuilder[Self <: Braces] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBraces(value: Boolean): Self = StObject.set(x, "braces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrackets(value: Boolean): Self = StObject.set(x, "brackets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotdir(value: Boolean): Self = StObject.set(x, "dotdir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotfile(value: Boolean): Self = StObject.set(x, "dotfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtglob(value: Boolean): Self = StObject.set(x, "extglob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlob(value: Boolean): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobstar(value: Boolean): Self = StObject.set(x, "globstar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegated(value: Boolean): Self = StObject.set(x, "negated", value.asInstanceOf[js.Any])
    }
  }
}
