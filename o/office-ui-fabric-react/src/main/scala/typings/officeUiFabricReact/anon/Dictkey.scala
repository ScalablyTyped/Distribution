package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactInstance
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictkey extends /* key */ StringDictionary[ReactInstance] {
  
  var navigatedMonth: HTMLElement = js.native
}
object Dictkey {
  
  @scala.inline
  def apply(navigatedMonth: HTMLElement): Dictkey = {
    val __obj = js.Dynamic.literal(navigatedMonth = navigatedMonth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  
  @scala.inline
  implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNavigatedMonth(value: HTMLElement): Self = StObject.set(x, "navigatedMonth", value.asInstanceOf[js.Any])
  }
}
