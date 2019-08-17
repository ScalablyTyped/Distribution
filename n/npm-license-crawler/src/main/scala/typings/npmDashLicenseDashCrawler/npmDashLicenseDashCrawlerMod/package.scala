package typings.npmDashLicenseDashCrawler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object npmDashLicenseDashCrawlerMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.npmDashLicenseDashCrawler.Anon_LicenseUrl
  import typings.std.Error

  type Callback = js.Function2[/* error */ Error | Null, /* licenses */ Licenses, Unit]
  type Licenses = StringDictionary[Anon_LicenseUrl]
}
