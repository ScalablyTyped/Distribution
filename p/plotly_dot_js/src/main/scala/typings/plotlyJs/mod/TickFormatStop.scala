package typings.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TickFormatStop extends js.Object {
  
  /**
    * Range [`min`, `max`], where `min`, `max` - dtick values
    * which describe some zoom level, it is possible to omit `min` or `max`
    * value by passing `null`
    */
  var dtickrange: js.Tuple2[DTickValue | Null, DTickValue | Null] = js.native
  
  /**
    * Determines whether or not this stop is used. If `false`,
    * this stop is ignored even within its `dtickrange`.
    */
  var enabled: Boolean = js.native
  
  /**
    * When used in a template, named items are created in the output figure
    * in addition to any items the figure already has in this array.
    * You can modify these items in the output figure by making
    * your own item with `templateitemname` matching this `name`
    * alongside your modifications (including `visible: false` or `enabled: false` to hide it).
    * Has no effect outside of a template.
    */
  var name: String = js.native
  
  /**
    * Used to refer to a named item in this array in the template.
    * Named items from the template will be created even without
    * a matching item in the input figure, but you can modify one by
    * making an item with `templateitemname` matching its `name`,
    * alongside your modifications (including `visible: false` or `enabled: false` to hide it).
    * If there is no template or no matching item, this item will be hidden
    * unless you explicitly show it with `visible: true`.
    */
  var templateitemname: String = js.native
  
  /**
    * dtickformat for described zoom level, the same as `tickformat`
    */
  var value: String = js.native
}
object TickFormatStop {
  
  @scala.inline
  def apply(
    dtickrange: js.Tuple2[DTickValue | Null, DTickValue | Null],
    enabled: Boolean,
    name: String,
    templateitemname: String,
    value: String
  ): TickFormatStop = {
    val __obj = js.Dynamic.literal(dtickrange = dtickrange.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], templateitemname = templateitemname.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TickFormatStop]
  }
  
  @scala.inline
  implicit class TickFormatStopOps[Self <: TickFormatStop] (val x: Self) extends AnyVal {
    
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
    def setDtickrange(value: js.Tuple2[DTickValue | Null, DTickValue | Null]): Self = this.set("dtickrange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateitemname(value: String): Self = this.set("templateitemname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
