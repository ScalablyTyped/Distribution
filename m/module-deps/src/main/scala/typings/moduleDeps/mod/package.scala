package typings.moduleDeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CacheCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* res */ js.UndefOr[typings.moduleDeps.AnonDeps], 
    scala.Unit
  ]
  /**
    * Placeholder, feel free to redefine or put in a pull request to improve
    */
  type PackageObject = org.scalablytyped.runtime.StringDictionary[js.Any]
}
