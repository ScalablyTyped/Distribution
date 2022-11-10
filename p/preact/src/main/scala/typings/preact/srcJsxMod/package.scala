package typings.preact.srcJsxMod

import typings.std.Exclude
import typings.std.Extract
import typings.std.Partial
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  // Distribute over unions
Props extends any ? std.Partial<std.Pick<Props, std.Extract<keyof Props, keyof Defaults>>> & // Include the remaining properties from Props
std.Pick<Props, std.Exclude<keyof Props, keyof Defaults>> : never
  }}}
  */
type Defaultize[Props, Defaults] = (Partial[Pick[Props, Extract[/* keyof Props */ String, /* keyof Defaults */ String]]]) & (// Include the remaining properties from Props
Pick[Props, Exclude[/* keyof Props */ String, /* keyof Defaults */ String]])
