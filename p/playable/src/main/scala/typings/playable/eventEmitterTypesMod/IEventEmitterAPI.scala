package typings.playable.eventEmitterTypesMod

import typings.eventemitter3.mod.ListenerFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEventEmitterAPI extends js.Object {
  
  var off: js.UndefOr[
    js.Function4[
      /* event */ String, 
      /* fn */ js.UndefOr[ListenerFn[js.Array[_]]], 
      /* context */ js.UndefOr[js.Any], 
      /* once */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.native
  
  var on: js.UndefOr[
    js.Function3[
      /* event */ String, 
      /* fn */ ListenerFn[js.Array[_]], 
      /* context */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.native
}
object IEventEmitterAPI {
  
  @scala.inline
  def apply(): IEventEmitterAPI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEventEmitterAPI]
  }
  
  @scala.inline
  implicit class IEventEmitterAPIOps[Self <: IEventEmitterAPI] (val x: Self) extends AnyVal {
    
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
    def setOff(
      value: (/* event */ String, /* fn */ js.UndefOr[ListenerFn[js.Array[_]]], /* context */ js.UndefOr[js.Any], /* once */ js.UndefOr[Boolean]) => IEventEmitterAPI
    ): Self = this.set("off", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOff: Self = this.set("off", js.undefined)
    
    @scala.inline
    def setOn(
      value: (/* event */ String, /* fn */ ListenerFn[js.Array[_]], /* context */ js.UndefOr[js.Any]) => IEventEmitterAPI
    ): Self = this.set("on", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
  }
}
