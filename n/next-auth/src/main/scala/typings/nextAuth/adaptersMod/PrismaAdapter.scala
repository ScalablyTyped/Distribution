package typings.nextAuth.adaptersMod

import typings.nextAuth.anon.ModelMapping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrismaAdapter extends js.Object {
  
  def Adapter(config: ModelMapping): typings.nextAuth.adaptersMod.Adapter[_, _, _, _] = js.native
}
object PrismaAdapter {
  
  @scala.inline
  def apply(Adapter: ModelMapping => Adapter[_, _, _, _]): PrismaAdapter = {
    val __obj = js.Dynamic.literal(Adapter = js.Any.fromFunction1(Adapter))
    __obj.asInstanceOf[PrismaAdapter]
  }
  
  @scala.inline
  implicit class PrismaAdapterOps[Self <: PrismaAdapter] (val x: Self) extends AnyVal {
    
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
    def setAdapter(value: ModelMapping => Adapter[_, _, _, _]): Self = this.set("Adapter", js.Any.fromFunction1(value))
  }
}
