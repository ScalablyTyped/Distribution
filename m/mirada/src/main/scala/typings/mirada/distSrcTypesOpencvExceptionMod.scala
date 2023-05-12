package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvExceptionMod {
  
  @JSImport("mirada/dist/src/types/opencv/Exception", "Exception")
  @js.native
  /**
    *   Default constructor
    */
  open class Exception () extends StObject {
    /**
      *   Full constructor. Normally the constructor is not called explicitly. Instead, the macros
      * [CV_Error()], [CV_Error_()] and [CV_Assert()] are used.
      */
    def this(_code: int, _err: String, _func: String, _file: String, _line: int) = this()
    
    /**
      *   CVStatus
      *
      */
    var code: int = js.native
    
    var err: String = js.native
    
    var file: String = js.native
    
    def formatMessage(): Unit = js.native
    
    var func: String = js.native
    
    var line: int = js.native
    
    var msg: String = js.native
    
    /**
      *   the error description and the context as a text string.
      */
    def what(): Any = js.native
  }
}
