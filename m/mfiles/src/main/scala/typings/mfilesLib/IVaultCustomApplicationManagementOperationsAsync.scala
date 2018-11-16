package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultCustomApplicationManagementOperationsAsync extends js.Object {
  def DownloadCustomApplicationBlock(DownloadID: scala.Double, BlockSize: scala.Double, Offset: scala.Double): scala.Unit = js.native
  def DownloadCustomApplicationBlock(
    DownloadID: scala.Double,
    BlockSize: scala.Double,
    Offset: scala.Double,
    successCallback: js.Function1[/* result */ js.Array[scala.Double], scala.Unit]
  ): scala.Unit = js.native
  def DownloadCustomApplicationBlock(
    DownloadID: scala.Double,
    BlockSize: scala.Double,
    Offset: scala.Double,
    successCallback: js.Function1[/* result */ js.Array[scala.Double], scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def DownloadCustomApplicationBlock(
    DownloadID: scala.Double,
    BlockSize: scala.Double,
    Offset: scala.Double,
    successCallback: js.Function1[/* result */ js.Array[scala.Double], scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def DownloadCustomApplicationBlockBegin(ApplicationID: java.lang.String): scala.Unit = js.native
  def DownloadCustomApplicationBlockBegin(
    ApplicationID: java.lang.String,
    successCallback: js.Function1[/* result */ IFileDownloadSession, scala.Unit]
  ): scala.Unit = js.native
  def DownloadCustomApplicationBlockBegin(
    ApplicationID: java.lang.String,
    successCallback: js.Function1[/* result */ IFileDownloadSession, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def DownloadCustomApplicationBlockBegin(
    ApplicationID: java.lang.String,
    successCallback: js.Function1[/* result */ IFileDownloadSession, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def DownloadCustomApplicationBlockBegin_32bit(ApplicationID: java.lang.String): scala.Unit = js.native
  def DownloadCustomApplicationBlockBegin_32bit(
    ApplicationID: java.lang.String,
    successCallback: js.Function1[/* result */ IFileDownloadSession, scala.Unit]
  ): scala.Unit = js.native
  def DownloadCustomApplicationBlockBegin_32bit(
    ApplicationID: java.lang.String,
    successCallback: js.Function1[/* result */ IFileDownloadSession, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def DownloadCustomApplicationBlockBegin_32bit(
    ApplicationID: java.lang.String,
    successCallback: js.Function1[/* result */ IFileDownloadSession, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def DownloadCustomApplicationBlock_32bit(DownloadID: scala.Double, BlockSize: scala.Double, Offset: scala.Double): scala.Unit = js.native
  def DownloadCustomApplicationBlock_32bit(
    DownloadID: scala.Double,
    BlockSize: scala.Double,
    Offset: scala.Double,
    successCallback: js.Function1[/* result */ js.Array[scala.Double], scala.Unit]
  ): scala.Unit = js.native
  def DownloadCustomApplicationBlock_32bit(
    DownloadID: scala.Double,
    BlockSize: scala.Double,
    Offset: scala.Double,
    successCallback: js.Function1[/* result */ js.Array[scala.Double], scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def DownloadCustomApplicationBlock_32bit(
    DownloadID: scala.Double,
    BlockSize: scala.Double,
    Offset: scala.Double,
    successCallback: js.Function1[/* result */ js.Array[scala.Double], scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def EnableCustomApplication(ApplicationID: java.lang.String, Enabled: scala.Boolean): scala.Unit = js.native
  def EnableCustomApplication(ApplicationID: java.lang.String, Enabled: scala.Boolean, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def EnableCustomApplication(
    ApplicationID: java.lang.String,
    Enabled: scala.Boolean,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def EnableCustomApplication(
    ApplicationID: java.lang.String,
    Enabled: scala.Boolean,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetCustomApplication(ApplicationID: java.lang.String): scala.Unit = js.native
  def GetCustomApplication(
    ApplicationID: java.lang.String,
    successCallback: js.Function1[/* result */ ICustomApplication, scala.Unit]
  ): scala.Unit = js.native
  def GetCustomApplication(
    ApplicationID: java.lang.String,
    successCallback: js.Function1[/* result */ ICustomApplication, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetCustomApplication(
    ApplicationID: java.lang.String,
    successCallback: js.Function1[/* result */ ICustomApplication, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetCustomApplications(): scala.Unit = js.native
  def GetCustomApplications(successCallback: js.Function1[/* result */ ICustomApplications, scala.Unit]): scala.Unit = js.native
  def GetCustomApplications(
    successCallback: js.Function1[/* result */ ICustomApplications, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetCustomApplications(
    successCallback: js.Function1[/* result */ ICustomApplications, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetCustomApplicationsEx(Platform: mfilesLib.MFilesNs.MFExtApplicationPlatform): scala.Unit = js.native
  def GetCustomApplicationsEx(
    Platform: mfilesLib.MFilesNs.MFExtApplicationPlatform,
    successCallback: js.Function1[/* result */ ICustomApplications, scala.Unit]
  ): scala.Unit = js.native
  def GetCustomApplicationsEx(
    Platform: mfilesLib.MFilesNs.MFExtApplicationPlatform,
    successCallback: js.Function1[/* result */ ICustomApplications, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetCustomApplicationsEx(
    Platform: mfilesLib.MFilesNs.MFExtApplicationPlatform,
    successCallback: js.Function1[/* result */ ICustomApplications, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def InstallCustomApplication(File: java.lang.String): scala.Unit = js.native
  def InstallCustomApplication(File: java.lang.String, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def InstallCustomApplication(
    File: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def InstallCustomApplication(
    File: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UninstallCustomApplication(ApplicationID: java.lang.String): scala.Unit = js.native
  def UninstallCustomApplication(ApplicationID: java.lang.String, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def UninstallCustomApplication(
    ApplicationID: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def UninstallCustomApplication(
    ApplicationID: java.lang.String,
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

