package typings.nodeJsflRunner

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ErrnoException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-jsfl-runner", "createJSFL")
  @js.native
  def createJSFL(
    jsfl: JSFL,
    fileName: String,
    initParams: js.Array[_],
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  
  @JSImport("node-jsfl-runner", "deleteJSFL")
  @js.native
  def deleteJSFL(fileName: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  
  @JSImport("node-jsfl-runner", "runJSFL")
  @js.native
  def runJSFL(flashLocation: String, fileName: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  
  @js.native
  trait JSFL
    extends /* index */ StringDictionary[js.Any] {
    
    def init(args: js.Any*): Unit = js.native
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
