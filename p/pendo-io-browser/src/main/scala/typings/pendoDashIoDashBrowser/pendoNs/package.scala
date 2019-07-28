package typings.pendoDashIoDashBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.pendoDashIoDashBrowser.Anon_Id
import typings.pendoDashIoDashBrowser.Anon_IdString
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pendoNs {
  type Account = Anon_IdString with Metadata
  type Events = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in 'ready' | 'guidesLoaded' | 'guidesFailed' ]: -? (callback : pendo-io-browser.pendo.EventCallbacks[K]): object}
    */ typings.pendoDashIoDashBrowser.pendoDashIoDashBrowserStrings.Events with EventCallbacks
  type Metadata = StringDictionary[String | Double | Boolean | Date | (js.Array[Double | String])]
  type Visitor = Anon_Id with Metadata
}
