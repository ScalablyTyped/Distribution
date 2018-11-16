package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultNamedACLOperationsAsync extends js.Object {
  def AddNamedACLAdmin(NamedACLAdmin: INamedACLAdmin): scala.Unit = js.native
  def AddNamedACLAdmin(
    NamedACLAdmin: INamedACLAdmin,
    successCallback: js.Function1[/* result */ INamedACLAdmin, scala.Unit]
  ): scala.Unit = js.native
  def AddNamedACLAdmin(
    NamedACLAdmin: INamedACLAdmin,
    successCallback: js.Function1[/* result */ INamedACLAdmin, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def AddNamedACLAdmin(
    NamedACLAdmin: INamedACLAdmin,
    successCallback: js.Function1[/* result */ INamedACLAdmin, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetMatchingNamedACLForAccessControlList(
    AccessControlList: IAccessControlList,
    ExplicitLinkOnly: scala.Boolean,
    ActiveAccessControlComponentsOnly: scala.Boolean,
    RefreshFromServer: scala.Boolean
  ): scala.Unit = js.native
  def GetMatchingNamedACLForAccessControlList(
    AccessControlList: IAccessControlList,
    ExplicitLinkOnly: scala.Boolean,
    ActiveAccessControlComponentsOnly: scala.Boolean,
    RefreshFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ INamedACL, scala.Unit]
  ): scala.Unit = js.native
  def GetMatchingNamedACLForAccessControlList(
    AccessControlList: IAccessControlList,
    ExplicitLinkOnly: scala.Boolean,
    ActiveAccessControlComponentsOnly: scala.Boolean,
    RefreshFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ INamedACL, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetMatchingNamedACLForAccessControlList(
    AccessControlList: IAccessControlList,
    ExplicitLinkOnly: scala.Boolean,
    ActiveAccessControlComponentsOnly: scala.Boolean,
    RefreshFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ INamedACL, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetMatchingNamedACLForAccessControlListComponent(
    AccessControlListComponent: IAccessControlListComponent,
    ExplicitLinkOnly: scala.Boolean,
    RefreshFromServer: scala.Boolean
  ): scala.Unit = js.native
  def GetMatchingNamedACLForAccessControlListComponent(
    AccessControlListComponent: IAccessControlListComponent,
    ExplicitLinkOnly: scala.Boolean,
    RefreshFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ INamedACL, scala.Unit]
  ): scala.Unit = js.native
  def GetMatchingNamedACLForAccessControlListComponent(
    AccessControlListComponent: IAccessControlListComponent,
    ExplicitLinkOnly: scala.Boolean,
    RefreshFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ INamedACL, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetMatchingNamedACLForAccessControlListComponent(
    AccessControlListComponent: IAccessControlListComponent,
    ExplicitLinkOnly: scala.Boolean,
    RefreshFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ INamedACL, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetNamedACL(NamedACLID: scala.Double): scala.Unit = js.native
  def GetNamedACL(NamedACLID: scala.Double, successCallback: js.Function1[/* result */ INamedACL, scala.Unit]): scala.Unit = js.native
  def GetNamedACL(
    NamedACLID: scala.Double,
    successCallback: js.Function1[/* result */ INamedACL, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetNamedACL(
    NamedACLID: scala.Double,
    successCallback: js.Function1[/* result */ INamedACL, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetNamedACLAdmin(NamedACLID: scala.Double): scala.Unit = js.native
  def GetNamedACLAdmin(NamedACLID: scala.Double, successCallback: js.Function1[/* result */ INamedACLAdmin, scala.Unit]): scala.Unit = js.native
  def GetNamedACLAdmin(
    NamedACLID: scala.Double,
    successCallback: js.Function1[/* result */ INamedACLAdmin, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetNamedACLAdmin(
    NamedACLID: scala.Double,
    successCallback: js.Function1[/* result */ INamedACLAdmin, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetNamedACLIDByAlias(Alias: java.lang.String): scala.Unit = js.native
  def GetNamedACLIDByAlias(Alias: java.lang.String, successCallback: js.Function1[/* result */ scala.Double, scala.Unit]): scala.Unit = js.native
  def GetNamedACLIDByAlias(
    Alias: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetNamedACLIDByAlias(
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
  def GetNamedACLIDByGUID(NamedACLGUID: java.lang.String): scala.Unit = js.native
  def GetNamedACLIDByGUID(
    NamedACLGUID: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def GetNamedACLIDByGUID(
    NamedACLGUID: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetNamedACLIDByGUID(
    NamedACLGUID: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetNamedACLWithRefresh(NamedACLID: scala.Double, RefreshFromServer: scala.Boolean): scala.Unit = js.native
  def GetNamedACLWithRefresh(
    NamedACLID: scala.Double,
    RefreshFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ INamedACL, scala.Unit]
  ): scala.Unit = js.native
  def GetNamedACLWithRefresh(
    NamedACLID: scala.Double,
    RefreshFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ INamedACL, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetNamedACLWithRefresh(
    NamedACLID: scala.Double,
    RefreshFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ INamedACL, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetNamedACLs(): scala.Unit = js.native
  def GetNamedACLs(successCallback: js.Function1[/* result */ INamedACLs, scala.Unit]): scala.Unit = js.native
  def GetNamedACLs(
    successCallback: js.Function1[/* result */ INamedACLs, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetNamedACLs(
    successCallback: js.Function1[/* result */ INamedACLs, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetNamedACLsByTypeAdmin(Type: mfilesLib.MFilesNs.MFNamedACLType): scala.Unit = js.native
  def GetNamedACLsByTypeAdmin(
    Type: mfilesLib.MFilesNs.MFNamedACLType,
    successCallback: js.Function1[/* result */ INamedACLsAdmin, scala.Unit]
  ): scala.Unit = js.native
  def GetNamedACLsByTypeAdmin(
    Type: mfilesLib.MFilesNs.MFNamedACLType,
    successCallback: js.Function1[/* result */ INamedACLsAdmin, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetNamedACLsByTypeAdmin(
    Type: mfilesLib.MFilesNs.MFNamedACLType,
    successCallback: js.Function1[/* result */ INamedACLsAdmin, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetNamedACLsWithRefresh(RefreshFromServer: scala.Boolean): scala.Unit = js.native
  def GetNamedACLsWithRefresh(
    RefreshFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ INamedACLs, scala.Unit]
  ): scala.Unit = js.native
  def GetNamedACLsWithRefresh(
    RefreshFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ INamedACLs, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetNamedACLsWithRefresh(
    RefreshFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ INamedACLs, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def IsNamedACLUsedInAutomaticPermissionsAdmin(NamedACLID: scala.Double): scala.Unit = js.native
  def IsNamedACLUsedInAutomaticPermissionsAdmin(NamedACLID: scala.Double, successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def IsNamedACLUsedInAutomaticPermissionsAdmin(
    NamedACLID: scala.Double,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def IsNamedACLUsedInAutomaticPermissionsAdmin(
    NamedACLID: scala.Double,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def RemoveNamedACLWithPropagationAdmin(NamedACLID: scala.Double, AllowPropagation: scala.Boolean): scala.Unit = js.native
  def RemoveNamedACLWithPropagationAdmin(
    NamedACLID: scala.Double,
    AllowPropagation: scala.Boolean,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def RemoveNamedACLWithPropagationAdmin(
    NamedACLID: scala.Double,
    AllowPropagation: scala.Boolean,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def RemoveNamedACLWithPropagationAdmin(
    NamedACLID: scala.Double,
    AllowPropagation: scala.Boolean,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UpdateNamedACLAdmin(NamedACLAdmin: INamedACLAdmin): scala.Unit = js.native
  def UpdateNamedACLAdmin(NamedACLAdmin: INamedACLAdmin, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def UpdateNamedACLAdmin(
    NamedACLAdmin: INamedACLAdmin,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def UpdateNamedACLAdmin(
    NamedACLAdmin: INamedACLAdmin,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UpdateNamedACLWithPropagationAdmin(NamedACLAdmin: INamedACLAdmin, MaintainLinks: scala.Boolean, AllowPropagation: scala.Boolean): scala.Unit = js.native
  def UpdateNamedACLWithPropagationAdmin(
    NamedACLAdmin: INamedACLAdmin,
    MaintainLinks: scala.Boolean,
    AllowPropagation: scala.Boolean,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UpdateNamedACLWithPropagationAdmin(
    NamedACLAdmin: INamedACLAdmin,
    MaintainLinks: scala.Boolean,
    AllowPropagation: scala.Boolean,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def UpdateNamedACLWithPropagationAdmin(
    NamedACLAdmin: INamedACLAdmin,
    MaintainLinks: scala.Boolean,
    AllowPropagation: scala.Boolean,
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

