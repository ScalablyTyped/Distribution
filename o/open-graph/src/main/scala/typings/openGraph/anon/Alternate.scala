package typings.openGraph.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alternate extends js.Object {
  
  /** An array of other locales this page is available in. */
  var alternate: js.UndefOr[String | js.Array[String]] = js.native
}
object Alternate {
  
  @scala.inline
  def apply(): Alternate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alternate]
  }
  
  @scala.inline
  implicit class AlternateOps[Self <: Alternate] (val x: Self) extends AnyVal {
    
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
    def setAlternateVarargs(value: String*): Self = this.set("alternate", js.Array(value :_*))
    
    @scala.inline
    def setAlternate(value: String | js.Array[String]): Self = this.set("alternate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternate: Self = this.set("alternate", js.undefined)
  }
}
