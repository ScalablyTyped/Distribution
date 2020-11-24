package typings.multimatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<minimatch.minimatch.IOptions> */
@js.native
trait Options extends js.Object {
  
  val debug: js.UndefOr[Boolean] = js.native
  
  val dot: js.UndefOr[Boolean] = js.native
  
  val flipNegate: js.UndefOr[Boolean] = js.native
  
  val matchBase: js.UndefOr[Boolean] = js.native
  
  val nobrace: js.UndefOr[Boolean] = js.native
  
  val nocase: js.UndefOr[Boolean] = js.native
  
  val nocomment: js.UndefOr[Boolean] = js.native
  
  val noext: js.UndefOr[Boolean] = js.native
  
  val noglobstar: js.UndefOr[Boolean] = js.native
  
  val nonegate: js.UndefOr[Boolean] = js.native
  
  val nonull: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDot(value: Boolean): Self = this.set("dot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDot: Self = this.set("dot", js.undefined)
    
    @scala.inline
    def setFlipNegate(value: Boolean): Self = this.set("flipNegate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlipNegate: Self = this.set("flipNegate", js.undefined)
    
    @scala.inline
    def setMatchBase(value: Boolean): Self = this.set("matchBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchBase: Self = this.set("matchBase", js.undefined)
    
    @scala.inline
    def setNobrace(value: Boolean): Self = this.set("nobrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNobrace: Self = this.set("nobrace", js.undefined)
    
    @scala.inline
    def setNocase(value: Boolean): Self = this.set("nocase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNocase: Self = this.set("nocase", js.undefined)
    
    @scala.inline
    def setNocomment(value: Boolean): Self = this.set("nocomment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNocomment: Self = this.set("nocomment", js.undefined)
    
    @scala.inline
    def setNoext(value: Boolean): Self = this.set("noext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoext: Self = this.set("noext", js.undefined)
    
    @scala.inline
    def setNoglobstar(value: Boolean): Self = this.set("noglobstar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoglobstar: Self = this.set("noglobstar", js.undefined)
    
    @scala.inline
    def setNonegate(value: Boolean): Self = this.set("nonegate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonegate: Self = this.set("nonegate", js.undefined)
    
    @scala.inline
    def setNonull(value: Boolean): Self = this.set("nonull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonull: Self = this.set("nonull", js.undefined)
  }
}
