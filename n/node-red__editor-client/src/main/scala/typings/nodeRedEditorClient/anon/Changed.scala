package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.nodeRedEditorClientStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Changed extends StObject {
  
  var changed: js.Object = js.native
  
  var config: js.Object = js.native
  
  var rev: String = js.native
  
  var t: replace = js.native
}
object Changed {
  
  @scala.inline
  def apply(changed: js.Object, config: js.Object, rev: String, t: replace): Changed = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[Changed]
  }
  
  @scala.inline
  implicit class ChangedMutableBuilder[Self <: Changed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChanged(value: js.Object): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: js.Object): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT(value: replace): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
