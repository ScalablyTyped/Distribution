package typings.plotlyJs.mod

import typings.plotlyJs.plotlyJsStrings.animate
import typings.plotlyJs.plotlyJsStrings.skip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMenuButton extends StObject {
  
  /**
    * Sets the arguments values to be passed to the Plotly method set in `method` on click.
    */
  var args: js.Array[Any]
  
  /**
    * Sets a 2nd set of `args`, these arguments values are passed to the Plotly method set in
    * method` when clicking this button while in the active state. Use this to create
    * toggle buttons.
    */
  var args2: js.Array[Any]
  
  /**
    * When true, the API method is executed. When false, all other behaviors are
    * the same and command execution is skipped. This may be useful when hooking
    * into, for example, the `plotly_buttonclicked` method and executing the API
    * command manually without losing the benefit of the updatemenu automatically
    * binding to the state of the plot through the specification of `method`
    * and `args`.
    */
  var execute: Boolean
  
  /**
    * Sets the text label to appear on the button.
    */
  var label: String
  
  /**
    * Sets the Plotly method to be called on click. If the `skip` method is
    * used, the API updatemenu will function as normal but will perform no
    * API calls and will not bind automatically to state updates. This may be
    * used to create a component interface and attach to updatemenu events
    * manually via JavaScript.
    */
  var method: typings.plotlyJs.plotlyJsStrings.restyle | typings.plotlyJs.plotlyJsStrings.relayout | animate | typings.plotlyJs.plotlyJsStrings.update | skip
  
  /**
    * When used in a template, named items are created in the output figure in
    * addition to any items the figure already has in this array. You can modify
    * these items in the output figure by making your own item with
    * `templateitemname` matching this `name` alongside your modifications
    * (including `visible: false` or `enabled: false` to hide it). Has no effect
    * outside of a template.
    */
  var name: String
  
  /**
    * Used to refer to a named item in this array in the template. Named items
    * from the template will be created even without a matching item in the
    * input figure, but you can modify one by making an item with
    * `templateitemname` matching its `name`, alongside your modifications
    * (including `visible: false` or `enabled: false` to hide it). If there is
    * no template or no matching item, this item will be hidden unless you
    * explicitly show it with `visible: true`.
    */
  var templateitemname: String
  
  /**
    * Determines whether or not this button is visible.
    */
  var visible: Boolean
}
object UpdateMenuButton {
  
  inline def apply(
    args: js.Array[Any],
    args2: js.Array[Any],
    execute: Boolean,
    label: String,
    method: typings.plotlyJs.plotlyJsStrings.restyle | typings.plotlyJs.plotlyJsStrings.relayout | animate | typings.plotlyJs.plotlyJsStrings.update | skip,
    name: String,
    templateitemname: String,
    visible: Boolean
  ): UpdateMenuButton = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], args2 = args2.asInstanceOf[js.Any], execute = execute.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], templateitemname = templateitemname.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMenuButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateMenuButton] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgs2(value: js.Array[Any]): Self = StObject.set(x, "args2", value.asInstanceOf[js.Any])
    
    inline def setArgs2Varargs(value: Any*): Self = StObject.set(x, "args2", js.Array(value*))
    
    inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setExecute(value: Boolean): Self = StObject.set(x, "execute", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setMethod(
      value: typings.plotlyJs.plotlyJsStrings.restyle | typings.plotlyJs.plotlyJsStrings.relayout | animate | typings.plotlyJs.plotlyJsStrings.update | skip
    ): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTemplateitemname(value: String): Self = StObject.set(x, "templateitemname", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
