package typings.nightwatch.anon

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import typings.devtoolsProtocol.mod.Protocol.Runtime.Timestamp
import typings.nightwatch.nightwatchStrings.assert
import typings.nightwatch.nightwatchStrings.clear
import typings.nightwatch.nightwatchStrings.count
import typings.nightwatch.nightwatchStrings.debug_
import typings.nightwatch.nightwatchStrings.dir
import typings.nightwatch.nightwatchStrings.dirxml
import typings.nightwatch.nightwatchStrings.endGroup
import typings.nightwatch.nightwatchStrings.error
import typings.nightwatch.nightwatchStrings.info_
import typings.nightwatch.nightwatchStrings.log
import typings.nightwatch.nightwatchStrings.profile
import typings.nightwatch.nightwatchStrings.profileEnd
import typings.nightwatch.nightwatchStrings.startGroup
import typings.nightwatch.nightwatchStrings.startGroupCollapsed
import typings.nightwatch.nightwatchStrings.table
import typings.nightwatch.nightwatchStrings.timeEnd
import typings.nightwatch.nightwatchStrings.trace
import typings.nightwatch.nightwatchStrings.warning_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<devtools-protocol.devtools-protocol.Protocol.Runtime.ConsoleAPICalledEvent, 'type' | 'timestamp' | 'args'> */
trait PickConsoleAPICalledEvent extends StObject {
  
  var args: js.Array[RemoteObject]
  
  var timestamp: Timestamp
  
  var `type`: log | debug_ | info_ | error | warning_ | dir | dirxml | table | trace | clear | startGroup | startGroupCollapsed | endGroup | assert | profile | profileEnd | count | timeEnd
}
object PickConsoleAPICalledEvent {
  
  inline def apply(
    args: js.Array[RemoteObject],
    timestamp: Timestamp,
    `type`: log | debug_ | info_ | error | warning_ | dir | dirxml | table | trace | clear | startGroup | startGroupCollapsed | endGroup | assert | profile | profileEnd | count | timeEnd
  ): PickConsoleAPICalledEvent = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickConsoleAPICalledEvent]
  }
  
  extension [Self <: PickConsoleAPICalledEvent](x: Self) {
    
    inline def setArgs(value: js.Array[RemoteObject]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: RemoteObject*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setTimestamp(value: Timestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(
      value: log | debug_ | info_ | error | warning_ | dir | dirxml | table | trace | clear | startGroup | startGroupCollapsed | endGroup | assert | profile | profileEnd | count | timeEnd
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
