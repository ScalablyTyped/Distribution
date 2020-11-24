package typings.mustache.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A simple string scanner that is used by the template parser to find tokens in template strings.
  */
@js.native
trait MustacheScanner extends js.Object {
  
  /**
    * Returns `true` if the tail is empty (end of string).
    */
  def eos(): Boolean = js.native
  
  var pos: Double = js.native
  
  /**
    * Tries to match the given regular expression at the current position.
    *
    * @param re
    * The regex-pattern to match.
    *
    * @returns
    * The matched text if it can match, the empty string otherwise.
    */
  def scan(re: RegExp): String = js.native
  
  /**
    * Skips all text until the given regular expression can be matched.
    *
    * @param re
    * The regex-pattern to match.
    *
    * @returns
    * Returns the skipped string, which is the entire tail if no match can be made.
    */
  def scanUntil(re: RegExp): String = js.native
  
  var string: String = js.native
  
  var tail: String = js.native
}
object MustacheScanner {
  
  @scala.inline
  def apply(
    eos: () => Boolean,
    pos: Double,
    scan: RegExp => String,
    scanUntil: RegExp => String,
    string: String,
    tail: String
  ): MustacheScanner = {
    val __obj = js.Dynamic.literal(eos = js.Any.fromFunction0(eos), pos = pos.asInstanceOf[js.Any], scan = js.Any.fromFunction1(scan), scanUntil = js.Any.fromFunction1(scanUntil), string = string.asInstanceOf[js.Any], tail = tail.asInstanceOf[js.Any])
    __obj.asInstanceOf[MustacheScanner]
  }
  
  @scala.inline
  implicit class MustacheScannerOps[Self <: MustacheScanner] (val x: Self) extends AnyVal {
    
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
    def setEos(value: () => Boolean): Self = this.set("eos", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPos(value: Double): Self = this.set("pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScan(value: RegExp => String): Self = this.set("scan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScanUntil(value: RegExp => String): Self = this.set("scanUntil", js.Any.fromFunction1(value))
    
    @scala.inline
    def setString(value: String): Self = this.set("string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTail(value: String): Self = this.set("tail", value.asInstanceOf[js.Any])
  }
}
