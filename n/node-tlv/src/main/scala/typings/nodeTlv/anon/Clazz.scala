package typings.nodeTlv.anon

import typings.nodeTlv.nodeTlvStrings.`context specific`
import typings.nodeTlv.nodeTlvStrings.`private`
import typings.nodeTlv.nodeTlvStrings.application
import typings.nodeTlv.nodeTlvStrings.constructed
import typings.nodeTlv.nodeTlvStrings.primitive
import typings.nodeTlv.nodeTlvStrings.universal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clazz extends js.Object {
  
  var clazz: js.UndefOr[universal | application | (`context specific`) | `private`] = js.native
  
  var encoding: primitive | constructed = js.native
}
object Clazz {
  
  @scala.inline
  def apply(encoding: primitive | constructed): Clazz = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clazz]
  }
  
  @scala.inline
  implicit class ClazzOps[Self <: Clazz] (val x: Self) extends AnyVal {
    
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
    def setEncoding(value: primitive | constructed): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClazz(value: universal | application | (`context specific`) | `private`): Self = this.set("clazz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClazz: Self = this.set("clazz", js.undefined)
  }
}
