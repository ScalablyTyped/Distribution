package typings.mv

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("mv", JSImport.Namespace)
  @js.native
  val ^ : Mv = js.native
  
  @js.native
  trait Mv extends StObject {
    
    def apply(src: String, dest: String, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
    def apply(src: String, dest: String, options: Options, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var clobber: js.UndefOr[Boolean] = js.undefined
    
    var mkdirp: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setClobber(value: Boolean): Self = StObject.set(x, "clobber", value.asInstanceOf[js.Any])
      
      inline def setClobberUndefined: Self = StObject.set(x, "clobber", js.undefined)
      
      inline def setMkdirp(value: Boolean): Self = StObject.set(x, "mkdirp", value.asInstanceOf[js.Any])
      
      inline def setMkdirpUndefined: Self = StObject.set(x, "mkdirp", js.undefined)
    }
  }
  
  type _To = Mv
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Mv = ^
}
