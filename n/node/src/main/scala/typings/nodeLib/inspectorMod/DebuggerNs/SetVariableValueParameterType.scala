package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SetVariableValueParameterType extends js.Object {
  /**
               * Id of callframe that holds variable.
               */
  var callFrameId: CallFrameId
  /**
               * New variable value.
               */
  var newValue: nodeLib.inspectorMod.RuntimeNs.CallArgument
  /**
               * 0-based number of scope as was listed in scope chain. Only 'local', 'closure' and 'catch'
               * scope types are allowed. Other scopes could be manipulated manually.
               */
  var scopeNumber: scala.Double
  /**
               * Variable name.
               */
  var variableName: java.lang.String
}

