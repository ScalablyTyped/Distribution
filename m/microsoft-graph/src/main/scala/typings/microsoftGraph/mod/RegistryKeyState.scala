package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegistryKeyState extends js.Object {
  
  /**
    * A Windows registry hive : HKEY_CURRENT_CONFIG HKEY_CURRENT_USER HKEY_LOCAL_MACHINE/SAM HKEY_LOCAL_MACHINE/Security
    * HKEY_LOCAL_MACHINE/Software HKEY_LOCAL_MACHINE/System HKEY_USERS/.Default. Possible values are: unknown, currentConfig,
    * currentUser, localMachineSam, localMachineSecurity, localMachineSoftware, localMachineSystem, usersDefault.
    */
  var hive: js.UndefOr[NullableOption[RegistryHive]] = js.native
  
  // Current (i.e. changed) registry key (excludes HIVE).
  var key: js.UndefOr[NullableOption[String]] = js.native
  
  // Previous (i.e. before changed) registry key (excludes HIVE).
  var oldKey: js.UndefOr[NullableOption[String]] = js.native
  
  // Previous (i.e. before changed) registry key value data (contents).
  var oldValueData: js.UndefOr[NullableOption[String]] = js.native
  
  // Previous (i.e. before changed) registry key value name.
  var oldValueName: js.UndefOr[NullableOption[String]] = js.native
  
  // Operation that changed the registry key name and/or value. Possible values are: unknown, create, modify, delete.
  var operation: js.UndefOr[NullableOption[RegistryOperation]] = js.native
  
  /**
    * Process ID (PID) of the process that modified the registry key (process details will appear in the alert 'processes'
    * collection).
    */
  var processId: js.UndefOr[NullableOption[Double]] = js.native
  
  // Current (i.e. changed) registry key value data (contents).
  var valueData: js.UndefOr[NullableOption[String]] = js.native
  
  // Current (i.e. changed) registry key value name
  var valueName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Registry key value type REG_BINARY REG_DWORD REG_DWORD_LITTLE_ENDIAN REG_DWORD_BIG_ENDIANREG_EXPAND_SZ REG_LINK
    * REG_MULTI_SZ REG_NONE REG_QWORD REG_QWORD_LITTLE_ENDIAN REG_SZ Possible values are: unknown, binary, dword,
    * dwordLittleEndian, dwordBigEndian, expandSz, link, multiSz, none, qword, qwordlittleEndian, sz.
    */
  var valueType: js.UndefOr[NullableOption[RegistryValueType]] = js.native
}
object RegistryKeyState {
  
  @scala.inline
  def apply(): RegistryKeyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistryKeyState]
  }
  
  @scala.inline
  implicit class RegistryKeyStateOps[Self <: RegistryKeyState] (val x: Self) extends AnyVal {
    
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
    def setHive(value: NullableOption[RegistryHive]): Self = this.set("hive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHive: Self = this.set("hive", js.undefined)
    
    @scala.inline
    def setHiveNull: Self = this.set("hive", null)
    
    @scala.inline
    def setKey(value: NullableOption[String]): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setKeyNull: Self = this.set("key", null)
    
    @scala.inline
    def setOldKey(value: NullableOption[String]): Self = this.set("oldKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldKey: Self = this.set("oldKey", js.undefined)
    
    @scala.inline
    def setOldKeyNull: Self = this.set("oldKey", null)
    
    @scala.inline
    def setOldValueData(value: NullableOption[String]): Self = this.set("oldValueData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldValueData: Self = this.set("oldValueData", js.undefined)
    
    @scala.inline
    def setOldValueDataNull: Self = this.set("oldValueData", null)
    
    @scala.inline
    def setOldValueName(value: NullableOption[String]): Self = this.set("oldValueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldValueName: Self = this.set("oldValueName", js.undefined)
    
    @scala.inline
    def setOldValueNameNull: Self = this.set("oldValueName", null)
    
    @scala.inline
    def setOperation(value: NullableOption[RegistryOperation]): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    
    @scala.inline
    def setOperationNull: Self = this.set("operation", null)
    
    @scala.inline
    def setProcessId(value: NullableOption[Double]): Self = this.set("processId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessId: Self = this.set("processId", js.undefined)
    
    @scala.inline
    def setProcessIdNull: Self = this.set("processId", null)
    
    @scala.inline
    def setValueData(value: NullableOption[String]): Self = this.set("valueData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueData: Self = this.set("valueData", js.undefined)
    
    @scala.inline
    def setValueDataNull: Self = this.set("valueData", null)
    
    @scala.inline
    def setValueName(value: NullableOption[String]): Self = this.set("valueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueName: Self = this.set("valueName", js.undefined)
    
    @scala.inline
    def setValueNameNull: Self = this.set("valueName", null)
    
    @scala.inline
    def setValueType(value: NullableOption[RegistryValueType]): Self = this.set("valueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueType: Self = this.set("valueType", js.undefined)
    
    @scala.inline
    def setValueTypeNull: Self = this.set("valueType", null)
  }
}
