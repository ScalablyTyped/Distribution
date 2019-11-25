package typings.pendoDashIoDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pendo {
  import org.scalablytyped.runtime.StringDictionary
  import typings.pendoDashIoDashBrowser.Anon_Id
  import typings.pendoDashIoDashBrowser.Anon_IdString
  import typings.std.Date

  type Account = Anon_IdString with Metadata
  type Events = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in 'ready' | 'guidesLoaded' | 'guidesFailed' ]: -? (callback : pendo-io-browser.pendo.EventCallbacks[K]): / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias pendo-io-browser.pendo.Events * / object}
    */ typings.pendoDashIoDashBrowser.pendoDashIoDashBrowserStrings.Events with EventCallbacks
  type Metadata = StringDictionary[String | Double | Boolean | Date | (js.Array[Double | String])]
  type Visitor = Anon_Id with Metadata
}
