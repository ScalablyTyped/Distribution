package typings.officeJs.Visio

import typings.officeJs.officeJsStrings.FromTarget
import typings.officeJs.officeJsStrings.ToTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Connector bindings for data visualizer diagram.
  *
  * [Api set:  1.1]
  */
trait ConnectorBinding extends StObject {
  
  /**
    *
    * If true then connectors are added in sequence according to the uniqueId column.
    *
    * [Api set:  1.1]
    */
  var connectSequentially: Boolean
  
  /**
    *
    * Delimiter for TargetColumn. It should not have more then one character.
    *
    * [Api set:  1.1]
    */
  var delimiter: String
  
  /**
    *
    * Direction of connector to use in diagram.
    *
    * [Api set:  1.1]
    */
  var direction: ConnectorDirection | FromTarget | ToTarget
  
  /**
    *
    * Column for ConnectorLabel (shape text of connector).
    *
    * [Api set:  1.1]
    */
  var labelColumnName: String
  
  /**
    *
    * Column for proving connected target shape.
    *
    * [Api set:  1.1]
    */
  var targetColumnName: String
}
object ConnectorBinding {
  
  inline def apply(
    connectSequentially: Boolean,
    delimiter: String,
    direction: ConnectorDirection | FromTarget | ToTarget,
    labelColumnName: String,
    targetColumnName: String
  ): ConnectorBinding = {
    val __obj = js.Dynamic.literal(connectSequentially = connectSequentially.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], labelColumnName = labelColumnName.asInstanceOf[js.Any], targetColumnName = targetColumnName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorBinding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectorBinding] (val x: Self) extends AnyVal {
    
    inline def setConnectSequentially(value: Boolean): Self = StObject.set(x, "connectSequentially", value.asInstanceOf[js.Any])
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: ConnectorDirection | FromTarget | ToTarget): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setLabelColumnName(value: String): Self = StObject.set(x, "labelColumnName", value.asInstanceOf[js.Any])
    
    inline def setTargetColumnName(value: String): Self = StObject.set(x, "targetColumnName", value.asInstanceOf[js.Any])
  }
}
