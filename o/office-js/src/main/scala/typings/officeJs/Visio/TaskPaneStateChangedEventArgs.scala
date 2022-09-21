package typings.officeJs.Visio

import typings.officeJs.officeJsStrings.DataVisualizerOrgChartMappings
import typings.officeJs.officeJsStrings.DataVisualizerProcessMappings
import typings.officeJs.officeJsStrings.None
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the TaskPaneStateChanged event.
  *
  * [Api set:  1.1]
  */
trait TaskPaneStateChangedEventArgs extends StObject {
  
  /**
    *
    * Current state of the taskpane
    *
    * [Api set:  1.1]
    */
  var isVisible: Boolean
  
  /**
    *
    * Type of the TaskPane.
    *
    * [Api set:  1.1]
    */
  var paneType: TaskPaneType | None | DataVisualizerProcessMappings | DataVisualizerOrgChartMappings
}
object TaskPaneStateChangedEventArgs {
  
  inline def apply(
    isVisible: Boolean,
    paneType: TaskPaneType | None | DataVisualizerProcessMappings | DataVisualizerOrgChartMappings
  ): TaskPaneStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(isVisible = isVisible.asInstanceOf[js.Any], paneType = paneType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskPaneStateChangedEventArgs]
  }
  
  extension [Self <: TaskPaneStateChangedEventArgs](x: Self) {
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setPaneType(value: TaskPaneType | None | DataVisualizerProcessMappings | DataVisualizerOrgChartMappings): Self = StObject.set(x, "paneType", value.asInstanceOf[js.Any])
  }
}
