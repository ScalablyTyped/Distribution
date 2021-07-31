package typings.mvdanSh

import typings.mvdanSh.mod.LangVariant
import typings.mvdanSh.mod.Node
import typings.mvdanSh.mod.Parser
import typings.mvdanSh.mod.ParserOption
import typings.mvdanSh.mod.Printer
import typings.mvdanSh.mod.PrinterOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait BinaryNextLine extends StObject {
    
    def BinaryNextLine(enabled: Boolean): PrinterOption = js.native
    
    // helpers and utils
    def DebugPrint(node: Node): Unit = js.native
    
    def FunctionNextLine(enabled: Boolean): PrinterOption = js.native
    
    def Indent(spaces: Double): PrinterOption = js.native
    
    def KeepComments(): ParserOption = js.native
    def KeepComments(enabled: Boolean): ParserOption = js.native
    
    def KeepPadding(enabled: Boolean): PrinterOption = js.native
    
    // variant
    var LangBash: typings.mvdanSh.mod.LangVariant.LangBash = js.native
    
    var LangMirBSDKorn: typings.mvdanSh.mod.LangVariant.LangMirBSDKorn = js.native
    
    var LangPOSIX: typings.mvdanSh.mod.LangVariant.LangPOSIX = js.native
    
    def Minify(enabled: Boolean): PrinterOption = js.native
    
    // parser
    def NewParser(options: ParserOption*): Parser = js.native
    
    // printer
    def NewPrinter(options: PrinterOption*): Printer = js.native
    
    def NodeType(node: Node): String = js.native
    
    def SpaceRedirects(enabled: Boolean): PrinterOption = js.native
    
    def SplitBraces[T](word: T): T = js.native
    
    def StopAt(word: String): ParserOption = js.native
    
    def SwitchCaseIndent(enabled: Boolean): PrinterOption = js.native
    
    def Variant(lang: LangVariant): ParserOption = js.native
    
    def Walk(node: Node, walker: js.Function1[/* node */ Node, Boolean]): Unit = js.native
  }
}
