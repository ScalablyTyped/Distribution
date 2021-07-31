package typings.nodeJsflRunner

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ErrnoException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-jsfl-runner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createJSFL(
    jsfl: JSFL,
    fileName: String,
    initParams: js.Array[js.Any],
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createJSFL")(jsfl.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], initParams.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def deleteJSFL(fileName: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteJSFL")(fileName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def runJSFL(flashLocation: String, fileName: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runJSFL")(flashLocation.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait JSFL
    extends StObject
       with /* index */ StringDictionary[js.Any] {
    
    def init(args: js.Any*): Unit
  }
  object JSFL {
    
    @scala.inline
    def apply(init: /* repeated */ js.Any => Unit): JSFL = {
      val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
      __obj.asInstanceOf[JSFL]
    }
    
    @scala.inline
    implicit class JSFLMutableBuilder[Self <: JSFL] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInit(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    }
  }
}
