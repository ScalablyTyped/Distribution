package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistryKeyState extends js.Object {
  /**
    * A Windows registry hive : HKEY_CURRENT_CONFIG HKEY_CURRENT_USER HKEY_LOCAL_MACHINE/SAM HKEY_LOCAL_MACHINE/Security
    * HKEY_LOCAL_MACHINE/Software HKEY_LOCAL_MACHINE/System HKEY_USERS/.Default. Possible values are: unknown, currentConfig,
    * currentUser, localMachineSam, localMachineSecurity, localMachineSoftware, localMachineSystem, usersDefault.
    */
  var hive: js.UndefOr[RegistryHive] = js.undefined
  // Current (i.e. changed) registry key (excludes HIVE).
  var key: js.UndefOr[java.lang.String] = js.undefined
  // Previous (i.e. before changed) registry key (excludes HIVE).
  var oldKey: js.UndefOr[java.lang.String] = js.undefined
  // Previous (i.e. before changed) registry key value data (contents).
  var oldValueData: js.UndefOr[java.lang.String] = js.undefined
  // Previous (i.e. before changed) registry key value name.
  var oldValueName: js.UndefOr[java.lang.String] = js.undefined
  // Operation that changed the registry key name and/or value. Possible values are: unknown, create, modify, delete.
  var operation: js.UndefOr[RegistryOperation] = js.undefined
  /**
    * Process ID (PID) of the process that modified the registry key (process details will appear in the alert 'processes'
    * collection).
    */
  var processId: js.UndefOr[scala.Double] = js.undefined
  // Current (i.e. changed) registry key value data (contents).
  var valueData: js.UndefOr[java.lang.String] = js.undefined
  // Current (i.e. changed) registry key value name
  var valueName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Registry key value type REG_BINARY REG_DWORD REG_DWORD_LITTLE_ENDIAN REG_DWORD_BIG_ENDIANREG_EXPAND_SZ REG_LINK
    * REG_MULTI_SZ REG_NONE REG_QWORD REG_QWORD_LITTLE_ENDIAN REG_SZ Possible values are: unknown, binary, dword,
    * dwordLittleEndian, dwordBigEndian, expandSz, link, multiSz, none, qword, qwordlittleEndian, sz.
    */
  var valueType: js.UndefOr[RegistryValueType] = js.undefined
}

object RegistryKeyState {
  @scala.inline
  def apply(
    hive: RegistryHive = null,
    key: java.lang.String = null,
    oldKey: java.lang.String = null,
    oldValueData: java.lang.String = null,
    oldValueName: java.lang.String = null,
    operation: RegistryOperation = null,
    processId: scala.Int | scala.Double = null,
    valueData: java.lang.String = null,
    valueName: java.lang.String = null,
    valueType: RegistryValueType = null
  ): RegistryKeyState = {
    val __obj = js.Dynamic.literal()
    if (hive != null) __obj.updateDynamic("hive")(hive)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oldKey != null) __obj.updateDynamic("oldKey")(oldKey)
    if (oldValueData != null) __obj.updateDynamic("oldValueData")(oldValueData)
    if (oldValueName != null) __obj.updateDynamic("oldValueName")(oldValueName)
    if (operation != null) __obj.updateDynamic("operation")(operation)
    if (processId != null) __obj.updateDynamic("processId")(processId.asInstanceOf[js.Any])
    if (valueData != null) __obj.updateDynamic("valueData")(valueData)
    if (valueName != null) __obj.updateDynamic("valueName")(valueName)
    if (valueType != null) __obj.updateDynamic("valueType")(valueType)
    __obj.asInstanceOf[RegistryKeyState]
  }
}

