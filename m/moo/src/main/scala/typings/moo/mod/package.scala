package typings.moo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Rules = org.scalablytyped.runtime.StringDictionary[
    typings.std.RegExp | java.lang.String | (js.Array[typings.moo.mod.Rule | java.lang.String]) | typings.moo.mod.Rule | typings.moo.mod.ErrorRule | typings.moo.mod.FallbackRule
  ]
  
  type TypeMapper = js.Function1[/* x */ java.lang.String, java.lang.String]
}
