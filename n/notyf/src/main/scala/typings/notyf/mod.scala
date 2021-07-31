package typings.notyf

import typings.notyf.anon.DeepPartialINotyfNotifica
import typings.notyf.anon.PartialINotyfOptions
import typings.notyf.notyfMod.default
import typings.notyf.notyfOptionsMod.INotyfOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("notyf", "DEFAULT_OPTIONS")
  @js.native
  val DEFAULT_OPTIONS: INotyfOptions = js.native
  
  @JSImport("notyf", "Notyf")
  @js.native
  class Notyf () extends default {
    def this(opts: PartialINotyfOptions) = this()
  }
  
  @JSImport("notyf", "NotyfArray")
  @js.native
  class NotyfArray[T] ()
    extends typings.notyf.notyfModelsMod.NotyfArray[T]
  
  @JSImport("notyf", "NotyfArrayEvent")
  @js.native
  object NotyfArrayEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.notyf.notyfModelsMod.NotyfArrayEvent & Double] = js.native
    
    /* 0 */ val Add: typings.notyf.notyfModelsMod.NotyfArrayEvent.Add & Double = js.native
    
    /* 1 */ val Remove: typings.notyf.notyfModelsMod.NotyfArrayEvent.Remove & Double = js.native
  }
  
  @JSImport("notyf", "NotyfEvent")
  @js.native
  object NotyfEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.notyf.notyfOptionsMod.NotyfEvent & String] = js.native
    
    /* "click" */ val Click: typings.notyf.notyfOptionsMod.NotyfEvent.Click & String = js.native
    
    /* "dismiss" */ val Dismiss: typings.notyf.notyfOptionsMod.NotyfEvent.Dismiss & String = js.native
  }
  
  @JSImport("notyf", "NotyfNotification")
  @js.native
  class NotyfNotification protected ()
    extends typings.notyf.notyfModelsMod.NotyfNotification {
    def this(options: DeepPartialINotyfNotifica) = this()
  }
  
  @JSImport("notyf", "NotyfView")
  @js.native
  class NotyfView ()
    extends typings.notyf.notyfViewMod.NotyfView
}
