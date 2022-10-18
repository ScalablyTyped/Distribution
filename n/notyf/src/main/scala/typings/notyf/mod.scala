package typings.notyf

import typings.notyf.anon.DeepPartialINotyfNotifica
import typings.notyf.anon.PartialINotyfOptions
import typings.notyf.notyfDotoptionsMod.INotyfOptions
import typings.notyf.notyfMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("notyf", "DEFAULT_OPTIONS")
  @js.native
  val DEFAULT_OPTIONS: INotyfOptions = js.native
  
  @JSImport("notyf", "Notyf")
  @js.native
  open class Notyf () extends default {
    def this(opts: PartialINotyfOptions) = this()
  }
  
  @JSImport("notyf", "NotyfArray")
  @js.native
  open class NotyfArray[T] ()
    extends typings.notyf.notyfDotmodelsMod.NotyfArray[T]
  
  @JSImport("notyf", "NotyfArrayEvent")
  @js.native
  object NotyfArrayEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.notyf.notyfDotmodelsMod.NotyfArrayEvent & Double] = js.native
    
    /* 0 */ val Add: typings.notyf.notyfDotmodelsMod.NotyfArrayEvent.Add & Double = js.native
    
    /* 1 */ val Remove: typings.notyf.notyfDotmodelsMod.NotyfArrayEvent.Remove & Double = js.native
  }
  
  @JSImport("notyf", "NotyfEvent")
  @js.native
  object NotyfEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.notyf.notyfDotoptionsMod.NotyfEvent & String] = js.native
    
    /* "click" */ val Click: typings.notyf.notyfDotoptionsMod.NotyfEvent.Click & String = js.native
    
    /* "dismiss" */ val Dismiss: typings.notyf.notyfDotoptionsMod.NotyfEvent.Dismiss & String = js.native
  }
  
  @JSImport("notyf", "NotyfNotification")
  @js.native
  open class NotyfNotification protected ()
    extends typings.notyf.notyfDotmodelsMod.NotyfNotification {
    def this(options: DeepPartialINotyfNotifica) = this()
  }
  
  @JSImport("notyf", "NotyfView")
  @js.native
  open class NotyfView ()
    extends typings.notyf.notyfDotviewMod.NotyfView
}
