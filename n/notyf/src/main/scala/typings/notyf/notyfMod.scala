package typings.notyf

import typings.notyf.anon.DeepPartialINotyfNotifica
import typings.notyf.anon.PartialINotyfNotification
import typings.notyf.anon.PartialINotyfOptions
import typings.notyf.notyfModelsMod.NotyfArray
import typings.notyf.notyfModelsMod.NotyfNotification
import typings.notyf.notyfOptionsMod.INotyfOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("notyf/notyf", JSImport.Namespace)
@js.native
object notyfMod extends js.Object {
  
  @js.native
  trait Notyf extends js.Object {
    
    var _pushNotification: js.Any = js.native
    
    var _removeNotification: js.Any = js.native
    
    /**
      * Assigns properties to a config object based on two rules:
      * 1. If the config object already sets that prop, leave it as so
      * 2. Otherwise, use the default prop from the global options
      *
      * It's intended to build the final config object to open a notification. e.g. if
      * 'dismissible' is not set, then use the value from the global config.
      *
      * @param props - properties to be assigned to the config object
      * @param config - object whose properties need to be set
      */
    var assignProps: js.Any = js.native
    
    def dismiss(notification: NotyfNotification): Unit = js.native
    
    def dismissAll(): Unit = js.native
    
    def error(payload: String): NotyfNotification = js.native
    def error(payload: PartialINotyfNotification): NotyfNotification = js.native
    
    var normalizeOptions: js.Any = js.native
    
    var notifications: NotyfArray[NotyfNotification] = js.native
    
    def open(options: DeepPartialINotyfNotifica): NotyfNotification = js.native
    
    var options: INotyfOptions = js.native
    
    var registerTypes: js.Any = js.native
    
    def success(payload: String): NotyfNotification = js.native
    def success(payload: PartialINotyfNotification): NotyfNotification = js.native
    
    var view: js.Any = js.native
  }
  
  @js.native
  class default () extends Notyf {
    def this(opts: PartialINotyfOptions) = this()
  }
}
