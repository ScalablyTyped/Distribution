package typings.preact.jsxMod

import typings.std.Exclude
import typings.std.Extract
import typings.std.Partial
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Defaultize[Props, Defaults] = (Partial[Pick[Props, Extract[/* keyof Props */ String, /* keyof Defaults */ String]]]) & (// Include the remaining properties from Props
Pick[Props, Exclude[/* keyof Props */ String, /* keyof Defaults */ String]])
