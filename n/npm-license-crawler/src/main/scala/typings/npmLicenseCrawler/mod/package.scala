package typings.npmLicenseCrawler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function2[
    /* error */ typings.std.Error | scala.Null, 
    /* licenses */ typings.npmLicenseCrawler.mod.Licenses, 
    scala.Unit
  ]
  type Licenses = org.scalablytyped.runtime.StringDictionary[typings.npmLicenseCrawler.anon.LicenseUrl]
}
