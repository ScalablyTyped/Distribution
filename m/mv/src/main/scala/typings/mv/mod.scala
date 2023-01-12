package typings.mv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(source: String, dest: String, callback: js.Function1[/* error */ js.UndefOr[Any], Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    source: String,
    dest: String,
    options: Options,
    callback: js.Function1[/* error */ js.UndefOr[Any], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("mv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * @default false
      */
    var clobber: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default 16
      */
    var limit: js.UndefOr[Double] = js.undefined
    
    /**
      * @default false
      */
    var mkdirp: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setClobber(value: Boolean): Self = StObject.set(x, "clobber", value.asInstanceOf[js.Any])
      
      inline def setClobberUndefined: Self = StObject.set(x, "clobber", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setMkdirp(value: Boolean): Self = StObject.set(x, "mkdirp", value.asInstanceOf[js.Any])
      
      inline def setMkdirpUndefined: Self = StObject.set(x, "mkdirp", js.undefined)
    }
  }
}
