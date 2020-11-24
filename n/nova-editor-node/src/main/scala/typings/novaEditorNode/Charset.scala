package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/charset/
@js.native
trait Charset extends js.Object {
  
  def concat(charsets: Charset*): Charset = js.native
  
  def intersect(charsets: Charset*): Charset = js.native
}
object Charset {
  
  @scala.inline
  def apply(concat: /* repeated */ Charset => Charset, intersect: /* repeated */ Charset => Charset): Charset = {
    val __obj = js.Dynamic.literal(concat = js.Any.fromFunction1(concat), intersect = js.Any.fromFunction1(intersect))
    __obj.asInstanceOf[Charset]
  }
  
  @scala.inline
  implicit class CharsetOps[Self <: Charset] (val x: Self) extends AnyVal {
    
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
    def setConcat(value: /* repeated */ Charset => Charset): Self = this.set("concat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIntersect(value: /* repeated */ Charset => Charset): Self = this.set("intersect", js.Any.fromFunction1(value))
  }
}
