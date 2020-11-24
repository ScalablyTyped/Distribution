package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object miniprogram {
  
  type ChoosePhoneContactArgs = typings.miniprogram.AsyncCallback[typings.miniprogram.anon.Mobile]
  
  type EmptyFn = js.Function0[scala.Unit]
  
  type GetClipboardArgs = typings.miniprogram.AsyncCallback[typings.miniprogram.anon.Text]
  
  type GetNetworkTypeArgs = typings.miniprogram.AsyncCallback[typings.miniprogram.anon.NetworkAvailable]
  
  type GetOpenUserInfoArgs = typings.miniprogram.AsyncCallback[typings.miniprogram.anon.Response]
  
  type GetSavedFileListArgs = typings.miniprogram.AsyncCallback[typings.miniprogram.anon.FileList]
  
  type GetSystemInfoArgs = typings.miniprogram.AsyncCallback[typings.miniprogram.anon.App]
  
  type OnPullDownRefresh = js.Function1[/* opts */ typings.miniprogram.anon.Form, scala.Unit]
  
  type OnTabItemTap = js.Function1[/* obj */ typings.miniprogram.anon.From, scala.Unit]
  
  type SelectorQueryExecCallback = js.Function1[/* ret */ js.Any, scala.Unit]
}
