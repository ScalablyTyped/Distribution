package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object postcssDashLoadDashConfig {
  import typings.std.Exclude
  import typings.std.Pick

  // The remaining ProcessOptions, sans the three above.
  type RemainingProcessOptions = Pick[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProcessOptions */ js.Any, 
    Exclude[String, String]
  ]
}
