package typings.notyf

import typings.notyf.anon.DeepPartialINotyfNotifica
import typings.notyf.anon.PartialINotyfNotification
import typings.notyf.anon.PartialINotyfOptions
import typings.notyf.notyfModelsMod.NotyfArray
import typings.notyf.notyfModelsMod.NotyfNotification
import typings.notyf.notyfOptionsMod.INotyfOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notyfMod {
  
  @JSImport("notyf/notyf", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with Notyf {
    def this(opts: PartialINotyfOptions) = this()
  }
  
  @js.native
  trait Notyf extends StObject {
    
    /* private */ var _pushNotification: js.Any = js.native
    
    /* private */ var _removeNotification: js.Any = js.native
    
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
    /* private */ var assignProps: js.Any = js.native
    
    def dismiss(notification: NotyfNotification): Unit = js.native
    
    def dismissAll(): Unit = js.native
    
    def error(payload: String): NotyfNotification = js.native
    def error(payload: PartialINotyfNotification): NotyfNotification = js.native
    
    /* private */ var normalizeOptions: js.Any = js.native
    
    var notifications: NotyfArray[NotyfNotification] = js.native
    
    def open(options: DeepPartialINotyfNotifica): NotyfNotification = js.native
    
    var options: INotyfOptions = js.native
    
    /* private */ var registerTypes: js.Any = js.native
    
    def success(payload: String): NotyfNotification = js.native
    def success(payload: PartialINotyfNotification): NotyfNotification = js.native
    
    /* private */ var view: js.Any = js.native
  }
}
