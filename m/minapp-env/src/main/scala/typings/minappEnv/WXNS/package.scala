package typings.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WXNS {
  type AnyObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  type downloadFile = js.Function1[
    /* param */ typings.minappEnv.WXNS.IDownloadFileParam, 
    typings.minappEnv.WXNS.IDownloadFileTask
  ]
  type getFileInfo = js.Function1[/* param */ typings.minappEnv.WXNS.IGetFileInfoParam, scala.Unit]
  type operateWXData = js.Function1[/* param */ js.Any, scala.Unit]
  type request = js.Function1[
    /* param */ typings.minappEnv.WXNS.IRequestParam, 
    typings.minappEnv.WXNS.IRequestTask
  ]
  type uploadFile = js.Function1[
    /* param */ typings.minappEnv.WXNS.IUploadFileParam, 
    typings.minappEnv.WXNS.IUploadFileTask
  ]
}
