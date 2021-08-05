package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Win32LobAppFileSystemRule
  extends StObject
     with Win32LobAppRule {
  
  // A value indicating whether to expand environment variables in the 32-bit context on 64-bit systems.
  var check32BitOn64System: js.UndefOr[Boolean] = js.undefined
  
  // The file or folder comparison value.
  var comparisonValue: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The file or folder name to look up.
  var fileOrFolderName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The file system operation type. Possible values are: notConfigured, exists, modifiedDate, createdDate, version,
    * sizeInMB.
    */
  var operationType: js.UndefOr[Win32LobAppFileSystemOperationType] = js.undefined
  
  /**
    * The operator for file or folder detection. Possible values are: notConfigured, equal, notEqual, greaterThan,
    * greaterThanOrEqual, lessThan, lessThanOrEqual.
    */
  var operator: js.UndefOr[Win32LobAppRuleOperator] = js.undefined
  
  // The file or folder path to look up.
  var path: js.UndefOr[NullableOption[String]] = js.undefined
}
object Win32LobAppFileSystemRule {
  
  inline def apply(): Win32LobAppFileSystemRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Win32LobAppFileSystemRule]
  }
  
  extension [Self <: Win32LobAppFileSystemRule](x: Self) {
    
    inline def setCheck32BitOn64System(value: Boolean): Self = StObject.set(x, "check32BitOn64System", value.asInstanceOf[js.Any])
    
    inline def setCheck32BitOn64SystemUndefined: Self = StObject.set(x, "check32BitOn64System", js.undefined)
    
    inline def setComparisonValue(value: NullableOption[String]): Self = StObject.set(x, "comparisonValue", value.asInstanceOf[js.Any])
    
    inline def setComparisonValueNull: Self = StObject.set(x, "comparisonValue", null)
    
    inline def setComparisonValueUndefined: Self = StObject.set(x, "comparisonValue", js.undefined)
    
    inline def setFileOrFolderName(value: NullableOption[String]): Self = StObject.set(x, "fileOrFolderName", value.asInstanceOf[js.Any])
    
    inline def setFileOrFolderNameNull: Self = StObject.set(x, "fileOrFolderName", null)
    
    inline def setFileOrFolderNameUndefined: Self = StObject.set(x, "fileOrFolderName", js.undefined)
    
    inline def setOperationType(value: Win32LobAppFileSystemOperationType): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    inline def setOperator(value: Win32LobAppRuleOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setPath(value: NullableOption[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
