package typings.mocha.anon

import typings.mocha.Mocha.Test
import typings.mocha.Mocha.reporters.Base.ColorMap
import typings.mocha.Mocha.reporters.Base.SymbolMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBase extends js.Object {
  
  /**
    * Color `str` with the given `type` (from `colors`)
    *
    * @see https://mochajs.org/api/module-base#.color
    */
  def color(`type`: String, str: String): String = js.native
  
  /**
    * Default color map
    *
    * @see https://mochajs.org/api/module-base#.colors
    */
  val colors: ColorMap = js.native
  
  /**
    * ANSI TTY control sequences common among reporters.
    *
    * @see https://mochajs.org/api/module-base#.cursor
    */
  val cursor: Typeofcursor = js.native
  
  /**
    * Returns a diff between two strings with colored ANSI output.
    *
    * @see https://mochajs.org/api/module-base#.generateDiff
    */
  def generateDiff(actual: String, expected: String): String = js.native
  
  /**
    * Inline diffs instead of +/-
    *
    * @see https://mochajs.org/api/module-base#.inlineDiffs
    */
  var inlineDiffs: Boolean = js.native
  
  /**
    * Output the given `failures` as a list.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Base.html#.exports.list1
    */
  def list(failures: js.Array[Test]): Unit = js.native
  
  /**
    * Default symbol map
    *
    * @see https://mochajs.org/api/module-base#.symbols
    */
  val symbols: SymbolMap = js.native
  
  /**
    * Enables coloring by default
    *
    * @see https://mochajs.org/api/module-base#.useColors
    */
  var useColors: Boolean = js.native
  
  /**
    * Expose terminal window size
    *
    * @see https://mochajs.org/api/module-base#.window
    */
  val window: Width = js.native
}
object TypeofBase {
  
  @scala.inline
  def apply(
    color: (String, String) => String,
    colors: ColorMap,
    cursor: Typeofcursor,
    generateDiff: (String, String) => String,
    inlineDiffs: Boolean,
    list: js.Array[Test] => Unit,
    symbols: SymbolMap,
    useColors: Boolean,
    window: Width
  ): TypeofBase = {
    val __obj = js.Dynamic.literal(color = js.Any.fromFunction2(color), colors = colors.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], generateDiff = js.Any.fromFunction2(generateDiff), inlineDiffs = inlineDiffs.asInstanceOf[js.Any], list = js.Any.fromFunction1(list), symbols = symbols.asInstanceOf[js.Any], useColors = useColors.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofBase]
  }
  
  @scala.inline
  implicit class TypeofBaseOps[Self <: TypeofBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColor(value: (String, String) => String): Self = this.set("color", js.Any.fromFunction2(value))
    
    @scala.inline
    def setColors(value: ColorMap): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursor(value: Typeofcursor): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateDiff(value: (String, String) => String): Self = this.set("generateDiff", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInlineDiffs(value: Boolean): Self = this.set("inlineDiffs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setList(value: js.Array[Test] => Unit): Self = this.set("list", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSymbols(value: SymbolMap): Self = this.set("symbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseColors(value: Boolean): Self = this.set("useColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindow(value: Width): Self = this.set("window", value.asInstanceOf[js.Any])
  }
}
