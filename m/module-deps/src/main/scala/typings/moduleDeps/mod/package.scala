package typings.moduleDeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CacheCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* res */ js.UndefOr[typings.moduleDeps.anon.Deps], 
    scala.Unit
  ]
  
  /**
    * Placeholder, feel free to redefine or put in a pull request to improve
    */
  type PackageObject = org.scalablytyped.runtime.StringDictionary[js.Any]
}
