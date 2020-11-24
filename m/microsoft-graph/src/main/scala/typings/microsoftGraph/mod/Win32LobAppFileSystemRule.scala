package typings.microsoftGraph.mod

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
  implicit class Win32LobAppFileSystemRuleOps[Self <: Win32LobAppFileSystemRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCheck32BitOn64System(value: Boolean): Self = this.set("check32BitOn64System", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheck32BitOn64System: Self = this.set("check32BitOn64System", js.undefined)
    
    @scala.inline
    def setComparisonValue(value: NullableOption[String]): Self = this.set("comparisonValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComparisonValue: Self = this.set("comparisonValue", js.undefined)
    
    @scala.inline
    def setComparisonValueNull: Self = this.set("comparisonValue", null)
    
    @scala.inline
    def setFileOrFolderName(value: NullableOption[String]): Self = this.set("fileOrFolderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileOrFolderName: Self = this.set("fileOrFolderName", js.undefined)
    
    @scala.inline
    def setFileOrFolderNameNull: Self = this.set("fileOrFolderName", null)
    
    @scala.inline
    def setOperationType(value: Win32LobAppFileSystemOperationType): Self = this.set("operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationType: Self = this.set("operationType", js.undefined)
    
    @scala.inline
    def setOperator(value: Win32LobAppRuleOperator): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    
    @scala.inline
    def setPath(value: NullableOption[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPathNull: Self = this.set("path", null)
  }
}
