package typings.nodeJsflRunner

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-jsfl-runner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createJSFL(
    jsfl: JSFL,
    fileName: String,
    initParams: js.Array[Any],
    callback: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ /* err */ Any, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createJSFL")(jsfl.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], initParams.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def deleteJSFL(
    fileName: String,
    callback: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ /* err */ Any, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteJSFL")(fileName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def runJSFL(
    flashLocation: String,
    fileName: String,
    callback: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ /* err */ Any, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runJSFL")(flashLocation.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait JSFL
    extends StObject
       with /* index */ StringDictionary[Any] {
    
    def init(args: Any*): Unit
  }
  object JSFL {
    
    inline def apply(init: /* repeated */ Any => Unit): JSFL = {
      val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
      __obj.asInstanceOf[JSFL]
    }
    
    extension [Self <: JSFL](x: Self) {
      
      inline def setInit(value: /* repeated */ Any => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    }
  }
}
