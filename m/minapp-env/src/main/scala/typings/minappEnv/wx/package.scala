package typings.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wx {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type AccessCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type AccessFailCallback = js.Function1[/* result */ typings.minappEnv.wx.AccessFailCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type AccessSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type AddCardCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type AddCardFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type AddCardSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.AddCardSuccessCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type AddPhoneContactCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type AddPhoneContactFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type AddPhoneContactSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type AppendFileCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type AppendFileFailCallback = js.Function1[/* result */ typings.minappEnv.wx.AppendFileFailCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type AppendFileSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type AuthorizeCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type AuthorizeFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type AuthorizeSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 背景音频进入可播放状态事件的回调函数 */
  type BackgroundAudioManagerOnCanplayCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 背景音频自然播放结束事件的回调函数 */
  type BackgroundAudioManagerOnEndedCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 背景音频播放错误事件的回调函数 */
  type BackgroundAudioManagerOnErrorCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 背景音频暂停事件的回调函数 */
  type BackgroundAudioManagerOnPauseCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 背景音频播放事件的回调函数 */
  type BackgroundAudioManagerOnPlayCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 背景音频完成跳转操作事件的回调函数 */
  type BackgroundAudioManagerOnSeekedCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 背景音频开始跳转操作事件的回调函数 */
  type BackgroundAudioManagerOnSeekingCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 背景音频停止事件的回调函数 */
  type BackgroundAudioManagerOnStopCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 背景音频播放进度更新事件的回调函数 */
  type BackgroundAudioManagerOnTimeUpdateCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 音频加载中事件的回调函数 */
  type BackgroundAudioManagerOnWaitingCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 回调函数，在执行 `SelectorQuery.exec` 方法后，节点信息会在 `callback` 中返回。 */
  type BoundingClientRectCallback = js.Function1[/* result */ typings.minappEnv.wx.BoundingClientRectCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type CameraContextStartRecordCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type CameraContextStartRecordFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type CameraContextStartRecordSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type CanvasGetImageDataCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type CanvasGetImageDataFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type CanvasGetImageDataSuccessCallback = js.Function2[
    /* result */ typings.minappEnv.wx.CanvasGetImageDataSuccessCallbackResult, 
    /* data */ typings.minappEnv.Uint8ClampedArray, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type CanvasPutImageDataCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type CanvasPutImageDataFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type CanvasPutImageDataSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type CanvasToTempFilePathCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type CanvasToTempFilePathFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type CanvasToTempFilePathSuccessCallback = js.Function1[
    /* result */ typings.minappEnv.wx.CanvasToTempFilePathSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type CheckIsSoterEnrolledInDeviceCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type CheckIsSoterEnrolledInDeviceFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type CheckIsSoterEnrolledInDeviceSuccessCallback = js.Function1[
    /* result */ typings.minappEnv.wx.CheckIsSoterEnrolledInDeviceSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type CheckIsSupportSoterAuthenticationCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type CheckIsSupportSoterAuthenticationFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type CheckIsSupportSoterAuthenticationSuccessCallback = js.Function1[
    /* result */ typings.minappEnv.wx.CheckIsSupportSoterAuthenticationSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type CheckSessionCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type CheckSessionFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type CheckSessionSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ChooseAddressCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type ChooseAddressFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type ChooseAddressSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.ChooseAddressSuccessCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ChooseImageCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type ChooseImageFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type ChooseImageSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.ChooseImageSuccessCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ChooseInvoiceCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type ChooseInvoiceFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type ChooseInvoiceSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.ChooseInvoiceSuccessCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ChooseInvoiceTitleCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type ChooseInvoiceTitleFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type ChooseInvoiceTitleSuccessCallback = js.Function1[
    /* result */ typings.minappEnv.wx.ChooseInvoiceTitleSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ChooseLocationCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type ChooseLocationFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type ChooseLocationSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.ChooseLocationSuccessCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ChooseVideoCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type ChooseVideoFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type ChooseVideoSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.ChooseVideoSuccessCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ClearStorageCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type ClearStorageFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type ClearStorageSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type CloseBLEConnectionCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type CloseBLEConnectionFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type CloseBLEConnectionSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type CloseBluetoothAdapterCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type CloseBluetoothAdapterFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type CloseBluetoothAdapterSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type CloseCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type CloseFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type CloseSocketCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type CloseSocketFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type CloseSocketSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type CloseSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type CompressImageCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type CompressImageFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type CompressImageSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ConnectSocketCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type ConnectSocketFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type ConnectSocketSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ConnectWifiCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type ConnectWifiFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type ConnectWifiSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 回调函数，在执行 `SelectorQuery.exec` 方法后，返回节点信息。 */
  type ContextCallback = js.Function1[/* result */ typings.minappEnv.wx.ContextCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type CopyFileCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type CopyFileFailCallback = js.Function1[/* result */ typings.minappEnv.wx.CopyFileFailCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type CopyFileSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type CreateBLEConnectionCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type CreateBLEConnectionFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type CreateBLEConnectionSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type DownloadFileCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type DownloadFileFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type DownloadFileSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.DownloadFileSuccessCallbackResult, scala.Unit]
  /** HTTP Response Header 事件的回调函数 */
  type DownloadTaskOffHeadersReceivedCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 下载进度变化事件的回调函数 */
  type DownloadTaskOffProgressUpdateCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** HTTP Response Header 事件的回调函数 */
  type DownloadTaskOnHeadersReceivedCallback = js.Function1[
    /* result */ typings.minappEnv.wx.DownloadTaskOnHeadersReceivedCallbackResult, 
    scala.Unit
  ]
  /** 下载进度变化事件的回调函数 */
  type DownloadTaskOnProgressUpdateCallback = js.Function1[
    /* result */ typings.minappEnv.wx.DownloadTaskOnProgressUpdateCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ExitFullScreenCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type ExitFullScreenFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type ExitFullScreenSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type FileSystemManagerGetFileInfoCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type FileSystemManagerGetFileInfoFailCallback = js.Function1[/* result */ typings.minappEnv.wx.GetFileInfoFailCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type FileSystemManagerGetFileInfoSuccessCallback = js.Function1[
    /* result */ typings.minappEnv.wx.FileSystemManagerGetFileInfoSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type FileSystemManagerGetSavedFileListCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type FileSystemManagerGetSavedFileListFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type FileSystemManagerGetSavedFileListSuccessCallback = js.Function1[
    /* result */ typings.minappEnv.wx.FileSystemManagerGetSavedFileListSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type FileSystemManagerRemoveSavedFileCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type FileSystemManagerRemoveSavedFileFailCallback = js.Function1[/* result */ typings.minappEnv.wx.RemoveSavedFileFailCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type FileSystemManagerRemoveSavedFileSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type FileSystemManagerSaveFileCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type FileSystemManagerSaveFileFailCallback = js.Function1[/* result */ typings.minappEnv.wx.SaveFileFailCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type FileSystemManagerSaveFileSuccessCallback = js.Function1[
    /* result */ typings.minappEnv.wx.FileSystemManagerSaveFileSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetAvailableAudioSourcesCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetAvailableAudioSourcesFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetAvailableAudioSourcesSuccessCallback = js.Function1[
    /* result */ typings.minappEnv.wx.GetAvailableAudioSourcesSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetBLEDeviceCharacteristicsCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetBLEDeviceCharacteristicsFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetBLEDeviceCharacteristicsSuccessCallback = js.Function1[
    /* result */ typings.minappEnv.wx.GetBLEDeviceCharacteristicsSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetBLEDeviceServicesCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetBLEDeviceServicesFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetBLEDeviceServicesSuccessCallback = js.Function1[
    /* result */ typings.minappEnv.wx.GetBLEDeviceServicesSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetBackgroundAudioPlayerStateCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetBackgroundAudioPlayerStateFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetBackgroundAudioPlayerStateSuccessCallback = js.Function1[
    /* result */ typings.minappEnv.wx.GetBackgroundAudioPlayerStateSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetBatteryInfoCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetBatteryInfoFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetBatteryInfoSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.GetBatteryInfoSuccessCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetBeaconsCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetBeaconsFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetBeaconsSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.GetBeaconsSuccessCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetBluetoothAdapterStateCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetBluetoothAdapterStateFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetBluetoothAdapterStateSuccessCallback = js.Function1[
    /* result */ typings.minappEnv.wx.GetBluetoothAdapterStateSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetBluetoothDevicesCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetBluetoothDevicesFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetBluetoothDevicesSuccessCallback = js.Function1[
    /* result */ typings.minappEnv.wx.GetBluetoothDevicesSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetCenterLocationCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetCenterLocationFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetCenterLocationSuccessCallback = js.Function1[
    /* result */ typings.minappEnv.wx.GetCenterLocationSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetClipboardDataCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetClipboardDataFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetClipboardDataSuccessCallback = js.Function1[
    /* option */ typings.minappEnv.wx.GetClipboardDataSuccessCallbackOption, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetConnectedBluetoothDevicesCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetConnectedBluetoothDevicesFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetConnectedBluetoothDevicesSuccessCallback = js.Function1[
    /* result */ typings.minappEnv.wx.GetConnectedBluetoothDevicesSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetConnectedWifiCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetConnectedWifiFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetConnectedWifiSuccessCallback = js.Function1[
    /* result */ typings.minappEnv.wx.GetConnectedWifiSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetExtConfigCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetExtConfigFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetExtConfigSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.GetExtConfigSuccessCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetHCEStateCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetHCEStateFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetHCEStateSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetImageInfoCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetImageInfoFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetImageInfoSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.GetImageInfoSuccessCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetLocationCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetLocationFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetLocationSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.GetLocationSuccessCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetNetworkTypeCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetNetworkTypeFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetNetworkTypeSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.GetNetworkTypeSuccessCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetRegionCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetRegionFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetRegionSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.GetRegionSuccessCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetSavedFileInfoCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetSavedFileInfoFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetSavedFileInfoSuccessCallback = js.Function1[
    /* result */ typings.minappEnv.wx.GetSavedFileInfoSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetScaleCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetScaleFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetScaleSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.GetScaleSuccessCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetScreenBrightnessCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetScreenBrightnessFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetScreenBrightnessSuccessCallback = js.Function1[
    /* option */ typings.minappEnv.wx.GetScreenBrightnessSuccessCallbackOption, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetSettingCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetSettingFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetSettingSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.GetSettingSuccessCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetShareInfoCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetShareInfoFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetShareInfoSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.GetShareInfoSuccessCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetStorageCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetStorageFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetStorageInfoCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetStorageInfoFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetStorageInfoSuccessCallback = js.Function1[/* option */ typings.minappEnv.wx.GetStorageInfoSuccessCallbackOption, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetStorageSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.GetStorageSuccessCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetSystemInfoCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetSystemInfoFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetSystemInfoSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.GetSystemInfoSuccessCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetUserInfoCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetUserInfoFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetUserInfoSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.GetUserInfoSuccessCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetWeRunDataCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetWeRunDataFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetWeRunDataSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.GetWeRunDataSuccessCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetWifiListCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetWifiListFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetWifiListSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type HideLoadingCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type HideLoadingFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type HideLoadingSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type HideNavigationBarLoadingCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type HideNavigationBarLoadingFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type HideNavigationBarLoadingSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type HideShareMenuCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type HideShareMenuFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type HideShareMenuSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type HideTabBarCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type HideTabBarFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type HideTabBarRedDotCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type HideTabBarRedDotFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type HideTabBarRedDotSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type HideTabBarSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type HideToastCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type HideToastFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type HideToastSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type IncludePointsCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type IncludePointsFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type IncludePointsSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 音频进入可以播放状态的事件的回调函数 */
  type InnerAudioContextOnCanplayCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 音频自然播放至结束的事件的回调函数 */
  type InnerAudioContextOnEndedCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 音频播放错误事件的回调函数 */
  type InnerAudioContextOnErrorCallback = js.Function1[
    /* result */ typings.minappEnv.wx.InnerAudioContextOnErrorCallbackResult, 
    scala.Unit
  ]
  /** 音频暂停事件的回调函数 */
  type InnerAudioContextOnPauseCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 音频播放事件的回调函数 */
  type InnerAudioContextOnPlayCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 音频完成跳转操作的事件的回调函数 */
  type InnerAudioContextOnSeekedCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 音频进行跳转操作的事件的回调函数 */
  type InnerAudioContextOnSeekingCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 音频停止事件的回调函数 */
  type InnerAudioContextOnStopCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 音频播放进度更新事件的回调函数 */
  type InnerAudioContextOnTimeUpdateCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 音频加载中事件的回调函数 */
  type InnerAudioContextOnWaitingCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type LivePlayerContextPauseCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type LivePlayerContextPauseFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type LivePlayerContextPauseSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type LivePlayerContextResumeCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type LivePlayerContextResumeFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type LivePlayerContextResumeSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type LivePlayerContextStopCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type LivePlayerContextStopFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type LivePlayerContextStopSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type LivePusherContextPauseCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type LivePusherContextPauseFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type LivePusherContextPauseSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type LivePusherContextResumeCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type LivePusherContextResumeFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type LivePusherContextResumeSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type LivePusherContextStopCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type LivePusherContextStopFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type LivePusherContextStopSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type LoadFontFaceCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type LoadFontFaceFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type LoadFontFaceSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type LoginCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type LoginFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type LoginSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.LoginSuccessCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type MakePhoneCallCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type MakePhoneCallFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type MakePhoneCallSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type MkdirCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type MkdirFailCallback = js.Function1[/* result */ typings.minappEnv.wx.MkdirFailCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type MkdirSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type MuteCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type MuteFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type MuteSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type NavigateBackCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type NavigateBackFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type NavigateBackMiniProgramCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type NavigateBackMiniProgramFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type NavigateBackMiniProgramSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type NavigateBackSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type NavigateToCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type NavigateToFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type NavigateToMiniProgramCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type NavigateToMiniProgramFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type NavigateToMiniProgramSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type NavigateToSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type NotifyBLECharacteristicValueChangeCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type NotifyBLECharacteristicValueChangeFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type NotifyBLECharacteristicValueChangeSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 监听相交状态变化的回调函数 */
  type ObserveCallback = js.Function1[/* result */ typings.minappEnv.wx.ObserveCallbackResult, scala.Unit]
  /** 小程序切后台事件的回调函数 */
  type OffAppHideCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 小程序切前台事件的回调函数 */
  type OffAppShowCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 音频进入可以播放状态的事件的回调函数 */
  type OffCanplayCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 音频自然播放至结束的事件的回调函数 */
  type OffEndedCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 音频播放错误事件的回调函数 */
  type OffErrorCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** mDNS 服务停止搜索的事件的回调函数 */
  type OffLocalServiceDiscoveryStopCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** mDNS 服务发现的事件的回调函数 */
  type OffLocalServiceFoundCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** mDNS 服务离开的事件的回调函数 */
  type OffLocalServiceLostCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** mDNS 服务解析失败的事件的回调函数 */
  type OffLocalServiceResolveFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 小程序要打开的页面不存在事件的回调函数 */
  type OffPageNotFoundCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 音频暂停事件的回调函数 */
  type OffPauseCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 音频播放事件的回调函数 */
  type OffPlayCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 音频完成跳转操作的事件的回调函数 */
  type OffSeekedCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 音频进行跳转操作的事件的回调函数 */
  type OffSeekingCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 音频停止事件的回调函数 */
  type OffStopCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 音频播放进度更新事件的回调函数 */
  type OffTimeUpdateCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 音频加载中事件的回调函数 */
  type OffWaitingCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 窗口尺寸变化事件的回调函数 */
  type OffWindowResizeCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 加速度数据事件的回调函数 */
  type OnAccelerometerChangeCallback = js.Function1[/* result */ typings.minappEnv.wx.OnAccelerometerChangeCallbackResult, scala.Unit]
  /** 小程序错误事件的回调函数 */
  type OnAppErrorCallback = js.Function1[/* error */ java.lang.String, scala.Unit]
  /** 小程序切后台事件的回调函数 */
  type OnAppHideCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 小程序切前台事件的回调函数 */
  type OnAppShowCallback = js.Function1[/* result */ typings.minappEnv.wx.OnAppShowCallbackResult, scala.Unit]
  /** 低功耗蓝牙设备的特征值变化事件的回调函数 */
  type OnBLECharacteristicValueChangeCallback = js.Function1[
    /* result */ typings.minappEnv.wx.OnBLECharacteristicValueChangeCallbackResult, 
    scala.Unit
  ]
  /** 低功耗蓝牙连接状态的改变事件的回调函数 */
  type OnBLEConnectionStateChangeCallback = js.Function1[
    /* result */ typings.minappEnv.wx.OnBLEConnectionStateChangeCallbackResult, 
    scala.Unit
  ]
  /** 音乐暂停事件的回调函数 */
  type OnBackgroundAudioPauseCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 音乐播放事件的回调函数 */
  type OnBackgroundAudioPlayCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 音乐停止事件的回调函数 */
  type OnBackgroundAudioStopCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** iBeacon 服务状态变化事件的回调函数 */
  type OnBeaconServiceChangeCallback = js.Function1[/* result */ typings.minappEnv.wx.OnBeaconServiceChangeCallbackResult, scala.Unit]
  /** iBeacon 设备更新事件的回调函数 */
  type OnBeaconUpdateCallback = js.Function1[/* result */ typings.minappEnv.wx.OnBeaconUpdateCallbackResult, scala.Unit]
  /** 蓝牙适配器状态变化事件的回调函数 */
  type OnBluetoothAdapterStateChangeCallback = js.Function1[
    /* result */ typings.minappEnv.wx.OnBluetoothAdapterStateChangeCallbackResult, 
    scala.Unit
  ]
  /** 寻找到新设备的事件的回调函数 */
  type OnBluetoothDeviceFoundCallback = js.Function1[/* result */ typings.minappEnv.wx.OnBluetoothDeviceFoundCallbackResult, scala.Unit]
  /** 向微信后台请求检查更新结果事件的回调函数 */
  type OnCheckForUpdateCallback = js.Function1[/* result */ typings.minappEnv.wx.OnCheckForUpdateCallbackResult, scala.Unit]
  /** WebSocket 连接关闭事件的回调函数 */
  type OnCloseCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 罗盘数据变化事件的回调函数 */
  type OnCompassChangeCallback = js.Function1[/* result */ typings.minappEnv.wx.OnCompassChangeCallbackResult, scala.Unit]
  /** 设备方向变化事件的回调函数 */
  type OnDeviceMotionChangeCallback = js.Function1[/* result */ typings.minappEnv.wx.OnDeviceMotionChangeCallbackResult, scala.Unit]
  /** 已录制完指定帧大小的文件事件的回调函数 */
  type OnFrameRecordedCallback = js.Function1[/* result */ typings.minappEnv.wx.OnFrameRecordedCallbackResult, scala.Unit]
  /** 获取到 Wi-Fi 列表数据事件的回调函数 */
  type OnGetWifiListCallback = js.Function1[/* result */ typings.minappEnv.wx.OnGetWifiListCallbackResult, scala.Unit]
  /** 陀螺仪数据变化事件的回调函数 */
  type OnGyroscopeChangeCallback = js.Function1[/* result */ typings.minappEnv.wx.OnGyroscopeChangeCallbackResult, scala.Unit]
  /** 接收 NFC 设备消息事件的回调函数 */
  type OnHCEMessageCallback = js.Function1[/* result */ typings.minappEnv.wx.OnHCEMessageCallbackResult, scala.Unit]
  /** 录音因为受到系统占用而被中断开始事件的回调函数 */
  type OnInterruptionBeginCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 录音中断结束事件的回调函数 */
  type OnInterruptionEndCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** mDNS 服务停止搜索的事件的回调函数 */
  type OnLocalServiceDiscoveryStopCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** mDNS 服务发现的事件的回调函数 */
  type OnLocalServiceFoundCallback = js.Function1[/* result */ typings.minappEnv.wx.OnLocalServiceFoundCallbackResult, scala.Unit]
  /** mDNS 服务离开的事件的回调函数 */
  type OnLocalServiceLostCallback = js.Function1[/* result */ typings.minappEnv.wx.OnLocalServiceLostCallbackResult, scala.Unit]
  /** mDNS 服务解析失败的事件的回调函数 */
  type OnLocalServiceResolveFailCallback = js.Function1[
    /* result */ typings.minappEnv.wx.OnLocalServiceResolveFailCallbackResult, 
    scala.Unit
  ]
  /** 内存不足告警事件的回调函数 */
  type OnMemoryWarningCallback = js.Function1[/* result */ typings.minappEnv.wx.OnMemoryWarningCallbackResult, scala.Unit]
  /** 网络状态变化事件的回调函数 */
  type OnNetworkStatusChangeCallback = js.Function1[/* result */ typings.minappEnv.wx.OnNetworkStatusChangeCallbackResult, scala.Unit]
  /** 用户在系统音乐播放面板点击下一曲事件的回调函数 */
  type OnNextCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** WebSocket 连接打开事件的回调函数 */
  type OnOpenCallback = js.Function1[/* result */ typings.minappEnv.wx.OnOpenCallbackResult, scala.Unit]
  /** 小程序要打开的页面不存在事件的回调函数 */
  type OnPageNotFoundCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 用户在系统音乐播放面板点击上一曲事件的回调函数 */
  type OnPrevCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 录音继续事件的回调函数 */
  type OnResumeCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** WebSocket 连接关闭事件的回调函数 */
  type OnSocketCloseCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** WebSocket 错误事件的回调函数 */
  type OnSocketErrorCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** WebSocket 接受到服务器的消息事件的回调函数 */
  type OnSocketMessageCallback = js.Function1[/* result */ typings.minappEnv.wx.OnSocketMessageCallbackResult, scala.Unit]
  /** WebSocket 连接打开事件的回调函数 */
  type OnSocketOpenCallback = js.Function1[/* result */ typings.minappEnv.wx.OnSocketOpenCallbackResult, scala.Unit]
  /** 录音开始事件的回调函数 */
  type OnStartCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 小程序更新失败事件的回调函数 */
  type OnUpdateFailedCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 小程序有版本更新事件的回调函数 */
  type OnUpdateReadyCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 用户主动截屏事件的回调函数 */
  type OnUserCaptureScreenCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 连接上 Wi-Fi 的事件的回调函数 */
  type OnWifiConnectedCallback = js.Function1[/* result */ typings.minappEnv.wx.OnWifiConnectedCallbackResult, scala.Unit]
  /** 窗口尺寸变化事件的回调函数 */
  type OnWindowResizeCallback = js.Function1[/* result */ typings.minappEnv.wx.OnWindowResizeCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type OpenBluetoothAdapterCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type OpenBluetoothAdapterFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type OpenBluetoothAdapterSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type OpenCardCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type OpenCardFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type OpenCardSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type OpenDocumentCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type OpenDocumentFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type OpenDocumentSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type OpenLocationCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type OpenLocationFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type OpenLocationSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type OpenSettingCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type OpenSettingFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type OpenSettingSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.OpenSettingSuccessCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type PageScrollToCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type PageScrollToFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type PageScrollToSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type PauseBGMCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type PauseBGMFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type PauseBGMSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type PauseBackgroundAudioCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type PauseBackgroundAudioFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type PauseBackgroundAudioSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type PauseVoiceCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type PauseVoiceFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type PauseVoiceSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type PlayBGMCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type PlayBGMFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type PlayBGMSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type PlayBackgroundAudioCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type PlayBackgroundAudioFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type PlayBackgroundAudioSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type PlayCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type PlayFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type PlaySuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type PlayVoiceCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type PlayVoiceFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type PlayVoiceSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type PreviewImageCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type PreviewImageFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type PreviewImageSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ReLaunchCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type ReLaunchFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type ReLaunchSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ReadBLECharacteristicValueCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type ReadBLECharacteristicValueFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type ReadBLECharacteristicValueSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ReadFileCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type ReadFileFailCallback = js.Function1[/* result */ typings.minappEnv.wx.ReadFileFailCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type ReadFileSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.ReadFileSuccessCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ReaddirCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type ReaddirFailCallback = js.Function1[/* result */ typings.minappEnv.wx.ReaddirFailCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type ReaddirSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.ReaddirSuccessCallbackResult, scala.Unit]
  /** 录音错误事件的回调函数 */
  type RecorderManagerOnErrorCallback = js.Function1[/* result */ typings.minappEnv.wx.RecorderManagerOnErrorCallbackResult, scala.Unit]
  /** 录音暂停事件的回调函数 */
  type RecorderManagerOnPauseCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 录音结束事件的回调函数 */
  type RecorderManagerOnStopCallback = js.Function1[/* result */ typings.minappEnv.wx.OnStopCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type RedirectToCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type RedirectToFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type RedirectToSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type RemoveStorageCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type RemoveStorageFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type RemoveStorageSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type RemoveTabBarBadgeCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type RemoveTabBarBadgeFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type RemoveTabBarBadgeSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type RenameCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type RenameFailCallback = js.Function1[/* result */ typings.minappEnv.wx.RenameFailCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type RenameSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type RequestCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type RequestFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type RequestFullScreenCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type RequestFullScreenFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type RequestFullScreenSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type RequestPaymentCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type RequestPaymentFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type RequestPaymentSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type RequestSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.RequestSuccessCallbackResult, scala.Unit]
  /** HTTP Response Header 事件的回调函数 */
  type RequestTaskOffHeadersReceivedCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** HTTP Response Header 事件的回调函数 */
  type RequestTaskOnHeadersReceivedCallback = js.Function1[
    /* result */ typings.minappEnv.wx.RequestTaskOnHeadersReceivedCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ResumeBGMCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type ResumeBGMFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type ResumeBGMSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type RmdirCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type RmdirFailCallback = js.Function1[/* result */ typings.minappEnv.wx.RmdirFailCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type RmdirSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SaveImageToPhotosAlbumCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type SaveImageToPhotosAlbumFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type SaveImageToPhotosAlbumSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SaveVideoToPhotosAlbumCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type SaveVideoToPhotosAlbumFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type SaveVideoToPhotosAlbumSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ScanCodeCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type ScanCodeFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type ScanCodeSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.ScanCodeSuccessCallbackResult, scala.Unit]
  /** 回调函数，在执行 `SelectorQuery.exec` 方法后，节点信息会在 `callback` 中返回。 */
  type ScrollOffsetCallback = js.Function1[/* result */ typings.minappEnv.wx.ScrollOffsetCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SeekBackgroundAudioCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type SeekBackgroundAudioFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type SeekBackgroundAudioSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SendCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type SendFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SendHCEMessageCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type SendHCEMessageFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type SendHCEMessageSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SendSocketMessageCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type SendSocketMessageFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type SendSocketMessageSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type SendSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetBGMVolumeCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type SetBGMVolumeFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type SetBGMVolumeSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetBackgroundColorCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type SetBackgroundColorFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type SetBackgroundColorSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetBackgroundTextStyleCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type SetBackgroundTextStyleFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type SetBackgroundTextStyleSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetClipboardDataCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type SetClipboardDataFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type SetClipboardDataSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetEnableDebugCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type SetEnableDebugFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type SetEnableDebugSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetInnerAudioOptionCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type SetInnerAudioOptionFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type SetInnerAudioOptionSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetKeepScreenOnCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type SetKeepScreenOnFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type SetKeepScreenOnSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetNavigationBarColorCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type SetNavigationBarColorFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type SetNavigationBarColorSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetNavigationBarTitleCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type SetNavigationBarTitleFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type SetNavigationBarTitleSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetScreenBrightnessCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type SetScreenBrightnessFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type SetScreenBrightnessSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetStorageCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type SetStorageFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type SetStorageSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetTabBarBadgeCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type SetTabBarBadgeFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type SetTabBarBadgeSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetTabBarItemCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type SetTabBarItemFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type SetTabBarItemSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetTabBarStyleCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type SetTabBarStyleFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type SetTabBarStyleSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetTopBarTextCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type SetTopBarTextFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type SetTopBarTextSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetWifiListCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type SetWifiListFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type SetWifiListSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ShowActionSheetCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type ShowActionSheetFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type ShowActionSheetSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.ShowActionSheetSuccessCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ShowLoadingCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type ShowLoadingFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type ShowLoadingSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ShowModalCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type ShowModalFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type ShowModalSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.ShowModalSuccessCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ShowNavigationBarLoadingCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type ShowNavigationBarLoadingFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type ShowNavigationBarLoadingSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ShowShareMenuCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type ShowShareMenuFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type ShowShareMenuSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ShowTabBarCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type ShowTabBarFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ShowTabBarRedDotCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type ShowTabBarRedDotFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type ShowTabBarRedDotSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type ShowTabBarSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ShowToastCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type ShowToastFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type ShowToastSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SnapshotCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type SnapshotFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type SnapshotSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** WebSocket 错误事件的回调函数 */
  type SocketTaskOnErrorCallback = js.Function1[/* result */ typings.minappEnv.wx.SocketTaskOnErrorCallbackResult, scala.Unit]
  /** WebSocket 接受到服务器的消息事件的回调函数 */
  type SocketTaskOnMessageCallback = js.Function1[/* result */ typings.minappEnv.wx.SocketTaskOnMessageCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StartAccelerometerCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StartAccelerometerFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StartAccelerometerSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StartBeaconDiscoveryCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StartBeaconDiscoveryFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StartBeaconDiscoverySuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StartBluetoothDevicesDiscoveryCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StartBluetoothDevicesDiscoveryFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StartBluetoothDevicesDiscoverySuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StartCompassCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StartCompassFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StartCompassSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StartCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StartDeviceMotionListeningCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StartDeviceMotionListeningFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StartDeviceMotionListeningSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StartFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StartGyroscopeCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StartGyroscopeFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StartGyroscopeSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StartHCECompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StartHCEFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StartHCESuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StartLocalServiceDiscoveryCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StartLocalServiceDiscoveryFailCallback = js.Function1[
    /* result */ typings.minappEnv.wx.StartLocalServiceDiscoveryFailCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type StartLocalServiceDiscoverySuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StartPullDownRefreshCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StartPullDownRefreshFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StartPullDownRefreshSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 超过30s或页面 `onHide` 时会结束录像 */
  type StartRecordTimeoutCallback = js.Function1[/* result */ typings.minappEnv.wx.StartRecordTimeoutCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StartSoterAuthenticationCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StartSoterAuthenticationFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StartSoterAuthenticationSuccessCallback = js.Function1[
    /* result */ typings.minappEnv.wx.StartSoterAuthenticationSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type StartSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StartWifiCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StartWifiFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StartWifiSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StatCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StatFailCallback = js.Function1[/* result */ typings.minappEnv.wx.StatFailCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StatSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.StatSuccessCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopAccelerometerCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StopAccelerometerFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StopAccelerometerSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopBGMCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StopBGMFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StopBGMSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopBackgroundAudioCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StopBackgroundAudioFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StopBackgroundAudioSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopBeaconDiscoveryCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StopBeaconDiscoveryFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StopBeaconDiscoverySuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopBluetoothDevicesDiscoveryCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StopBluetoothDevicesDiscoveryFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StopBluetoothDevicesDiscoverySuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopCompassCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StopCompassFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StopCompassSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopDeviceMotionListeningCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StopDeviceMotionListeningFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StopDeviceMotionListeningSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopGyroscopeCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StopGyroscopeFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StopGyroscopeSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopHCECompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StopHCEFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StopHCESuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopLocalServiceDiscoveryCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StopLocalServiceDiscoveryFailCallback = js.Function1[
    /* result */ typings.minappEnv.wx.StopLocalServiceDiscoveryFailCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type StopLocalServiceDiscoverySuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopPullDownRefreshCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StopPullDownRefreshFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StopPullDownRefreshSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopRecordCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StopRecordFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StopRecordSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.StopRecordSuccessCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopVoiceCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StopVoiceFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StopVoiceSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopWifiCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StopWifiFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StopWifiSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SwitchCameraCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type SwitchCameraFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type SwitchCameraSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SwitchTabCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type SwitchTabFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type SwitchTabSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type TakePhotoCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type TakePhotoFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type TakePhotoSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.TakePhotoSuccessCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ToggleTorchCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type ToggleTorchFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type ToggleTorchSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type TranslateMarkerCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type TranslateMarkerFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type TranslateMarkerSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type UnlinkCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type UnlinkFailCallback = js.Function1[/* result */ typings.minappEnv.wx.UnlinkFailCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type UnlinkSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type UnzipCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type UnzipFailCallback = js.Function1[/* result */ typings.minappEnv.wx.UnzipFailCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type UnzipSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type UpdateShareMenuCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type UpdateShareMenuFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type UpdateShareMenuSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type UploadFileCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type UploadFileFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type UploadFileSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.UploadFileSuccessCallbackResult, scala.Unit]
  /** HTTP Response Header 事件的回调函数 */
  type UploadTaskOffHeadersReceivedCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 上传进度变化事件的回调函数 */
  type UploadTaskOffProgressUpdateCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** HTTP Response Header 事件的回调函数 */
  type UploadTaskOnHeadersReceivedCallback = js.Function1[
    /* result */ typings.minappEnv.wx.UploadTaskOnHeadersReceivedCallbackResult, 
    scala.Unit
  ]
  /** 上传进度变化事件的回调函数 */
  type UploadTaskOnProgressUpdateCallback = js.Function1[
    /* result */ typings.minappEnv.wx.UploadTaskOnProgressUpdateCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type VibrateLongCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type VibrateLongFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type VibrateLongSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type VibrateShortCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type VibrateShortFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type VibrateShortSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 主线程/Worker 线程向当前线程发送的消息的事件的回调函数 */
  type WorkerOnMessageCallback = js.Function1[/* result */ typings.minappEnv.wx.WorkerOnMessageCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type WriteBLECharacteristicValueCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type WriteBLECharacteristicValueFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type WriteBLECharacteristicValueSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type WriteFileCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type WriteFileFailCallback = js.Function1[/* result */ typings.minappEnv.wx.WriteFileFailCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type WriteFileSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type WxGetFileInfoCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type WxGetFileInfoFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type WxGetFileInfoSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.WxGetFileInfoSuccessCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type WxGetSavedFileListCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type WxGetSavedFileListFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type WxGetSavedFileListSuccessCallback = js.Function1[
    /* result */ typings.minappEnv.wx.WxGetSavedFileListSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type WxRemoveSavedFileCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type WxRemoveSavedFileFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type WxRemoveSavedFileSuccessCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type WxSaveFileCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type WxSaveFileFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type WxSaveFileSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.WxSaveFileSuccessCallbackResult, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type WxStartRecordCompleteCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用失败的回调函数 */
  type WxStartRecordFailCallback = js.Function1[/* res */ typings.minappEnv.wx.GeneralCallbackResult, scala.Unit]
  /** 接口调用成功的回调函数 */
  type WxStartRecordSuccessCallback = js.Function1[/* result */ typings.minappEnv.wx.StartRecordSuccessCallbackResult, scala.Unit]
}
