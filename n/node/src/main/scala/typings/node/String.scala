package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Node.js ESNEXT support
@js.native
trait String extends js.Object {
  
  /** Returns a copy with trailing whitespace removed. */
  def trimEnd(): java.lang.String = js.native
  
  /** Removes whitespace from the left end of a string. */
  def trimLeft(): java.lang.String = js.native
  
  /** Removes whitespace from the right end of a string. */
  def trimRight(): java.lang.String = js.native
  
  /** Returns a copy with leading whitespace removed. */
  def trimStart(): java.lang.String = js.native
}
object String {
  
  @scala.inline
  def apply(
    trimEnd: () => java.lang.String,
    trimLeft: () => java.lang.String,
    trimRight: () => java.lang.String,
    trimStart: () => java.lang.String
  ): String = {
    val __obj = js.Dynamic.literal(trimEnd = js.Any.fromFunction0(trimEnd), trimLeft = js.Any.fromFunction0(trimLeft), trimRight = js.Any.fromFunction0(trimRight), trimStart = js.Any.fromFunction0(trimStart))
    __obj.asInstanceOf[String]
  }
  
  @scala.inline
  implicit class StringOps[Self <: String] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTrimEnd(value: () => java.lang.String): Self = this.set("trimEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTrimLeft(value: () => java.lang.String): Self = this.set("trimLeft", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTrimRight(value: () => java.lang.String): Self = this.set("trimRight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTrimStart(value: () => java.lang.String): Self = this.set("trimStart", js.Any.fromFunction0(value))
  }
}
