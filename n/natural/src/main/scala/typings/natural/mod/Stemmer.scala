package typings.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stemmer extends js.Object {
  
  def attach(): Unit = js.native
  
  def stem(token: String): String = js.native
  
  def tokenizeAndStem(text: String): js.Array[String] = js.native
}
object Stemmer {
  
  @scala.inline
  def apply(attach: () => Unit, stem: String => String, tokenizeAndStem: String => js.Array[String]): Stemmer = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction0(attach), stem = js.Any.fromFunction1(stem), tokenizeAndStem = js.Any.fromFunction1(tokenizeAndStem))
    __obj.asInstanceOf[Stemmer]
  }
  
  @scala.inline
  implicit class StemmerOps[Self <: Stemmer] (val x: Self) extends AnyVal {
    
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
    def setAttach(value: () => Unit): Self = this.set("attach", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStem(value: String => String): Self = this.set("stem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTokenizeAndStem(value: String => js.Array[String]): Self = this.set("tokenizeAndStem", js.Any.fromFunction1(value))
  }
}
