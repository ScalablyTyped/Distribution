package typings.nodeRedEditorClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodesFontAwesome extends js.Object {
  
  def getIconList(): js.Array[String] = js.native
  
  def getIconUnicode(name: String): String = js.native
}
object NodesFontAwesome {
  
  @scala.inline
  def apply(getIconList: () => js.Array[String], getIconUnicode: String => String): NodesFontAwesome = {
    val __obj = js.Dynamic.literal(getIconList = js.Any.fromFunction0(getIconList), getIconUnicode = js.Any.fromFunction1(getIconUnicode))
    __obj.asInstanceOf[NodesFontAwesome]
  }
  
  @scala.inline
  implicit class NodesFontAwesomeOps[Self <: NodesFontAwesome] (val x: Self) extends AnyVal {
    
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
    def setGetIconList(value: () => js.Array[String]): Self = this.set("getIconList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIconUnicode(value: String => String): Self = this.set("getIconUnicode", js.Any.fromFunction1(value))
  }
}
