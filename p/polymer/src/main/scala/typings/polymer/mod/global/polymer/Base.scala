package typings.polymer.mod.global.polymer

import org.scalablytyped.runtime.StringDictionary
import typings.std.ArrayConstructor
import typings.std.BooleanConstructor
import typings.std.Date
import typings.std.DateConstructor
import typings.std.HTMLElement
import typings.std.NumberConstructor
import typings.std.ObjectConstructor
import typings.std.StringConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Base
  extends CommonBase
     with /** Need to allow all properties for callback methods. */
/* prop */ StringDictionary[js.Any] {
  
  // Has to live on Base because it is incompatible with
  // HTMLElement#toggleAttribute
  var toggleAttribute: js.UndefOr[
    js.Function3[
      /* name */ String, 
      /* bool */ js.UndefOr[Boolean], 
      /* node */ js.UndefOr[HTMLElement], 
      Unit
    ]
  ] = js.native
}
object Base {
  
  @scala.inline
  def apply(
    deserialize: (js.UndefOr[js.Function2[/* value */ String, /* type */ NumberConstructor, Double]]) with (js.UndefOr[js.Function2[/* value */ String, /* type */ BooleanConstructor, Boolean]]) with (js.UndefOr[js.Function2[/* value */ String, /* type */ ObjectConstructor, js.Object]]) with (js.UndefOr[js.Function2[/* value */ String, /* type */ ArrayConstructor, js.Array[_]]]) with (js.UndefOr[js.Function2[/* value */ String, /* type */ DateConstructor, Date]]) with (js.UndefOr[js.Function2[/* value */ String, /* type */ StringConstructor, String]]),
    is: String
  ): Base = {
    val __obj = js.Dynamic.literal(deserialize = deserialize.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
  
  @scala.inline
  implicit class BaseOps[Self <: Base] (val x: Self) extends AnyVal {
    
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
    def setToggleAttribute(
      value: (/* name */ String, /* bool */ js.UndefOr[Boolean], /* node */ js.UndefOr[HTMLElement]) => Unit
    ): Self = this.set("toggleAttribute", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteToggleAttribute: Self = this.set("toggleAttribute", js.undefined)
  }
}
