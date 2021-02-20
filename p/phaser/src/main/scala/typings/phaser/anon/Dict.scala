package typings.phaser.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dict
  extends /* _ */ StringDictionary[js.Any] {
  
  var name: js.UndefOr[String] = js.native
}
object Dict {
  
  @scala.inline
  def apply(): Dict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dict]
  }
  
  @scala.inline
  implicit class DictMutableBuilder[Self <: Dict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
