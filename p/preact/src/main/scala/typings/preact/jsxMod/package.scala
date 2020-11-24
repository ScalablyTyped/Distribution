package typings.preact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object jsxMod {
  
  type Defaultize[Props, Defaults] = (typings.std.Partial[
    typings.std.Pick[
      Props, 
      typings.std.Extract[/* keyof Props */ java.lang.String, /* keyof Defaults */ java.lang.String]
    ]
  ]) with (// Include the remaining properties from Props
  typings.std.Pick[
    Props, 
    typings.std.Exclude[/* keyof Props */ java.lang.String, /* keyof Defaults */ java.lang.String]
  ])
}
