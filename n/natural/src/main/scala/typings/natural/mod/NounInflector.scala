package typings.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NounInflector extends js.Object {
  
  def pluralize(token: String): String = js.native
  
  def singularize(token: String): String = js.native
}
object NounInflector {
  
  @scala.inline
  def apply(pluralize: String => String, singularize: String => String): NounInflector = {
    val __obj = js.Dynamic.literal(pluralize = js.Any.fromFunction1(pluralize), singularize = js.Any.fromFunction1(singularize))
    __obj.asInstanceOf[NounInflector]
  }
  
  @scala.inline
  implicit class NounInflectorOps[Self <: NounInflector] (val x: Self) extends AnyVal {
    
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
    def setPluralize(value: String => String): Self = this.set("pluralize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSingularize(value: String => String): Self = this.set("singularize", js.Any.fromFunction1(value))
  }
}
