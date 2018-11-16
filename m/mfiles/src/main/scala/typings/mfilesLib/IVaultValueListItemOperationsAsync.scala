package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultValueListItemOperationsAsync extends js.Object {
  def AddValueListItem(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItem: IValueListItem,
    AdministrativeOperation: scala.Boolean
  ): scala.Unit = js.native
  def AddValueListItem(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItem: IValueListItem,
    AdministrativeOperation: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit]
  ): scala.Unit = js.native
  def AddValueListItem(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItem: IValueListItem,
    AdministrativeOperation: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def AddValueListItem(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItem: IValueListItem,
    AdministrativeOperation: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def AddValueListItem(ValueList: scala.Double, ValueListItem: IValueListItem, AdministrativeOperation: scala.Boolean): scala.Unit = js.native
  def AddValueListItem(
    ValueList: scala.Double,
    ValueListItem: IValueListItem,
    AdministrativeOperation: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit]
  ): scala.Unit = js.native
  def AddValueListItem(
    ValueList: scala.Double,
    ValueListItem: IValueListItem,
    AdministrativeOperation: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def AddValueListItem(
    ValueList: scala.Double,
    ValueListItem: IValueListItem,
    AdministrativeOperation: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ChangeAutomaticPermissionsToACL(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    AccessControlList: IAccessControlList,
    NameForAutomaticPermissions: java.lang.String,
    CanDeactivate: scala.Boolean,
    AutomaticPermissionsOperationOptions: mfilesLib.MFilesNs.MFAutomaticPermissionsOperationOptions
  ): scala.Unit = js.native
  def ChangeAutomaticPermissionsToACL(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    AccessControlList: IAccessControlList,
    NameForAutomaticPermissions: java.lang.String,
    CanDeactivate: scala.Boolean,
    AutomaticPermissionsOperationOptions: mfilesLib.MFilesNs.MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ChangeAutomaticPermissionsToACL(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    AccessControlList: IAccessControlList,
    NameForAutomaticPermissions: java.lang.String,
    CanDeactivate: scala.Boolean,
    AutomaticPermissionsOperationOptions: mfilesLib.MFilesNs.MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ChangeAutomaticPermissionsToACL(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    AccessControlList: IAccessControlList,
    NameForAutomaticPermissions: java.lang.String,
    CanDeactivate: scala.Boolean,
    AutomaticPermissionsOperationOptions: mfilesLib.MFilesNs.MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ChangeAutomaticPermissionsToACL(
    ValueList: scala.Double,
    ValueListItemID: scala.Double,
    AccessControlList: IAccessControlList,
    NameForAutomaticPermissions: java.lang.String,
    CanDeactivate: scala.Boolean,
    AutomaticPermissionsOperationOptions: mfilesLib.MFilesNs.MFAutomaticPermissionsOperationOptions
  ): scala.Unit = js.native
  def ChangeAutomaticPermissionsToACL(
    ValueList: scala.Double,
    ValueListItemID: scala.Double,
    AccessControlList: IAccessControlList,
    NameForAutomaticPermissions: java.lang.String,
    CanDeactivate: scala.Boolean,
    AutomaticPermissionsOperationOptions: mfilesLib.MFilesNs.MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ChangeAutomaticPermissionsToACL(
    ValueList: scala.Double,
    ValueListItemID: scala.Double,
    AccessControlList: IAccessControlList,
    NameForAutomaticPermissions: java.lang.String,
    CanDeactivate: scala.Boolean,
    AutomaticPermissionsOperationOptions: mfilesLib.MFilesNs.MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ChangeAutomaticPermissionsToACL(
    ValueList: scala.Double,
    ValueListItemID: scala.Double,
    AccessControlList: IAccessControlList,
    NameForAutomaticPermissions: java.lang.String,
    CanDeactivate: scala.Boolean,
    AutomaticPermissionsOperationOptions: mfilesLib.MFilesNs.MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ChangeAutomaticPermissionsToItemsOwnPermissions(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    CanDeactivate: scala.Boolean,
    AutomaticPermissionsOperationOptions: mfilesLib.MFilesNs.MFAutomaticPermissionsOperationOptions
  ): scala.Unit = js.native
  def ChangeAutomaticPermissionsToItemsOwnPermissions(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    CanDeactivate: scala.Boolean,
    AutomaticPermissionsOperationOptions: mfilesLib.MFilesNs.MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ChangeAutomaticPermissionsToItemsOwnPermissions(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    CanDeactivate: scala.Boolean,
    AutomaticPermissionsOperationOptions: mfilesLib.MFilesNs.MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ChangeAutomaticPermissionsToItemsOwnPermissions(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    CanDeactivate: scala.Boolean,
    AutomaticPermissionsOperationOptions: mfilesLib.MFilesNs.MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ChangeAutomaticPermissionsToItemsOwnPermissions(
    ValueList: scala.Double,
    ValueListItemID: scala.Double,
    CanDeactivate: scala.Boolean,
    AutomaticPermissionsOperationOptions: mfilesLib.MFilesNs.MFAutomaticPermissionsOperationOptions
  ): scala.Unit = js.native
  def ChangeAutomaticPermissionsToItemsOwnPermissions(
    ValueList: scala.Double,
    ValueListItemID: scala.Double,
    CanDeactivate: scala.Boolean,
    AutomaticPermissionsOperationOptions: mfilesLib.MFilesNs.MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ChangeAutomaticPermissionsToItemsOwnPermissions(
    ValueList: scala.Double,
    ValueListItemID: scala.Double,
    CanDeactivate: scala.Boolean,
    AutomaticPermissionsOperationOptions: mfilesLib.MFilesNs.MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ChangeAutomaticPermissionsToItemsOwnPermissions(
    ValueList: scala.Double,
    ValueListItemID: scala.Double,
    CanDeactivate: scala.Boolean,
    AutomaticPermissionsOperationOptions: mfilesLib.MFilesNs.MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ChangeAutomaticPermissionsToNamedACL(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    NamedACL: scala.Double,
    CanDeactivate: scala.Boolean,
    AutomaticPermissionsOperationOptions: mfilesLib.MFilesNs.MFAutomaticPermissionsOperationOptions
  ): scala.Unit = js.native
  def ChangeAutomaticPermissionsToNamedACL(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    NamedACL: scala.Double,
    CanDeactivate: scala.Boolean,
    AutomaticPermissionsOperationOptions: mfilesLib.MFilesNs.MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ChangeAutomaticPermissionsToNamedACL(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    NamedACL: scala.Double,
    CanDeactivate: scala.Boolean,
    AutomaticPermissionsOperationOptions: mfilesLib.MFilesNs.MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ChangeAutomaticPermissionsToNamedACL(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    NamedACL: scala.Double,
    CanDeactivate: scala.Boolean,
    AutomaticPermissionsOperationOptions: mfilesLib.MFilesNs.MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ChangeAutomaticPermissionsToNamedACL(
    ValueList: scala.Double,
    ValueListItemID: scala.Double,
    NamedACL: scala.Double,
    CanDeactivate: scala.Boolean,
    AutomaticPermissionsOperationOptions: mfilesLib.MFilesNs.MFAutomaticPermissionsOperationOptions
  ): scala.Unit = js.native
  def ChangeAutomaticPermissionsToNamedACL(
    ValueList: scala.Double,
    ValueListItemID: scala.Double,
    NamedACL: scala.Double,
    CanDeactivate: scala.Boolean,
    AutomaticPermissionsOperationOptions: mfilesLib.MFilesNs.MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ChangeAutomaticPermissionsToNamedACL(
    ValueList: scala.Double,
    ValueListItemID: scala.Double,
    NamedACL: scala.Double,
    CanDeactivate: scala.Boolean,
    AutomaticPermissionsOperationOptions: mfilesLib.MFilesNs.MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ChangeAutomaticPermissionsToNamedACL(
    ValueList: scala.Double,
    ValueListItemID: scala.Double,
    NamedACL: scala.Double,
    CanDeactivate: scala.Boolean,
    AutomaticPermissionsOperationOptions: mfilesLib.MFilesNs.MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ChangePermissionsToACL(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    AccessControlList: IAccessControlList
  ): scala.Unit = js.native
  def ChangePermissionsToACL(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    AccessControlList: IAccessControlList,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ChangePermissionsToACL(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    AccessControlList: IAccessControlList,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ChangePermissionsToACL(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    AccessControlList: IAccessControlList,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ChangePermissionsToACL(ValueList: scala.Double, ValueListItemID: scala.Double, AccessControlList: IAccessControlList): scala.Unit = js.native
  def ChangePermissionsToACL(
    ValueList: scala.Double,
    ValueListItemID: scala.Double,
    AccessControlList: IAccessControlList,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ChangePermissionsToACL(
    ValueList: scala.Double,
    ValueListItemID: scala.Double,
    AccessControlList: IAccessControlList,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ChangePermissionsToACL(
    ValueList: scala.Double,
    ValueListItemID: scala.Double,
    AccessControlList: IAccessControlList,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ChangePermissionsToNamedACL(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    NamedACL: scala.Double
  ): scala.Unit = js.native
  def ChangePermissionsToNamedACL(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    NamedACL: scala.Double,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ChangePermissionsToNamedACL(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    NamedACL: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ChangePermissionsToNamedACL(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    NamedACL: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ChangePermissionsToNamedACL(ValueList: scala.Double, ValueListItemID: scala.Double, NamedACL: scala.Double): scala.Unit = js.native
  def ChangePermissionsToNamedACL(
    ValueList: scala.Double,
    ValueListItemID: scala.Double,
    NamedACL: scala.Double,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ChangePermissionsToNamedACL(
    ValueList: scala.Double,
    ValueListItemID: scala.Double,
    NamedACL: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ChangePermissionsToNamedACL(
    ValueList: scala.Double,
    ValueListItemID: scala.Double,
    NamedACL: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ClearAutomaticPermissions(ValueList: mfilesLib.MFilesNs.MFBuiltInValueList, ValueListItemID: scala.Double): scala.Unit = js.native
  def ClearAutomaticPermissions(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ClearAutomaticPermissions(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ClearAutomaticPermissions(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ClearAutomaticPermissions(ValueList: scala.Double, ValueListItemID: scala.Double): scala.Unit = js.native
  def ClearAutomaticPermissions(ValueList: scala.Double, ValueListItemID: scala.Double, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def ClearAutomaticPermissions(
    ValueList: scala.Double,
    ValueListItemID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ClearAutomaticPermissions(
    ValueList: scala.Double,
    ValueListItemID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemByDisplayID(ValueList: mfilesLib.MFilesNs.MFBuiltInValueList, ValueListItemDisplayID: java.lang.String): scala.Unit = js.native
  def GetValueListItemByDisplayID(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemDisplayID: java.lang.String,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemByDisplayID(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemDisplayID: java.lang.String,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetValueListItemByDisplayID(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemDisplayID: java.lang.String,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemByDisplayID(ValueList: scala.Double, ValueListItemDisplayID: java.lang.String): scala.Unit = js.native
  def GetValueListItemByDisplayID(
    ValueList: scala.Double,
    ValueListItemDisplayID: java.lang.String,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemByDisplayID(
    ValueList: scala.Double,
    ValueListItemDisplayID: java.lang.String,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetValueListItemByDisplayID(
    ValueList: scala.Double,
    ValueListItemDisplayID: java.lang.String,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemByDisplayIDEx(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemDisplayID: java.lang.String,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean
  ): scala.Unit = js.native
  def GetValueListItemByDisplayIDEx(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemDisplayID: java.lang.String,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemByDisplayIDEx(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemDisplayID: java.lang.String,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetValueListItemByDisplayIDEx(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemDisplayID: java.lang.String,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemByDisplayIDEx(
    ValueList: scala.Double,
    ValueListItemDisplayID: java.lang.String,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean
  ): scala.Unit = js.native
  def GetValueListItemByDisplayIDEx(
    ValueList: scala.Double,
    ValueListItemDisplayID: java.lang.String,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemByDisplayIDEx(
    ValueList: scala.Double,
    ValueListItemDisplayID: java.lang.String,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetValueListItemByDisplayIDEx(
    ValueList: scala.Double,
    ValueListItemDisplayID: java.lang.String,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemByGUID(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ItemGUID: java.lang.String,
    AllowDeletedItems: scala.Boolean,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean
  ): scala.Unit = js.native
  def GetValueListItemByGUID(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ItemGUID: java.lang.String,
    AllowDeletedItems: scala.Boolean,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemByGUID(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ItemGUID: java.lang.String,
    AllowDeletedItems: scala.Boolean,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetValueListItemByGUID(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ItemGUID: java.lang.String,
    AllowDeletedItems: scala.Boolean,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemByGUID(
    ValueList: scala.Double,
    ItemGUID: java.lang.String,
    AllowDeletedItems: scala.Boolean,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean
  ): scala.Unit = js.native
  def GetValueListItemByGUID(
    ValueList: scala.Double,
    ItemGUID: java.lang.String,
    AllowDeletedItems: scala.Boolean,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemByGUID(
    ValueList: scala.Double,
    ItemGUID: java.lang.String,
    AllowDeletedItems: scala.Boolean,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetValueListItemByGUID(
    ValueList: scala.Double,
    ItemGUID: java.lang.String,
    AllowDeletedItems: scala.Boolean,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemByID(ValueList: mfilesLib.MFilesNs.MFBuiltInValueList, ValueListItemID: scala.Double): scala.Unit = js.native
  def GetValueListItemByID(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemByID(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetValueListItemByID(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemByID(ValueList: scala.Double, ValueListItemID: scala.Double): scala.Unit = js.native
  def GetValueListItemByID(
    ValueList: scala.Double,
    ValueListItemID: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemByID(
    ValueList: scala.Double,
    ValueListItemID: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetValueListItemByID(
    ValueList: scala.Double,
    ValueListItemID: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemByIDEx(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean
  ): scala.Unit = js.native
  def GetValueListItemByIDEx(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemByIDEx(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetValueListItemByIDEx(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemByIDEx(
    ValueList: scala.Double,
    ValueListItemID: scala.Double,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean
  ): scala.Unit = js.native
  def GetValueListItemByIDEx(
    ValueList: scala.Double,
    ValueListItemID: scala.Double,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemByIDEx(
    ValueList: scala.Double,
    ValueListItemID: scala.Double,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetValueListItemByIDEx(
    ValueList: scala.Double,
    ValueListItemID: scala.Double,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemIDByGUID(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ItemGUID: java.lang.String,
    AllowDeletedItems: scala.Boolean
  ): scala.Unit = js.native
  def GetValueListItemIDByGUID(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ItemGUID: java.lang.String,
    AllowDeletedItems: scala.Boolean,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemIDByGUID(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ItemGUID: java.lang.String,
    AllowDeletedItems: scala.Boolean,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetValueListItemIDByGUID(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ItemGUID: java.lang.String,
    AllowDeletedItems: scala.Boolean,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemIDByGUID(ValueList: scala.Double, ItemGUID: java.lang.String, AllowDeletedItems: scala.Boolean): scala.Unit = js.native
  def GetValueListItemIDByGUID(
    ValueList: scala.Double,
    ItemGUID: java.lang.String,
    AllowDeletedItems: scala.Boolean,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemIDByGUID(
    ValueList: scala.Double,
    ItemGUID: java.lang.String,
    AllowDeletedItems: scala.Boolean,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetValueListItemIDByGUID(
    ValueList: scala.Double,
    ItemGUID: java.lang.String,
    AllowDeletedItems: scala.Boolean,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItems(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType
  ): scala.Unit = js.native
  def GetValueListItems(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    successCallback: js.Function1[/* result */ IValueListItems, scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItems(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    successCallback: js.Function1[/* result */ IValueListItems, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetValueListItems(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    successCallback: js.Function1[/* result */ IValueListItems, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItems(
    ValueList: scala.Double,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType
  ): scala.Unit = js.native
  def GetValueListItems(
    ValueList: scala.Double,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    successCallback: js.Function1[/* result */ IValueListItems, scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItems(
    ValueList: scala.Double,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    successCallback: js.Function1[/* result */ IValueListItems, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetValueListItems(
    ValueList: scala.Double,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    successCallback: js.Function1[/* result */ IValueListItems, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemsEx(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean
  ): scala.Unit = js.native
  def GetValueListItemsEx(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItems, scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemsEx(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItems, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetValueListItemsEx(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItems, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemsEx(
    ValueList: scala.Double,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean
  ): scala.Unit = js.native
  def GetValueListItemsEx(
    ValueList: scala.Double,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItems, scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemsEx(
    ValueList: scala.Double,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItems, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetValueListItemsEx(
    ValueList: scala.Double,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItems, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemsEx2(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef
  ): scala.Unit = js.native
  def GetValueListItemsEx2(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef,
    successCallback: js.Function1[/* result */ IValueListItems, scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemsEx2(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef,
    successCallback: js.Function1[/* result */ IValueListItems, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetValueListItemsEx2(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef,
    successCallback: js.Function1[/* result */ IValueListItems, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemsEx2(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double
  ): scala.Unit = js.native
  def GetValueListItemsEx2(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItems, scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemsEx2(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItems, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetValueListItemsEx2(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItems, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemsEx2(
    ValueList: scala.Double,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef
  ): scala.Unit = js.native
  def GetValueListItemsEx2(
    ValueList: scala.Double,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef,
    successCallback: js.Function1[/* result */ IValueListItems, scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemsEx2(
    ValueList: scala.Double,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef,
    successCallback: js.Function1[/* result */ IValueListItems, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetValueListItemsEx2(
    ValueList: scala.Double,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef,
    successCallback: js.Function1[/* result */ IValueListItems, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemsEx2(
    ValueList: scala.Double,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double
  ): scala.Unit = js.native
  def GetValueListItemsEx2(
    ValueList: scala.Double,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItems, scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemsEx2(
    ValueList: scala.Double,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItems, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetValueListItemsEx2(
    ValueList: scala.Double,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItems, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef
  ): scala.Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef,
    successCallback: js.Function1[/* result */ IValueListItemsWithPermissions, scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef,
    successCallback: js.Function1[/* result */ IValueListItemsWithPermissions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef,
    successCallback: js.Function1[/* result */ IValueListItemsWithPermissions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double
  ): scala.Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItemsWithPermissions, scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItemsWithPermissions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItemsWithPermissions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: scala.Double,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef
  ): scala.Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: scala.Double,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef,
    successCallback: js.Function1[/* result */ IValueListItemsWithPermissions, scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: scala.Double,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef,
    successCallback: js.Function1[/* result */ IValueListItemsWithPermissions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: scala.Double,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef,
    successCallback: js.Function1[/* result */ IValueListItemsWithPermissions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: scala.Double,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double
  ): scala.Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: scala.Double,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItemsWithPermissions, scala.Unit]
  ): scala.Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: scala.Double,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItemsWithPermissions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: scala.Double,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItemsWithPermissions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def RemoveValueListItem(ValueList: mfilesLib.MFilesNs.MFBuiltInValueList, Item: scala.Double): scala.Unit = js.native
  def RemoveValueListItem(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    Item: scala.Double,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def RemoveValueListItem(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    Item: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def RemoveValueListItem(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    Item: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def RemoveValueListItem(ValueList: scala.Double, Item: scala.Double): scala.Unit = js.native
  def RemoveValueListItem(ValueList: scala.Double, Item: scala.Double, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def RemoveValueListItem(
    ValueList: scala.Double,
    Item: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def RemoveValueListItem(
    ValueList: scala.Double,
    Item: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SearchForValueListItemsEx(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean
  ): scala.Unit = js.native
  def SearchForValueListItemsEx(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, scala.Unit]
  ): scala.Unit = js.native
  def SearchForValueListItemsEx(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SearchForValueListItemsEx(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SearchForValueListItemsEx(
    ValueList: scala.Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean
  ): scala.Unit = js.native
  def SearchForValueListItemsEx(
    ValueList: scala.Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, scala.Unit]
  ): scala.Unit = js.native
  def SearchForValueListItemsEx(
    ValueList: scala.Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SearchForValueListItemsEx(
    ValueList: scala.Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef,
    MaxResults: scala.Double
  ): scala.Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef,
    MaxResults: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, scala.Unit]
  ): scala.Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef,
    MaxResults: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef,
    MaxResults: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double,
    MaxResults: scala.Double
  ): scala.Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double,
    MaxResults: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, scala.Unit]
  ): scala.Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double,
    MaxResults: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double,
    MaxResults: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: scala.Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef,
    MaxResults: scala.Double
  ): scala.Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: scala.Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef,
    MaxResults: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, scala.Unit]
  ): scala.Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: scala.Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef,
    MaxResults: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: scala.Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef,
    MaxResults: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: scala.Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double,
    MaxResults: scala.Double
  ): scala.Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: scala.Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double,
    MaxResults: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, scala.Unit]
  ): scala.Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: scala.Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double,
    MaxResults: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: scala.Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double,
    MaxResults: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef,
    MaxResults: scala.Double
  ): scala.Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef,
    MaxResults: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResultsWithPermissions, scala.Unit]
  ): scala.Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef,
    MaxResults: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResultsWithPermissions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef,
    MaxResults: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResultsWithPermissions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double,
    MaxResults: scala.Double
  ): scala.Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double,
    MaxResults: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResultsWithPermissions, scala.Unit]
  ): scala.Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double,
    MaxResults: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResultsWithPermissions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double,
    MaxResults: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResultsWithPermissions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: scala.Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef,
    MaxResults: scala.Double
  ): scala.Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: scala.Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef,
    MaxResults: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResultsWithPermissions, scala.Unit]
  ): scala.Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: scala.Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef,
    MaxResults: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResultsWithPermissions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: scala.Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef,
    MaxResults: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResultsWithPermissions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: scala.Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double,
    MaxResults: scala.Double
  ): scala.Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: scala.Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double,
    MaxResults: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResultsWithPermissions, scala.Unit]
  ): scala.Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: scala.Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double,
    MaxResults: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResultsWithPermissions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: scala.Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: scala.Boolean,
    RefreshTypeIfExternalValueList: mfilesLib.MFilesNs.MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: scala.Boolean,
    PropertyDef: scala.Double,
    MaxResults: scala.Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResultsWithPermissions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UndeleteValueListItem(ValueList: mfilesLib.MFilesNs.MFBuiltInValueList, ValueListItemID: scala.Double): scala.Unit = js.native
  def UndeleteValueListItem(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UndeleteValueListItem(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def UndeleteValueListItem(
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    ValueListItemID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UndeleteValueListItem(ValueList: scala.Double, ValueListItemID: scala.Double): scala.Unit = js.native
  def UndeleteValueListItem(ValueList: scala.Double, ValueListItemID: scala.Double, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def UndeleteValueListItem(
    ValueList: scala.Double,
    ValueListItemID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def UndeleteValueListItem(
    ValueList: scala.Double,
    ValueListItemID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UpdateValueListItem(ValueListItem: IValueListItem): scala.Unit = js.native
  def UpdateValueListItem(ValueListItem: IValueListItem, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def UpdateValueListItem(
    ValueListItem: IValueListItem,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def UpdateValueListItem(
    ValueListItem: IValueListItem,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

