package typings.nivoGenerators

import typings.nivoGenerators.anon.Keys
import typings.nivoGenerators.anon.Matrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesChordMod {
  
  @JSImport("@nivo/generators/dist/types/chord", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateChordData(): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("generateChordData")().asInstanceOf[Matrix]
  inline def generateChordData(param0: Keys): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("generateChordData")(param0.asInstanceOf[js.Any]).asInstanceOf[Matrix]
}
