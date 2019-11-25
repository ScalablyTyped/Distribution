package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.RemoteObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JavaScript call frame. Array of call frames form the call stack.
  */
trait CallFrame extends js.Object {
  /**
    * Call frame identifier. This identifier is only valid while the virtual machine is paused.
    */
  var callFrameId: CallFrameId
  /**
    * Location in the source code.
    */
  var functionLocation: js.UndefOr[Location] = js.undefined
  /**
    * Name of the JavaScript function called on this call frame.
    */
  var functionName: java.lang.String
  /**
    * Location in the source code.
    */
  var location: Location
  /**
    * The value being returned, if the function is at return point.
    */
  var returnValue: js.UndefOr[RemoteObject] = js.undefined
  /**
    * Scope chain for this call frame.
    */
  var scopeChain: js.Array[Scope]
  /**
    * <code>this</code> object for this call frame.
    */
  var `this`: RemoteObject
  /**
    * JavaScript script name or url.
    */
  var url: java.lang.String
}

object CallFrame {
  @scala.inline
  def apply(
    callFrameId: CallFrameId,
    functionName: java.lang.String,
    location: Location,
    scopeChain: js.Array[Scope],
    `this`: RemoteObject,
    url: java.lang.String,
    functionLocation: Location = null,
    returnValue: RemoteObject = null
  ): CallFrame = {
    val __obj = js.Dynamic.literal(callFrameId = callFrameId.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], scopeChain = scopeChain.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
    if (functionLocation != null) __obj.updateDynamic("functionLocation")(functionLocation.asInstanceOf[js.Any])
    if (returnValue != null) __obj.updateDynamic("returnValue")(returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallFrame]
  }
}

