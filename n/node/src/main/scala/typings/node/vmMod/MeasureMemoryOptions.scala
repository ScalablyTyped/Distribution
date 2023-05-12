package typings.node.vmMod

import typings.node.nodeStrings.default
import typings.node.nodeStrings.eager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasureMemoryOptions extends StObject {
  
  /**
    * @default 'default'
    */
  var execution: js.UndefOr[default | eager] = js.undefined
  
  /**
    * @default 'summary'
    */
  var mode: js.UndefOr[MeasureMemoryMode] = js.undefined
}
object MeasureMemoryOptions {
  
  inline def apply(): MeasureMemoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasureMemoryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeasureMemoryOptions] (val x: Self) extends AnyVal {
    
    inline def setExecution(value: default | eager): Self = StObject.set(x, "execution", value.asInstanceOf[js.Any])
    
    inline def setExecutionUndefined: Self = StObject.set(x, "execution", js.undefined)
    
    inline def setMode(value: MeasureMemoryMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
