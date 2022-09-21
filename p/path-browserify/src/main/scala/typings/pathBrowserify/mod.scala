package typings.pathBrowserify

import org.scalablytyped.runtime.Shortcut
import typings.pathBrowserify.anon.PartialPathObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("path-browserify", JSImport.Namespace)
  @js.native
  val ^ : Path = js.native
  
  @js.native
  trait Path extends StObject {
    
    def basename(path: String): String = js.native
    def basename(path: String, ext: String): String = js.native
    
    val delimiter: String = js.native
    
    def dirname(path: String): String = js.native
    
    def extname(path: String): String = js.native
    
    def format(pathObject: PartialPathObject): String = js.native
    
    def isAbsolute(path: String): Boolean = js.native
    
    def join(paths: String*): String = js.native
    
    def normalize(path: String): String = js.native
    
    def parse(path: String): PathObject = js.native
    
    val posix: Path = js.native
    
    def relative(from: String, to: String): String = js.native
    
    def resolve(pathSegments: String*): String = js.native
    
    val sep: String = js.native
    
    val win32: Null = js.native
  }
  
  trait PathObject extends StObject {
    
    var base: String
    
    var dir: String
    
    var ext: String
    
    var name: String
    
    var root: String
  }
  object PathObject {
    
    inline def apply(base: String, dir: String, ext: String, name: String, root: String): PathObject = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathObject]
    }
    
    extension [Self <: PathObject](x: Self) {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Path
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Path = ^
}
