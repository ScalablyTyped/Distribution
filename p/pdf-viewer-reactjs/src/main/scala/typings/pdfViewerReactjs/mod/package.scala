package typings.pdfViewerReactjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AlertHandler = js.Function1[/* err */ typings.pdfViewerReactjs.mod.Err, typings.react.mod.ReactNode]
  
  type BtnClickHandler = js.Function1[/* page */ scala.Double, scala.Unit]
  
  type DocClickHandler = js.Function0[scala.Unit]
  
  type RotationClickHandler = js.Function1[/* angle */ scala.Double, scala.Unit]
  
  type ZoomClickHandler = js.Function1[/* scale */ scala.Double, scala.Unit]
}
