package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/path/
trait Path extends StObject {
  
  def basename(path: String): String
  
  def dirname(path: String): String
  
  def expanduser(path: String): String
  
  def extname(path: String): String
  
  def isAbsolute(path: String): Boolean
  
  def join(paths: String*): String
  
  def normalize(path: String): String
  
  def relative(from: String, to: String): String
  
  def split(path: String): js.Array[String]
  
  def splitext(path: String): js.Tuple2[String, String]
}
object Path {
  
  inline def apply(
    basename: String => String,
    dirname: String => String,
    expanduser: String => String,
    extname: String => String,
    isAbsolute: String => Boolean,
    join: /* repeated */ String => String,
    normalize: String => String,
    relative: (String, String) => String,
    split: String => js.Array[String],
    splitext: String => js.Tuple2[String, String]
  ): Path = {
    val __obj = js.Dynamic.literal(basename = js.Any.fromFunction1(basename), dirname = js.Any.fromFunction1(dirname), expanduser = js.Any.fromFunction1(expanduser), extname = js.Any.fromFunction1(extname), isAbsolute = js.Any.fromFunction1(isAbsolute), join = js.Any.fromFunction1(join), normalize = js.Any.fromFunction1(normalize), relative = js.Any.fromFunction2(relative), split = js.Any.fromFunction1(split), splitext = js.Any.fromFunction1(splitext))
    __obj.asInstanceOf[Path]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
    
    inline def setBasename(value: String => String): Self = StObject.set(x, "basename", js.Any.fromFunction1(value))
    
    inline def setDirname(value: String => String): Self = StObject.set(x, "dirname", js.Any.fromFunction1(value))
    
    inline def setExpanduser(value: String => String): Self = StObject.set(x, "expanduser", js.Any.fromFunction1(value))
    
    inline def setExtname(value: String => String): Self = StObject.set(x, "extname", js.Any.fromFunction1(value))
    
    inline def setIsAbsolute(value: String => Boolean): Self = StObject.set(x, "isAbsolute", js.Any.fromFunction1(value))
    
    inline def setJoin(value: /* repeated */ String => String): Self = StObject.set(x, "join", js.Any.fromFunction1(value))
    
    inline def setNormalize(value: String => String): Self = StObject.set(x, "normalize", js.Any.fromFunction1(value))
    
    inline def setRelative(value: (String, String) => String): Self = StObject.set(x, "relative", js.Any.fromFunction2(value))
    
    inline def setSplit(value: String => js.Array[String]): Self = StObject.set(x, "split", js.Any.fromFunction1(value))
    
    inline def setSplitext(value: String => js.Tuple2[String, String]): Self = StObject.set(x, "splitext", js.Any.fromFunction1(value))
  }
}
