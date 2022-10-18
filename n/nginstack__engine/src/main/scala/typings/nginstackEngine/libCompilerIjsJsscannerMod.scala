package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCompilerIjsJsscannerMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/compiler/ijs/JSScanner", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with JSScanner {
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    var lineBreaks: Boolean = js.native
    
    /* CompleteClass */
    var lineBreaksInsideString: Boolean = js.native
    
    /* CompleteClass */
    override def nextToken(): String = js.native
    
    /* CompleteClass */
    var position: Double = js.native
    
    /* CompleteClass */
    override def prepare(source: String): Unit = js.native
    
    /* CompleteClass */
    var source: String = js.native
    
    /* CompleteClass */
    var token: String = js.native
    
    /* CompleteClass */
    var tokenWord: JSTokenWord = js.native
  }
  @JSImport("@nginstack/engine/lib/compiler/ijs/JSScanner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait JSScanner extends StObject {
    
    def clear(): Unit
    
    var lineBreaks: Boolean
    
    var lineBreaksInsideString: Boolean
    
    def nextToken(): String
    
    var position: Double
    
    def prepare(source: String): Unit
    
    var source: String
    
    var token: String
    
    var tokenWord: JSTokenWord
  }
  object JSScanner {
    
    inline def apply(
      clear: () => Unit,
      lineBreaks: Boolean,
      lineBreaksInsideString: Boolean,
      nextToken: () => String,
      position: Double,
      prepare: String => Unit,
      source: String,
      token: String,
      tokenWord: JSTokenWord
    ): JSScanner = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), lineBreaks = lineBreaks.asInstanceOf[js.Any], lineBreaksInsideString = lineBreaksInsideString.asInstanceOf[js.Any], nextToken = js.Any.fromFunction0(nextToken), position = position.asInstanceOf[js.Any], prepare = js.Any.fromFunction1(prepare), source = source.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], tokenWord = tokenWord.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSScanner]
    }
    
    extension [Self <: JSScanner](x: Self) {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setLineBreaks(value: Boolean): Self = StObject.set(x, "lineBreaks", value.asInstanceOf[js.Any])
      
      inline def setLineBreaksInsideString(value: Boolean): Self = StObject.set(x, "lineBreaksInsideString", value.asInstanceOf[js.Any])
      
      inline def setNextToken(value: () => String): Self = StObject.set(x, "nextToken", js.Any.fromFunction0(value))
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPrepare(value: String => Unit): Self = StObject.set(x, "prepare", js.Any.fromFunction1(value))
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenWord(value: JSTokenWord): Self = StObject.set(x, "tokenWord", value.asInstanceOf[js.Any])
    }
  }
  
  type JSTokenWord = typings.nginstackEngine.libCompilerIjsJstokenwordMod.^
}
