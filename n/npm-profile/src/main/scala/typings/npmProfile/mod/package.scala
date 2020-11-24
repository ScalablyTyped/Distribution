package typings.npmProfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Options = typings.npmRegistryFetch.mod.Options with typings.npmProfile.mod.ProfileFetchOptions
  
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - typings.npmProfile.npmProfileBooleans.`false`
    - typings.npmProfile.anon.Dictkey
    - js.Tuple2[java.lang.String, java.lang.String]
    - java.lang.String
  */
  type TFAStatus = typings.npmProfile.mod._TFAStatus | (js.Tuple2[java.lang.String, java.lang.String]) | scala.Null | java.lang.String
}
