package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Win32LobAppFileSystemRule extends Win32LobAppRule {
  
  // A value indicating whether to expand environment variables in the 32-bit context on 64-bit systems.
  var check32BitOn64System: js.UndefOr[Boolean] = js.native
  
  // The file or folder comparison value.
  var comparisonValue: js.UndefOr[NullableOption[String]] = js.native
  
  // The file or folder name to look up.
  var fileOrFolderName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The file system operation type. Possible values are: notConfigured, exists, modifiedDate, createdDate, version,
    * sizeInMB.
    */
  var operationType: js.UndefOr[Win32LobAppFileSystemOperationType] = js.native
  
  /**
    * The operator for file or folder detection. Possible values are: notConfigured, equal, notEqual, greaterThan,
    * greaterThanOrEqual, lessThan, lessThanOrEqual.
    */
  var operator: js.UndefOr[Win32LobAppRuleOperator] = js.native
  
  // The file or folder path to look up.
  var path: js.UndefOr[NullableOption[String]] = js.native
}
object Win32LobAppFileSystemRule {
  
  @scala.inline
  def apply(): Win32LobAppFileSystemRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Win32LobAppFileSystemRule]
  }
  
  @scala.inline
  implicit class Win32LobAppFileSystemRuleMutableBuilder[Self <: Win32LobAppFileSystemRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheck32BitOn64System(value: Boolean): Self = StObject.set(x, "check32BitOn64System", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheck32BitOn64SystemUndefined: Self = StObject.set(x, "check32BitOn64System", js.undefined)
    
    @scala.inline
    def setComparisonValue(value: NullableOption[String]): Self = StObject.set(x, "comparisonValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparisonValueNull: Self = StObject.set(x, "comparisonValue", null)
    
    @scala.inline
    def setComparisonValueUndefined: Self = StObject.set(x, "comparisonValue", js.undefined)
    
    @scala.inline
    def setFileOrFolderName(value: NullableOption[String]): Self = StObject.set(x, "fileOrFolderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileOrFolderNameNull: Self = StObject.set(x, "fileOrFolderName", null)
    
    @scala.inline
    def setFileOrFolderNameUndefined: Self = StObject.set(x, "fileOrFolderName", js.undefined)
    
    @scala.inline
    def setOperationType(value: Win32LobAppFileSystemOperationType): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    @scala.inline
    def setOperator(value: Win32LobAppRuleOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setPath(value: NullableOption[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathNull: Self = StObject.set(x, "path", null)
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
