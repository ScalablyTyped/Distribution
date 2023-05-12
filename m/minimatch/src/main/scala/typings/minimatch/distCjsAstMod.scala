package typings.minimatch

import typings.minimatch.mod.MMRegExp
import typings.minimatch.mod.MinimatchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsAstMod {
  
  @JSImport("minimatch/dist/cjs/ast", "AST")
  @js.native
  open class AST () extends StObject {
    def this(`type`: ExtglobType) = this()
    def this(`type`: Null, parent: AST) = this()
    def this(`type`: ExtglobType, parent: AST) = this()
    def this(`type`: Null, parent: Unit, options: MinimatchOptions) = this()
    def this(`type`: Null, parent: AST, options: MinimatchOptions) = this()
    def this(`type`: ExtglobType, parent: Unit, options: MinimatchOptions) = this()
    def this(`type`: ExtglobType, parent: AST, options: MinimatchOptions) = this()
    
    def clone(parent: AST): AST = js.native
    
    def copyIn(part: String): Unit = js.native
    def copyIn(part: AST): Unit = js.native
    
    def hasMagic: js.UndefOr[Boolean] = js.native
    
    def isEnd(): Boolean = js.native
    
    def isStart(): Boolean = js.native
    
    /* private */ var `private`: Any = js.native
    
    def push(parts: (String | AST)*): Unit = js.native
    
    def toJSON(): js.Array[Any] = js.native
    
    def toMMPattern(): MMRegExp | String = js.native
    
    def toRegExpSource(): js.Tuple4[/* re */ String, /* body */ String, /* hasMagic */ Boolean, /* uflag */ Boolean] = js.native
    
    var `type`: ExtglobType | Null = js.native
  }
  /* static members */
  object AST {
    
    @JSImport("minimatch/dist/cjs/ast", "AST")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromGlob(pattern: String): AST = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGlob")(pattern.asInstanceOf[js.Any]).asInstanceOf[AST]
    inline def fromGlob(pattern: String, options: MinimatchOptions): AST = (^.asInstanceOf[js.Dynamic].applyDynamic("fromGlob")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AST]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.minimatch.minimatchStrings.Exclamationmark
    - typings.minimatch.minimatchStrings.Questionmark
    - typings.minimatch.minimatchStrings.Plussign
    - typings.minimatch.minimatchStrings.Asterisk
    - typings.minimatch.minimatchStrings.`@`
  */
  trait ExtglobType extends StObject
  object ExtglobType {
    
    inline def `@`: typings.minimatch.minimatchStrings.`@` = "@".asInstanceOf[typings.minimatch.minimatchStrings.`@`]
    
    inline def Asterisk: typings.minimatch.minimatchStrings.Asterisk = "*".asInstanceOf[typings.minimatch.minimatchStrings.Asterisk]
    
    inline def Exclamationmark: typings.minimatch.minimatchStrings.Exclamationmark = "!".asInstanceOf[typings.minimatch.minimatchStrings.Exclamationmark]
    
    inline def Plussign: typings.minimatch.minimatchStrings.Plussign = "+".asInstanceOf[typings.minimatch.minimatchStrings.Plussign]
    
    inline def Questionmark: typings.minimatch.minimatchStrings.Questionmark = "?".asInstanceOf[typings.minimatch.minimatchStrings.Questionmark]
  }
}
