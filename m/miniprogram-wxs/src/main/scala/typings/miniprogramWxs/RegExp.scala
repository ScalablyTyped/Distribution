package typings.miniprogramWxs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegExp extends StObject {
  
  // Non-standard extensions
  def compile(): this.type
  
  /**
    * Executes a search on a string using a regular expression pattern, and returns an array containing the results of that search.
    * @param string The String object or string literal on which to perform the search.
    */
  def exec(string: java.lang.String): RegExpExecArray | Null
  
  /** Returns a Boolean value indicating the state of the global flag (g) used with a regular expression. Default is false. Read-only. */
  val global: scala.Boolean
  
  /** Returns a Boolean value indicating the state of the ignoreCase flag (i) used with a regular expression. Default is false. Read-only. */
  val ignoreCase: scala.Boolean
  
  var lastIndex: Double
  
  /** Returns a Boolean value indicating the state of the multiline flag (m) used with a regular expression. Default is false. Read-only. */
  val multiline: scala.Boolean
  
  /** Returns a copy of the text of the regular expression pattern. Read-only. The regExp argument is a Regular expression object. It can be a variable name or a literal. */
  val source: java.lang.String
  
  /**
    * Returns a Boolean value that indicates whether or not a pattern exists in a searched string.
    * @param string String on which to perform the search.
    */
  def test(string: java.lang.String): scala.Boolean
}
object RegExp {
  
  inline def apply(
    compile: () => RegExp,
    exec: java.lang.String => RegExpExecArray | Null,
    global: scala.Boolean,
    ignoreCase: scala.Boolean,
    lastIndex: Double,
    multiline: scala.Boolean,
    source: java.lang.String,
    test: java.lang.String => scala.Boolean
  ): RegExp = {
    val __obj = js.Dynamic.literal(compile = js.Any.fromFunction0(compile), exec = js.Any.fromFunction1(exec), global = global.asInstanceOf[js.Any], ignoreCase = ignoreCase.asInstanceOf[js.Any], lastIndex = lastIndex.asInstanceOf[js.Any], multiline = multiline.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[RegExp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegExp] (val x: Self) extends AnyVal {
    
    inline def setCompile(value: () => RegExp): Self = StObject.set(x, "compile", js.Any.fromFunction0(value))
    
    inline def setExec(value: java.lang.String => RegExpExecArray | Null): Self = StObject.set(x, "exec", js.Any.fromFunction1(value))
    
    inline def setGlobal(value: scala.Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCase(value: scala.Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    inline def setLastIndex(value: Double): Self = StObject.set(x, "lastIndex", value.asInstanceOf[js.Any])
    
    inline def setMultiline(value: scala.Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
    
    inline def setSource(value: java.lang.String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTest(value: java.lang.String => scala.Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
  }
}
