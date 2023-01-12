package typings.parseGlob

import org.scalablytyped.runtime.Shortcut
import typings.parseGlob.anon.Basename
import typings.parseGlob.anon.Braces
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("parse-glob", JSImport.Namespace)
  @js.native
  val ^ : ParseGlob = js.native
  
  type ParseGlob = js.Function1[/* glob */ String, Result]
  
  trait Result extends StObject {
    
    /**
      * The non-glob part of the string, if any.
      */
    var base: String
    
    /**
      * The glob pattern part of the string, if any.
      */
    var glob: String
    
    /**
      * An object with boolean information about the glob.
      */
    var is: Braces
    
    /**
      * A copy of the original, unmodified glob pattern.
      */
    var orig: String
    
    /**
      * File path segments.
      */
    var path: Basename
  }
  object Result {
    
    inline def apply(base: String, glob: String, is: Braces, orig: String, path: Basename): Result = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], glob = glob.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], orig = orig.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setGlob(value: String): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      inline def setIs(value: Braces): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setOrig(value: String): Self = StObject.set(x, "orig", value.asInstanceOf[js.Any])
      
      inline def setPath(value: Basename): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ParseGlob
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ParseGlob = ^
}
