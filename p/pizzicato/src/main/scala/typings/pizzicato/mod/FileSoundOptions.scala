package typings.pizzicato.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSoundOptions
  extends StObject
     with SoundOptions {
  
  /** Whether or not to loop the sound */
  var loop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When given a list of paths, Pizzicato uses the first path that
    * loads successfully.
    */
  var path: String | js.Array[String]
}
object FileSoundOptions {
  
  inline def apply(path: String | js.Array[String]): FileSoundOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSoundOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileSoundOptions] (val x: Self) extends AnyVal {
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setPath(value: String | js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
  }
}
