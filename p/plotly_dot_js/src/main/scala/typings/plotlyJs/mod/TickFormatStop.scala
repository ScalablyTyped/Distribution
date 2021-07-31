package typings.plotlyJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TickFormatStop extends StObject {
  
  /**
    * Range [`min`, `max`], where `min`, `max` - dtick values
    * which describe some zoom level, it is possible to omit `min` or `max`
    * value by passing `null`
    */
  var dtickrange: js.Tuple2[DTickValue | Null, DTickValue | Null]
  
  /**
    * Determines whether or not this stop is used. If `false`,
    * this stop is ignored even within its `dtickrange`.
    */
  var enabled: Boolean
  
  /**
    * When used in a template, named items are created in the output figure
    * in addition to any items the figure already has in this array.
    * You can modify these items in the output figure by making
    * your own item with `templateitemname` matching this `name`
    * alongside your modifications (including `visible: false` or `enabled: false` to hide it).
    * Has no effect outside of a template.
    */
  var name: String
  
  /**
    * Used to refer to a named item in this array in the template.
    * Named items from the template will be created even without
    * a matching item in the input figure, but you can modify one by
    * making an item with `templateitemname` matching its `name`,
    * alongside your modifications (including `visible: false` or `enabled: false` to hide it).
    * If there is no template or no matching item, this item will be hidden
    * unless you explicitly show it with `visible: true`.
    */
  var templateitemname: String
  
  /**
    * dtickformat for described zoom level, the same as `tickformat`
    */
  var value: String
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
  implicit class TickFormatStopMutableBuilder[Self <: TickFormatStop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDtickrange(value: js.Tuple2[DTickValue | Null, DTickValue | Null]): Self = StObject.set(x, "dtickrange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateitemname(value: String): Self = StObject.set(x, "templateitemname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
