package typings.preact.srcJsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  // Distribute over unions
Props extends any ? std.Partial<std.Pick<Props, std.Extract<keyof Props, keyof Defaults>>> & // Include the remaining properties from Props
std.Pick<Props, std.Exclude<keyof Props, keyof Defaults>> : never
  }}}
  */
@js.native
trait Defaultize[Props, Defaults] extends StObject
