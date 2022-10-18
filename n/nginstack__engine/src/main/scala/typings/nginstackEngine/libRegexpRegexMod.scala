package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRegexpRegexMod {
  
  inline def apply(pattern: String): Unit = ^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(pattern: String, sensitivity: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], sensitivity.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(pattern: String, sensitivity: Double, syntax: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], sensitivity.asInstanceOf[js.Any], syntax.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(pattern: String, sensitivity: Null, syntax: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], sensitivity.asInstanceOf[js.Any], syntax.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/regexp/Regex", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Regex {
    def this(pattern: String) = this()
    def this(pattern: String, sensitivity: Double) = this()
    def this(pattern: String, sensitivity: Double, syntax: Double) = this()
    def this(pattern: String, sensitivity: Null, syntax: Double) = this()
  }
  @JSImport("@nginstack/engine/lib/regexp/Regex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/regexp/Regex", "CARET_AT_OFFSET")
  @js.native
  val CARET_AT_OFFSET: Double = js.native
  
  @JSImport("@nginstack/engine/lib/regexp/Regex", "CARET_AT_ZERO")
  @js.native
  val CARET_AT_ZERO: Double = js.native
  
  @JSImport("@nginstack/engine/lib/regexp/Regex", "CARET_WONT_MATCH")
  @js.native
  val CARET_WONT_MATCH: Double = js.native
  
  @JSImport("@nginstack/engine/lib/regexp/Regex", "CASE_INSENSITIVE")
  @js.native
  val CASE_INSENSITIVE: Double = js.native
  
  @JSImport("@nginstack/engine/lib/regexp/Regex", "CASE_SENSITIVE")
  @js.native
  val CASE_SENSITIVE: Double = js.native
  
  @JSImport("@nginstack/engine/lib/regexp/Regex", "SYNTAX_FIXED_STRING")
  @js.native
  val SYNTAX_FIXED_STRING: Double = js.native
  
  @JSImport("@nginstack/engine/lib/regexp/Regex", "SYNTAX_REG_EXP")
  @js.native
  val SYNTAX_REG_EXP: Double = js.native
  
  @JSImport("@nginstack/engine/lib/regexp/Regex", "SYNTAX_REG_EXP2")
  @js.native
  val SYNTAX_REG_EXP2: Double = js.native
  
  @JSImport("@nginstack/engine/lib/regexp/Regex", "SYNTAX_W3C_XML_SCHEMA_11")
  @js.native
  val SYNTAX_W3C_XML_SCHEMA_11: Double = js.native
  
  @JSImport("@nginstack/engine/lib/regexp/Regex", "SYNTAX_WILDCARD")
  @js.native
  val SYNTAX_WILDCARD: Double = js.native
  
  @JSImport("@nginstack/engine/lib/regexp/Regex", "SYNTAX_WILDCARD_UNIX")
  @js.native
  val SYNTAX_WILDCARD_UNIX: Double = js.native
  
  @js.native
  trait Regex extends StObject {
    
    def cap(matchedIndex: Double): String = js.native
    
    def captureCount(): Double = js.native
    
    def capturedTexts(): js.Array[String] = js.native
    
    def exactMatch(str: String): Boolean = js.native
    
    def getCaseSensitivity(): Double = js.native
    
    def getErrorString(): String = js.native
    
    def getPattern(): String = js.native
    
    def getPatternSyntax(): Double = js.native
    
    def indexIn(str: String): Double = js.native
    def indexIn(str: String, offSet: Double): Double = js.native
    def indexIn(str: String, offSet: Double, caretMode: Double): Double = js.native
    def indexIn(str: String, offSet: Null, caretMode: Double): Double = js.native
    
    def isEmpty(): Boolean = js.native
    
    def isMinimal(): Boolean = js.native
    
    def isValid(): Boolean = js.native
    
    def lastIndexIn(str: String, offSet: Double, caretMode: Double): Double = js.native
    
    def matchedLength(): Double = js.native
    
    def pos(n: Double): Double = js.native
    
    def setCaseSensitivity(constCaseSensitive: Any): Unit = js.native
    
    def setMinimal(isMinimal: Boolean): Unit = js.native
    
    def setPattern(pattern: String): Unit = js.native
    
    def setPatternSyntax(constPatternSyntax: Double): Unit = js.native
  }
}
