package typings.mdastUtilToMarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Unsafe extends js.Object {
  
  var after: js.UndefOr[String] = js.native
  
  var atBreak: js.UndefOr[Boolean] = js.native
  
  var before: js.UndefOr[String] = js.native
  
  var character: String = js.native
  
  var inConstruct: js.UndefOr[String | js.Array[String]] = js.native
  
  var notInConstruct: js.UndefOr[String | js.Array[String]] = js.native
}
object Unsafe {
  
  @scala.inline
  def apply(character: String): Unsafe = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any])
    __obj.asInstanceOf[Unsafe]
  }
  
  @scala.inline
  implicit class UnsafeOps[Self <: Unsafe] (val x: Self) extends AnyVal {
    
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
    def setCharacter(value: String): Self = this.set("character", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfter(value: String): Self = this.set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setAtBreak(value: Boolean): Self = this.set("atBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAtBreak: Self = this.set("atBreak", js.undefined)
    
    @scala.inline
    def setBefore(value: String): Self = this.set("before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    
    @scala.inline
    def setInConstructVarargs(value: String*): Self = this.set("inConstruct", js.Array(value :_*))
    
    @scala.inline
    def setInConstruct(value: String | js.Array[String]): Self = this.set("inConstruct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInConstruct: Self = this.set("inConstruct", js.undefined)
    
    @scala.inline
    def setNotInConstructVarargs(value: String*): Self = this.set("notInConstruct", js.Array(value :_*))
    
    @scala.inline
    def setNotInConstruct(value: String | js.Array[String]): Self = this.set("notInConstruct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotInConstruct: Self = this.set("notInConstruct", js.undefined)
  }
}
