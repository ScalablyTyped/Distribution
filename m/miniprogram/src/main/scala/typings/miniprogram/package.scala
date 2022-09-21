package typings.miniprogram

import typings.miniprogram.anon.FileList
import typings.miniprogram.anon.Form
import typings.miniprogram.anon.From
import typings.miniprogram.anon.Response
import typings.miniprogram.anon.Text
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ChoosePhoneContactArgs = AsyncCallback[ChoosePhoneContactCallbackValue]

type Common = Record[String, String | Double | Boolean]

type EmptyFn = js.Function0[Unit]

type GetClipboardArgs = AsyncCallback[Text]

type GetNetworkTypeArgs = AsyncCallback[GetNetworkTypeCallbackValue]

type GetOpenUserInfoArgs = AsyncCallback[Response]

type GetSavedFileListArgs = AsyncCallback[FileList]

type GetSystemInfoArgs = AsyncCallback[GetSystemInfoCallbackValue]

type OnPullDownRefresh = js.Function1[/* opts */ Form, Unit]

type OnTabItemTap = js.Function1[/* obj */ From, Unit]

type SelectorQueryExecCallback = js.Function1[/* ret */ Any, Unit]
