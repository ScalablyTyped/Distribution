package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultUserGroupOperationsAsync extends js.Object {
  def AddOrUndeleteUserGroup(UserGroup: IUserGroupAdmin): scala.Unit = js.native
  def AddOrUndeleteUserGroup(
    UserGroup: IUserGroupAdmin,
    successCallback: js.Function1[/* result */ IUserGroupAdmin, scala.Unit]
  ): scala.Unit = js.native
  def AddOrUndeleteUserGroup(
    UserGroup: IUserGroupAdmin,
    successCallback: js.Function1[/* result */ IUserGroupAdmin, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def AddOrUndeleteUserGroup(
    UserGroup: IUserGroupAdmin,
    successCallback: js.Function1[/* result */ IUserGroupAdmin, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def AddUserGroupAdmin(UserGroup: IUserGroupAdmin): scala.Unit = js.native
  def AddUserGroupAdmin(
    UserGroup: IUserGroupAdmin,
    successCallback: js.Function1[/* result */ IUserGroupAdmin, scala.Unit]
  ): scala.Unit = js.native
  def AddUserGroupAdmin(
    UserGroup: IUserGroupAdmin,
    successCallback: js.Function1[/* result */ IUserGroupAdmin, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def AddUserGroupAdmin(
    UserGroup: IUserGroupAdmin,
    successCallback: js.Function1[/* result */ IUserGroupAdmin, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetGroupsOfUserOrGroup(UserOrGroupID: scala.Double, IsGroup: scala.Boolean): scala.Unit = js.native
  def GetGroupsOfUserOrGroup(
    UserOrGroupID: scala.Double,
    IsGroup: scala.Boolean,
    successCallback: js.Function1[/* result */ IUserGroups, scala.Unit]
  ): scala.Unit = js.native
  def GetGroupsOfUserOrGroup(
    UserOrGroupID: scala.Double,
    IsGroup: scala.Boolean,
    successCallback: js.Function1[/* result */ IUserGroups, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetGroupsOfUserOrGroup(
    UserOrGroupID: scala.Double,
    IsGroup: scala.Boolean,
    successCallback: js.Function1[/* result */ IUserGroups, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetUserGroup(UserGroupID: mfilesLib.MFilesNs.MFBuiltInUserGroup): scala.Unit = js.native
  def GetUserGroup(
    UserGroupID: mfilesLib.MFilesNs.MFBuiltInUserGroup,
    successCallback: js.Function1[/* result */ IUserGroup, scala.Unit]
  ): scala.Unit = js.native
  def GetUserGroup(
    UserGroupID: mfilesLib.MFilesNs.MFBuiltInUserGroup,
    successCallback: js.Function1[/* result */ IUserGroup, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetUserGroup(
    UserGroupID: mfilesLib.MFilesNs.MFBuiltInUserGroup,
    successCallback: js.Function1[/* result */ IUserGroup, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetUserGroup(UserGroupID: scala.Double): scala.Unit = js.native
  def GetUserGroup(UserGroupID: scala.Double, successCallback: js.Function1[/* result */ IUserGroup, scala.Unit]): scala.Unit = js.native
  def GetUserGroup(
    UserGroupID: scala.Double,
    successCallback: js.Function1[/* result */ IUserGroup, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetUserGroup(
    UserGroupID: scala.Double,
    successCallback: js.Function1[/* result */ IUserGroup, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetUserGroupAdmin(UserGroupID: mfilesLib.MFilesNs.MFBuiltInUserGroup): scala.Unit = js.native
  def GetUserGroupAdmin(
    UserGroupID: mfilesLib.MFilesNs.MFBuiltInUserGroup,
    successCallback: js.Function1[/* result */ IUserGroupAdmin, scala.Unit]
  ): scala.Unit = js.native
  def GetUserGroupAdmin(
    UserGroupID: mfilesLib.MFilesNs.MFBuiltInUserGroup,
    successCallback: js.Function1[/* result */ IUserGroupAdmin, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetUserGroupAdmin(
    UserGroupID: mfilesLib.MFilesNs.MFBuiltInUserGroup,
    successCallback: js.Function1[/* result */ IUserGroupAdmin, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetUserGroupAdmin(UserGroupID: scala.Double): scala.Unit = js.native
  def GetUserGroupAdmin(UserGroupID: scala.Double, successCallback: js.Function1[/* result */ IUserGroupAdmin, scala.Unit]): scala.Unit = js.native
  def GetUserGroupAdmin(
    UserGroupID: scala.Double,
    successCallback: js.Function1[/* result */ IUserGroupAdmin, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetUserGroupAdmin(
    UserGroupID: scala.Double,
    successCallback: js.Function1[/* result */ IUserGroupAdmin, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetUserGroupIDByAlias(Alias: java.lang.String): scala.Unit = js.native
  def GetUserGroupIDByAlias(Alias: java.lang.String, successCallback: js.Function1[/* result */ scala.Double, scala.Unit]): scala.Unit = js.native
  def GetUserGroupIDByAlias(
    Alias: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetUserGroupIDByAlias(
    Alias: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetUserGroupIDByGUID(UserGroupGUID: java.lang.String): scala.Unit = js.native
  def GetUserGroupIDByGUID(
    UserGroupGUID: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def GetUserGroupIDByGUID(
    UserGroupGUID: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetUserGroupIDByGUID(
    UserGroupGUID: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetUserGroupList(): scala.Unit = js.native
  def GetUserGroupList(successCallback: js.Function1[/* result */ IKeyNamePairs, scala.Unit]): scala.Unit = js.native
  def GetUserGroupList(
    successCallback: js.Function1[/* result */ IKeyNamePairs, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetUserGroupList(
    successCallback: js.Function1[/* result */ IKeyNamePairs, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetUserGroups(): scala.Unit = js.native
  def GetUserGroups(successCallback: js.Function1[/* result */ IUserGroups, scala.Unit]): scala.Unit = js.native
  def GetUserGroups(
    successCallback: js.Function1[/* result */ IUserGroups, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetUserGroups(
    successCallback: js.Function1[/* result */ IUserGroups, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetUserGroupsAdmin(): scala.Unit = js.native
  def GetUserGroupsAdmin(successCallback: js.Function1[/* result */ IUserGroupsAdmin, scala.Unit]): scala.Unit = js.native
  def GetUserGroupsAdmin(
    successCallback: js.Function1[/* result */ IUserGroupsAdmin, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetUserGroupsAdmin(
    successCallback: js.Function1[/* result */ IUserGroupsAdmin, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def RemoveUserGroupAdmin(UserGroupID: mfilesLib.MFilesNs.MFBuiltInUserGroup): scala.Unit = js.native
  def RemoveUserGroupAdmin(UserGroupID: mfilesLib.MFilesNs.MFBuiltInUserGroup, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def RemoveUserGroupAdmin(
    UserGroupID: mfilesLib.MFilesNs.MFBuiltInUserGroup,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def RemoveUserGroupAdmin(
    UserGroupID: mfilesLib.MFilesNs.MFBuiltInUserGroup,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def RemoveUserGroupAdmin(UserGroupID: scala.Double): scala.Unit = js.native
  def RemoveUserGroupAdmin(UserGroupID: scala.Double, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def RemoveUserGroupAdmin(
    UserGroupID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def RemoveUserGroupAdmin(
    UserGroupID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UpdateUserGroupAdmin(UserGroup: IUserGroupAdmin): scala.Unit = js.native
  def UpdateUserGroupAdmin(UserGroup: IUserGroupAdmin, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def UpdateUserGroupAdmin(
    UserGroup: IUserGroupAdmin,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def UpdateUserGroupAdmin(
    UserGroup: IUserGroupAdmin,
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

